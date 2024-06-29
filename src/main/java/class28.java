import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class28 {

    @OriginalMember(owner = "client!df", name = "x", descriptor = "J")
    private long field674 = -1L;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "J")
    private long field686 = -1L;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    private int field681 = 0;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lab;")
    private class3 field656;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "J")
    private long field664;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "J")
    private long field680;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "[B")
    private byte[] field689;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[B")
    private byte[] field668;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "J")
    private long field683;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field672 = 0;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lid;")
    public static class60 field661 = class11.method72("scape main", (byte) -37);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lid;")
    private static class60 field678 = class11.method72("Walk here", (byte) 112);

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lid;")
    public static class60 field682 = field678;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Lid;")
    private static class60 field679 = class11.method72(" seconds)3", (byte) -60);

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field685 = 0;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lid;")
    public static class60 field658 = field679;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "J")
    private long field666;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Ldd;")
    public static class26 field653;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lie;")
    public static class61 field662;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
    public static final boolean method209(int arg0, int arg1) {
        field655++;
        if (class132.field3009[arg0]) {
            return true;
        } else if (class41.field1104.method475(arg0, true)) {
            int var2 = class41.field1104.method479(arg0, (byte) -98);
            if (~var2 == arg1) {
                class132.field3009[arg0] = true;
                return true;
            }
            if (class45.field1177[arg0] == null) {
                class45.field1177[arg0] = new class40[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class45.field1177[arg0][var3] == null) {
                    byte[] var4 = class41.field1104.method473((byte) 111, arg0, var3);
                    if (var4 != null) {
                        class45.field1177[arg0][var3] = new class40();
                        class45.field1177[arg0][var3].field1008 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class45.field1177[arg0][var3].method321(120, new class103(var4));
                        } else {
                            class45.field1177[arg0][var3].method315(new class103(var4), 95);
                        }
                    }
                }
            }
            class132.field3009[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILie;Lie;)V")
    public static final void method210(int arg0, class61 arg1, class61 arg2) {
        class90.field2225 = arg1;
        field688++;
        if (arg0 == -1) {
            class67.field1638 = arg2;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method211(byte arg0) {
        field679 = null;
        field662 = null;
        field682 = null;
        field653 = null;
        field678 = null;
        int var1 = -71 / ((85 - arg0) / 32);
        field658 = null;
        field661 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    private final void method212(byte arg0) throws IOException {
        int var2 = -23 / ((56 - arg0) / 60);
        field690++;
        this.field657 = 0;
        if (this.field683 != this.field666) {
            this.field656.method11(this.field683, 4096);
            this.field666 = this.field683;
        }
        this.field674 = this.field683;
        while (this.field668.length > this.field657) {
            int var3 = this.field656.method14(this.field668, this.field657, true, this.field668.length - this.field657);
            if (var3 == -1) {
                break;
            }
            this.field666 += var3;
            this.field657 += var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)Lid;")
    public static final class60 method213(int arg0, boolean arg1, int arg2) {
        field671++;
        if (arg0 != -873632864) {
            method210(96, null, null);
        }
        return class31.method237(arg1, 10, arg2, -2);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)J")
    public final long method214(byte arg0) {
        if (arg0 == 114) {
            field667++;
            return this.field680;
        } else {
            return 41L;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    private final void method215(boolean arg0) throws IOException {
        if (this.field686 != -1L) {
            if (this.field686 != this.field666) {
                this.field656.method11(this.field686, 4096);
                this.field666 = this.field686;
            }
            this.field656.method10(this.field681, 27179, this.field689, 0);
            this.field666 += this.field681;
            long var2 = -1L;
            if (this.field666 > this.field664) {
                this.field664 = this.field666;
            }
            if (this.field674 <= this.field686 && this.field686 < (long) this.field657 + this.field674) {
                var2 = this.field686;
            } else if (this.field686 <= this.field674 && (long) this.field681 + this.field686 > this.field674) {
                var2 = this.field674;
            }
            long var4 = -1L;
            if ((long) this.field681 + this.field686 > this.field674 && this.field686 + (long) this.field681 <= (long) this.field657 + this.field674) {
                var4 = (long) this.field681 + this.field686;
            } else if (this.field674 + (long) this.field657 > this.field686 && (long) this.field657 + this.field674 <= this.field686 - -((long) this.field681)) {
                var4 = this.field674 + (long) this.field657;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class149.method1136(this.field689, (int) (var2 - this.field686), this.field668, (int) (var2 - this.field674), var6);
            }
            this.field686 = -1L;
            this.field681 = 0;
        }
        if (!arg0) {
            method218((byte) 40, 110, 55, null);
        }
        field660++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
    public static final void method216(int arg0, byte arg1, int arg2) {
        int[] var3 = new int[4];
        var3[0] = arg0;
        field665++;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg2;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class25.field619[var6] != arg0) {
                var3[var5] = class25.field619[var6];
                var4[var5] = class105.field2588[var6];
                var5++;
            }
        }
        if (arg1 < 119) {
            method218((byte) -122, 92, 111, null);
        }
        class105.field2588 = var4;
        class25.field619 = var3;
        class43.method341(class105.field2588, class80.field1986.length - 1, class25.field619, -98, 0, class80.field1986);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIB)V")
    public final void method217(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field670++;
        try {
            if (arg0.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field686 != -1L && this.field686 <= this.field683 && (long) this.field681 + this.field686 >= (long) arg2 + this.field683) {
                class149.method1136(this.field689, (int) (this.field683 - this.field686), arg0, arg1, arg2);
                this.field683 += arg2;
                return;
            }
            long var5 = this.field683;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field683 >= this.field674 && (long) this.field657 + this.field674 > this.field683) {
                int var9 = (int) (this.field674 + (long) this.field657 - this.field683);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class149.method1136(this.field668, (int) (this.field683 - this.field674), arg0, arg1, var9);
                this.field683 += var9;
                arg1 += var9;
            }
            if (arg3 <= 92) {
                field685 = -109;
            }
            if (arg2 > this.field668.length) {
                this.field656.method11(this.field683, 4096);
                this.field666 = this.field683;
                while (arg2 > 0) {
                    int var10 = this.field656.method14(arg0, arg1, true, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    this.field683 += var10;
                    this.field666 += var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method212((byte) -44);
                if (this.field657 < arg2) {
                    var11 = this.field657;
                }
                arg2 -= var11;
                class149.method1136(this.field668, 0, arg0, arg1, var11);
                this.field683 += var11;
                arg1 += var11;
            }
            if (this.field686 != -1L) {
                if (this.field686 > this.field683 && arg2 > 0) {
                    int var12 = (int) (this.field686 - this.field683) + arg1;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg0[arg1++] = 0;
                        this.field683++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field686 && this.field686 < (long) var8 + var5) {
                    var13 = this.field686;
                } else if (this.field686 <= var5 && var5 < (long) this.field681 + this.field686) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field681 + this.field686 && var5 + (long) var8 >= (long) this.field681 + this.field686) {
                    var15 = (long) this.field681 + this.field686;
                } else if ((long) var8 + var5 > this.field686 && this.field686 + (long) this.field681 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class149.method1136(this.field689, (int) (var13 - this.field686), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field683 < var15) {
                        arg2 = (int) ((long) arg2 + this.field683 - var15);
                        this.field683 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field666 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BIILie;)Lae;")
    public static final class6 method218(byte arg0, int arg1, int arg2, class61 arg3) {
        if (arg0 != -60) {
            method210(-86, null, null);
        }
        field687++;
        return class77.method628(arg1, arg2, arg3, -117) ? class89.method728((byte) 120) : null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III[B)V")
    public final void method219(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field663++;
        try {
            if ((long) arg1 + this.field683 > this.field680) {
                this.field680 = this.field683 + (long) arg1;
            }
            if (this.field686 != -1L && (this.field686 > this.field683 || this.field683 > this.field686 + (long) this.field681)) {
                this.method215(true);
            }
            if (arg0 != -11154) {
                field685 = -62;
            }
            if (this.field686 != -1L && (long) this.field689.length + this.field686 < (long) arg1 + this.field683) {
                int var5 = (int) (this.field686 + (long) this.field689.length - this.field683);
                arg1 -= var5;
                class149.method1136(arg3, arg2, this.field689, (int) (this.field683 - this.field686), var5);
                arg2 += var5;
                this.field683 += var5;
                this.field681 = this.field689.length;
                this.method215(true);
            }
            if (this.field689.length < arg1) {
                if (this.field683 != this.field666) {
                    this.field656.method11(this.field683, arg0 ^ 0xFFFFC46E);
                    this.field666 = this.field683;
                }
                this.field656.method10(arg1, 27179, arg3, arg2);
                this.field666 += arg1;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field666 > this.field664) {
                    this.field664 = this.field666;
                }
                if (this.field683 >= this.field674 && (long) this.field657 + this.field674 > this.field683) {
                    var8 = this.field683;
                } else if (this.field683 <= this.field674 && this.field674 < (long) arg1 + this.field683) {
                    var8 = this.field674;
                }
                if (this.field683 + (long) arg1 > this.field674 && (long) arg1 + this.field683 <= (long) this.field657 + this.field674) {
                    var6 = this.field683 + (long) arg1;
                } else if ((long) this.field657 + this.field674 > this.field683 && (long) arg1 + this.field683 >= (long) this.field657 + this.field674) {
                    var6 = (long) this.field657 + this.field674;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class149.method1136(arg3, (int) ((long) arg2 + var8 - this.field683), this.field668, (int) (var8 - this.field674), var10);
                }
                this.field683 += arg1;
            } else if (arg1 > 0) {
                if (this.field686 == -1L) {
                    this.field686 = this.field683;
                }
                class149.method1136(arg3, arg2, this.field689, (int) (this.field683 - this.field686), arg1);
                this.field683 += arg1;
                if (this.field683 - this.field686 > (long) this.field681) {
                    this.field681 = (int) (this.field683 - this.field686);
                }
            }
        } catch (IOException var12) {
            this.field666 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method220(int arg0) throws IOException {
        this.method215(true);
        this.field656.method9((byte) -50);
        if (arg0 <= 123) {
            method209(118, -91);
        }
        field677++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BJ)V")
    public final void method221(byte arg0, long arg1) {
        if (arg0 < 20) {
            this.field680 = 56L;
        }
        field652++;
        if (arg1 >= 0L) {
            this.field683 = arg1;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lab;II)V")
    public class28(class3 arg0, int arg1, int arg2) throws IOException {
        this.field656 = arg0;
        this.field680 = this.field664 = arg0.method13(-95);
        this.field689 = new byte[arg2];
        this.field668 = new byte[arg1];
        this.field683 = 0L;
    }
}
