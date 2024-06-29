import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class262 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    private int field4575 = 0;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "J")
    private long field4588 = -1L;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "J")
    private long field4593 = -1L;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lac;")
    private class126 field4581;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "J")
    private long field4570;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "J")
    private long field4568;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[B")
    private byte[] field4572;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "[B")
    private byte[] field4582;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "J")
    private long field4587;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Ldf;")
    public static class51 field4583 = class46.method233(":duelfriend:", 100);

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ldf;")
    public static class51 field4576 = class46.method233(":", 100);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Ldf;")
    public static class51 field4594 = class46.method233("scrollen:", 100);

    @OriginalMember(owner = "client!p", name = "A", descriptor = "[[I")
    public static int[][] field4590 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    private int field4577;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "J")
    private long field4580;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[Ltg;")
    public static class171[] field4566;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "[[[S")
    public static short[][][] field4574;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)J")
    public final long method1777(byte arg0) {
        if (arg0 != 95) {
            method1780(76);
        }
        field4579++;
        return this.field4568;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    private final void method1778(byte arg0) throws IOException {
        field4569++;
        this.field4577 = 0;
        if (this.field4587 != this.field4580) {
            this.field4581.method938(this.field4587, 105);
            this.field4580 = this.field4587;
        }
        this.field4588 = this.field4587;
        while (this.field4582.length > this.field4577) {
            int var2 = this.field4582.length - this.field4577;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4581.method936(this.field4577, var2, 73, this.field4582);
            if (var3 == -1) {
                break;
            }
            this.field4577 += var3;
            this.field4580 += (long) var3;
        }
        if (arg0 > -69) {
            field4574 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II[BB)V")
    public final void method1779(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field4567++;
        try {
            if (arg2.length < (arg0 + arg1)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field4593 != -1L && this.field4593 <= this.field4587 && (long) arg1 + this.field4587 <= (long) this.field4575 + this.field4593) {
                class256.method1746(this.field4572, (int) (this.field4587 - this.field4593), arg2, arg0, arg1);
                this.field4587 += (long) arg1;
                return;
            }
            if (arg3 != -107) {
                this.field4577 = -121;
            }
            long var5 = this.field4587;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field4587 >= this.field4588 && this.field4587 < (long) this.field4577 + this.field4588) {
                int var9 = (int) (this.field4588 + (long) this.field4577 - this.field4587);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class256.method1746(this.field4582, (int) (this.field4587 - this.field4588), arg2, arg0, var9);
                arg0 += var9;
                arg1 -= var9;
                this.field4587 += (long) var9;
            }
            if (this.field4582.length < arg1) {
                this.field4581.method938(this.field4587, arg3 ^ 0xFFFFFFA6);
                this.field4580 = this.field4587;
                while (arg1 > 0) {
                    int var11 = this.field4581.method936(arg0, arg1, 55, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field4580 += (long) var11;
                    arg1 -= var11;
                    this.field4587 += (long) var11;
                    arg0 += var11;
                }
            } else if (arg1 > 0) {
                this.method1778((byte) -106);
                int var10 = arg1;
                if (arg1 > this.field4577) {
                    var10 = this.field4577;
                }
                class256.method1746(this.field4582, 0, arg2, arg0, var10);
                arg1 -= var10;
                this.field4587 += (long) var10;
                arg0 += var10;
            }
            if (this.field4593 != -1L) {
                if (this.field4587 < this.field4593 && arg1 > 0) {
                    int var12 = (int) (this.field4593 - this.field4587) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field4587++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field4593 && ((long) var7 + var5) > this.field4593) {
                    var15 = this.field4593;
                } else if (var5 >= this.field4593 && var5 < (long) this.field4575 + this.field4593) {
                    var15 = var5;
                }
                if (var5 < (long) this.field4575 + this.field4593 && ((long) var7 + var5) >= ((long) this.field4575 + this.field4593)) {
                    var13 = (long) this.field4575 + this.field4593;
                } else if (this.field4593 < ((long) var7 + var5) && this.field4593 + ((long) this.field4575) >= (long) var7 + var5) {
                    var13 = (long) var7 + var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class256.method1746(this.field4572, (int) (var15 - this.field4593), arg2, var8 + ((int) (var15 - var5)), var17);
                    if (var13 > this.field4587) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field4587));
                        this.field4587 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4580 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method1780(int arg0) {
        if (arg0 != 255) {
            method1780(-113);
        }
        field4594 = null;
        field4576 = null;
        field4590 = null;
        field4566 = null;
        field4574 = null;
        field4583 = null;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    private final void method1781(byte arg0) throws IOException {
        field4564++;
        if (arg0 < 56) {
            method1780(47);
        }
        if (this.field4593 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field4593 != this.field4580) {
            this.field4581.method938(this.field4593, 83);
            this.field4580 = this.field4593;
        }
        this.field4581.method940((byte) 101, 0, this.field4575, this.field4572);
        if (this.field4593 >= this.field4588 && this.field4593 < this.field4588 + ((long) this.field4577)) {
            var2 = this.field4593;
        } else if (this.field4588 >= this.field4593 && this.field4588 < (long) this.field4575 + this.field4593) {
            var2 = this.field4588;
        }
        long var4 = -1L;
        this.field4580 += (long) this.field4575;
        if (this.field4570 < this.field4580) {
            this.field4570 = this.field4580;
        }
        if (this.field4588 < (long) this.field4575 + this.field4593 && (this.field4588 + ((long) this.field4577)) >= ((long) this.field4575 + this.field4593)) {
            var4 = (long) this.field4575 + this.field4593;
        } else if ((long) this.field4577 + this.field4588 > this.field4593 && (this.field4588 + ((long) this.field4577)) <= (this.field4593 + ((long) this.field4575))) {
            var4 = this.field4588 + ((long) this.field4577);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class256.method1746(this.field4572, (int) (var2 - this.field4593), this.field4582, (int) (var2 - this.field4588), var6);
        }
        this.field4593 = -1L;
        this.field4575 = 0;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
    public final void method1782(byte arg0) throws IOException {
        this.method1781((byte) 80);
        int var2 = 74 / ((arg0 - 31) / 43);
        this.field4581.method937(0);
        field4592++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BIZ)V")
    public final void method1783(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field4589++;
        try {
            if (this.field4568 < (long) arg0 + this.field4587) {
                this.field4568 = this.field4587 + ((long) arg0);
            }
            if (arg3) {
                this.field4568 = -127L;
            }
            if (this.field4593 != -1L && (this.field4587 < this.field4593 || ((long) this.field4575 + this.field4593) < this.field4587)) {
                this.method1781((byte) 75);
            }
            if (this.field4593 != -1L && (long) arg0 + this.field4587 > (long) this.field4572.length + this.field4593) {
                int var5 = (int) ((long) this.field4572.length + this.field4593 - this.field4587);
                arg0 -= var5;
                class256.method1746(arg1, arg2, this.field4572, (int) (this.field4587 - this.field4593), var5);
                this.field4587 += (long) var5;
                arg2 += var5;
                this.field4575 = this.field4572.length;
                this.method1781((byte) 67);
            }
            if (arg0 > this.field4572.length) {
                if (this.field4587 != this.field4580) {
                    this.field4581.method938(this.field4587, 120);
                    this.field4580 = this.field4587;
                }
                this.field4581.method940((byte) 76, arg2, arg0, arg1);
                this.field4580 += (long) arg0;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field4588 <= this.field4587 && this.field4587 < (long) this.field4577 + this.field4588) {
                    var6 = this.field4587;
                } else if (this.field4588 >= this.field4587 && this.field4588 < (long) arg0 + this.field4587) {
                    var6 = this.field4588;
                }
                if (this.field4570 < this.field4580) {
                    this.field4570 = this.field4580;
                }
                if (this.field4588 < ((long) arg0 + this.field4587) && (long) arg0 + this.field4587 <= (long) this.field4577 + this.field4588) {
                    var8 = this.field4587 + ((long) arg0);
                } else if (this.field4587 < (long) this.field4577 + this.field4588 && (long) this.field4577 + this.field4588 <= (long) arg0 + this.field4587) {
                    var8 = (long) this.field4577 + this.field4588;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class256.method1746(arg1, (int) ((long) arg2 + var6 - this.field4587), this.field4582, (int) (var6 - this.field4588), var10);
                }
                this.field4587 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field4593 == -1L) {
                    this.field4593 = this.field4587;
                }
                class256.method1746(arg1, arg2, this.field4572, (int) (this.field4587 - this.field4593), arg0);
                this.field4587 += (long) arg0;
                if (((long) this.field4575) < (this.field4587 - this.field4593)) {
                    this.field4575 = (int) (this.field4587 - this.field4593);
                }
            }
        } catch (IOException var12) {
            this.field4580 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Llb;I)V")
    public static final void method1784(class121 arg0, int arg1) {
        field4585++;
        if (arg0.field2014.length - arg0.field2026 < 1) {
            return;
        }
        int var2 = arg0.method897(-79);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        if (arg1 > -76) {
            field4583 = null;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg0.field2014.length - arg0.field2026 < var3) {
            return;
        }
        class40.field623 = arg0.method897(119);
        if (class40.field623 < 1) {
            class40.field623 = 1;
        } else if (class40.field623 > 4) {
            class40.field623 = 4;
        }
        class105.method755(arg0.method897(106) == 1, 303);
        class142.field2376 = arg0.method897(106) == 1;
        class193.field3244 = arg0.method897(-122) == 1;
        class120.field2000 = arg0.method897(126) == 1;
        class35.field517 = arg0.method897(-88) == 1;
        class98.field1636 = arg0.method897(124) == 1;
        class190.field3182 = arg0.method897(-53) == 1;
        class174.field2860 = arg0.method897(-108) == 1;
        class103.field1699 = arg0.method897(-55);
        if (class103.field1699 > 2) {
            class103.field1699 = 2;
        }
        if (var2 < 2) {
            class263.field4602 = arg0.method897(-91) == 1;
            arg0.method897(-127);
        } else {
            class263.field4602 = arg0.method897(109) == 1;
        }
        class20.field272 = arg0.method897(-83) == 1;
        class66.field1075 = arg0.method897(-51) == 1;
        class205.field3429 = arg0.method897(-27);
        if (class205.field3429 > 2) {
            class205.field3429 = 2;
        }
        class212.field3522 = arg0.method897(121) == 1;
        class261.field4551 = arg0.method897(117);
        if (class261.field4551 > 127) {
            class261.field4551 = 127;
        }
        class26.field381 = arg0.method897(122);
        class218.field3801 = arg0.method897(-15);
        if (class218.field3801 > 127) {
            class218.field3801 = 127;
        }
        if (var2 >= 1) {
            class95.field1560 = arg0.method876(false);
            class41.field640 = arg0.method876(false);
        }
        if (var2 >= 3) {
            class230.field4009 = arg0.method897(109) == 1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(JI)V")
    public final void method1785(long arg0, int arg1) throws IOException {
        field4586++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1787((byte) 117));
        }
        this.field4587 = arg0;
        if (arg1 != 19303) {
            method1784((class121) null, 80);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BI)V")
    public final void method1786(byte[] arg0, int arg1) throws IOException {
        field4565++;
        this.method1779(arg1, arg0.length, arg0, (byte) -107);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(B)Ljava/io/File;")
    private final File method1787(byte arg0) {
        field4571++;
        if (arg0 != 117) {
            this.method1777((byte) -19);
        }
        return this.field4581.method939(1);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lac;II)V")
    public class262(class126 arg0, int arg1, int arg2) throws IOException {
        this.field4581 = arg0;
        this.field4568 = this.field4570 = arg0.method935(false);
        this.field4572 = new byte[arg2];
        this.field4582 = new byte[arg1];
        this.field4587 = 0L;
    }
}
