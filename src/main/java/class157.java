import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class157 {

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "J")
    private long field2821 = -1L;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "J")
    private long field2834 = -1L;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    private int field2820 = 0;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "Le;")
    private class222 field2830;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "J")
    private long field2831;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "J")
    private long field2841;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "J")
    private long field2840;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[B")
    private byte[] field2832;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[B")
    private byte[] field2819;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "J")
    public static volatile long field2824 = 0L;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    private int field2825;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "J")
    private long field2837;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lpe;")
    public static class262 field2817;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lcc;B)V", line = 5)
    public static final void method1141(class313 arg0, byte arg1) {
        field2843++;
        class97.field1562 = arg0;
        class53.field806 = class97.field1562.method2165(arg1 ^ 0xFFFFFF8D, 4);
        if (arg1 != -115) {
            field2824 = -74L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Z", line = 20)
    public static final boolean method1142(int arg0, int arg1) {
        int var2 = 86 / ((arg0 - 19) / 39);
        field2828++;
        return (arg1 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 30)
    private final void method1143(int arg0) throws IOException {
        field2827++;
        this.field2825 = 0;
        if (this.field2840 != this.field2837) {
            this.field2830.method1524(this.field2840, (byte) -56);
            this.field2837 = this.field2840;
        }
        this.field2821 = this.field2840;
        while (this.field2832.length > this.field2825) {
            int var2 = this.field2832.length - this.field2825;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2830.method1526(this.field2825, this.field2832, var2, true);
            if (var3 == -1) {
                break;
            }
            this.field2837 += (long) var3;
            this.field2825 += var3;
        }
        if (arg0 != 200000000) {
            this.method1147((byte) -87);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 73)
    private final void method1144(int arg0) throws IOException {
        if (arg0 < 71) {
            this.method1147((byte) 64);
        }
        field2839++;
        if (this.field2834 == -1L) {
            return;
        }
        if (this.field2837 != this.field2834) {
            this.field2830.method1524(this.field2834, (byte) 72);
            this.field2837 = this.field2834;
        }
        long var2 = -1L;
        this.field2830.method1527(-96, 0, this.field2820, this.field2819);
        long var4 = -1L;
        this.field2837 += (long) this.field2820;
        if (this.field2821 < (this.field2834 + ((long) this.field2820)) && ((long) this.field2820 + this.field2834) <= ((long) this.field2825 + this.field2821)) {
            var2 = (long) this.field2820 + this.field2834;
        } else if (this.field2834 < ((long) this.field2825 + this.field2821) && (long) this.field2820 + this.field2834 >= (long) this.field2825 + this.field2821) {
            var2 = (long) this.field2825 + this.field2821;
        }
        if (this.field2834 >= this.field2821 && ((long) this.field2825 + this.field2821) > this.field2834) {
            var4 = this.field2834;
        } else if (this.field2821 >= this.field2834 && this.field2821 < this.field2834 + ((long) this.field2820)) {
            var4 = this.field2821;
        }
        if (this.field2837 > this.field2831) {
            this.field2831 = this.field2837;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class230.method1562(this.field2819, (int) (var4 - this.field2834), this.field2832, (int) (var4 - this.field2821), var6);
        }
        this.field2834 = -1L;
        this.field2820 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 153)
    public final void method1145(int arg0) throws IOException {
        if (arg0 <= -62) {
            this.method1144(122);
            field2822++;
            this.field2830.method1525(0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V", line = 165)
    public static final void method1146(int arg0) {
        class32.field457.method1178(-118);
        field2844++;
        if (arg0 != -30533) {
            field2833 = -61;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Le;II)V", line = 638)
    public class157(class222 arg0, int arg1, int arg2) throws IOException {
        this.field2830 = arg0;
        this.field2841 = this.field2831 = arg0.method1528(30736);
        this.field2840 = 0L;
        this.field2832 = new byte[arg1];
        this.field2819 = new byte[arg2];
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Ljava/io/File;", line = 185)
    private final File method1147(byte arg0) {
        if (arg0 < 63) {
            this.method1153(52);
        }
        field2826++;
        return this.field2830.method1523(0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BIII)V", line = 196)
    public final void method1148(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2829++;
        try {
            if (((long) arg3 + this.field2840) > this.field2841) {
                this.field2841 = (long) arg3 + this.field2840;
            }
            if (this.field2834 != -1L && (this.field2840 < this.field2834 || this.field2840 > this.field2834 + ((long) this.field2820))) {
                this.method1144(101);
            }
            if (this.field2834 != -1L && ((long) arg3 + this.field2840) > ((long) this.field2819.length + this.field2834)) {
                int var5 = (int) ((long) this.field2819.length - (this.field2840 - this.field2834));
                arg3 -= var5;
                class230.method1562(arg0, arg2, this.field2819, (int) (this.field2840 - this.field2834), var5);
                arg2 += var5;
                this.field2840 += (long) var5;
                this.field2820 = this.field2819.length;
                this.method1144(116);
            }
            if (arg1 > -127) {
                field2833 = -61;
            }
            if (arg3 > this.field2819.length) {
                long var6 = -1L;
                if (this.field2840 != this.field2837) {
                    this.field2830.method1524(this.field2840, (byte) -87);
                    this.field2837 = this.field2840;
                }
                long var8 = -1L;
                this.field2830.method1527(-72, arg2, arg3, arg0);
                if ((long) arg3 + this.field2840 > this.field2821 && ((long) arg3 + this.field2840) <= ((long) this.field2825 + this.field2821)) {
                    var6 = (long) arg3 + this.field2840;
                } else if (this.field2821 + ((long) this.field2825) > this.field2840 && this.field2840 + ((long) arg3) >= (long) this.field2825 + this.field2821) {
                    var6 = (long) this.field2825 + this.field2821;
                }
                if (this.field2840 >= this.field2821 && (long) this.field2825 + this.field2821 > this.field2840) {
                    var8 = this.field2840;
                } else if (this.field2840 <= this.field2821 && ((long) arg3 + this.field2840) > this.field2821) {
                    var8 = this.field2821;
                }
                this.field2837 += (long) arg3;
                if (this.field2831 < this.field2837) {
                    this.field2831 = this.field2837;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class230.method1562(arg0, (int) ((long) arg2 + var8 - this.field2840), this.field2832, (int) (var8 - this.field2821), var10);
                }
                this.field2840 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2834 == -1L) {
                    this.field2834 = this.field2840;
                }
                class230.method1562(arg0, arg2, this.field2819, (int) (this.field2840 - this.field2834), arg3);
                this.field2840 += (long) arg3;
                if ((long) this.field2820 < this.field2840 - this.field2834) {
                    this.field2820 = (int) (this.field2840 - this.field2834);
                }
            }
        } catch (IOException var12) {
            this.field2837 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)I", line = 320)
    public static final int method1149(int arg0, boolean arg1, int arg2) {
        field2838++;
        if (arg1) {
            return -18;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[BI)V", line = 362)
    public final void method1150(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2842++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field2834 != -1L && this.field2840 >= this.field2834 && ((long) arg3 + this.field2840) <= ((long) this.field2820 + this.field2834)) {
                class230.method1562(this.field2819, (int) (this.field2840 - this.field2834), arg2, arg1, arg3);
                this.field2840 += (long) arg3;
                return;
            }
            long var5 = this.field2840;
            if (arg0 != 21153) {
                this.method1153(89);
            }
            int var7 = arg1;
            int var8 = arg3;
            if (this.field2840 >= this.field2821 && this.field2840 < (long) this.field2825 + this.field2821) {
                int var9 = (int) (this.field2821 + (long) this.field2825 - this.field2840);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class230.method1562(this.field2832, (int) (this.field2840 - this.field2821), arg2, arg1, var9);
                arg1 += var9;
                this.field2840 += (long) var9;
            }
            if (this.field2832.length < arg3) {
                this.field2830.method1524(this.field2840, (byte) 62);
                this.field2837 = this.field2840;
                while (arg3 > 0) {
                    int var10 = this.field2830.method1526(arg1, arg2, arg3, true);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2837 += (long) var10;
                    this.field2840 += (long) var10;
                    arg1 += var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method1143(200000000);
                if (arg3 > this.field2825) {
                    var11 = this.field2825;
                }
                arg3 -= var11;
                class230.method1562(this.field2832, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field2840 += (long) var11;
            }
            if (this.field2834 != -1L) {
                if (this.field2834 > this.field2840 && arg3 > 0) {
                    int var12 = (int) (this.field2834 - this.field2840) + arg1;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field2840++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < (this.field2834 + ((long) this.field2820)) && ((long) var8 + var5) >= ((long) this.field2820 + this.field2834)) {
                    var13 = (long) this.field2820 + this.field2834;
                } else if (((long) var8 + var5) > this.field2834 && ((long) var8 + var5) <= ((long) this.field2820 + this.field2834)) {
                    var13 = (long) var8 + var5;
                }
                if (this.field2834 >= var5 && ((long) var8 + var5) > this.field2834) {
                    var15 = this.field2834;
                } else if (var5 >= this.field2834 && var5 < (long) this.field2820 + this.field2834) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class230.method1562(this.field2819, (int) (var15 - this.field2834), arg2, (int) (var15 - var5) + var7, var17);
                    if (this.field2840 < var13) {
                        arg3 = (int) ((long) arg3 - (var13 - this.field2840));
                        this.field2840 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2837 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(JI)V", line = 556)
    public final void method1151(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            field2833 = 12;
        }
        field2836++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1147((byte) 112));
        }
        this.field2840 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V", line = 585)
    public static void method1152(int arg0) {
        if (arg0 != 8) {
            method1142(83, 100);
        }
        field2817 = null;
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)J", line = 598)
    public final long method1153(int arg0) {
        if (arg0 == 3783) {
            field2818++;
            return this.field2841;
        } else {
            return -85L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([BI)V", line = 614)
    public final void method1154(byte[] arg0, int arg1) throws IOException {
        this.method1150(arg1 + 21154, 0, arg0, arg0.length);
        if (arg1 == -1) {
            field2835++;
        }
    }
}
