import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class326 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private int field5078 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "J")
    private long field5065 = -1L;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "J")
    private long field5085 = -1L;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lia;")
    private class14 field5073;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "J")
    private long field5080;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "J")
    private long field5075;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "J")
    private long field5074;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[B")
    private byte[] field5063;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[B")
    private byte[] field5083;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Luk;")
    public static class135 field5082 = null;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lpg;")
    public static class320 field5081 = new class320(2);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field5064;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "J")
    private long field5068;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B[B)V", line = 12)
    public final void method2207(byte arg0, byte[] arg1) throws IOException {
        if (arg0 != 54) {
            this.field5073 = (class14) null;
        }
        field5070++;
        this.method2215(arg1, arg1.length, 0, -1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 24)
    private final void method2208(int arg0) throws IOException {
        if (this.field5085 != -1L) {
            if (this.field5085 != this.field5068) {
                this.field5073.method104(this.field5085, true);
                this.field5068 = this.field5085;
            }
            long var2 = -1L;
            long var4 = -1L;
            this.field5073.method105(this.field5078, 0, (byte) -74, this.field5063);
            this.field5068 += (long) this.field5078;
            if (this.field5068 > this.field5080) {
                this.field5080 = this.field5068;
            }
            if (this.field5065 < ((long) this.field5078 + this.field5085) && ((long) this.field5078 + this.field5085) <= (this.field5065 + ((long) this.field5064))) {
                var2 = (long) this.field5078 + this.field5085;
            } else if (this.field5085 < ((long) this.field5064 + this.field5065) && this.field5065 + ((long) this.field5064) <= (long) this.field5078 + this.field5085) {
                var2 = (long) this.field5064 + this.field5065;
            }
            if (this.field5085 >= this.field5065 && this.field5085 < ((long) this.field5064 + this.field5065)) {
                var4 = this.field5085;
            } else if (this.field5085 <= this.field5065 && this.field5065 < ((long) this.field5078 + this.field5085)) {
                var4 = this.field5065;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class343.method2373(this.field5063, (int) (var4 - this.field5085), this.field5083, (int) (var4 - this.field5065), var6);
            }
            this.field5085 = -1L;
            this.field5078 = 0;
        }
        field5076++;
        if (arg0 != -31856) {
            this.method2210(-3);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[B)V", line = 110)
    public final void method2209(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5077++;
        try {
            if (this.field5075 < (long) arg2 + this.field5074) {
                this.field5075 = (long) arg2 + this.field5074;
            }
            if (this.field5085 != -1L && (this.field5085 > this.field5074 || (long) this.field5078 + this.field5085 < this.field5074)) {
                this.method2208(-31856);
            }
            if (this.field5085 != -1L && this.field5085 + ((long) this.field5063.length) < (long) arg2 + this.field5074) {
                int var5 = (int) ((long) this.field5063.length + this.field5085 - this.field5074);
                class343.method2373(arg3, arg1, this.field5063, (int) (this.field5074 - this.field5085), var5);
                arg1 += var5;
                arg2 -= var5;
                this.field5074 += (long) var5;
                this.field5078 = this.field5063.length;
                this.method2208(-31856);
            }
            if (this.field5063.length < arg2) {
                long var6 = -1L;
                if (this.field5074 != this.field5068) {
                    this.field5073.method104(this.field5074, true);
                    this.field5068 = this.field5074;
                }
                long var8 = -1L;
                this.field5073.method105(arg2, arg1, (byte) -71, arg3);
                if (this.field5065 <= this.field5074 && this.field5074 < (long) this.field5064 + this.field5065) {
                    var6 = this.field5074;
                } else if (this.field5074 <= this.field5065 && this.field5065 < ((long) arg2 + this.field5074)) {
                    var6 = this.field5065;
                }
                this.field5068 += (long) arg2;
                if (((long) arg2 + this.field5074) > this.field5065 && (this.field5074 + ((long) arg2)) <= ((long) this.field5064 + this.field5065)) {
                    var8 = this.field5074 + ((long) arg2);
                } else if (((long) this.field5064 + this.field5065) > this.field5074 && this.field5074 + ((long) arg2) >= (long) this.field5064 + this.field5065) {
                    var8 = this.field5065 + ((long) this.field5064);
                }
                if (this.field5068 > this.field5080) {
                    this.field5080 = this.field5068;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class343.method2373(arg3, (int) ((long) arg1 + var6 - this.field5074), this.field5083, (int) (var6 - this.field5065), var10);
                }
                this.field5074 += (long) arg2;
                return;
            }
            if (arg2 > 0) {
                if (this.field5085 == -1L) {
                    this.field5085 = this.field5074;
                }
                class343.method2373(arg3, arg1, this.field5063, (int) (this.field5074 - this.field5085), arg2);
                this.field5074 += (long) arg2;
                if ((long) this.field5078 < this.field5074 - this.field5085) {
                    this.field5078 = (int) (this.field5074 - this.field5085);
                }
                return;
            }
        } catch (IOException var13) {
            this.field5068 = -1L;
            throw var13;
        }
        int var12 = -81 % ((11 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)J", line = 241)
    public final long method2210(int arg0) {
        if (arg0 != -1) {
            method2214((byte) 123);
        }
        field5084++;
        return this.field5075;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Ljava/io/File;", line = 253)
    private final File method2211(int arg0) {
        if (arg0 == -1486022112) {
            field5066++;
            return this.field5073.method101(false);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BJ)V", line = 264)
    public final void method2212(byte arg0, long arg1) throws IOException {
        if (arg0 > -12) {
            field5081 = (class320) null;
        }
        field5067++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2211(-1486022112));
        }
        this.field5074 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 291)
    private final void method2213(byte arg0) throws IOException {
        this.field5064 = 0;
        field5071++;
        int var2 = 119 / ((-arg0 - 66) / 60);
        if (this.field5074 != this.field5068) {
            this.field5073.method104(this.field5074, true);
            this.field5068 = this.field5074;
        }
        this.field5065 = this.field5074;
        while (this.field5064 < this.field5083.length) {
            int var3 = this.field5083.length - this.field5064;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field5073.method106(this.field5064, this.field5083, false, var3);
            if (var4 == -1) {
                break;
            }
            this.field5068 += (long) var4;
            this.field5064 += var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lia;II)V", line = 549)
    public class326(class14 arg0, int arg1, int arg2) throws IOException {
        this.field5073 = arg0;
        this.field5075 = this.field5080 = arg0.method103(0);
        this.field5074 = 0L;
        this.field5063 = new byte[arg2];
        this.field5083 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 342)
    public static void method2214(byte arg0) {
        field5082 = null;
        if (arg0 != 101) {
            method2214((byte) -107);
        }
        field5081 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIII)V", line = 360)
    public final void method2215(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5079++;
        try {
            if ((arg1 + arg2) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 - (arg0.length - arg1));
            }
            if ((long) arg3 != this.field5085 && this.field5085 <= this.field5074 && (long) arg1 + this.field5074 <= (long) this.field5078 + this.field5085) {
                class343.method2373(this.field5063, (int) (this.field5074 - this.field5085), arg0, arg2, arg1);
                this.field5074 += (long) arg1;
                return;
            }
            int var5 = arg2;
            long var6 = this.field5074;
            int var8 = arg1;
            if (this.field5074 >= this.field5065 && this.field5074 < (long) this.field5064 + this.field5065) {
                int var9 = (int) ((long) this.field5064 + this.field5065 - this.field5074);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class343.method2373(this.field5083, (int) (this.field5074 - this.field5065), arg0, arg2, var9);
                this.field5074 += (long) var9;
                arg2 += var9;
            }
            if (this.field5083.length < arg1) {
                this.field5073.method104(this.field5074, true);
                this.field5068 = this.field5074;
                while (arg1 > 0) {
                    int var10 = this.field5073.method106(arg2, arg0, false, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    this.field5074 += (long) var10;
                    arg1 -= var10;
                    this.field5068 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method2213((byte) 38);
                int var11 = arg1;
                if (this.field5064 < arg1) {
                    var11 = this.field5064;
                }
                arg1 -= var11;
                class343.method2373(this.field5083, 0, arg0, arg2, var11);
                this.field5074 += (long) var11;
                arg2 += var11;
            }
            if (this.field5085 != -1L) {
                if (this.field5085 > this.field5074 && arg1 > 0) {
                    int var12 = (int) (this.field5085 - this.field5074) + arg2;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field5074++;
                    }
                }
                long var13 = -1L;
                if (var6 < (long) this.field5078 + this.field5085 && ((long) var8 + var6) >= ((long) this.field5078 + this.field5085)) {
                    var13 = (long) this.field5078 + this.field5085;
                } else if (((long) var8 + var6) > this.field5085 && ((long) var8 + var6) <= (this.field5085 + ((long) this.field5078))) {
                    var13 = (long) var8 + var6;
                }
                long var15 = -1L;
                if (this.field5085 >= var6 && this.field5085 < (long) var8 + var6) {
                    var15 = this.field5085;
                } else if (this.field5085 <= var6 && ((long) this.field5078 + this.field5085) > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class343.method2373(this.field5063, (int) (var15 - this.field5085), arg0, var5 + ((int) (var15 - var6)), var17);
                    if (this.field5074 < var13) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field5074));
                        this.field5074 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5068 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }
}
