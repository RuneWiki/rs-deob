import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class456 {

    @OriginalMember(owner = "client!nja", name = "j", descriptor = "J")
    private long field6425 = -1L;

    @OriginalMember(owner = "client!nja", name = "p", descriptor = "J")
    private long field6431 = -1L;

    @OriginalMember(owner = "client!nja", name = "t", descriptor = "I")
    private int field6435 = 0;

    @OriginalMember(owner = "client!nja", name = "r", descriptor = "Lea;")
    private class573 field6433;

    @OriginalMember(owner = "client!nja", name = "u", descriptor = "J")
    private long field6436;

    @OriginalMember(owner = "client!nja", name = "d", descriptor = "J")
    private long field6419;

    @OriginalMember(owner = "client!nja", name = "v", descriptor = "[B")
    private byte[] field6437;

    @OriginalMember(owner = "client!nja", name = "m", descriptor = "J")
    private long field6428;

    @OriginalMember(owner = "client!nja", name = "i", descriptor = "[B")
    private byte[] field6424;

    @OriginalMember(owner = "client!nja", name = "o", descriptor = "[Lne;")
    public static class338[] field6430 = new class338[14];

    @OriginalMember(owner = "client!nja", name = "c", descriptor = "I")
    public static int field6418 = 0;

    @OriginalMember(owner = "client!nja", name = "q", descriptor = "Lap;")
    public static class503 field6432 = new class503();

    @OriginalMember(owner = "client!nja", name = "y", descriptor = "I")
    public static int field6440 = 0;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!nja", name = "e", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!nja", name = "f", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!nja", name = "g", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!nja", name = "h", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!nja", name = "l", descriptor = "I")
    private int field6427;

    @OriginalMember(owner = "client!nja", name = "n", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!nja", name = "s", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!nja", name = "w", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!nja", name = "x", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!nja", name = "k", descriptor = "J")
    private long field6426;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IJ)V", line = 6)
    public final void method2759(int arg0, long arg1) throws IOException {
        if (arg0 <= 10) {
            method2768(true);
        }
        field6429++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2764(12));
        }
        this.field6428 = arg1;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I[B)V", line = 25)
    public final void method2760(int arg0, byte[] arg1) throws IOException {
        if (arg0 < 17) {
            this.method2764(-113);
        }
        this.method2766(arg1, arg1.length, 0, 125);
        field6420++;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIIIIIIII)V", line = 36)
    public static final void method2761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6441++;
        if (arg0 != -1) {
            field6430 = null;
        }
        if (arg2 >= class471.field6572 && class223.field2604 >= arg2 && class471.field6572 <= arg6 && class223.field2604 >= arg6 && class471.field6572 <= arg4 && arg4 <= class223.field2604 && class471.field6572 <= arg5 && arg5 <= class223.field2604 && arg8 >= class187.field2268 && class461.field6480 >= arg8 && arg9 >= class187.field2268 && class461.field6480 >= arg9 && arg7 >= class187.field2268 && arg7 <= class461.field6480 && arg3 >= class187.field2268 && arg3 <= class461.field6480) {
            class50.method463(arg2, arg5, arg4, arg6, arg9, arg7, arg3, arg1, -116, arg8);
        } else {
            class730.method4127(arg4, arg9, arg2, arg3, arg5, arg8, arg1, arg6, -5, arg7);
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V", line = 53)
    private final void method2762(int arg0) throws IOException {
        this.field6427 = 0;
        field6434++;
        if (this.field6428 != this.field6426) {
            this.field6433.method3318(arg0 - 26231, this.field6428);
            this.field6426 = this.field6428;
        }
        this.field6425 = this.field6428;
        while (this.field6424.length > this.field6427) {
            int var2 = this.field6424.length - this.field6427;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6433.method3322(this.field6427, var2, this.field6424, arg0 - 37662);
            if (var3 == -1) {
                break;
            }
            this.field6426 += var3;
            this.field6427 += var3;
        }
        if (arg0 != 26229) {
            field6430 = null;
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IZIIZ)V", line = 113)
    public static final void method2763(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field6417++;
        if (class118.field1503.field10665.method1903(0) == 0) {
            class402.method2352(-1, false);
        } else {
            class303.field3618 = class118.field1503.field10665.method1903(0);
            class677.method3810(true, 0, true);
        }
        class676.field9282 = arg4;
        class406.field5343 = arg0;
        class455.field6413 = arg3;
        class9.method160(arg2);
        if (!arg1) {
            method2761(-36, -88, -40, -69, 121, -10, -75, 86, -68, 86);
        }
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lea;II)V", line = 458)
    public class456(class573 arg0, int arg1, int arg2) throws IOException {
        this.field6433 = arg0;
        this.field6419 = this.field6436 = arg0.method3321(30971);
        this.field6437 = new byte[arg2];
        this.field6428 = 0L;
        this.field6424 = new byte[arg1];
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)Ljava/io/File;", line = 138)
    private final File method2764(int arg0) {
        int var2 = -95 % ((arg0 - 63) / 49);
        field6422++;
        return this.field6433.method3324((byte) 56);
    }

    @OriginalMember(owner = "client!nja", name = "c", descriptor = "(I)V", line = 150)
    private final void method2765(int arg0) throws IOException {
        if (this.field6431 != -1L) {
            if (this.field6431 != this.field6426) {
                this.field6433.method3318(-2, this.field6431);
                this.field6426 = this.field6431;
            }
            this.field6433.method3323(this.field6435, this.field6437, true, 0);
            this.field6426 += this.field6435;
            if (this.field6426 > this.field6436) {
                this.field6436 = this.field6426;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field6425 <= this.field6431 && this.field6431 < ((long) this.field6427 + this.field6425)) {
                var2 = this.field6431;
            } else if (this.field6425 >= this.field6431 && (long) this.field6435 + this.field6431 > this.field6425) {
                var2 = this.field6425;
            }
            if (this.field6425 < ((long) this.field6435 + this.field6431) && ((long) this.field6435 + this.field6431) <= ((long) this.field6427 + this.field6425)) {
                var4 = this.field6431 + ((long) this.field6435);
            } else if (this.field6431 < ((long) this.field6427 + this.field6425) && (this.field6425 + ((long) this.field6427)) <= ((long) this.field6435 + this.field6431)) {
                var4 = this.field6425 + ((long) this.field6427);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class211.method1330(this.field6437, (int) (var2 - this.field6431), this.field6424, (int) (var2 - this.field6425), var6);
            }
            this.field6431 = -1L;
            this.field6435 = 0;
        }
        if (arg0 != 0) {
            this.field6433 = null;
        }
        field6423++;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "([BIII)V", line = 227)
    public final void method2766(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6421++;
        int var5 = -121 / ((93 - arg3) / 32);
        try {
            if ((arg1 + arg2) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field6431 != -1L && this.field6428 >= this.field6431 && ((long) arg1 + this.field6428) <= ((long) this.field6435 + this.field6431)) {
                class211.method1330(this.field6437, (int) (this.field6428 - this.field6431), arg0, arg2, arg1);
                this.field6428 += arg1;
                return;
            }
            long var6 = this.field6428;
            int var8 = arg2;
            int var9 = arg1;
            if (this.field6425 <= this.field6428 && this.field6425 + ((long) this.field6427) > this.field6428) {
                int var10 = (int) (this.field6425 + (long) this.field6427 - this.field6428);
                if (var10 > arg1) {
                    var10 = arg1;
                }
                class211.method1330(this.field6424, (int) (this.field6428 - this.field6425), arg0, arg2, var10);
                arg1 -= var10;
                arg2 += var10;
                this.field6428 += var10;
            }
            if (this.field6424.length < arg1) {
                this.field6433.method3318(-2, this.field6428);
                this.field6426 = this.field6428;
                while (arg1 > 0) {
                    int var12 = this.field6433.method3322(arg2, arg1, arg0, -11433);
                    if (var12 == -1) {
                        break;
                    }
                    this.field6426 += var12;
                    arg1 -= var12;
                    arg2 += var12;
                    this.field6428 += var12;
                }
            } else if (arg1 > 0) {
                this.method2762(26229);
                int var11 = arg1;
                if (arg1 > this.field6427) {
                    var11 = this.field6427;
                }
                class211.method1330(this.field6424, 0, arg0, arg2, var11);
                this.field6428 += var11;
                arg2 += var11;
                arg1 -= var11;
            }
            if (this.field6431 != -1L) {
                if (this.field6428 < this.field6431 && arg1 > 0) {
                    int var13 = (int) (this.field6431 - this.field6428) + arg2;
                    if (arg1 + arg2 < var13) {
                        var13 = arg1 + arg2;
                    }
                    while (arg2 < var13) {
                        arg1--;
                        arg0[arg2++] = 0;
                        this.field6428++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (var6 <= this.field6431 && var6 + ((long) var9) > this.field6431) {
                    var14 = this.field6431;
                } else if (var6 >= this.field6431 && ((long) this.field6435 + this.field6431) > var6) {
                    var14 = var6;
                }
                if (((long) this.field6435 + this.field6431) > var6 && this.field6431 + ((long) this.field6435) <= (long) var9 + var6) {
                    var16 = (long) this.field6435 + this.field6431;
                } else if (this.field6431 < ((long) var9 + var6) && ((long) this.field6435 + this.field6431) >= ((long) var9 + var6)) {
                    var16 = (long) var9 + var6;
                }
                if (var14 > -1L && var14 < var16) {
                    int var18 = (int) (var16 - var14);
                    class211.method1330(this.field6437, (int) (var14 - this.field6431), arg0, (int) (var14 - var6) + var8, var18);
                    if (this.field6428 < var16) {
                        arg1 = (int) ((long) arg1 - (var16 - this.field6428));
                        this.field6428 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field6426 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Z)V", line = 422)
    public final void method2767(boolean arg0) throws IOException {
        field6438++;
        this.method2765(0);
        this.field6433.method3319(127);
        if (!arg0) {
            this.field6426 = -10L;
        }
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(Z)V", line = 435)
    public static void method2768(boolean arg0) {
        field6432 = null;
        if (!arg0) {
            method2761(-69, 69, 123, 68, -36, -11, -16, -90, 49, 34);
        }
        field6430 = null;
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(III[B)V", line = 484)
    public final void method2769(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field6439++;
        try {
            if (arg1 < 5) {
                field6440 = 108;
            }
            if (((long) arg2 + this.field6428) > this.field6419) {
                this.field6419 = this.field6428 + ((long) arg2);
            }
            if (this.field6431 != -1L && (this.field6428 < this.field6431 || this.field6431 + ((long) this.field6435) < this.field6428)) {
                this.method2765(0);
            }
            if (this.field6431 != -1L && ((long) arg2 + this.field6428) > ((long) this.field6437.length + this.field6431)) {
                int var5 = (int) ((long) this.field6437.length + this.field6431 - this.field6428);
                class211.method1330(arg3, arg0, this.field6437, (int) (this.field6428 - this.field6431), var5);
                arg2 -= var5;
                arg0 += var5;
                this.field6428 += var5;
                this.field6435 = this.field6437.length;
                this.method2765(0);
            }
            if (this.field6437.length < arg2) {
                if (this.field6428 != this.field6426) {
                    this.field6433.method3318(-2, this.field6428);
                    this.field6426 = this.field6428;
                }
                this.field6433.method3323(arg2, arg3, true, arg0);
                this.field6426 += arg2;
                if (this.field6436 < this.field6426) {
                    this.field6436 = this.field6426;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6425 <= this.field6428 && this.field6428 < ((long) this.field6427 + this.field6425)) {
                    var6 = this.field6428;
                } else if (this.field6428 <= this.field6425 && this.field6425 < ((long) arg2 + this.field6428)) {
                    var6 = this.field6425;
                }
                if (this.field6425 < (long) arg2 + this.field6428 && this.field6425 + ((long) this.field6427) >= this.field6428 - -((long) arg2)) {
                    var8 = (long) arg2 + this.field6428;
                } else if (this.field6428 < (this.field6425 + ((long) this.field6427)) && ((long) this.field6427 + this.field6425) <= ((long) arg2 + this.field6428)) {
                    var8 = (long) this.field6427 + this.field6425;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class211.method1330(arg3, (int) ((long) arg0 + var6 - this.field6428), this.field6424, (int) (var6 - this.field6425), var10);
                }
                this.field6428 += arg2;
            } else if (arg2 > 0) {
                if (this.field6431 == -1L) {
                    this.field6431 = this.field6428;
                }
                class211.method1330(arg3, arg0, this.field6437, (int) (this.field6428 - this.field6431), arg2);
                this.field6428 += arg2;
                if (this.field6428 - this.field6431 > (long) this.field6435) {
                    this.field6435 = (int) (this.field6428 - this.field6431);
                }
            }
        } catch (IOException var12) {
            this.field6426 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)J", line = 608)
    public final long method2770(byte arg0) {
        int var2 = -87 / ((arg0 - 31) / 63);
        field6416++;
        return this.field6419;
    }
}
