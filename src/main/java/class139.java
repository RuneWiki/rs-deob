import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class139 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "J")
    private long field2300 = -1L;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    private int field2304 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "J")
    private long field2318 = -1L;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lhe;")
    private class5 field2296;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
    private long field2298;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "J")
    private long field2301;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "[B")
    private byte[] field2317;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[B")
    private byte[] field2309;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "J")
    private long field2315;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Ldf;")
    public static class177 field2316 = new class177(64);

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public static int field2321 = 3;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "J")
    private long field2319;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lrg;IIII)V", line = 8)
    public static final void method1156(class342 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2312++;
        int var5 = -37 % ((arg1 - 49) / 57);
        if (class240.field3737) {
            class213.method1595(arg3, arg4, arg0.field5374 + arg3, arg4 - -arg0.field5339);
        }
        if (class151.field2462 < 3) {
            if (class240.field3737) {
                ((class2) class306.field4750).method16(arg3, arg4, arg0.field5374, arg0.field5339, class306.field4750.field3366 / 2, class306.field4750.field3367 / 2, (int) class313.field4846, 256, (class2) arg0.method2399(false, 0));
            } else {
                ((class361) class306.field4750).method527(arg3, arg4, arg0.field5374, arg0.field5339, class306.field4750.field3366 / 2, class306.field4750.field3367 / 2, (int) class313.field4846, 256, arg0.field5272, arg0.field5428);
            }
        } else if (class240.field3737) {
            class215 var6 = arg0.method2399(false, 0);
            if (var6 != null) {
                var6.method17(arg3, arg4);
            }
        } else {
            class60.method612(arg3, arg4, 0, arg0.field5272, arg0.field5428);
        }
        class349.field5544[arg2] = true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)J", line = 47)
    public final long method1157(byte arg0) {
        field2306++;
        if (arg0 != 4) {
            this.field2317 = (byte[]) null;
        }
        return this.field2301;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", line = 61)
    public static final void method1158(String arg0, byte arg1, String arg2, String arg3, int arg4, String arg5, int arg6, int arg7) {
        field2297++;
        for (int var8 = 99; var8 > 0; var8--) {
            class324.field4985[var8] = class324.field4985[var8 - 1];
            class293.field4549[var8] = class293.field4549[var8 - 1];
            class78.field1139[var8] = class78.field1139[var8 - 1];
            class359.field5699[var8] = class359.field5699[var8 - 1];
            class234.field3648[var8] = class234.field3648[var8 - 1];
            class18.field305[var8] = class18.field305[var8 - 1];
            class282.field4356[var8] = class282.field4356[var8 - 1];
        }
        class188.field2955 = class327.field5030;
        class203.field3148++;
        class78.field1139[0] = arg3;
        class324.field4985[0] = arg6;
        class359.field5699[0] = arg0;
        class234.field3648[0] = arg2;
        if (arg1 >= -98) {
            field2316 = (class177) null;
        }
        class293.field4549[0] = arg4;
        class282.field4356[0] = arg7;
        class18.field305[0] = arg5;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILrn;Lrn;I)Lhg;", line = 101)
    public static final class162 method1159(boolean arg0, int arg1, class18 arg2, class18 arg3, int arg4) {
        field2320++;
        int[] var5 = arg2.method183(false, arg1);
        boolean var6 = true;
        for (int var7 = arg4; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method204(arg1, (byte) 11, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method204(0, (byte) -32, var9);
                } else {
                    var10 = arg3.method204(var9, (byte) 28, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class162(arg2, arg3, arg1, arg0);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 154)
    private final void method1160(byte arg0) throws IOException {
        this.field2311 = 0;
        if (this.field2319 != this.field2315) {
            this.field2296.method40(this.field2315, -1);
            this.field2319 = this.field2315;
        }
        field2305++;
        this.field2318 = this.field2315;
        int var2 = -103 / ((8 - arg0) / 52);
        while (this.field2309.length > this.field2311) {
            int var3 = this.field2309.length - this.field2311;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2296.method39((byte) 109, var3, this.field2311, this.field2309);
            if (var4 == -1) {
                break;
            }
            this.field2311 += var4;
            this.field2319 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[B)V", line = 196)
    public final void method1161(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2302++;
        try {
            if (this.field2301 < (this.field2315 + ((long) arg0))) {
                this.field2301 = (long) arg0 + this.field2315;
            }
            if (this.field2300 != -1L && (this.field2315 < this.field2300 || this.field2315 > this.field2300 + ((long) this.field2304))) {
                this.method1168((byte) -101);
            }
            if (this.field2300 != -1L && (long) this.field2317.length + this.field2300 < (long) arg0 + this.field2315) {
                int var5 = (int) ((long) this.field2317.length + this.field2300 - this.field2315);
                arg0 -= var5;
                class65.method642(arg3, arg2, this.field2317, (int) (this.field2315 - this.field2300), var5);
                this.field2315 += (long) var5;
                this.field2304 = this.field2317.length;
                arg2 += var5;
                this.method1168((byte) -101);
            }
            if (this.field2317.length < arg0) {
                if (this.field2319 != this.field2315) {
                    this.field2296.method40(this.field2315, -1);
                    this.field2319 = this.field2315;
                }
                this.field2296.method38(arg3, arg0, (byte) -61, arg2);
                this.field2319 += (long) arg0;
                long var6 = -1L;
                if (this.field2319 > this.field2298) {
                    this.field2298 = this.field2319;
                }
                if (this.field2318 <= this.field2315 && this.field2315 < (this.field2318 + ((long) this.field2311))) {
                    var6 = this.field2315;
                } else if (this.field2315 <= this.field2318 && this.field2318 < (long) arg0 + this.field2315) {
                    var6 = this.field2318;
                }
                long var8 = -1L;
                if (((long) arg0 + this.field2315) > this.field2318 && ((long) arg0 + this.field2315) <= ((long) this.field2311 + this.field2318)) {
                    var8 = (long) arg0 + this.field2315;
                } else if (((long) this.field2311 + this.field2318) > this.field2315 && (long) this.field2311 + this.field2318 <= (long) arg0 + this.field2315) {
                    var8 = (long) this.field2311 + this.field2318;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class65.method642(arg3, (int) ((long) arg2 + var6 - this.field2315), this.field2309, (int) (var6 - this.field2318), var10);
                }
                this.field2315 += (long) arg0;
            } else if (~arg0 < arg1) {
                if (this.field2300 == -1L) {
                    this.field2300 = this.field2315;
                }
                class65.method642(arg3, arg2, this.field2317, (int) (this.field2315 - this.field2300), arg0);
                this.field2315 += (long) arg0;
                if ((long) this.field2304 < this.field2315 - this.field2300) {
                    this.field2304 = (int) (this.field2315 - this.field2300);
                }
            }
        } catch (IOException var12) {
            this.field2319 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)V", line = 317)
    public final void method1162(byte[] arg0, int arg1) throws IOException {
        this.method1164(arg0, arg0.length, arg1 ^ 0xFFFFFFF7, 0);
        field2307++;
        if (arg1 != 8) {
            this.field2300 = 120L;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Ljava/io/File;", line = 329)
    private final File method1163(byte arg0) {
        if (arg0 > -104) {
            return (File) null;
        } else {
            field2308++;
            return this.field2296.method41(-119);
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lhe;II)V", line = 705)
    public class139(class5 arg0, int arg1, int arg2) throws IOException {
        this.field2296 = arg0;
        this.field2301 = this.field2298 = arg0.method36((byte) -121);
        this.field2317 = new byte[arg2];
        this.field2309 = new byte[arg1];
        this.field2315 = 0L;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([BIII)V", line = 345)
    public final void method1164(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2313++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2300 != -1L && this.field2300 <= this.field2315 && (long) arg1 + this.field2315 <= (long) this.field2304 + this.field2300) {
                class65.method642(this.field2317, (int) (this.field2315 - this.field2300), arg0, arg3, arg1);
                this.field2315 += (long) arg1;
                return;
            }
            long var5 = this.field2315;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field2315 >= this.field2318 && (this.field2318 + ((long) this.field2311)) > this.field2315) {
                int var9 = (int) ((long) this.field2311 + this.field2318 - this.field2315);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class65.method642(this.field2309, (int) (this.field2315 - this.field2318), arg0, arg3, var9);
                arg3 += var9;
                this.field2315 += (long) var9;
                arg1 -= var9;
            }
            if (this.field2309.length < arg1) {
                this.field2296.method40(this.field2315, arg2 ^ 0x0);
                this.field2319 = this.field2315;
                while (arg1 > 0) {
                    int var11 = this.field2296.method39((byte) 109, arg1, arg3, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2315 += (long) var11;
                    arg1 -= var11;
                    arg3 += var11;
                    this.field2319 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method1160((byte) -52);
                int var10 = arg1;
                if (this.field2311 < arg1) {
                    var10 = this.field2311;
                }
                class65.method642(this.field2309, 0, arg0, arg3, var10);
                arg1 -= var10;
                arg3 += var10;
                this.field2315 += (long) var10;
            }
            if (this.field2300 != -1L) {
                if (this.field2315 < this.field2300 && arg1 > 0) {
                    int var12 = (int) (this.field2300 - this.field2315) + arg3;
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field2315++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2300 && this.field2300 < var5 + ((long) var8)) {
                    var13 = this.field2300;
                } else if (var5 >= this.field2300 && (long) this.field2304 + this.field2300 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field2304 + this.field2300 > var5 && (long) this.field2304 + this.field2300 <= (long) var8 + var5) {
                    var15 = (long) this.field2304 + this.field2300;
                } else if ((long) var8 + var5 > this.field2300 && (long) var8 + var5 <= (long) this.field2304 + this.field2300) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class65.method642(this.field2317, (int) (var13 - this.field2300), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2315) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2315));
                        this.field2315 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2319 = -1L;
            throw var19;
        }
        if (~arg1 < arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(JI)V", line = 531)
    public final void method1165(long arg0, int arg1) throws IOException {
        field2303++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1163((byte) -124));
        }
        this.field2315 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 558)
    public static void method1166(int arg0) {
        field2316 = null;
        if (arg0 != -1) {
            field2321 = -6;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;", line = 573)
    public static final Class method1167(boolean arg0, String arg1) throws ClassNotFoundException {
        field2310++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0) {
                field2321 = -36;
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V", line = 617)
    private final void method1168(byte arg0) throws IOException {
        field2322++;
        if (this.field2300 != -1L) {
            if (this.field2319 != this.field2300) {
                this.field2296.method40(this.field2300, -1);
                this.field2319 = this.field2300;
            }
            this.field2296.method38(this.field2317, this.field2304, (byte) -61, 0);
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2318 <= this.field2300 && ((long) this.field2311 + this.field2318) > this.field2300) {
                var2 = this.field2300;
            } else if (this.field2300 <= this.field2318 && (long) this.field2304 + this.field2300 > this.field2318) {
                var2 = this.field2318;
            }
            if (this.field2318 < ((long) this.field2304 + this.field2300) && (this.field2300 + ((long) this.field2304)) <= (this.field2318 + ((long) this.field2311))) {
                var4 = (long) this.field2304 + this.field2300;
            } else if ((long) this.field2311 + this.field2318 > this.field2300 && ((long) this.field2304 + this.field2300) >= (this.field2318 + ((long) this.field2311))) {
                var4 = (long) this.field2311 + this.field2318;
            }
            this.field2319 += (long) this.field2304;
            if (this.field2319 > this.field2298) {
                this.field2298 = this.field2319;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class65.method642(this.field2317, (int) (var2 - this.field2300), this.field2309, (int) (var2 - this.field2318), var6);
            }
            this.field2304 = 0;
            this.field2300 = -1L;
        }
        if (arg0 != -101) {
            this.field2315 = 106L;
        }
    }
}
