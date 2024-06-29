import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class207 {

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    private int field2699 = 0;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "J")
    private long field2701 = -1L;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "J")
    private long field2714 = -1L;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Lhh;")
    private class428 field2707;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "J")
    private long field2711;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "J")
    private long field2715;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[B")
    private byte[] field2695;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[B")
    private byte[] field2700;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "J")
    private long field2703;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "S")
    public static short field2705 = 1;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2698 = new String[100];

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "[I")
    public static int[] field2716 = new int[14];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "J")
    private long field2706;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[BI)V", line = 10)
    public final void method1289(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2712++;
        try {
            if ((this.field2703 + ((long) arg1)) > this.field2715) {
                this.field2715 = (long) arg1 + this.field2703;
            }
            if (this.field2701 != -1L && (this.field2701 > this.field2703 || this.field2703 > (long) this.field2699 + this.field2701)) {
                this.method1299((byte) -23);
            }
            if (arg3 > 123) {
                if (this.field2701 != -1L && (long) this.field2700.length + this.field2701 < (long) arg1 + this.field2703) {
                    int var5 = (int) ((long) this.field2700.length + this.field2701 - this.field2703);
                    class657.method3639(arg2, arg0, this.field2700, (int) (this.field2703 - this.field2701), var5);
                    arg0 += var5;
                    this.field2703 += var5;
                    arg1 -= var5;
                    this.field2699 = this.field2700.length;
                    this.method1299((byte) -23);
                }
                if (this.field2700.length < arg1) {
                    if (this.field2706 != this.field2703) {
                        this.field2707.method2463(this.field2703, 0);
                        this.field2706 = this.field2703;
                    }
                    this.field2707.method2465(arg2, arg0, -20626, arg1);
                    this.field2706 += arg1;
                    if (this.field2711 < this.field2706) {
                        this.field2711 = this.field2706;
                    }
                    long var6 = -1L;
                    if (this.field2714 <= this.field2703 && ((long) this.field2708 + this.field2714) > this.field2703) {
                        var6 = this.field2703;
                    } else if (this.field2714 >= this.field2703 && (this.field2703 + ((long) arg1)) > this.field2714) {
                        var6 = this.field2714;
                    }
                    long var8 = -1L;
                    if (this.field2714 < ((long) arg1 + this.field2703) && (long) arg1 + this.field2703 <= (long) this.field2708 + this.field2714) {
                        var8 = (long) arg1 + this.field2703;
                    } else if ((long) this.field2708 + this.field2714 > this.field2703 && (long) this.field2708 + this.field2714 <= (long) arg1 + this.field2703) {
                        var8 = (long) this.field2708 + this.field2714;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class657.method3639(arg2, (int) (var6 + (long) arg0 - this.field2703), this.field2695, (int) (var6 - this.field2714), var10);
                    }
                    this.field2703 += arg1;
                } else if (arg1 > 0) {
                    if (this.field2701 == -1L) {
                        this.field2701 = this.field2703;
                    }
                    class657.method3639(arg2, arg0, this.field2700, (int) (this.field2703 - this.field2701), arg1);
                    this.field2703 += arg1;
                    if (((long) this.field2699) < (this.field2703 - this.field2701)) {
                        this.field2699 = (int) (this.field2703 - this.field2701);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2706 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)J", line = 135)
    public final long method1290(int arg0) {
        if (arg0 != 100) {
            this.method1290(70);
        }
        field2697++;
        return this.field2715;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BJ)V", line = 153)
    public final void method1291(byte arg0, long arg1) throws IOException {
        if (arg0 >= -93) {
            field2716 = null;
        }
        field2710++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1293(true));
        }
        this.field2703 = arg1;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V", line = 169)
    public static void method1292(int arg0) {
        int var1 = 40 % ((-arg0 - 78) / 35);
        field2716 = null;
        field2698 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Ljava/io/File;", line = 183)
    private final File method1293(boolean arg0) {
        field2694++;
        if (!arg0) {
            field2705 = -122;
        }
        return this.field2707.method2469((byte) 26);
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lhh;II)V", line = 628)
    public class207(class428 arg0, int arg1, int arg2) throws IOException {
        this.field2707 = arg0;
        this.field2715 = this.field2711 = arg0.method2468(0);
        this.field2695 = new byte[arg1];
        this.field2700 = new byte[arg2];
        this.field2703 = 0L;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V", line = 212)
    public final void method1294(int arg0, byte[] arg1) throws IOException {
        this.method1296(arg1.length, arg1, 109, 0);
        field2704++;
        if (arg0 >= -7) {
            this.field2714 = -114L;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V", line = 232)
    public static final void method1295(int arg0, int arg1, int arg2) {
        boolean var3 = class145.field1841[0][arg1][arg2] != null && class145.field1841[0][arg1][arg2].field9225 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class145.field1841[var4][arg1][arg2] == null) {
                class651 var5 = class145.field1841[var4][arg1][arg2] = new class651(var4, arg1, arg2);
                if (var3) {
                    var5.field9239++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[BII)V", line = 253)
    public final void method1296(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2696++;
        try {
            if (arg1.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg1.length);
            }
            if (arg2 <= 103) {
                method1295(-31, 17, -43);
            }
            if (this.field2701 != -1L && this.field2703 >= this.field2701 && ((long) arg0 + this.field2703) <= ((long) this.field2699 + this.field2701)) {
                class657.method3639(this.field2700, (int) (this.field2703 - this.field2701), arg1, arg3, arg0);
                this.field2703 += arg0;
                return;
            }
            long var5 = this.field2703;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2714 <= this.field2703 && ((long) this.field2708 + this.field2714) > this.field2703) {
                int var9 = (int) ((long) this.field2708 + this.field2714 - this.field2703);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class657.method3639(this.field2695, (int) (this.field2703 - this.field2714), arg1, arg3, var9);
                arg0 -= var9;
                this.field2703 += var9;
                arg3 += var9;
            }
            if (this.field2695.length < arg0) {
                this.field2707.method2463(this.field2703, 0);
                this.field2706 = this.field2703;
                while (arg0 > 0) {
                    int var10 = this.field2707.method2466(arg1, (byte) -10, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field2703 += var10;
                    arg0 -= var10;
                    this.field2706 += var10;
                }
            } else if (arg0 > 0) {
                this.method1300(8);
                int var11 = arg0;
                if (arg0 > this.field2708) {
                    var11 = this.field2708;
                }
                class657.method3639(this.field2695, 0, arg1, arg3, var11);
                arg3 += var11;
                arg0 -= var11;
                this.field2703 += var11;
            }
            if (this.field2701 != -1L) {
                if (this.field2703 < this.field2701 && arg0 > 0) {
                    int var12 = (int) (this.field2701 - this.field2703) + arg3;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1[arg3++] = 0;
                        arg0--;
                        this.field2703++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2701 && this.field2701 < ((long) var8 + var5)) {
                    var13 = this.field2701;
                } else if (this.field2701 <= var5 && (long) this.field2699 + this.field2701 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field2699 + this.field2701) > var5 && (this.field2701 + ((long) this.field2699)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field2699 + this.field2701;
                } else if (this.field2701 < var5 + ((long) var8) && this.field2701 + ((long) this.field2699) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class657.method3639(this.field2700, (int) (var13 - this.field2701), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field2703) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field2703));
                        this.field2703 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2706 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V", line = 438)
    public static final void method1297(boolean arg0) {
        field2693++;
        class253.field3491.method906(-1, class401.field5696.method1059(arg0));
        class253.field3491.method906(-1, class93.field1162.method1059(true));
        class253.field3491.method906(-1, class119.field1528.method1059(true));
        class253.field3491.method906(-1, class108.field1300.method1059(arg0));
        class253.field3491.method906(-1, class589.field8086.method1059(true));
        class253.field3491.method906(-1, class397.field5664.method1059(true));
        class253.field3491.method906(-1, class328.field4812.method1059(true));
        class253.field3491.method906(-1, class284.field3839.method1059(true));
        class253.field3491.method906(-1, class39.field510.method1059(true));
        class253.field3491.method906(-1, class355.field5163.method1059(true));
        class253.field3491.method906(-1, class103.field1263.method1059(true));
        class253.field3491.method906(-1, class209.field2740.method1059(true));
        class253.field3491.method906(-1, class314.field4517.method1059(true));
        class253.field3491.method906(-1, class613.field8373.method1059(true));
        class253.field3491.method906(-1, class16.field132.method1059(arg0));
        class253.field3491.method906(-1, class360.field5194.method1059(true));
        class253.field3491.method906(-1, class560.field7638.method1059(true));
        class253.field3491.method906(-1, class563.field7708.method1059(true));
        class253.field3491.method906(-1, class175.field2199.method1059(arg0));
        class253.field3491.method906(-1, class560.field7636.method1059(arg0));
        class253.field3491.method906(-1, class327.field4752.method1059(true));
        class253.field3491.method906(-1, class23.field223.method1059(true));
        class253.field3491.method906(-1, class440.field6064.method1059(arg0));
        class253.field3491.method906(-1, class307.field4123.method1059(true));
        class253.field3491.method906(-1, class429.field5959.method1059(true));
        class253.field3491.method906(-1, class61.field846.method1059(arg0));
        class253.field3491.method906(-1, class3.field29.method1059(true));
        class253.field3491.method906(-1, class417.field5814.method1059(true));
        class253.field3491.method906(-1, class639.field8722.method1059(arg0));
        class253.field3491.method906(-1, class462.field6300.method1059(true));
        class253.field3491.method906(-1, class640.field8729.method1059(true));
        class253.field3491.method906(-1, class16.field134.method1059(arg0));
        class253.field3491.method906(-1, class173.method1151((byte) 126));
        class253.field3491.method906(-1, class333.method2129(33985));
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V", line = 479)
    public final void method1298(int arg0) throws IOException {
        field2713++;
        this.method1299((byte) -23);
        this.field2707.method2467((byte) 106);
        if (arg0 != 0) {
            this.method1290(43);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 495)
    private final void method1299(byte arg0) throws IOException {
        if (arg0 != -23) {
            this.field2699 = -46;
        }
        if (this.field2701 != -1L) {
            if (this.field2706 != this.field2701) {
                this.field2707.method2463(this.field2701, arg0 ^ 0xFFFFFFE9);
                this.field2706 = this.field2701;
            }
            this.field2707.method2465(this.field2700, 0, arg0 ^ 0x5087, this.field2699);
            this.field2706 += this.field2699;
            if (this.field2711 < this.field2706) {
                this.field2711 = this.field2706;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2714 <= this.field2701 && (long) this.field2708 + this.field2714 > this.field2701) {
                var2 = this.field2701;
            } else if (this.field2701 <= this.field2714 && (this.field2701 + ((long) this.field2699)) > this.field2714) {
                var2 = this.field2714;
            }
            if (this.field2714 < ((long) this.field2699 + this.field2701) && this.field2701 + ((long) this.field2699) <= (long) this.field2708 + this.field2714) {
                var4 = (long) this.field2699 + this.field2701;
            } else if (((long) this.field2708 + this.field2714) > this.field2701 && ((long) this.field2699 + this.field2701) >= ((long) this.field2708 + this.field2714)) {
                var4 = this.field2714 + ((long) this.field2708);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class657.method3639(this.field2700, (int) (var2 - this.field2701), this.field2695, (int) (var2 - this.field2714), var6);
            }
            this.field2701 = -1L;
            this.field2699 = 0;
        }
        field2709++;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V", line = 572)
    private final void method1300(int arg0) throws IOException {
        field2702++;
        this.field2708 = 0;
        if (this.field2706 != this.field2703) {
            this.field2707.method2463(this.field2703, 0);
            this.field2706 = this.field2703;
        }
        this.field2714 = this.field2703;
        while (this.field2695.length > this.field2708) {
            int var2 = this.field2695.length - this.field2708;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2707.method2466(this.field2695, (byte) -12, this.field2708, var2);
            if (var3 == -1) {
                break;
            }
            this.field2708 += var3;
            this.field2706 += var3;
        }
        int var4 = -95 / ((arg0 + 70) / 52);
    }
}
