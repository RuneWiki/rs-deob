import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class41 {

    @OriginalMember(owner = "client!en", name = "p", descriptor = "J")
    private long field679 = -1L;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    private int field670 = 0;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "J")
    private long field686 = -1L;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Lqm;")
    private class231 field682;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "J")
    private long field664;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "J")
    private long field673;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "[B")
    private byte[] field680;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[B")
    private byte[] field665;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "J")
    private long field674;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "Lna;")
    public static class26 field671 = class69.method505(":chalreq:", (byte) -122);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Lna;")
    public static class26 field668 = class69.method505("::fpsoff", (byte) -122);

    @OriginalMember(owner = "client!en", name = "t", descriptor = "[I")
    public static int[] field683 = new int[14];

    @OriginalMember(owner = "client!en", name = "x", descriptor = "Lna;")
    public static class26 field687 = class69.method505("http:)4)4", (byte) -125);

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Z")
    public static boolean field690 = false;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "F")
    public static float field689;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    private int field685;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "J")
    private long field676;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V", line = 12)
    public static void method326(boolean arg0) {
        field687 = null;
        if (arg0) {
            field683 = null;
            field671 = null;
            field668 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 31)
    private final void method327(byte arg0) throws IOException {
        int var2 = 56 % ((45 - arg0) / 44);
        field678++;
        if (this.field679 == -1L) {
            return;
        }
        if (this.field679 != this.field676) {
            this.field682.method1557((byte) -10, this.field679);
            this.field676 = this.field679;
        }
        this.field682.method1558(127, this.field680, this.field670, 0);
        long var3 = -1L;
        if (this.field686 <= this.field679 && ((long) this.field685 + this.field686) > this.field679) {
            var3 = this.field679;
        } else if (this.field679 <= this.field686 && this.field686 < (this.field679 + ((long) this.field670))) {
            var3 = this.field686;
        }
        this.field676 += (long) this.field670;
        if (this.field664 < this.field676) {
            this.field664 = this.field676;
        }
        long var5 = -1L;
        if (this.field686 < this.field679 + ((long) this.field670) && (long) this.field685 + this.field686 >= (long) this.field670 + this.field679) {
            var5 = this.field679 + ((long) this.field670);
        } else if ((this.field686 + ((long) this.field685)) > this.field679 && (long) this.field670 + this.field679 >= (long) this.field685 + this.field686) {
            var5 = (long) this.field685 + this.field686;
        }
        if (var3 > -1L && var5 > var3) {
            int var7 = (int) (var5 - var3);
            class75.method536(this.field680, (int) (var3 - this.field679), this.field665, (int) (var3 - this.field686), var7);
        }
        this.field670 = 0;
        this.field679 = -1L;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)J", line = 103)
    public final long method328(int arg0) {
        field677++;
        if (arg0 != 0) {
            this.method328(19);
        }
        return this.field673;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Ljava/io/File;", line = 127)
    private final File method329(int arg0) {
        if (arg0 != 281669816) {
            method326(true);
        }
        field669++;
        return this.field682.method1554(-83);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BII)V", line = 142)
    public final void method330(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field688++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field679 != -1L && this.field674 >= this.field679 && (long) this.field670 + this.field679 >= (long) arg2 + this.field674) {
                class75.method536(this.field680, (int) (this.field674 - this.field679), arg1, arg0, arg2);
                this.field674 += (long) arg2;
                return;
            }
            long var5 = this.field674;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field686 <= this.field674 && (long) this.field685 + this.field686 > this.field674) {
                int var9 = (int) ((long) this.field685 + this.field686 - this.field674);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class75.method536(this.field665, (int) (this.field674 - this.field686), arg1, arg0, var9);
                arg0 += var9;
                arg2 -= var9;
                this.field674 += (long) var9;
            }
            if (this.field665.length < arg2) {
                this.field682.method1557((byte) -10, this.field674);
                this.field676 = this.field674;
                while (arg2 > 0) {
                    int var10 = this.field682.method1553(arg0, 0, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field676 += (long) var10;
                    arg2 -= var10;
                    arg0 += var10;
                    this.field674 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method333(4393);
                int var11 = arg2;
                if (arg2 > this.field685) {
                    var11 = this.field685;
                }
                class75.method536(this.field665, 0, arg1, arg0, var11);
                arg2 -= var11;
                arg0 += var11;
                this.field674 += (long) var11;
            }
            if (this.field679 != -1L) {
                if (this.field674 < this.field679 && arg2 > 0) {
                    int var12 = (int) (this.field679 - this.field674) + arg0;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        this.field674++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field670 + this.field679 > var5 && (long) var8 + var5 >= (long) this.field670 + this.field679) {
                    var15 = (long) this.field670 + this.field679;
                } else if (this.field679 < ((long) var8 + var5) && ((long) this.field670 + this.field679) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var5 <= this.field679 && (var5 + ((long) var8)) > this.field679) {
                    var13 = this.field679;
                } else if (var5 >= this.field679 && var5 < (long) this.field670 + this.field679) {
                    var13 = var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class75.method536(this.field680, (int) (var13 - this.field679), arg1, (int) (var13 - var5) + var7, var17);
                    if (this.field674 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field674));
                        this.field674 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field676 = -1L;
            throw var19;
        }
        if (arg3 < arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lqm;II)V", line = 608)
    public class41(class231 arg0, int arg1, int arg2) throws IOException {
        this.field682 = arg0;
        this.field673 = this.field664 = arg0.method1556(-1);
        this.field680 = new byte[arg2];
        this.field665 = new byte[arg1];
        this.field674 = 0L;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIB)V", line = 334)
    public static final void method331(int arg0, int arg1, int arg2, byte arg3) {
        field672++;
        class26 var4 = class236.method1587(new class26[] { class209.field3235, class149.method1019((byte) 9, arg2), class268.field4426, class149.method1019((byte) 9, arg0 >> 6), class268.field4426, class149.method1019((byte) 9, arg1 >> 6), class268.field4426, class149.method1019((byte) 9, arg0 & 0x3F), class268.field4426, class149.method1019((byte) 9, arg1 & 0x3F) }, (byte) -90);
        var4.method180(false);
        if (arg3 != -4) {
            field687 = (class26) null;
        }
        class233.method1575(var4, false);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V", line = 353)
    public final void method332(boolean arg0) throws IOException {
        this.method327((byte) -75);
        this.field682.method1555(1);
        field666++;
        if (arg0) {
            this.field674 = 91L;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 384)
    private final void method333(int arg0) throws IOException {
        this.field685 = 0;
        field684++;
        if (arg0 != 4393) {
            this.method328(-127);
        }
        if (this.field676 != this.field674) {
            this.field682.method1557((byte) -10, this.field674);
            this.field676 = this.field674;
        }
        this.field686 = this.field674;
        while (this.field665.length > this.field685) {
            int var2 = this.field665.length - this.field685;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field682.method1553(this.field685, 0, var2, this.field665);
            if (var3 == -1) {
                break;
            }
            this.field676 += (long) var3;
            this.field685 += var3;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z[B)V", line = 427)
    public final void method334(boolean arg0, byte[] arg1) throws IOException {
        field675++;
        if (arg0) {
            method331(-72, 3, 3, (byte) -115);
        }
        this.method330(0, arg1, arg1.length, 0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BIII)V", line = 460)
    public final void method335(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field667++;
        try {
            if (this.field673 < ((long) arg3 + this.field674)) {
                this.field673 = (long) arg3 + this.field674;
            }
            if (this.field679 != -1L && (this.field679 > this.field674 || this.field674 > ((long) this.field670 + this.field679))) {
                this.method327((byte) 124);
            }
            if (this.field679 != -1L && (long) this.field680.length + this.field679 < (long) arg3 + this.field674) {
                int var5 = (int) ((long) this.field680.length + this.field679 - this.field674);
                arg3 -= var5;
                class75.method536(arg0, arg1, this.field680, (int) (this.field674 - this.field679), var5);
                this.field674 += (long) var5;
                this.field670 = this.field680.length;
                this.method327((byte) 93);
                arg1 += var5;
            }
            if (this.field680.length < arg3) {
                if (this.field676 != this.field674) {
                    this.field682.method1557((byte) -10, this.field674);
                    this.field676 = this.field674;
                }
                this.field682.method1558(111, arg0, arg3, arg1);
                long var6 = -1L;
                if (this.field686 <= this.field674 && ((long) this.field685 + this.field686) > this.field674) {
                    var6 = this.field674;
                } else if (this.field674 <= this.field686 && ((long) arg3 + this.field674) > this.field686) {
                    var6 = this.field686;
                }
                this.field676 += (long) arg3;
                long var8 = -1L;
                if (this.field664 < this.field676) {
                    this.field664 = this.field676;
                }
                if ((long) arg3 + this.field674 > this.field686 && (this.field674 + ((long) arg3)) <= (this.field686 + ((long) this.field685))) {
                    var8 = (long) arg3 + this.field674;
                } else if (((long) this.field685 + this.field686) > this.field674 && (long) arg3 + this.field674 >= (long) this.field685 + this.field686) {
                    var8 = (long) this.field685 + this.field686;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class75.method536(arg0, (int) (var6 + (long) arg1 - this.field674), this.field665, (int) (var6 - this.field686), var10);
                }
                this.field674 += (long) arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field679 == -1L) {
                    this.field679 = this.field674;
                }
                class75.method536(arg0, arg1, this.field680, (int) (this.field674 - this.field679), arg3);
                this.field674 += (long) arg3;
                if (((long) this.field670) < (this.field674 - this.field679)) {
                    this.field670 = (int) (this.field674 - this.field679);
                }
                return;
            }
        } catch (IOException var12) {
            this.field676 = -1L;
            throw var12;
        }
        if (arg2 != -903171152) {
            this.field664 = -28L;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IJ)V", line = 586)
    public final void method336(int arg0, long arg1) throws IOException {
        field681++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method329(281669816));
        }
        this.field674 = arg1;
        if (arg0 > -6) {
            this.field674 = 89L;
        }
    }
}
