import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class122 {

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field1857 = 0;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "J")
    private long field1852 = -1L;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "J")
    private long field1850 = -1L;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lwi;")
    private class415 field1842;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "J")
    private long field1847;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "J")
    private long field1859;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "J")
    private long field1851;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[B")
    private byte[] field1845;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[B")
    private byte[] field1846;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "S")
    public static short field1856 = 205;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field1858;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "J")
    private long field1854;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 6)
    private final void method904(byte arg0) throws IOException {
        if (this.field1852 != -1L) {
            if (this.field1854 != this.field1852) {
                this.field1842.method2487(0, this.field1852);
                this.field1854 = this.field1852;
            }
            this.field1842.method2489(0, 0, this.field1857, this.field1845);
            this.field1854 += this.field1857;
            if (this.field1854 > this.field1847) {
                this.field1847 = this.field1854;
            }
            long var2 = -1L;
            if (this.field1852 >= this.field1850 && this.field1852 < (this.field1850 + ((long) this.field1858))) {
                var2 = this.field1852;
            } else if (this.field1852 <= this.field1850 && this.field1850 < (long) this.field1857 + this.field1852) {
                var2 = this.field1850;
            }
            long var4 = -1L;
            if ((long) this.field1857 + this.field1852 > this.field1850 && (long) this.field1857 + this.field1852 <= (long) this.field1858 + this.field1850) {
                var4 = (long) this.field1857 + this.field1852;
            } else if (this.field1852 < (long) this.field1858 + this.field1850 && ((long) this.field1858 + this.field1850) <= (this.field1852 + ((long) this.field1857))) {
                var4 = (long) this.field1858 + this.field1850;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class442.method2590(this.field1845, (int) (var2 - this.field1852), this.field1846, (int) (var2 - this.field1850), var6);
            }
            this.field1857 = 0;
            this.field1852 = -1L;
        }
        if (arg0 == 103) {
            field1848++;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 84)
    private final void method905(int arg0) throws IOException {
        field1853++;
        int var2 = 84 / ((arg0 + 1) / 55);
        this.field1858 = 0;
        if (this.field1854 != this.field1851) {
            this.field1842.method2487(0, this.field1851);
            this.field1854 = this.field1851;
        }
        this.field1850 = this.field1851;
        while (this.field1846.length > this.field1858) {
            int var3 = this.field1846.length - this.field1858;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field1842.method2488(this.field1858, this.field1846, 0, var3);
            if (var4 == -1) {
                break;
            }
            this.field1858 += var4;
            this.field1854 += var4;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLcs;Ltv;ILya;Lb;II)V", line = 128)
    public static final void method906(boolean arg0, class219 arg1, class294 arg2, int arg3, class11 arg4, class473 arg5, int arg6, int arg7) {
        field1855++;
        int var8 = arg1.field3130 - (arg7 / 2) - 5;
        int var9 = arg6 + 2;
        if (arg5.field6934 != 0) {
            arg4.method67(74, arg7 + 10, arg5.field6934, var8, arg3 * arg2.method1828() + arg6 + 1 - var9, var9);
        }
        if (arg5.field6962 != 0) {
            arg4.method123(var9, false, arg5.field6962, arg7 + 10, arg3 * arg2.method1828() + 1 + (arg6 - var9), var8);
        }
        int var10 = arg5.field6940;
        if (arg1.field3138 && arg5.field6972 != -1) {
            var10 = arg5.field6972;
        }
        if (!arg0) {
            field1856 = 44;
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            String var12 = class461.field6716[var11];
            if (arg3 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg2.method1829(arg4, var12, arg1.field3130, arg6, var10, true);
            arg6 += arg2.method1828();
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)J", line = 182)
    public final long method907(byte arg0) {
        field1860++;
        int var2 = -63 / ((arg0 - 52) / 59);
        return this.field1859;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JB)V", line = 195)
    public final void method908(long arg0, byte arg1) throws IOException {
        if (arg1 >= -101) {
            return;
        }
        field1861++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method910((byte) -62));
        }
        this.field1851 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BI)V", line = 213)
    public final void method909(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1843++;
        try {
            if (arg3 == 16711680) {
                if (this.field1859 < this.field1851 + ((long) arg0)) {
                    this.field1859 = (long) arg0 + this.field1851;
                }
                if (this.field1852 != -1L && (this.field1852 > this.field1851 || this.field1851 > ((long) this.field1857 + this.field1852))) {
                    this.method904((byte) 103);
                }
                if (this.field1852 != -1L && this.field1852 + ((long) this.field1845.length) < (long) arg0 + this.field1851) {
                    int var5 = (int) (this.field1852 + (long) this.field1845.length - this.field1851);
                    class442.method2590(arg2, arg1, this.field1845, (int) (this.field1851 - this.field1852), var5);
                    arg0 -= var5;
                    arg1 += var5;
                    this.field1851 += var5;
                    this.field1857 = this.field1845.length;
                    this.method904((byte) 103);
                }
                if (arg0 > this.field1845.length) {
                    if (this.field1854 != this.field1851) {
                        this.field1842.method2487(0, this.field1851);
                        this.field1854 = this.field1851;
                    }
                    this.field1842.method2489(arg1, 0, arg0, arg2);
                    this.field1854 += arg0;
                    if (this.field1854 > this.field1847) {
                        this.field1847 = this.field1854;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field1850 <= this.field1851 && (long) this.field1858 + this.field1850 > this.field1851) {
                        var6 = this.field1851;
                    } else if (this.field1850 >= this.field1851 && (this.field1851 + ((long) arg0)) > this.field1850) {
                        var6 = this.field1850;
                    }
                    if (((long) arg0 + this.field1851) > this.field1850 && (long) this.field1858 + this.field1850 >= (long) arg0 + this.field1851) {
                        var8 = this.field1851 + ((long) arg0);
                    } else if ((this.field1850 + ((long) this.field1858)) > this.field1851 && ((long) arg0 + this.field1851) >= ((long) this.field1858 + this.field1850)) {
                        var8 = (long) this.field1858 + this.field1850;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class442.method2590(arg2, (int) ((long) arg1 + var6 - this.field1851), this.field1846, (int) (var6 - this.field1850), var10);
                    }
                    this.field1851 += arg0;
                } else if (arg0 > 0) {
                    if (this.field1852 == -1L) {
                        this.field1852 = this.field1851;
                    }
                    class442.method2590(arg2, arg1, this.field1845, (int) (this.field1851 - this.field1852), arg0);
                    this.field1851 += arg0;
                    if ((long) this.field1857 < this.field1851 - this.field1852) {
                        this.field1857 = (int) (this.field1851 - this.field1852);
                    }
                }
            }
        } catch (IOException var12) {
            this.field1854 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)Ljava/io/File;", line = 335)
    private final File method910(byte arg0) {
        if (arg0 != -62) {
            this.method910((byte) 82);
        }
        field1862++;
        return this.field1842.method2486(arg0 ^ 0xFFFFFFC2);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lwi;II)V", line = 573)
    public class122(class415 arg0, int arg1, int arg2) throws IOException {
        this.field1842 = arg0;
        this.field1859 = this.field1847 = arg0.method2484(121);
        this.field1851 = 0L;
        this.field1845 = new byte[arg2];
        this.field1846 = new byte[arg1];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BI)V", line = 369)
    public final void method911(byte[] arg0, int arg1) throws IOException {
        if (arg1 != -6111) {
            this.field1847 = 8L;
        }
        field1844++;
        this.method912(arg0, false, 0, arg0.length);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BZII)V", line = 388)
    public final void method912(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field1849++;
        try {
            if (arg2 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field1852 != -1L && this.field1852 <= this.field1851 && (long) this.field1857 + this.field1852 >= this.field1851 - -((long) arg3)) {
                class442.method2590(this.field1845, (int) (this.field1851 - this.field1852), arg0, arg2, arg3);
                this.field1851 += arg3;
                return;
            }
            long var5 = this.field1851;
            int var7 = arg2;
            int var8 = arg3;
            if (arg1) {
                this.field1847 = -36L;
            }
            if (this.field1851 >= this.field1850 && ((long) this.field1858 + this.field1850) > this.field1851) {
                int var9 = (int) (this.field1850 + (long) this.field1858 - this.field1851);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class442.method2590(this.field1846, (int) (this.field1851 - this.field1850), arg0, arg2, var9);
                arg2 += var9;
                this.field1851 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field1846.length) {
                this.field1842.method2487(0, this.field1851);
                this.field1854 = this.field1851;
                while (arg3 > 0) {
                    int var10 = this.field1842.method2488(arg2, arg0, 0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1854 += var10;
                    arg3 -= var10;
                    this.field1851 += var10;
                    arg2 += var10;
                }
            } else if (arg3 > 0) {
                this.method905(121);
                int var11 = arg3;
                if (this.field1858 < arg3) {
                    var11 = this.field1858;
                }
                class442.method2590(this.field1846, 0, arg0, arg2, var11);
                this.field1851 += var11;
                arg3 -= var11;
                arg2 += var11;
            }
            if (this.field1852 != -1L) {
                if (this.field1852 > this.field1851 && arg3 > 0) {
                    int var12 = (int) (this.field1852 - this.field1851) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg2 < var12) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field1851++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field1852 && this.field1852 < ((long) var8 + var5)) {
                    var13 = this.field1852;
                } else if (var5 >= this.field1852 && var5 < (long) this.field1857 + this.field1852) {
                    var13 = var5;
                }
                if (var5 < (long) this.field1857 + this.field1852 && ((long) var8 + var5) >= ((long) this.field1857 + this.field1852)) {
                    var15 = (long) this.field1857 + this.field1852;
                } else if (this.field1852 < (long) var8 + var5 && (var5 + ((long) var8)) <= ((long) this.field1857 + this.field1852)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class442.method2590(this.field1845, (int) (var13 - this.field1852), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field1851) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field1851));
                        this.field1851 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1854 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }
}
