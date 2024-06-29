import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class131 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    private int field1817 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "J")
    private long field1820 = -1L;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "J")
    private long field1823 = -1L;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Lrg;")
    private class611 field1810;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
    private long field1819;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "J")
    private long field1812;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[B")
    private byte[] field1826;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "[B")
    private byte[] field1824;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "J")
    private long field1815;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "F")
    public static float field1807;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "J")
    private long field1822;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 8)
    public final void method763(byte arg0) throws IOException {
        field1814++;
        if (arg0 >= -49) {
            this.method772((byte) -65);
        }
        this.method773(true);
        this.field1810.method3390(0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)V", line = 21)
    public static final void method764(byte arg0, int arg1) {
        if (arg0 == -76) {
            field1811++;
            class642.field8878.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Ljava/io/File;", line = 32)
    private final File method765(byte arg0) {
        if (arg0 == -10) {
            field1827++;
            return this.field1810.method3388(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[BII)V", line = 47)
    public final void method766(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1828++;
        try {
            if (arg2 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field1823 != -1L && this.field1823 <= this.field1815 && (long) this.field1817 + this.field1823 >= this.field1815 - -((long) arg2)) {
                class2.method9(this.field1824, (int) (this.field1815 - this.field1823), arg1, arg3, arg2);
                this.field1815 += arg2;
                return;
            }
            long var5 = this.field1815;
            int var7 = arg3;
            if (arg0 <= 70) {
                this.method772((byte) -58);
            }
            int var8 = arg2;
            if (this.field1820 <= this.field1815 && this.field1815 < (long) this.field1816 + this.field1820) {
                int var9 = (int) ((long) this.field1816 + this.field1820 - this.field1815);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class2.method9(this.field1826, (int) (this.field1815 - this.field1820), arg1, arg3, var9);
                arg2 -= var9;
                this.field1815 += var9;
                arg3 += var9;
            }
            if (arg2 > this.field1826.length) {
                this.field1810.method3384(this.field1815, (byte) -59);
                this.field1822 = this.field1815;
                while (arg2 > 0) {
                    int var11 = this.field1810.method3386(arg2, 0, arg3, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 += var11;
                    this.field1815 += var11;
                    this.field1822 += var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method767(-20196);
                int var10 = arg2;
                if (this.field1816 < arg2) {
                    var10 = this.field1816;
                }
                class2.method9(this.field1826, 0, arg1, arg3, var10);
                arg2 -= var10;
                arg3 += var10;
                this.field1815 += var10;
            }
            if (this.field1823 != -1L) {
                if (this.field1815 < this.field1823 && arg2 > 0) {
                    int var12 = (int) (this.field1823 - this.field1815) + arg3;
                    if (var12 > (arg3 + arg2)) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1[arg3++] = 0;
                        arg2--;
                        this.field1815++;
                    }
                }
                long var13 = -1L;
                if (this.field1823 >= var5 && ((long) var8 + var5) > this.field1823) {
                    var13 = this.field1823;
                } else if (this.field1823 <= var5 && var5 < ((long) this.field1817 + this.field1823)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field1817 + this.field1823) > var5 && (long) this.field1817 + this.field1823 <= (long) var8 + var5) {
                    var15 = this.field1823 + ((long) this.field1817);
                } else if (this.field1823 < ((long) var8 + var5) && ((long) var8 + var5) <= (this.field1823 + ((long) this.field1817))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class2.method9(this.field1824, (int) (var13 - this.field1823), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1815) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field1815));
                        this.field1815 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1822 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 228)
    private final void method767(int arg0) throws IOException {
        field1808++;
        if (arg0 != -20196) {
            field1807 = -1.5890181F;
        }
        this.field1816 = 0;
        if (this.field1822 != this.field1815) {
            this.field1810.method3384(this.field1815, (byte) -59);
            this.field1822 = this.field1815;
        }
        this.field1820 = this.field1815;
        while (this.field1826.length > this.field1816) {
            int var2 = this.field1826.length - this.field1816;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1810.method3386(var2, 0, this.field1816, this.field1826);
            if (var3 == -1) {
                break;
            }
            this.field1816 += var3;
            this.field1822 += var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lrg;II)V", line = 651)
    public class131(class611 arg0, int arg1, int arg2) throws IOException {
        this.field1810 = arg0;
        this.field1812 = this.field1819 = arg0.method3387(-89);
        this.field1826 = new byte[arg1];
        this.field1824 = new byte[arg2];
        this.field1815 = 0L;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lnu;II[I)V", line = 290)
    public static final void method768(class351 arg0, int arg1, int arg2, int[] arg3) {
        field1821++;
        if (arg0.field2989 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field2989.length; var5++) {
                if (arg0.field2989[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field3048 != -1) {
                class186 var6 = class423.field5620.method1707(arg0.field3048, arg2 - 114);
                int var7 = var6.field2584;
                if (var7 == 1) {
                    arg0.field3058 = 0;
                    arg0.field3068 = arg1;
                    arg0.field3026 = 1;
                    arg0.field2991 = 0;
                    arg0.field3051 = 0;
                    class615.method3398(arg0.field2991, arg0.field398, var6, -1773, arg0.field397, arg0.field385, false);
                }
                if (var7 == 2) {
                    arg0.field3051 = 0;
                }
            }
        }
        boolean var8 = true;
        int var9 = 0;
        if (arg2 != -1) {
            method774(-94, (byte) 19);
        }
        while (var9 < arg3.length) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field2989 == null || arg0.field2989[var9] == -1 || class423.field5620.method1707(arg3[var9], 96).field2572 >= class423.field5620.method1707(arg0.field2989[var9], arg2 ^ 0x66).field2572) {
                arg0.field3068 = arg1;
                arg0.field2989 = arg3;
                arg0.field3085 = arg0.field3095;
            }
            var9++;
        }
        if (var8) {
            arg0.field3068 = arg1;
            arg0.field3085 = arg0.field3095;
            arg0.field2989 = arg3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[B)V", line = 378)
    public final void method769(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1809++;
        try {
            if (((long) arg1 + this.field1815) > this.field1812) {
                this.field1812 = this.field1815 + ((long) arg1);
            }
            if (this.field1823 != -1L && (this.field1815 < this.field1823 || ((long) this.field1817 + this.field1823) < this.field1815)) {
                this.method773(true);
            }
            if (this.field1823 != -1L && this.field1823 + ((long) this.field1824.length) < (long) arg1 + this.field1815) {
                int var5 = (int) ((long) this.field1824.length + this.field1823 - this.field1815);
                class2.method9(arg3, arg0, this.field1824, (int) (this.field1815 - this.field1823), var5);
                arg1 -= var5;
                arg0 += var5;
                this.field1815 += var5;
                this.field1817 = this.field1824.length;
                this.method773(true);
            }
            if (arg2 <= -45) {
                if (this.field1824.length < arg1) {
                    if (this.field1822 != this.field1815) {
                        this.field1810.method3384(this.field1815, (byte) -59);
                        this.field1822 = this.field1815;
                    }
                    this.field1810.method3389(102, arg0, arg3, arg1);
                    this.field1822 += arg1;
                    if (this.field1819 < this.field1822) {
                        this.field1819 = this.field1822;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field1815 >= this.field1820 && this.field1815 < this.field1820 + ((long) this.field1816)) {
                        var6 = this.field1815;
                    } else if (this.field1815 <= this.field1820 && this.field1820 < (long) arg1 + this.field1815) {
                        var6 = this.field1820;
                    }
                    if (this.field1820 < ((long) arg1 + this.field1815) && ((long) arg1 + this.field1815) <= ((long) this.field1816 + this.field1820)) {
                        var8 = (long) arg1 + this.field1815;
                    } else if (((long) this.field1816 + this.field1820) > this.field1815 && (long) this.field1816 + this.field1820 <= (long) arg1 + this.field1815) {
                        var8 = (long) this.field1816 + this.field1820;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class2.method9(arg3, (int) ((long) arg0 + var6 - this.field1815), this.field1826, (int) (var6 - this.field1820), var10);
                    }
                    this.field1815 += arg1;
                } else if (arg1 > 0) {
                    if (this.field1823 == -1L) {
                        this.field1823 = this.field1815;
                    }
                    class2.method9(arg3, arg0, this.field1824, (int) (this.field1815 - this.field1823), arg1);
                    this.field1815 += arg1;
                    if (this.field1815 - this.field1823 > (long) this.field1817) {
                        this.field1817 = (int) (this.field1815 - this.field1823);
                    }
                }
            }
        } catch (IOException var12) {
            this.field1822 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BB)V", line = 505)
    public final void method770(byte[] arg0, byte arg1) throws IOException {
        if (arg1 != 103) {
            method774(64, (byte) -108);
        }
        field1818++;
        this.method766(104, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IJ)V", line = 519)
    public final void method771(int arg0, long arg1) throws IOException {
        field1813++;
        if (arg0 != 0) {
            this.field1817 = 112;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method765((byte) -10));
        }
        this.field1815 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)J", line = 533)
    public final long method772(byte arg0) {
        int var2 = -13 / ((-arg0 - 41) / 37);
        field1829++;
        return this.field1812;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 559)
    private final void method773(boolean arg0) throws IOException {
        field1830++;
        if (!arg0) {
            this.field1816 = 35;
        }
        if (this.field1823 == -1L) {
            return;
        }
        if (this.field1823 != this.field1822) {
            this.field1810.method3384(this.field1823, (byte) -59);
            this.field1822 = this.field1823;
        }
        this.field1810.method3389(-63, 0, this.field1824, this.field1817);
        this.field1822 += this.field1817;
        if (this.field1819 < this.field1822) {
            this.field1819 = this.field1822;
        }
        long var2 = -1L;
        if (this.field1823 >= this.field1820 && this.field1823 < (this.field1820 + ((long) this.field1816))) {
            var2 = this.field1823;
        } else if (this.field1820 >= this.field1823 && this.field1820 < ((long) this.field1817 + this.field1823)) {
            var2 = this.field1820;
        }
        long var4 = -1L;
        if (this.field1820 < ((long) this.field1817 + this.field1823) && (long) this.field1816 + this.field1820 >= (long) this.field1817 + this.field1823) {
            var4 = this.field1823 + ((long) this.field1817);
        } else if (((long) this.field1816 + this.field1820) > this.field1823 && ((long) this.field1816 + this.field1820) <= ((long) this.field1817 + this.field1823)) {
            var4 = this.field1820 + ((long) this.field1816);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class2.method9(this.field1824, (int) (var2 - this.field1823), this.field1826, (int) (var2 - this.field1820), var6);
        }
        this.field1817 = 0;
        this.field1823 = -1L;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)I", line = 639)
    public static final int method774(int arg0, byte arg1) {
        field1831++;
        if (arg1 > -86) {
            field1807 = -0.5922124F;
        }
        return arg0 & 0x7F;
    }
}
