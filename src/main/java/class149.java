import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class149 {

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    private int field2217 = 0;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "J")
    private long field2222 = -1L;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "J")
    private long field2223 = -1L;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lfh;")
    private class132 field2224;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "J")
    private long field2209;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "J")
    private long field2202;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[B")
    private byte[] field2215;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "J")
    private long field2214;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[B")
    private byte[] field2213;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2208 = -2;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    public static int[] field2205 = new int[128];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Llf;")
    public static class211 field2212 = new class211(50);

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static volatile int field2228 = 0;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field2230 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[I")
    public static int[] field2229 = new int[100];

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    private int field2211;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "J")
    private long field2199;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lbd;")
    public static class186 field2227;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lhc;")
    public static class229 field2221;

    // $FF: synthetic field
    @OriginalMember(owner = "client!id", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field2231;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    private final void method991(int arg0) throws IOException {
        if ((long) arg0 != this.field2222) {
            if (this.field2222 != this.field2199) {
                this.field2224.method899((byte) 125, this.field2222);
                this.field2199 = this.field2222;
            }
            this.field2224.method902(0, this.field2217, this.field2213, 0);
            long var2 = -1L;
            if (this.field2223 <= this.field2222 && this.field2222 < (long) this.field2211 + this.field2223) {
                var2 = this.field2222;
            } else if (this.field2223 >= this.field2222 && this.field2223 < ((long) this.field2217 + this.field2222)) {
                var2 = this.field2223;
            }
            this.field2199 += (long) this.field2217;
            long var4 = -1L;
            if (this.field2199 > this.field2209) {
                this.field2209 = this.field2199;
            }
            if (((long) this.field2217 + this.field2222) > this.field2223 && (long) this.field2217 + this.field2222 <= (long) this.field2211 + this.field2223) {
                var4 = (long) this.field2217 + this.field2222;
            } else if (this.field2222 < (this.field2223 + ((long) this.field2211)) && ((long) this.field2217 + this.field2222) >= ((long) this.field2211 + this.field2223)) {
                var4 = (long) this.field2211 + this.field2223;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class196.method1357(this.field2213, (int) (var2 - this.field2222), this.field2215, (int) (var2 - this.field2223), var6);
            }
            this.field2217 = 0;
            this.field2222 = -1L;
        }
        field2220++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)V")
    public final void method992(long arg0, int arg1) throws IOException {
        int var4 = -108 % ((-arg1 - 9) / 49);
        field2201++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method996((byte) 78));
        }
        this.field2214 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    private final void method993(byte arg0) throws IOException {
        int var2 = -9 % ((arg0 + 79) / 38);
        field2203++;
        this.field2211 = 0;
        if (this.field2214 != this.field2199) {
            this.field2224.method899((byte) 125, this.field2214);
            this.field2199 = this.field2214;
        }
        this.field2223 = this.field2214;
        while (this.field2211 < this.field2215.length) {
            int var3 = this.field2215.length - this.field2211;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2224.method903(this.field2211, var3, 119, this.field2215);
            if (var4 == -1) {
                break;
            }
            this.field2211 += var4;
            this.field2199 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BIB)V")
    public final void method994(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field2206++;
        try {
            if (((long) arg0 + this.field2214) > this.field2202) {
                this.field2202 = (long) arg0 + this.field2214;
            }
            if (this.field2222 != -1L && (this.field2214 < this.field2222 || (long) this.field2217 + this.field2222 < this.field2214)) {
                this.method991(-1);
            }
            if (arg3 != 65) {
                field2221 = null;
            }
            if (this.field2222 != -1L && ((long) this.field2213.length + this.field2222) < ((long) arg0 + this.field2214)) {
                int var5 = (int) ((long) this.field2213.length + this.field2222 - this.field2214);
                arg0 -= var5;
                class196.method1357(arg1, arg2, this.field2213, (int) (this.field2214 - this.field2222), var5);
                arg2 += var5;
                this.field2214 += (long) var5;
                this.field2217 = this.field2213.length;
                this.method991(-1);
            }
            if (arg0 > this.field2213.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2214 != this.field2199) {
                    this.field2224.method899((byte) 125, this.field2214);
                    this.field2199 = this.field2214;
                }
                this.field2224.method902(arg3 ^ 0x41, arg0, arg1, arg2);
                if (this.field2223 < (long) arg0 + this.field2214 && (long) this.field2211 + this.field2223 >= (long) arg0 + this.field2214) {
                    var8 = (long) arg0 + this.field2214;
                } else if (this.field2214 < (long) this.field2211 + this.field2223 && ((long) this.field2211 + this.field2223) <= ((long) arg0 + this.field2214)) {
                    var8 = (long) this.field2211 + this.field2223;
                }
                this.field2199 += (long) arg0;
                if (this.field2209 < this.field2199) {
                    this.field2209 = this.field2199;
                }
                if (this.field2223 <= this.field2214 && this.field2214 < (long) this.field2211 + this.field2223) {
                    var6 = this.field2214;
                } else if (this.field2214 <= this.field2223 && this.field2223 < (long) arg0 + this.field2214) {
                    var6 = this.field2223;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class196.method1357(arg1, (int) ((long) arg2 + var6 - this.field2214), this.field2215, (int) (var6 - this.field2223), var10);
                }
                this.field2214 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field2222 == -1L) {
                    this.field2222 = this.field2214;
                }
                class196.method1357(arg1, arg2, this.field2213, (int) (this.field2214 - this.field2222), arg0);
                this.field2214 += (long) arg0;
                if ((long) this.field2217 < this.field2214 - this.field2222) {
                    this.field2217 = (int) (this.field2214 - this.field2222);
                }
            }
        } catch (IOException var12) {
            this.field2199 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)J")
    public final long method995(boolean arg0) {
        field2219++;
        if (!arg0) {
            method1001(false);
        }
        return this.field2202;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method996(byte arg0) {
        field2204++;
        if (arg0 < 26) {
            method1000((byte) 56);
        }
        return this.field2224.method900((byte) -113);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public final void method997(boolean arg0) throws IOException {
        field2225++;
        this.method991(-1);
        this.field2224.method898((byte) 5);
        if (!arg0) {
            field2221 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B[B)V")
    public final void method998(byte arg0, byte[] arg1) throws IOException {
        this.method999(arg1.length, arg1, -1, 0);
        if (arg0 >= -107) {
            method1000((byte) -47);
        }
        field2207++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)V")
    public final void method999(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2218++;
        try {
            if (arg1.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if ((long) arg2 != this.field2222 && this.field2214 >= this.field2222 && ((long) arg0 + this.field2214) <= ((long) this.field2217 + this.field2222)) {
                class196.method1357(this.field2213, (int) (this.field2214 - this.field2222), arg1, arg3, arg0);
                this.field2214 += (long) arg0;
                return;
            }
            long var5 = this.field2214;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2223 <= this.field2214 && ((long) this.field2211 + this.field2223) > this.field2214) {
                int var9 = (int) ((long) this.field2211 + this.field2223 - this.field2214);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class196.method1357(this.field2215, (int) (this.field2214 - this.field2223), arg1, arg3, var9);
                arg0 -= var9;
                arg3 += var9;
                this.field2214 += (long) var9;
            }
            if (arg0 > this.field2215.length) {
                this.field2224.method899((byte) 125, this.field2214);
                this.field2199 = this.field2214;
                while (arg0 > 0) {
                    int var11 = this.field2224.method903(arg3, arg0, 121, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2199 += (long) var11;
                    arg3 += var11;
                    this.field2214 += (long) var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method993((byte) 63);
                int var10 = arg0;
                if (arg0 > this.field2211) {
                    var10 = this.field2211;
                }
                class196.method1357(this.field2215, 0, arg1, arg3, var10);
                this.field2214 += (long) var10;
                arg0 -= var10;
                arg3 += var10;
            }
            if (this.field2222 != -1L) {
                if (this.field2214 < this.field2222 && arg0 > 0) {
                    int var12 = (int) (this.field2222 - this.field2214) + arg3;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1[arg3++] = 0;
                        this.field2214++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if ((long) this.field2217 + this.field2222 > var5 && ((long) this.field2217 + this.field2222) <= ((long) var8 + var5)) {
                    var13 = (long) this.field2217 + this.field2222;
                } else if (this.field2222 < (long) var8 + var5 && ((long) this.field2217 + this.field2222) >= ((long) var8 + var5)) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field2222 >= var5 && this.field2222 < (long) var8 + var5) {
                    var15 = this.field2222;
                } else if (this.field2222 <= var5 && var5 < ((long) this.field2217 + this.field2222)) {
                    var15 = var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class196.method1357(this.field2213, (int) (var15 - this.field2222), arg1, (int) (var15 - var5) + var7, var17);
                    if (this.field2214 < var13) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field2214));
                        this.field2214 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2199 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static final void method1000(byte arg0) {
        try {
            Method var1 = (field2231 == null ? (field2231 = method1002("java.lang.Runtime")) : field2231).getMethod("maxMemory");
            if (arg0 != -84) {
                field2226 = -128;
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class69.field967 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field2216++;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(Z)V")
    public static void method1001(boolean arg0) {
        field2205 = null;
        field2212 = null;
        if (arg0) {
            field2226 = -88;
        }
        field2221 = null;
        field2229 = null;
        field2230 = null;
        field2227 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lfh;II)V")
    public class149(class132 arg0, int arg1, int arg2) throws IOException {
        this.field2224 = arg0;
        this.field2202 = this.field2209 = arg0.method901(true);
        this.field2215 = new byte[arg1];
        this.field2214 = 0L;
        this.field2213 = new byte[arg2];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1002(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
