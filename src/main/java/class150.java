import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class150 {

    @OriginalMember(owner = "client!up", name = "f", descriptor = "J")
    private long field2241 = -1L;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "I")
    private int field2259 = 0;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "J")
    private long field2253 = -1L;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Lhd;")
    private class443 field2242;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "J")
    private long field2257;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "J")
    private long field2256;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "J")
    private long field2244;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "[B")
    private byte[] field2262;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[B")
    private byte[] field2238;

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[I")
    public static int[] field2254;

    @OriginalMember(owner = "client!up", name = "t", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    private int field2250;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!up", name = "w", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "J")
    private long field2239;

    static {
        new class349("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field2254 = new int[2500];
        field2255 = 0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(JB)V", line = 5)
    public final void method1109(long arg0, byte arg1) throws IOException {
        field2245++;
        if (arg1 != -79) {
            this.field2239 = 48L;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1118(false));
        }
        this.field2244 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 22)
    private final void method1110(int arg0) throws IOException {
        if (this.field2253 != -1L) {
            if (this.field2253 != this.field2239) {
                this.field2242.method2763(-15472, this.field2253);
                this.field2239 = this.field2253;
            }
            this.field2242.method2766(this.field2262, -7120, 0, this.field2259);
            this.field2239 += (long) this.field2259;
            if (this.field2257 < this.field2239) {
                this.field2257 = this.field2239;
            }
            long var2 = -1L;
            if (this.field2253 >= this.field2241 && (long) this.field2250 + this.field2241 > this.field2253) {
                var2 = this.field2253;
            } else if (this.field2253 <= this.field2241 && ((long) this.field2259 + this.field2253) > this.field2241) {
                var2 = this.field2241;
            }
            long var4 = -1L;
            if (this.field2253 + ((long) this.field2259) > this.field2241 && (long) this.field2259 + this.field2253 <= (long) this.field2250 + this.field2241) {
                var4 = (long) this.field2259 + this.field2253;
            } else if (((long) this.field2250 + this.field2241) > this.field2253 && ((long) this.field2250 + this.field2241) <= ((long) this.field2259 + this.field2253)) {
                var4 = this.field2241 + ((long) this.field2250);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class271.method1853(this.field2262, (int) (var2 - this.field2253), this.field2238, (int) (var2 - this.field2241), var6);
            }
            this.field2253 = -1L;
            this.field2259 = 0;
        }
        if (arg0 == -11075) {
            field2252++;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V", line = 105)
    public static final void method1111(byte arg0) {
        field2247++;
        if (class214.field3022 == 2) {
            return;
        }
        if (arg0 >= -5) {
            method1119((byte) 39);
        }
        try {
            class348.method2282((byte) -77, "tbrefresh", class296.field4282);
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 128)
    public static void method1112(int arg0) {
        if (arg0 < -118) {
            field2254 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lli;Lvq;B)I", line = 139)
    public static final int method1113(class247 arg0, class269 arg1, byte arg2) {
        int var3 = -106 % ((-arg2 - 11) / 52);
        field2240++;
        if (arg0.field3685 != -1) {
            return arg0.field3685;
        }
        if (arg0.field3682 != -1) {
            class287 var4 = class321.field4701.method1475(arg1.method864() ? arg0.field3682 : arg0.field3687, 17673);
            if (!var4.field4184) {
                return var4.field4175;
            }
        }
        return arg0.field3688;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V", line = 169)
    public static final void method1114(int arg0, byte arg1) {
        class385.field5445 = 100;
        class334.field4849 = -1;
        if (arg1 != 8) {
            field2255 = -44;
        }
        class166.field2377 = 3;
        field2258++;
        class252.field3743 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I[B)V", line = 185)
    public final void method1115(int arg0, byte[] arg1) throws IOException {
        if (arg0 != -9030) {
            this.method1118(true);
        }
        field2260++;
        this.method1120(0, 7127, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)J", line = 205)
    public final long method1116(byte arg0) {
        field2236++;
        if (arg0 != 25) {
            this.method1116((byte) -69);
        }
        return this.field2256;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BII[B)V", line = 218)
    public final void method1117(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2237++;
        try {
            if (this.field2256 < ((long) arg2 + this.field2244)) {
                this.field2256 = (long) arg2 + this.field2244;
            }
            if (this.field2253 != -1L && (this.field2244 < this.field2253 || ((long) this.field2259 + this.field2253) < this.field2244)) {
                this.method1110(-11075);
            }
            if (this.field2253 != -1L && ((long) arg2 + this.field2244) > ((long) this.field2262.length + this.field2253)) {
                int var5 = (int) (-this.field2244 - (-this.field2253 - (long) this.field2262.length));
                class271.method1853(arg3, arg1, this.field2262, (int) (this.field2244 - this.field2253), var5);
                this.field2244 += (long) var5;
                arg1 += var5;
                arg2 -= var5;
                this.field2259 = this.field2262.length;
                this.method1110(-11075);
            }
            if (arg0 > -75) {
                this.method1116((byte) 61);
            }
            if (arg2 > this.field2262.length) {
                if (this.field2244 != this.field2239) {
                    this.field2242.method2763(-15472, this.field2244);
                    this.field2239 = this.field2244;
                }
                this.field2242.method2766(arg3, -7120, arg1, arg2);
                this.field2239 += (long) arg2;
                if (this.field2239 > this.field2257) {
                    this.field2257 = this.field2239;
                }
                long var6 = -1L;
                if (this.field2241 <= this.field2244 && ((long) this.field2250 + this.field2241) > this.field2244) {
                    var6 = this.field2244;
                } else if (this.field2241 >= this.field2244 && (long) arg2 + this.field2244 > this.field2241) {
                    var6 = this.field2241;
                }
                long var8 = -1L;
                if (this.field2241 < ((long) arg2 + this.field2244) && (long) arg2 + this.field2244 <= this.field2241 - -((long) this.field2250)) {
                    var8 = (long) arg2 + this.field2244;
                } else if ((long) this.field2250 + this.field2241 > this.field2244 && this.field2241 + ((long) this.field2250) <= this.field2244 - -((long) arg2)) {
                    var8 = (long) this.field2250 + this.field2241;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class271.method1853(arg3, (int) ((long) arg1 + var6 - this.field2244), this.field2238, (int) (var6 - this.field2241), var10);
                }
                this.field2244 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2253 == -1L) {
                    this.field2253 = this.field2244;
                }
                class271.method1853(arg3, arg1, this.field2262, (int) (this.field2244 - this.field2253), arg2);
                this.field2244 += (long) arg2;
                if ((long) this.field2259 < this.field2244 - this.field2253) {
                    this.field2259 = (int) (this.field2244 - this.field2253);
                }
            }
        } catch (IOException var12) {
            this.field2239 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Ljava/io/File;", line = 351)
    private final File method1118(boolean arg0) {
        if (arg0) {
            this.field2257 = -110L;
        }
        field2261++;
        return this.field2242.method2764(0);
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)Lta;", line = 363)
    public static final class117 method1119(byte arg0) {
        if (arg0 != -70) {
            field2246 = 25;
        }
        field2248++;
        class117 var1 = (class117) class32.field395.method1075((byte) -49);
        if (var1 == null) {
            return new class117();
        } else {
            class311.field4572--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II[BI)V", line = 393)
    public final void method1120(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2251++;
        try {
            if ((arg0 + arg3) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            if (arg1 != 7127) {
                this.method1118(false);
            }
            if (this.field2253 != -1L && this.field2253 <= this.field2244 && ((long) this.field2259 + this.field2253) >= ((long) arg3 + this.field2244)) {
                class271.method1853(this.field2262, (int) (this.field2244 - this.field2253), arg2, arg0, arg3);
                this.field2244 += (long) arg3;
                return;
            }
            long var5 = this.field2244;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field2241 <= this.field2244 && (this.field2241 + ((long) this.field2250)) > this.field2244) {
                int var9 = (int) ((long) this.field2250 + this.field2241 - this.field2244);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class271.method1853(this.field2238, (int) (this.field2244 - this.field2241), arg2, arg0, var9);
                this.field2244 += (long) var9;
                arg3 -= var9;
                arg0 += var9;
            }
            if (this.field2238.length < arg3) {
                this.field2242.method2763(-15472, this.field2244);
                this.field2239 = this.field2244;
                while (arg3 > 0) {
                    int var10 = this.field2242.method2767(true, arg2, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field2244 += (long) var10;
                    arg0 += var10;
                    this.field2239 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method1121(-1);
                int var11 = arg3;
                if (arg3 > this.field2250) {
                    var11 = this.field2250;
                }
                class271.method1853(this.field2238, 0, arg2, arg0, var11);
                arg0 += var11;
                this.field2244 += (long) var11;
                arg3 -= var11;
            }
            if (this.field2253 != -1L) {
                if (this.field2253 > this.field2244 && arg3 > 0) {
                    int var12 = (int) (this.field2253 - this.field2244) + arg0;
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg2[arg0++] = 0;
                        arg3--;
                        this.field2244++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2253 && this.field2253 < ((long) var8 + var5)) {
                    var13 = this.field2253;
                } else if (this.field2253 <= var5 && var5 < ((long) this.field2259 + this.field2253)) {
                    var13 = var5;
                }
                if ((long) this.field2259 + this.field2253 > var5 && (var5 + ((long) var8)) >= ((long) this.field2259 + this.field2253)) {
                    var15 = (long) this.field2259 + this.field2253;
                } else if ((long) var8 + var5 > this.field2253 && this.field2253 + ((long) this.field2259) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class271.method1853(this.field2262, (int) (var13 - this.field2253), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2244) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2244));
                        this.field2244 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2239 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lhd;II)V", line = 639)
    public class150(class443 arg0, int arg1, int arg2) throws IOException {
        this.field2242 = arg0;
        this.field2256 = this.field2257 = arg0.method2765(0);
        this.field2244 = 0L;
        this.field2262 = new byte[arg2];
        this.field2238 = new byte[arg1];
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V", line = 595)
    private final void method1121(int arg0) throws IOException {
        this.field2250 = 0;
        field2243++;
        if (this.field2244 != this.field2239) {
            this.field2242.method2763(-15472, this.field2244);
            this.field2239 = this.field2244;
        }
        this.field2241 = this.field2244;
        while (this.field2250 < this.field2238.length) {
            int var2 = this.field2238.length - this.field2250;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2242.method2767(true, this.field2238, this.field2250, var2);
            if (var3 == -1) {
                break;
            }
            this.field2250 += var3;
            this.field2239 += (long) var3;
        }
        if (arg0 != -1) {
            this.field2253 = -52L;
        }
    }
}
