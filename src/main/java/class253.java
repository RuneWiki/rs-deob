import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class253 {

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "J")
    private long field3573 = -1L;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    private int field3580 = 0;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "J")
    private long field3587 = -1L;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "Lwr;")
    private class393 field3584;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "J")
    private long field3582;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "J")
    private long field3589;

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "[B")
    private byte[] field3590;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "[B")
    private byte[] field3591;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "J")
    private long field3574;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "F")
    public static float field3578;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "J")
    private long field3571;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    private final void method1657(byte arg0) throws IOException {
        field3579++;
        if (arg0 != 103) {
            method1660(-14, false);
        }
        this.field3585 = 0;
        if (this.field3574 != this.field3571) {
            this.field3584.method2532(-126, this.field3574);
            this.field3571 = this.field3574;
        }
        this.field3587 = this.field3574;
        while (this.field3591.length > this.field3585) {
            int var2 = this.field3591.length - this.field3585;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3584.method2531(this.field3585, this.field3591, -14263, var2);
            if (var3 == -1) {
                break;
            }
            this.field3585 += var3;
            this.field3571 += var3;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[BII)V")
    public final void method1658(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3581++;
        try {
            if (this.field3589 < (long) arg3 + this.field3574) {
                this.field3589 = (long) arg3 + this.field3574;
            }
            if (this.field3573 != -1L && (this.field3574 < this.field3573 || this.field3573 + ((long) this.field3580) < this.field3574)) {
                this.method1661(0);
            }
            if (this.field3573 != -1L && (this.field3573 + ((long) this.field3590.length)) < (this.field3574 + ((long) arg3))) {
                int var5 = (int) (this.field3573 + (long) this.field3590.length - this.field3574);
                class210.method1330(arg1, arg2, this.field3590, (int) (this.field3574 - this.field3573), var5);
                arg2 += var5;
                arg3 -= var5;
                this.field3574 += var5;
                this.field3580 = this.field3590.length;
                this.method1661(0);
            }
            if (arg3 > this.field3590.length) {
                if (this.field3574 != this.field3571) {
                    this.field3584.method2532(-66, this.field3574);
                    this.field3571 = this.field3574;
                }
                this.field3584.method2529(arg3, arg1, arg2, true);
                this.field3571 += arg3;
                if (this.field3582 < this.field3571) {
                    this.field3582 = this.field3571;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3574 >= this.field3587 && this.field3574 < (long) this.field3585 + this.field3587) {
                    var6 = this.field3574;
                } else if (this.field3574 <= this.field3587 && this.field3587 < (long) arg3 + this.field3574) {
                    var6 = this.field3587;
                }
                if (this.field3587 < (this.field3574 + ((long) arg3)) && this.field3574 + ((long) arg3) <= (long) this.field3585 + this.field3587) {
                    var8 = (long) arg3 + this.field3574;
                } else if (this.field3574 < this.field3587 + ((long) this.field3585) && (long) this.field3585 + this.field3587 <= (long) arg3 + this.field3574) {
                    var8 = this.field3587 + ((long) this.field3585);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class210.method1330(arg1, (int) ((long) arg2 + var6 - this.field3574), this.field3591, (int) (var6 - this.field3587), var10);
                }
                this.field3574 += arg3;
            } else if (arg3 > 0) {
                if (this.field3573 == -1L) {
                    this.field3573 = this.field3574;
                }
                class210.method1330(arg1, arg2, this.field3590, (int) (this.field3574 - this.field3573), arg3);
                this.field3574 += arg3;
                if ((long) this.field3580 < this.field3574 - this.field3573) {
                    this.field3580 = (int) (this.field3574 - this.field3573);
                }
            } else if (arg0 != 0) {
                this.field3590 = null;
            }
        } catch (IOException var12) {
            this.field3571 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1659(int arg0) {
        if (arg0 > -112) {
            this.field3590 = null;
        }
        field3586++;
        return this.field3584.method2530(false);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V")
    public static final void method1660(int arg0, boolean arg1) {
        int var2 = 92 % ((arg0 + 54) / 63);
        for (class588 var3 = (class588) class278.field3884.method719(false); var3 != null; var3 = (class588) class278.field3884.method716(14)) {
            if (var3.field8455 != null) {
                class44.field469.method934(var3.field8455);
                var3.field8455 = null;
            }
            if (var3.field8457 != null) {
                class44.field469.method934(var3.field8457);
                var3.field8457 = null;
            }
            var3.method2108(true);
        }
        field3583++;
        if (!arg1) {
            return;
        }
        for (class588 var4 = (class588) class407.field6140.method719(false); var4 != null; var4 = (class588) class407.field6140.method716(14)) {
            if (var4.field8455 != null) {
                class44.field469.method934(var4.field8455);
                var4.field8455 = null;
            }
            var4.method2108(true);
        }
        for (class588 var5 = (class588) class281.field3922.method523(-115); var5 != null; var5 = (class588) class281.field3922.method530(12714)) {
            if (var5.field8455 != null) {
                class44.field469.method934(var5.field8455);
                var5.field8455 = null;
            }
            var5.method2108(true);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    private final void method1661(int arg0) throws IOException {
        field3572++;
        if (arg0 != 0) {
            this.field3589 = 34L;
        }
        if (this.field3573 == -1L) {
            return;
        }
        if (this.field3573 != this.field3571) {
            this.field3584.method2532(arg0 - 64, this.field3573);
            this.field3571 = this.field3573;
        }
        this.field3584.method2529(this.field3580, this.field3590, 0, true);
        this.field3571 += this.field3580;
        if (this.field3571 > this.field3582) {
            this.field3582 = this.field3571;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3587 <= this.field3573 && (long) this.field3585 + this.field3587 > this.field3573) {
            var2 = this.field3573;
        } else if (this.field3573 <= this.field3587 && ((long) this.field3580 + this.field3573) > this.field3587) {
            var2 = this.field3587;
        }
        if (((long) this.field3580 + this.field3573) > this.field3587 && (long) this.field3580 + this.field3573 <= this.field3587 - -((long) this.field3585)) {
            var4 = (long) this.field3580 + this.field3573;
        } else if (this.field3573 < this.field3587 + ((long) this.field3585) && (long) this.field3585 + this.field3587 <= this.field3573 - -((long) this.field3580)) {
            var4 = this.field3587 + ((long) this.field3585);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class210.method1330(this.field3590, (int) (var2 - this.field3573), this.field3591, (int) (var2 - this.field3587), var6);
        }
        this.field3580 = 0;
        this.field3573 = -1L;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[B)V")
    public final void method1662(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3577++;
        try {
            if ((arg1 + arg2) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (this.field3573 != -1L && this.field3573 <= this.field3574 && this.field3573 + ((long) this.field3580) >= (long) arg1 + this.field3574) {
                class210.method1330(this.field3590, (int) (this.field3574 - this.field3573), arg3, arg2, arg1);
                this.field3574 += arg1;
                return;
            }
            long var5 = this.field3574;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field3574 >= this.field3587 && (this.field3587 + ((long) this.field3585)) > this.field3574) {
                int var9 = (int) ((long) this.field3585 + this.field3587 - this.field3574);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class210.method1330(this.field3591, (int) (this.field3574 - this.field3587), arg3, arg2, var9);
                this.field3574 += var9;
                arg1 -= var9;
                arg2 += var9;
            }
            if (this.field3591.length < arg1) {
                this.field3584.method2532(arg0 - 132, this.field3574);
                this.field3571 = this.field3574;
                while (arg1 > 0) {
                    int var10 = this.field3584.method2531(arg2, arg3, arg0 ^ 0xFFFFC841, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3571 += var10;
                    arg1 -= var10;
                    arg2 += var10;
                    this.field3574 += var10;
                }
            } else if (arg1 > 0) {
                this.method1657((byte) 103);
                int var11 = arg1;
                if (arg1 > this.field3585) {
                    var11 = this.field3585;
                }
                class210.method1330(this.field3591, 0, arg3, arg2, var11);
                this.field3574 += var11;
                arg1 -= var11;
                arg2 += var11;
            }
            if (arg0 != 8) {
                return;
            }
            if (this.field3573 != -1L) {
                if (this.field3574 < this.field3573 && arg1 > 0) {
                    int var12 = (int) (this.field3573 - this.field3574) + arg2;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg2 + arg1;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg3[arg2++] = 0;
                        this.field3574++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field3573 >= var5 && ((long) var8 + var5) > this.field3573) {
                    var13 = this.field3573;
                } else if (var5 >= this.field3573 && ((long) this.field3580 + this.field3573) > var5) {
                    var13 = var5;
                }
                if (var5 < (this.field3573 + ((long) this.field3580)) && ((long) this.field3580 + this.field3573) <= ((long) var8 + var5)) {
                    var15 = (long) this.field3580 + this.field3573;
                } else if (this.field3573 < ((long) var8 + var5) && (var5 + ((long) var8)) <= ((long) this.field3580 + this.field3573)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class210.method1330(this.field3590, (int) (var13 - this.field3573), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field3574 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3574));
                        this.field3574 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3571 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)J")
    public final long method1663(int arg0) {
        field3575++;
        if (arg0 != 1553) {
            this.field3582 = -23L;
        }
        return this.field3589;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[B)V")
    public final void method1664(int arg0, byte[] arg1) throws IOException {
        field3588++;
        if (arg0 < 83) {
            this.field3590 = null;
        }
        this.method1662(8, arg1.length, 0, arg1);
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lwr;II)V")
    public class253(class393 arg0, int arg1, int arg2) throws IOException {
        this.field3584 = arg0;
        this.field3589 = this.field3582 = arg0.method2533((byte) 108);
        this.field3590 = new byte[arg2];
        this.field3591 = new byte[arg1];
        this.field3574 = 0L;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IJ)V")
    public final void method1665(int arg0, long arg1) throws IOException {
        field3592++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1659(-125));
        }
        this.field3574 = arg1;
        if (arg0 != 0) {
            this.method1663(-76);
        }
    }
}
