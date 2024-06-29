import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class213 {

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    private int field2594 = 0;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "J")
    private long field2597 = -1L;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "J")
    private long field2593 = -1L;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lob;")
    private class627 field2604;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "J")
    private long field2588;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "J")
    private long field2589;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[B")
    private byte[] field2587;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[B")
    private byte[] field2599;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "J")
    private long field2598;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    public static boolean field2595 = false;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "J")
    private long field2590;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z[B)V")
    public final void method1215(boolean arg0, byte[] arg1) throws IOException {
        this.method1217(arg1.length, (byte) 112, 0, arg1);
        field2602++;
        if (!arg0) {
            this.field2593 = -7L;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z")
    public static final boolean method1216(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field2606++;
            return (arg0 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI[B)V")
    public final void method1217(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2586++;
        try {
            if ((arg0 + arg2) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field2597 != -1L && this.field2598 >= this.field2597 && ((long) this.field2594 + this.field2597) >= (this.field2598 + ((long) arg0))) {
                class345.method1932(this.field2587, (int) (this.field2598 - this.field2597), arg3, arg2, arg0);
                this.field2598 += arg0;
                return;
            }
            int var5 = -79 % ((arg1 - 36) / 53);
            long var6 = this.field2598;
            int var8 = arg2;
            int var9 = arg0;
            if (this.field2598 >= this.field2593 && this.field2598 < (long) this.field2600 + this.field2593) {
                int var10 = (int) (this.field2593 - (this.field2598 - (long) this.field2600));
                if (arg0 < var10) {
                    var10 = arg0;
                }
                class345.method1932(this.field2599, (int) (this.field2598 - this.field2593), arg3, arg2, var10);
                arg2 += var10;
                arg0 -= var10;
                this.field2598 += var10;
            }
            if (this.field2599.length < arg0) {
                this.field2604.method3595(-122, this.field2598);
                this.field2590 = this.field2598;
                while (arg0 > 0) {
                    int var12 = this.field2604.method3597(false, arg3, arg2, arg0);
                    if (var12 == -1) {
                        break;
                    }
                    this.field2590 += var12;
                    arg0 -= var12;
                    arg2 += var12;
                    this.field2598 += var12;
                }
            } else if (arg0 > 0) {
                this.method1219(-122);
                int var11 = arg0;
                if (this.field2600 < arg0) {
                    var11 = this.field2600;
                }
                class345.method1932(this.field2599, 0, arg3, arg2, var11);
                arg0 -= var11;
                this.field2598 += var11;
                arg2 += var11;
            }
            if (this.field2597 != -1L) {
                if (this.field2598 < this.field2597 && arg0 > 0) {
                    int var13 = (int) (this.field2597 - this.field2598) + arg2;
                    if (var13 > (arg0 + arg2)) {
                        var13 = arg2 + arg0;
                    }
                    while (var13 > arg2) {
                        arg0--;
                        arg3[arg2++] = 0;
                        this.field2598++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (this.field2597 >= var6 && ((long) var9 + var6) > this.field2597) {
                    var14 = this.field2597;
                } else if (this.field2597 <= var6 && this.field2597 + ((long) this.field2594) > var6) {
                    var14 = var6;
                }
                if ((long) this.field2594 + this.field2597 > var6 && var6 + ((long) var9) >= this.field2597 - -((long) this.field2594)) {
                    var16 = (long) this.field2594 + this.field2597;
                } else if (this.field2597 < var6 + ((long) var9) && (long) this.field2594 + this.field2597 >= var6 - -((long) var9)) {
                    var16 = (long) var9 + var6;
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class345.method1932(this.field2587, (int) (var14 - this.field2597), arg3, (int) (var14 - var6) + var8, var18);
                    if (this.field2598 < var16) {
                        arg0 = (int) ((long) arg0 - (var16 - this.field2598));
                        this.field2598 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2590 = -1L;
            throw var20;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(JI)V")
    public final void method1218(long arg0, int arg1) throws IOException {
        field2591++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1222(-1));
        }
        this.field2598 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    private final void method1219(int arg0) throws IOException {
        this.field2600 = 0;
        field2601++;
        if (arg0 >= -106) {
            method1220(111, -50, 89);
        }
        if (this.field2598 != this.field2590) {
            this.field2604.method3595(121, this.field2598);
            this.field2590 = this.field2598;
        }
        this.field2593 = this.field2598;
        while (this.field2600 < this.field2599.length) {
            int var2 = this.field2599.length - this.field2600;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2604.method3597(false, this.field2599, this.field2600, var2);
            if (var3 == -1) {
                break;
            }
            this.field2600 += var3;
            this.field2590 += var3;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
    public static final boolean method1220(int arg0, int arg1, int arg2) {
        if (arg1 >= -101) {
            method1220(94, -127, 19);
        }
        field2605++;
        return class220.method1269(-35, arg0, arg2) | (arg0 & 0x70000) != 0 || class264.method1476(10, arg0, arg2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    private final void method1221(byte arg0) throws IOException {
        if (this.field2597 != -1L) {
            if (this.field2597 != this.field2590) {
                this.field2604.method3595(-96, this.field2597);
                this.field2590 = this.field2597;
            }
            this.field2604.method3593(0, this.field2587, this.field2594, (byte) 125);
            this.field2590 += this.field2594;
            if (this.field2590 > this.field2588) {
                this.field2588 = this.field2590;
            }
            long var2 = -1L;
            if (this.field2593 <= this.field2597 && (long) this.field2600 + this.field2593 > this.field2597) {
                var2 = this.field2597;
            } else if (this.field2593 >= this.field2597 && (long) this.field2594 + this.field2597 > this.field2593) {
                var2 = this.field2593;
            }
            long var4 = -1L;
            if ((long) this.field2594 + this.field2597 > this.field2593 && (this.field2593 + ((long) this.field2600)) >= ((long) this.field2594 + this.field2597)) {
                var4 = (long) this.field2594 + this.field2597;
            } else if (((long) this.field2600 + this.field2593) > this.field2597 && (this.field2597 + ((long) this.field2594)) >= ((long) this.field2600 + this.field2593)) {
                var4 = (long) this.field2600 + this.field2593;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class345.method1932(this.field2587, (int) (var2 - this.field2597), this.field2599, (int) (var2 - this.field2593), var6);
            }
            this.field2594 = 0;
            this.field2597 = -1L;
        }
        if (arg0 > 106) {
            field2596++;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1222(int arg0) {
        field2585++;
        return arg0 == -1 ? this.field2604.method3592(true) : null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BIBI)V")
    public final void method1223(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 > -63) {
            this.field2600 = -10;
        }
        field2603++;
        try {
            if (this.field2589 < (long) arg1 + this.field2598) {
                this.field2589 = (long) arg1 + this.field2598;
            }
            if (this.field2597 != -1L && (this.field2597 > this.field2598 || (long) this.field2594 + this.field2597 < this.field2598)) {
                this.method1221((byte) 115);
            }
            if (this.field2597 != -1L && (long) this.field2587.length + this.field2597 < this.field2598 - -((long) arg1)) {
                int var5 = (int) ((long) this.field2587.length - (this.field2598 - this.field2597));
                class345.method1932(arg0, arg3, this.field2587, (int) (this.field2598 - this.field2597), var5);
                arg3 += var5;
                this.field2598 += var5;
                arg1 -= var5;
                this.field2594 = this.field2587.length;
                this.method1221((byte) 120);
            }
            if (this.field2587.length < arg1) {
                if (this.field2598 != this.field2590) {
                    this.field2604.method3595(-62, this.field2598);
                    this.field2590 = this.field2598;
                }
                this.field2604.method3593(arg3, arg0, arg1, (byte) 103);
                this.field2590 += arg1;
                if (this.field2590 > this.field2588) {
                    this.field2588 = this.field2590;
                }
                long var6 = -1L;
                if (this.field2593 <= this.field2598 && ((long) this.field2600 + this.field2593) > this.field2598) {
                    var6 = this.field2598;
                } else if (this.field2593 >= this.field2598 && this.field2593 < (long) arg1 + this.field2598) {
                    var6 = this.field2593;
                }
                long var8 = -1L;
                if (this.field2593 < (long) arg1 + this.field2598 && this.field2598 + ((long) arg1) <= this.field2593 - -((long) this.field2600)) {
                    var8 = (long) arg1 + this.field2598;
                } else if ((long) this.field2600 + this.field2593 > this.field2598 && ((long) arg1 + this.field2598) >= ((long) this.field2600 + this.field2593)) {
                    var8 = (long) this.field2600 + this.field2593;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class345.method1932(arg0, (int) ((long) arg3 + var6 - this.field2598), this.field2599, (int) (var6 - this.field2593), var10);
                }
                this.field2598 += arg1;
            } else if (arg1 > 0) {
                if (this.field2597 == -1L) {
                    this.field2597 = this.field2598;
                }
                class345.method1932(arg0, arg3, this.field2587, (int) (this.field2598 - this.field2597), arg1);
                this.field2598 += arg1;
                if ((this.field2598 - this.field2597) > ((long) this.field2594)) {
                    this.field2594 = (int) (this.field2598 - this.field2597);
                }
            }
        } catch (IOException var12) {
            this.field2590 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lob;II)V")
    public class213(class627 arg0, int arg1, int arg2) throws IOException {
        this.field2604 = arg0;
        this.field2589 = this.field2588 = arg0.method3594(-1);
        this.field2587 = new byte[arg2];
        this.field2599 = new byte[arg1];
        this.field2598 = 0L;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)J")
    public final long method1224(byte arg0) {
        if (arg0 != 18) {
            this.method1224((byte) 22);
        }
        field2592++;
        return this.field2589;
    }
}
