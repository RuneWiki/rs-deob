import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class182 {

    @OriginalMember(owner = "client!li", name = "q", descriptor = "J")
    private long field2721 = -1L;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    private int field2715 = 0;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "J")
    private long field2729 = -1L;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lcf;")
    private class264 field2708;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "J")
    private long field2717;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "J")
    private long field2712;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[B")
    private byte[] field2727;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "J")
    private long field2706;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[B")
    private byte[] field2710;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
    public static int[] field2713 = new int[14];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "J")
    private long field2728;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Llm;")
    public static class210 field2726;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
    public static int[] field2716;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II[BI)V", line = 4)
    public final void method1256(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2714++;
        try {
            if (((long) arg0 + this.field2706) > this.field2712) {
                this.field2712 = (long) arg0 + this.field2706;
            }
            if (this.field2721 != -1L && (this.field2721 > this.field2706 || this.field2706 > (this.field2721 + ((long) this.field2715)))) {
                this.method1265(~arg3);
            }
            if (this.field2721 != -1L && (long) arg0 + this.field2706 > (long) this.field2710.length + this.field2721) {
                int var5 = (int) (this.field2721 - (this.field2706 - (long) this.field2710.length));
                class85.method589(arg2, arg1, this.field2710, (int) (this.field2706 - this.field2721), var5);
                this.field2706 += (long) var5;
                arg1 += var5;
                this.field2715 = this.field2710.length;
                arg0 -= var5;
                this.method1265(arg3 - 1);
            }
            if (this.field2710.length < arg0) {
                if (this.field2728 != this.field2706) {
                    this.field2708.method1850(-17551, this.field2706);
                    this.field2728 = this.field2706;
                }
                this.field2708.method1852((byte) 50, arg1, arg2, arg0);
                long var6 = -1L;
                this.field2728 += (long) arg0;
                if (this.field2729 <= this.field2706 && this.field2706 < (long) this.field2711 + this.field2729) {
                    var6 = this.field2706;
                } else if (this.field2729 >= this.field2706 && (long) arg0 + this.field2706 > this.field2729) {
                    var6 = this.field2729;
                }
                if (this.field2728 > this.field2717) {
                    this.field2717 = this.field2728;
                }
                long var8 = -1L;
                if (this.field2729 < this.field2706 + ((long) arg0) && (this.field2729 + ((long) this.field2711)) >= ((long) arg0 + this.field2706)) {
                    var8 = this.field2706 + ((long) arg0);
                } else if (this.field2706 < ((long) this.field2711 + this.field2729) && this.field2706 + ((long) arg0) >= (long) this.field2711 + this.field2729) {
                    var8 = (long) this.field2711 + this.field2729;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class85.method589(arg2, (int) ((long) arg1 + var6 - this.field2706), this.field2727, (int) (var6 - this.field2729), var10);
                }
                this.field2706 += (long) arg0;
            } else if (arg0 > arg3) {
                if (this.field2721 == -1L) {
                    this.field2721 = this.field2706;
                }
                class85.method589(arg2, arg1, this.field2710, (int) (this.field2706 - this.field2721), arg0);
                this.field2706 += (long) arg0;
                if (this.field2706 - this.field2721 > (long) this.field2715) {
                    this.field2715 = (int) (this.field2706 - this.field2721);
                }
            }
        } catch (IOException var12) {
            this.field2728 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)J", line = 124)
    public final long method1257(boolean arg0) {
        if (!arg0) {
            field2716 = (int[]) null;
        }
        field2719++;
        return this.field2712;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Ljava/io/File;", line = 140)
    private final File method1258(int arg0) {
        if (arg0 == 8144) {
            field2709++;
            return this.field2708.method1853(7835);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B[B)V", line = 157)
    public final void method1259(byte arg0, byte[] arg1) throws IOException {
        field2705++;
        this.method1264(arg1, 0, arg1.length, arg0 - 2549);
        if (arg0 != -75) {
            this.method1257(false);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 174)
    private final void method1260(int arg0) throws IOException {
        field2722++;
        this.field2711 = 0;
        if (this.field2728 != this.field2706) {
            this.field2708.method1850(-17551, this.field2706);
            this.field2728 = this.field2706;
        }
        this.field2729 = this.field2706;
        while (this.field2711 < this.field2727.length) {
            int var2 = this.field2727.length - this.field2711;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2708.method1854(arg0 ^ 0xFFFFEF41, this.field2727, var2, this.field2711);
            if (var3 == -1) {
                break;
            }
            this.field2728 += (long) var3;
            this.field2711 += var3;
        }
        if (arg0 != 4286) {
            this.method1257(true);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V", line = 229)
    public final void method1261(int arg0) throws IOException {
        field2720++;
        this.method1265(arg0 - 1);
        this.field2708.method1855(arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 253)
    public static final void method1262(int arg0, Component arg1) {
        Method var2 = class262.field3977;
        field2718++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class60.field796);
        arg1.addFocusListener(class60.field796);
        if (arg0 < 90) {
            field2726 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lcf;II)V", line = 589)
    public class182(class264 arg0, int arg1, int arg2) throws IOException {
        this.field2708 = arg0;
        this.field2712 = this.field2717 = arg0.method1851(111);
        this.field2727 = new byte[arg1];
        this.field2706 = 0L;
        this.field2710 = new byte[arg2];
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V", line = 281)
    public static void method1263(int arg0) {
        field2726 = null;
        field2713 = null;
        if (arg0 != -1) {
            field2726 = (class210) null;
        }
        field2716 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BIII)V", line = 297)
    public final void method1264(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != -2624) {
            this.method1258(20);
        }
        field2724++;
        try {
            if (arg0.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2721 != -1L && this.field2721 <= this.field2706 && (long) this.field2715 + this.field2721 >= (long) arg2 + this.field2706) {
                class85.method589(this.field2710, (int) (this.field2706 - this.field2721), arg0, arg1, arg2);
                this.field2706 += (long) arg2;
                return;
            }
            int var5 = arg2;
            int var6 = arg1;
            long var7 = this.field2706;
            if (this.field2729 <= this.field2706 && (long) this.field2711 + this.field2729 > this.field2706) {
                int var9 = (int) (this.field2729 + (long) this.field2711 - this.field2706);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class85.method589(this.field2727, (int) (this.field2706 - this.field2729), arg0, arg1, var9);
                arg1 += var9;
                this.field2706 += (long) var9;
            }
            if (this.field2727.length < arg2) {
                this.field2708.method1850(arg3 ^ 0x4EB1, this.field2706);
                this.field2728 = this.field2706;
                while (arg2 > 0) {
                    int var10 = this.field2708.method1854(-1, arg0, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    this.field2728 += (long) var10;
                    this.field2706 += (long) var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                this.method1260(4286);
                int var11 = arg2;
                if (arg2 > this.field2711) {
                    var11 = this.field2711;
                }
                arg2 -= var11;
                class85.method589(this.field2727, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field2706 += (long) var11;
            }
            if (this.field2721 != -1L) {
                if (this.field2721 > this.field2706 && arg2 > 0) {
                    int var12 = (int) (this.field2721 - this.field2706) + arg1;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg2--;
                        arg0[arg1++] = 0;
                        this.field2706++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var7 < (long) this.field2715 + this.field2721 && (long) var5 + var7 >= this.field2721 - -((long) this.field2715)) {
                    var13 = (long) this.field2715 + this.field2721;
                } else if (this.field2721 < var7 + ((long) var5) && ((long) this.field2715 + this.field2721) >= (var7 + ((long) var5))) {
                    var13 = var7 + ((long) var5);
                }
                if (var7 <= this.field2721 && (long) var5 + var7 > this.field2721) {
                    var15 = this.field2721;
                } else if (this.field2721 <= var7 && this.field2721 + ((long) this.field2715) > var7) {
                    var15 = var7;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class85.method589(this.field2710, (int) (var15 - this.field2721), arg0, (int) (var15 - var7) + var6, var17);
                    if (this.field2706 < var13) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field2706));
                        this.field2706 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2728 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V", line = 486)
    private final void method1265(int arg0) throws IOException {
        if ((long) arg0 != this.field2721) {
            if (this.field2728 != this.field2721) {
                this.field2708.method1850(-17551, this.field2721);
                this.field2728 = this.field2721;
            }
            this.field2708.method1852((byte) 98, 0, this.field2710, this.field2715);
            this.field2728 += (long) this.field2715;
            if (this.field2728 > this.field2717) {
                this.field2717 = this.field2728;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2729 <= this.field2721 && this.field2721 < (long) this.field2711 + this.field2729) {
                var2 = this.field2721;
            } else if (this.field2729 >= this.field2721 && ((long) this.field2715 + this.field2721) > this.field2729) {
                var2 = this.field2729;
            }
            if (this.field2729 < (long) this.field2715 + this.field2721 && (long) this.field2715 + this.field2721 <= (long) this.field2711 + this.field2729) {
                var4 = (long) this.field2715 + this.field2721;
            } else if (this.field2721 < this.field2729 + ((long) this.field2711) && (this.field2729 + ((long) this.field2711)) <= ((long) this.field2715 + this.field2721)) {
                var4 = this.field2729 + ((long) this.field2711);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class85.method589(this.field2710, (int) (var2 - this.field2721), this.field2727, (int) (var2 - this.field2729), var6);
            }
            this.field2721 = -1L;
            this.field2715 = 0;
        }
        field2707++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BJ)V", line = 568)
    public final void method1266(byte arg0, long arg1) throws IOException {
        if (arg0 != 32) {
            this.field2708 = (class264) null;
        }
        field2723++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1258(arg0 ^ 0x1FF0));
        }
        this.field2706 = arg1;
    }
}
