import java.awt.Font;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class409 {

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "J")
    private long field6067 = -1L;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    private int field6070 = 0;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "J")
    private long field6062 = -1L;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Lk;")
    private class335 field6055;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "J")
    private long field6052;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "J")
    private long field6061;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "J")
    private long field6050;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[B")
    private byte[] field6057;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "[B")
    private byte[] field6074;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6059 = "glow2:";

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "Z")
    public static boolean field6073 = false;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "[I")
    public static int[] field6075 = new int[14];

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    private int field6071;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "J")
    private long field6069;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field6049;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6047;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III[B)V", line = 5)
    public final void method2560(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6053++;
        try {
            if (((long) arg2 + this.field6050) > this.field6061) {
                this.field6061 = (long) arg2 + this.field6050;
            }
            if ((long) arg0 != this.field6067 && (this.field6067 > this.field6050 || this.field6050 > ((long) this.field6070 + this.field6067))) {
                this.method2562(-112);
            }
            if (this.field6067 != -1L && (long) this.field6074.length + this.field6067 < this.field6050 - -((long) arg2)) {
                int var5 = (int) ((long) this.field6074.length + this.field6067 - this.field6050);
                class408.method2559(arg3, arg1, this.field6074, (int) (this.field6050 - this.field6067), var5);
                arg2 -= var5;
                arg1 += var5;
                this.field6050 += (long) var5;
                this.field6070 = this.field6074.length;
                this.method2562(arg0 ^ 0xFFFFFFB5);
            }
            if (this.field6074.length < arg2) {
                if (this.field6069 != this.field6050) {
                    this.field6055.method2215(this.field6050, (byte) -15);
                    this.field6069 = this.field6050;
                }
                this.field6055.method2211(arg2, true, arg1, arg3);
                this.field6069 += (long) arg2;
                if (this.field6069 > this.field6052) {
                    this.field6052 = this.field6069;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6050 >= this.field6062 && (this.field6062 + ((long) this.field6071)) > this.field6050) {
                    var6 = this.field6050;
                } else if (this.field6050 <= this.field6062 && (long) arg2 + this.field6050 > this.field6062) {
                    var6 = this.field6062;
                }
                if (this.field6062 < ((long) arg2 + this.field6050) && ((long) arg2 + this.field6050) <= ((long) this.field6071 + this.field6062)) {
                    var8 = this.field6050 + ((long) arg2);
                } else if ((this.field6062 + ((long) this.field6071)) > this.field6050 && (this.field6062 + ((long) this.field6071)) <= (this.field6050 + ((long) arg2))) {
                    var8 = (long) this.field6071 + this.field6062;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class408.method2559(arg3, (int) (var6 + (long) arg1 - this.field6050), this.field6057, (int) (var6 - this.field6062), var10);
                }
                this.field6050 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field6067 == -1L) {
                    this.field6067 = this.field6050;
                }
                class408.method2559(arg3, arg1, this.field6074, (int) (this.field6050 - this.field6067), arg2);
                this.field6050 += (long) arg2;
                if (this.field6050 - this.field6067 > (long) this.field6070) {
                    this.field6070 = (int) (this.field6050 - this.field6067);
                }
            }
        } catch (IOException var12) {
            this.field6069 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 123)
    private final void method2561(byte arg0) throws IOException {
        this.field6071 = 0;
        field6056++;
        if (this.field6069 != this.field6050) {
            this.field6055.method2215(this.field6050, (byte) -48);
            this.field6069 = this.field6050;
        }
        this.field6062 = this.field6050;
        if (arg0 < 87) {
            return;
        }
        while (this.field6071 < this.field6057.length) {
            int var2 = this.field6057.length - this.field6071;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6055.method2213((byte) 66, this.field6071, this.field6057, var2);
            if (var3 == -1) {
                break;
            }
            this.field6069 += (long) var3;
            this.field6071 += var3;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 172)
    private final void method2562(int arg0) throws IOException {
        if (this.field6067 != -1L) {
            if (this.field6069 != this.field6067) {
                this.field6055.method2215(this.field6067, (byte) -20);
                this.field6069 = this.field6067;
            }
            this.field6055.method2211(this.field6070, true, 0, this.field6074);
            this.field6069 += (long) this.field6070;
            if (this.field6069 > this.field6052) {
                this.field6052 = this.field6069;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field6062 <= this.field6067 && this.field6067 < ((long) this.field6071 + this.field6062)) {
                var2 = this.field6067;
            } else if (this.field6062 >= this.field6067 && this.field6062 < (this.field6067 + ((long) this.field6070))) {
                var2 = this.field6062;
            }
            if (this.field6062 < ((long) this.field6070 + this.field6067) && ((long) this.field6071 + this.field6062) >= (this.field6067 + ((long) this.field6070))) {
                var4 = (long) this.field6070 + this.field6067;
            } else if (this.field6067 < ((long) this.field6071 + this.field6062) && this.field6067 + ((long) this.field6070) >= (long) this.field6071 + this.field6062) {
                var4 = (long) this.field6071 + this.field6062;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class408.method2559(this.field6074, (int) (var2 - this.field6067), this.field6057, (int) (var2 - this.field6062), var6);
            }
            this.field6067 = -1L;
            this.field6070 = 0;
        }
        int var7 = 48 % ((arg0 + 53) / 41);
        field6066++;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)J", line = 246)
    public final long method2563(byte arg0) {
        field6046++;
        if (arg0 != 30) {
            this.field6070 = -31;
        }
        return this.field6061;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(JI)V", line = 261)
    public final void method2564(long arg0, int arg1) throws IOException {
        field6060++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2565(arg1 ^ 0xFFFFFFAF));
        }
        this.field6050 = arg0;
        if (arg1 != 0) {
            this.field6069 = 74L;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Ljava/io/File;", line = 275)
    private final File method2565(int arg0) {
        int var2 = 9 / ((arg0 - 32) / 37);
        field6065++;
        return this.field6055.method2214(6348);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 295)
    public static final void method2566(boolean arg0) {
        if (class313.field4928 != null) {
            class313.field4928.method1543(125);
        }
        field6054++;
        if (!arg0) {
            method2566(false);
        }
        if (class441.field6457 != null) {
            class441.field6457.method1543(127);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[BII)V", line = 316)
    public final void method2567(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6072++;
        try {
            if (arg2 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (this.field6067 != -1L && this.field6050 >= this.field6067 && this.field6067 + ((long) this.field6070) >= this.field6050 - -((long) arg3)) {
                class408.method2559(this.field6074, (int) (this.field6050 - this.field6067), arg1, arg2, arg3);
                this.field6050 += (long) arg3;
                return;
            }
            if (arg0 >= -103) {
                field6058 = -118;
            }
            long var5 = this.field6050;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field6050 >= this.field6062 && (long) this.field6071 + this.field6062 > this.field6050) {
                int var9 = (int) (this.field6062 + (long) this.field6071 - this.field6050);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class408.method2559(this.field6057, (int) (this.field6050 - this.field6062), arg1, arg2, var9);
                arg3 -= var9;
                this.field6050 += (long) var9;
                arg2 += var9;
            }
            if (this.field6057.length < arg3) {
                this.field6055.method2215(this.field6050, (byte) -29);
                this.field6069 = this.field6050;
                while (arg3 > 0) {
                    int var10 = this.field6055.method2213((byte) 66, arg2, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    this.field6050 += (long) var10;
                    this.field6069 += (long) var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                this.method2561((byte) 102);
                int var11 = arg3;
                if (this.field6071 < arg3) {
                    var11 = this.field6071;
                }
                class408.method2559(this.field6057, 0, arg1, arg2, var11);
                this.field6050 += (long) var11;
                arg3 -= var11;
                arg2 += var11;
            }
            if (this.field6067 != -1L) {
                if (this.field6067 > this.field6050 && arg3 > 0) {
                    int var12 = (int) (this.field6067 - this.field6050) + arg2;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        arg3--;
                        this.field6050++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field6067 >= var5 && this.field6067 < (long) var8 + var5) {
                    var13 = this.field6067;
                } else if (this.field6067 <= var5 && var5 < this.field6067 + ((long) this.field6070)) {
                    var13 = var5;
                }
                if ((long) this.field6070 + this.field6067 > var5 && (long) var8 + var5 >= (long) this.field6070 + this.field6067) {
                    var15 = (long) this.field6070 + this.field6067;
                } else if (this.field6067 < ((long) var8 + var5) && ((long) this.field6070 + this.field6067) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class408.method2559(this.field6074, (int) (var13 - this.field6067), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field6050) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field6050));
                        this.field6050 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6069 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)V", line = 504)
    public static void method2568(byte arg0) {
        field6047 = null;
        field6059 = null;
        field6049 = null;
        field6075 = null;
        int var1 = -20 % ((-arg0 - 56) / 52);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Z", line = 531)
    public static final boolean method2569(int arg0) {
        field6068++;
        if (arg0 != 6324) {
            method2569(88);
        }
        return class385.field5812;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lk;II)V", line = 585)
    public class409(class335 arg0, int arg1, int arg2) throws IOException {
        this.field6055 = arg0;
        this.field6061 = this.field6052 = arg0.method2212((byte) -56);
        this.field6050 = 0L;
        this.field6057 = new byte[arg1];
        this.field6074 = new byte[arg2];
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[B)V", line = 561)
    public final void method2570(int arg0, byte[] arg1) throws IOException {
        this.method2567(-104, arg1, 0, arg1.length);
        field6051++;
        int var3 = 127 % ((arg0 + 44) / 61);
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V", line = 603)
    public static final void method2571(int arg0) {
        class52 var1 = class287.field4601;
        synchronized (class287.field4601) {
            class287.field4601.method335((byte) -46);
        }
        int var2 = 26 % ((1 - arg0) / 36);
        field6064++;
    }
}
