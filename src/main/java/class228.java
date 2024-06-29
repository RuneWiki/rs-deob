import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class228 {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "J")
    private long field4272 = -1L;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "J")
    private long field4273 = -1L;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    private int field4296 = 0;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lwh;")
    private class236 field4276;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "J")
    private long field4269;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "J")
    private long field4286;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "J")
    private long field4288;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[B")
    private byte[] field4295;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[B")
    private byte[] field4290;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lvd;")
    public static class222 field4274 = class212.method1357("Benutzen Sie die (WPasswort -=ndern(W Option", 10731);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[I")
    public static int[] field4278 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lvd;")
    private static class222 field4268 = class212.method1357("Loaded sprites", 10731);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lvd;")
    private static class222 field4281 = class212.method1357("You can(Wt add yourself to your own ignore list)3", 10731);

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lvd;")
    public static class222 field4291 = class212.method1357("m", 10731);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    public static int[] field4293 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lvd;")
    public static class222 field4271 = field4281;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lvd;")
    public static class222 field4279 = field4268;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "J")
    private long field4298;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Lba;")
    public static class13 field4275;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "Ls;")
    public static class188 field4297;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Z")
    public static boolean field4289;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[Lva;")
    public static class219[] field4299;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III[B)V")
    public final void method1496(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4267++;
        try {
            if (this.field4286 < (long) arg0 + this.field4288) {
                this.field4286 = (long) arg0 + this.field4288;
            }
            if (this.field4273 != -1L && (this.field4288 < this.field4273 || (long) this.field4296 + this.field4273 < this.field4288)) {
                this.method1505((byte) -121);
            }
            if (this.field4273 != -1L && (long) arg0 + this.field4288 > this.field4273 - -((long) this.field4290.length)) {
                int var5 = (int) (this.field4273 + (long) this.field4290.length - this.field4288);
                class163.method1025(arg3, arg1, this.field4290, (int) (this.field4288 - this.field4273), var5);
                arg1 += var5;
                arg0 -= var5;
                this.field4288 += var5;
                this.field4296 = this.field4290.length;
                this.method1505((byte) -125);
            }
            if (this.field4290.length < arg0) {
                if (this.field4298 != this.field4288) {
                    this.field4276.method1538(this.field4288, (byte) 112);
                    this.field4298 = this.field4288;
                }
                this.field4276.method1541(arg0, arg2 ^ 0xFFFFFFFE, arg3, arg1);
                this.field4298 += arg0;
                long var6 = -1L;
                if (this.field4272 <= this.field4288 && this.field4288 < (long) this.field4277 + this.field4272) {
                    var6 = this.field4288;
                } else if (this.field4288 <= this.field4272 && (long) arg0 + this.field4288 > this.field4272) {
                    var6 = this.field4272;
                }
                if (this.field4298 > this.field4269) {
                    this.field4269 = this.field4298;
                }
                long var8 = -1L;
                if ((long) arg0 + this.field4288 > this.field4272 && (long) this.field4277 + this.field4272 >= this.field4288 - -((long) arg0)) {
                    var8 = (long) arg0 + this.field4288;
                } else if ((long) this.field4277 + this.field4272 > this.field4288 && (long) this.field4277 + this.field4272 <= (long) arg0 + this.field4288) {
                    var8 = this.field4272 + (long) this.field4277;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class163.method1025(arg3, (int) ((long) arg1 + var6 - this.field4288), this.field4295, (int) (var6 - this.field4272), var10);
                }
                this.field4288 += arg0;
            } else if (arg2 > ~arg0) {
                if (this.field4273 == -1L) {
                    this.field4273 = this.field4288;
                }
                class163.method1025(arg3, arg1, this.field4290, (int) (this.field4288 - this.field4273), arg0);
                this.field4288 += arg0;
                if ((long) this.field4296 < this.field4288 - this.field4273) {
                    this.field4296 = (int) (this.field4288 - this.field4273);
                }
            }
        } catch (IOException var12) {
            this.field4298 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method1497(int arg0) throws IOException {
        field4280++;
        this.method1505((byte) -118);
        if (arg0 != -1) {
            method1503(-14L, true);
        }
        this.field4276.method1536((byte) 70);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    private final void method1498(byte arg0) throws IOException {
        this.field4277 = 0;
        if (arg0 < 10) {
            return;
        }
        if (this.field4298 != this.field4288) {
            this.field4276.method1538(this.field4288, (byte) 112);
            this.field4298 = this.field4288;
        }
        field4301++;
        this.field4272 = this.field4288;
        while (this.field4295.length > this.field4277) {
            int var2 = this.field4295.length - this.field4277;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4276.method1539((byte) -45, this.field4277, this.field4295, var2);
            if (var3 == -1) {
                break;
            }
            this.field4277 += var3;
            this.field4298 += var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static void method1499(int arg0) {
        field4297 = null;
        field4268 = null;
        field4279 = null;
        field4291 = null;
        field4271 = null;
        int var1 = -49 % ((2 - arg0) / 53);
        field4278 = null;
        field4274 = null;
        field4299 = null;
        field4293 = null;
        field4275 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B[B)V")
    public final void method1500(byte arg0, byte[] arg1) throws IOException {
        if (arg0 != 8) {
            this.method1502(-27);
        }
        this.method1507(arg1.length, arg1, 0, arg0 + 16751);
        field4294++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V")
    public final void method1501(byte arg0, long arg1) throws IOException {
        field4282++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1502(28020));
        }
        this.field4288 = arg1;
        if (arg0 > -75) {
            field4278 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1502(int arg0) {
        field4284++;
        return arg0 == 28020 ? this.field4276.method1537((byte) -120) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(JZ)Lvd;")
    public static final class222 method1503(long arg0, boolean arg1) {
        field4285++;
        return arg1 ? null : class69.method471(arg0, (byte) -110, false, 10);
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)J")
    public final long method1504(int arg0) {
        field4300++;
        if (arg0 != -1) {
            method1503(-100L, true);
        }
        return this.field4286;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    private final void method1505(byte arg0) throws IOException {
        field4283++;
        if (this.field4273 != -1L) {
            if (this.field4298 != this.field4273) {
                this.field4276.method1538(this.field4273, (byte) 112);
                this.field4298 = this.field4273;
            }
            long var2 = -1L;
            this.field4276.method1541(this.field4296, 1, this.field4290, 0);
            if (this.field4272 <= this.field4273 && this.field4273 < this.field4272 + (long) this.field4277) {
                var2 = this.field4273;
            } else if (this.field4272 >= this.field4273 && (long) this.field4296 + this.field4273 > this.field4272) {
                var2 = this.field4272;
            }
            this.field4298 += this.field4296;
            if (this.field4269 < this.field4298) {
                this.field4269 = this.field4298;
            }
            long var4 = -1L;
            if (this.field4273 + (long) this.field4296 > this.field4272 && this.field4272 + (long) this.field4277 >= (long) this.field4296 + this.field4273) {
                var4 = (long) this.field4296 + this.field4273;
            } else if ((long) this.field4277 + this.field4272 > this.field4273 && (long) this.field4296 + this.field4273 >= (long) this.field4277 + this.field4272) {
                var4 = this.field4272 + (long) this.field4277;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class163.method1025(this.field4290, (int) (var2 - this.field4273), this.field4295, (int) (var2 - this.field4272), var6);
            }
            this.field4273 = -1L;
            this.field4296 = 0;
        }
        if (arg0 > -115) {
            method1503(48L, true);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILbg;BILba;)V")
    public static final void method1506(int arg0, int arg1, int arg2, class19 arg3, byte arg4, int arg5, class13 arg6) {
        field4270++;
        if (arg3 == null) {
            return;
        }
        if (arg4 >= -42) {
            field4278 = null;
        }
        int var7 = class34.field740 + class116.field2218 & 0x7FF;
        int var8 = Math.max(arg6.field341 / 2, arg6.field245 / 2) + 10;
        int var9 = arg0 * arg0 + arg5 * arg5;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class199.field3640[var7];
        int var11 = class199.field3624[var7];
        int var12 = var11 * 256 / (class208.field3876 + 256);
        int var13 = var10 * 256 / (class208.field3876 + 256);
        int var14 = arg0 * var12 + arg5 * var13 >> 16;
        int var15 = arg5 * var12 - arg0 * var13 >> 16;
        arg3.method161(arg6.field341 / 2 + arg1 + var14 - arg3.field447 / 2, -var15 - arg3.field444 / 2 + (arg2 - -(arg6.field245 / 2)), arg6.field272, arg6.field346);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[BII)V")
    public final void method1507(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4292++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field4273 != -1L && this.field4288 >= this.field4273 && (long) arg0 + this.field4288 <= (long) this.field4296 + this.field4273) {
                class163.method1025(this.field4290, (int) (this.field4288 - this.field4273), arg1, arg2, arg0);
                this.field4288 += arg0;
                return;
            }
            long var5 = this.field4288;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field4288 >= this.field4272 && this.field4288 < (long) this.field4277 + this.field4272) {
                int var9 = (int) ((long) this.field4277 + this.field4272 - this.field4288);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class163.method1025(this.field4295, (int) (this.field4288 - this.field4272), arg1, arg2, var9);
                arg2 += var9;
                this.field4288 += var9;
                arg0 -= var9;
            }
            if (arg0 > this.field4295.length) {
                this.field4276.method1538(this.field4288, (byte) 112);
                this.field4298 = this.field4288;
                while (arg0 > 0) {
                    int var11 = this.field4276.method1539((byte) -45, arg2, arg1, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field4298 += var11;
                    arg2 += var11;
                    this.field4288 += var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method1498((byte) 124);
                int var10 = arg0;
                if (this.field4277 < arg0) {
                    var10 = this.field4277;
                }
                arg0 -= var10;
                class163.method1025(this.field4295, 0, arg1, arg2, var10);
                arg2 += var10;
                this.field4288 += var10;
            }
            if (this.field4273 != -1L) {
                if (this.field4288 < this.field4273 && arg0 > 0) {
                    int var12 = (int) (this.field4273 - this.field4288) + arg2;
                    if (var12 > arg0 + arg2) {
                        var12 = arg2 + arg0;
                    }
                    while (arg2 < var12) {
                        arg1[arg2++] = 0;
                        this.field4288++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field4273 && this.field4273 < var5 + (long) var7) {
                    var13 = this.field4273;
                } else if (this.field4273 <= var5 && (long) this.field4296 + this.field4273 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field4296 + this.field4273 && var5 + (long) var7 >= this.field4273 - -((long) this.field4296)) {
                    var15 = this.field4273 + (long) this.field4296;
                } else if ((long) var7 + var5 > this.field4273 && (long) var7 + var5 <= (long) this.field4296 + this.field4273) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class163.method1025(this.field4290, (int) (var13 - this.field4273), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field4288 < var15) {
                        arg0 = (int) ((long) arg0 + this.field4288 - var15);
                        this.field4288 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4298 = -1L;
            throw var19;
        }
        if (arg3 != 16759) {
            this.field4286 = 106L;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method1508(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1508(-14, -80, 59);
        }
        field4266++;
        if (class172.field3227 < 2 && class214.field3979 == 0 && !class79.field1522) {
            return;
        }
        class222 var3;
        if (class214.field3979 == 1 && class172.field3227 < 2) {
            var3 = class234.method1531(new class222[] { class153.field2946, class98.field1843, class211.field3931, class135.field2607 }, -10949);
        } else if (class79.field1522 && class172.field3227 < 2) {
            var3 = class234.method1531(new class222[] { class55.field1038, class98.field1843, class17.field429, class135.field2607 }, -10949);
        } else {
            var3 = client.method276((byte) 88, class172.field3227 - 1);
        }
        if (class172.field3227 > 2) {
            var3 = class234.method1531(new class222[] { var3, class52.field998, class56.method414(-105, class172.field3227 - 2), class87.field1651 }, arg2 ^ 0x2AC4);
        }
        int var4 = class138.field2664.method903(var3, arg0 + 4, arg1 + 15, 16777215, 0, class159.field3026, class32.field683);
        class77.method512(arg0 + 4, 15, 0, var4 + class138.field2664.method900(var3), arg1);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lwh;II)V")
    public class228(class236 arg0, int arg1, int arg2) throws IOException {
        this.field4276 = arg0;
        this.field4286 = this.field4269 = arg0.method1540(82);
        this.field4288 = 0L;
        this.field4295 = new byte[arg1];
        this.field4290 = new byte[arg2];
    }
}
