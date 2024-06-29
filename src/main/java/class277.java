import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class277 {

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
    private long field4298 = -1L;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field4295 = 0;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "J")
    private long field4310 = -1L;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lmc;")
    private class55 field4289;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "J")
    private long field4296;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "J")
    private long field4304;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[B")
    private byte[] field4302;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[B")
    private byte[] field4297;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "J")
    private long field4308;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field4307 = -1;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4292 = -1;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field4313 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    private int field4290;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "J")
    private long field4291;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lmn;")
    public static class161 field4303;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lrj;")
    public static class269 field4299;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J", line = 10)
    public final long method1917(byte arg0) {
        field4312++;
        if (arg0 != -85) {
            this.field4291 = -40L;
        }
        return this.field4304;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Ljava/io/File;", line = 27)
    private final File method1918(byte arg0) {
        field4294++;
        if (arg0 > -24) {
            this.field4304 = 76L;
        }
        return this.field4289.method394(0);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 46)
    private final void method1919(int arg0) throws IOException {
        field4305++;
        this.field4290 = 0;
        if (arg0 != 5838) {
            this.field4290 = 122;
        }
        if (this.field4308 != this.field4291) {
            this.field4289.method398(this.field4308, (byte) 22);
            this.field4291 = this.field4308;
        }
        this.field4298 = this.field4308;
        while (this.field4302.length > this.field4290) {
            int var2 = this.field4302.length - this.field4290;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4289.method396(this.field4302, this.field4290, var2, (byte) -29);
            if (var3 == -1) {
                break;
            }
            this.field4291 += (long) var3;
            this.field4290 += var3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 88)
    public static void method1920(boolean arg0) {
        field4303 = null;
        field4299 = null;
        if (!arg0) {
            method1920(false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BJ)V", line = 99)
    public final void method1921(byte arg0, long arg1) throws IOException {
        field4309++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1918((byte) -59));
        }
        this.field4308 = arg1;
        if (arg0 != -102) {
            this.method1918((byte) 53);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)V", line = 114)
    public final void method1922(byte[] arg0, int arg1) throws IOException {
        field4288++;
        this.method1924(0, arg0, true, arg0.length);
        if (arg1 >= -15) {
            method1920(true);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BII)V", line = 136)
    public final void method1923(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4301++;
        try {
            if ((long) arg3 + this.field4308 > this.field4304) {
                this.field4304 = (long) arg3 + this.field4308;
            }
            if (this.field4310 != -1L && (this.field4310 > this.field4308 || this.field4308 > (long) this.field4295 + this.field4310)) {
                this.method1925(false);
            }
            if ((long) arg2 != this.field4310 && ((long) this.field4297.length + this.field4310) < (this.field4308 + ((long) arg3))) {
                int var5 = (int) (this.field4310 + (long) this.field4297.length - this.field4308);
                arg3 -= var5;
                class126.method947(arg1, arg0, this.field4297, (int) (this.field4308 - this.field4310), var5);
                this.field4308 += (long) var5;
                this.field4295 = this.field4297.length;
                arg0 += var5;
                this.method1925(false);
            }
            if (this.field4297.length < arg3) {
                if (this.field4308 != this.field4291) {
                    this.field4289.method398(this.field4308, (byte) 22);
                    this.field4291 = this.field4308;
                }
                long var6 = -1L;
                this.field4289.method397(arg3, (byte) 120, arg1, arg0);
                if (this.field4298 <= this.field4308 && (this.field4298 + ((long) this.field4290)) > this.field4308) {
                    var6 = this.field4308;
                } else if (this.field4298 >= this.field4308 && ((long) arg3 + this.field4308) > this.field4298) {
                    var6 = this.field4298;
                }
                this.field4291 += (long) arg3;
                long var8 = -1L;
                if (this.field4291 > this.field4296) {
                    this.field4296 = this.field4291;
                }
                if (this.field4298 < ((long) arg3 + this.field4308) && (long) arg3 + this.field4308 <= (long) this.field4290 + this.field4298) {
                    var8 = (long) arg3 + this.field4308;
                } else if (this.field4308 < (long) this.field4290 + this.field4298 && ((long) this.field4290 + this.field4298) <= ((long) arg3 + this.field4308)) {
                    var8 = (long) this.field4290 + this.field4298;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class126.method947(arg1, (int) ((long) arg0 + var6 - this.field4308), this.field4302, (int) (var6 - this.field4298), var10);
                }
                this.field4308 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field4310 == -1L) {
                    this.field4310 = this.field4308;
                }
                class126.method947(arg1, arg0, this.field4297, (int) (this.field4308 - this.field4310), arg3);
                this.field4308 += (long) arg3;
                if ((this.field4308 - this.field4310) > ((long) this.field4295)) {
                    this.field4295 = (int) (this.field4308 - this.field4310);
                }
            }
        } catch (IOException var12) {
            this.field4291 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lmc;II)V", line = 566)
    public class277(class55 arg0, int arg1, int arg2) throws IOException {
        this.field4289 = arg0;
        this.field4304 = this.field4296 = arg0.method393(29853);
        this.field4302 = new byte[arg1];
        this.field4297 = new byte[arg2];
        this.field4308 = 0L;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BZI)V", line = 275)
    public final void method1924(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field4311++;
        try {
            if (arg1.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (this.field4310 != -1L && this.field4310 <= this.field4308 && this.field4308 + ((long) arg3) <= (long) this.field4295 + this.field4310) {
                class126.method947(this.field4297, (int) (this.field4308 - this.field4310), arg1, arg0, arg3);
                this.field4308 += (long) arg3;
                return;
            }
            if (!arg2) {
                this.method1918((byte) 98);
            }
            long var5 = this.field4308;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field4298 <= this.field4308 && (this.field4298 + ((long) this.field4290)) > this.field4308) {
                int var9 = (int) ((long) this.field4290 + this.field4298 - this.field4308);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class126.method947(this.field4302, (int) (this.field4308 - this.field4298), arg1, arg0, var9);
                arg0 += var9;
                this.field4308 += (long) var9;
            }
            if (arg3 > this.field4302.length) {
                this.field4289.method398(this.field4308, (byte) 22);
                this.field4291 = this.field4308;
                while (arg3 > 0) {
                    int var10 = this.field4289.method396(arg1, arg0, arg3, (byte) -29);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4308 += (long) var10;
                    arg3 -= var10;
                    this.field4291 += (long) var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                this.method1919(5838);
                int var11 = arg3;
                if (arg3 > this.field4290) {
                    var11 = this.field4290;
                }
                arg3 -= var11;
                class126.method947(this.field4302, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field4308 += (long) var11;
            }
            if (this.field4310 != -1L) {
                if (this.field4310 > this.field4308 && arg3 > 0) {
                    int var12 = arg0 + ((int) (this.field4310 - this.field4308));
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field4308++;
                    }
                }
                long var13 = -1L;
                if (this.field4310 >= var5 && this.field4310 < ((long) var7 + var5)) {
                    var13 = this.field4310;
                } else if (this.field4310 <= var5 && var5 < ((long) this.field4295 + this.field4310)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field4295 + this.field4310 > var5 && ((long) this.field4295 + this.field4310) <= ((long) var7 + var5)) {
                    var15 = (long) this.field4295 + this.field4310;
                } else if ((var5 + ((long) var7)) > this.field4310 && ((long) var7 + var5) <= ((long) this.field4295 + this.field4310)) {
                    var15 = var5 + ((long) var7);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class126.method947(this.field4297, (int) (var13 - this.field4310), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field4308 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field4308));
                        this.field4308 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4291 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 488)
    private final void method1925(boolean arg0) throws IOException {
        if (arg0) {
            field4303 = (class161) null;
        }
        if (this.field4310 != -1L) {
            if (this.field4310 != this.field4291) {
                this.field4289.method398(this.field4310, (byte) 22);
                this.field4291 = this.field4310;
            }
            this.field4289.method397(this.field4295, (byte) 125, this.field4297, 0);
            this.field4291 += (long) this.field4295;
            long var2 = -1L;
            if (this.field4296 < this.field4291) {
                this.field4296 = this.field4291;
            }
            long var4 = -1L;
            if (this.field4298 < ((long) this.field4295 + this.field4310) && (this.field4298 + ((long) this.field4290)) >= ((long) this.field4295 + this.field4310)) {
                var4 = this.field4310 + ((long) this.field4295);
            } else if (this.field4310 < (long) this.field4290 + this.field4298 && ((long) this.field4295 + this.field4310) >= ((long) this.field4290 + this.field4298)) {
                var4 = (long) this.field4290 + this.field4298;
            }
            if (this.field4310 >= this.field4298 && this.field4298 + ((long) this.field4290) > this.field4310) {
                var2 = this.field4310;
            } else if (this.field4310 <= this.field4298 && this.field4298 < (this.field4310 + ((long) this.field4295))) {
                var2 = this.field4298;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class126.method947(this.field4297, (int) (var2 - this.field4310), this.field4302, (int) (var2 - this.field4298), var6);
            }
            this.field4310 = -1L;
            this.field4295 = 0;
        }
        field4314++;
    }
}
