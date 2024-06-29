import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class241 {

    @OriginalMember(owner = "client!og", name = "g", descriptor = "J")
    private long field3800 = -1L;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    private int field3819 = 0;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "J")
    private long field3820 = -1L;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Lck;")
    private class238 field3812;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "J")
    private long field3794;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "J")
    private long field3807;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "J")
    private long field3815;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "[B")
    private byte[] field3821;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[B")
    private byte[] field3798;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[Z")
    public static boolean[] field3799 = new boolean[100];

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field3806 = 0;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3808 = new String[200];

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "J")
    public static long field3809 = 0L;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "Z")
    public static boolean field3822 = false;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "J")
    private long field3795;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1676(int arg0) {
        if (arg0 == -1) {
            field3816++;
            return this.field3812.method1661((byte) -73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    private final void method1677(boolean arg0) throws IOException {
        if (!arg0) {
            method1685((byte) -54, 69);
        }
        this.field3814 = 0;
        field3817++;
        if (this.field3815 != this.field3795) {
            this.field3812.method1657(false, this.field3815);
            this.field3795 = this.field3815;
        }
        this.field3800 = this.field3815;
        while (this.field3821.length > this.field3814) {
            int var2 = this.field3821.length - this.field3814;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3812.method1659(var2, this.field3814, -101, this.field3821);
            if (var3 == -1) {
                break;
            }
            this.field3795 += (long) var3;
            this.field3814 += var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([BI)V")
    public final void method1678(byte[] arg0, int arg1) throws IOException {
        int var3 = 18 / ((arg1 + 81) / 37);
        this.method1687(0, false, arg0, arg0.length);
        field3796++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)V")
    public final void method1679(long arg0, int arg1) throws IOException {
        field3803++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1676(-1));
        }
        this.field3815 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static void method1680(int arg0) {
        if (arg0 != 2) {
            field3809 = 29L;
        }
        field3808 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[BI)V")
    public final void method1681(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3797++;
        try {
            if (((long) arg0 + this.field3815) > this.field3807) {
                this.field3807 = (long) arg0 + this.field3815;
            }
            if (this.field3820 != -1L && (this.field3820 > this.field3815 || (this.field3820 + ((long) this.field3819)) < this.field3815)) {
                this.method1684(-66);
            }
            if (this.field3820 != -1L && (long) arg0 + this.field3815 > this.field3820 - -((long) this.field3798.length)) {
                int var5 = (int) ((long) this.field3798.length + this.field3820 - this.field3815);
                arg0 -= var5;
                class158.method1051(arg2, arg3, this.field3798, (int) (this.field3815 - this.field3820), var5);
                arg3 += var5;
                this.field3815 += (long) var5;
                this.field3819 = this.field3798.length;
                this.method1684(127);
            }
            if (this.field3798.length < arg0) {
                if (this.field3815 != this.field3795) {
                    this.field3812.method1657(false, this.field3815);
                    this.field3795 = this.field3815;
                }
                this.field3812.method1662(arg0, arg3, -7751, arg2);
                this.field3795 += (long) arg0;
                long var6 = -1L;
                if (this.field3794 < this.field3795) {
                    this.field3794 = this.field3795;
                }
                long var8 = -1L;
                if (this.field3800 <= this.field3815 && (this.field3800 + ((long) this.field3814)) > this.field3815) {
                    var6 = this.field3815;
                } else if (this.field3815 <= this.field3800 && ((long) arg0 + this.field3815) > this.field3800) {
                    var6 = this.field3800;
                }
                if ((long) arg0 + this.field3815 > this.field3800 && ((long) this.field3814 + this.field3800) >= ((long) arg0 + this.field3815)) {
                    var8 = (long) arg0 + this.field3815;
                } else if (this.field3800 + ((long) this.field3814) > this.field3815 && ((long) arg0 + this.field3815) >= ((long) this.field3814 + this.field3800)) {
                    var8 = this.field3800 + ((long) this.field3814);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class158.method1051(arg2, (int) ((long) arg3 + var6 - this.field3815), this.field3821, (int) (var6 - this.field3800), var10);
                }
                this.field3815 += (long) arg0;
            } else if (arg1 > ~arg0) {
                if (this.field3820 == -1L) {
                    this.field3820 = this.field3815;
                }
                class158.method1051(arg2, arg3, this.field3798, (int) (this.field3815 - this.field3820), arg0);
                this.field3815 += (long) arg0;
                if (this.field3815 - this.field3820 > (long) this.field3819) {
                    this.field3819 = (int) (this.field3815 - this.field3820);
                }
            }
        } catch (IOException var12) {
            this.field3795 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)Lve;")
    public static final class203 method1682(int arg0) {
        class180.field2796 = 0;
        if (arg0 != 8) {
            field3806 = -33;
        }
        field3801++;
        return class271.method1861(-16307);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3818++;
        if ((arg6 - arg4) >= class53.field711 && arg4 + arg6 <= class87.field1356 && (arg2 - arg4) >= class63.field941 && class75.field1180 >= (arg2 + arg4)) {
            class247.method1724(arg1, arg2, arg3, arg6, arg0, arg4, true);
        } else {
            class184.method1221(arg0, arg2, arg1, 0, arg6, arg4, arg3);
        }
        if (arg5 < 105) {
            field3806 = -101;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    private final void method1684(int arg0) throws IOException {
        if (this.field3820 != -1L) {
            if (this.field3820 != this.field3795) {
                this.field3812.method1657(false, this.field3820);
                this.field3795 = this.field3820;
            }
            long var2 = -1L;
            this.field3812.method1662(this.field3819, 0, -7751, this.field3798);
            if (this.field3820 >= this.field3800 && this.field3820 < this.field3800 + ((long) this.field3814)) {
                var2 = this.field3820;
            } else if (this.field3820 <= this.field3800 && (this.field3820 + ((long) this.field3819)) > this.field3800) {
                var2 = this.field3800;
            }
            long var4 = -1L;
            this.field3795 += (long) this.field3819;
            if (this.field3820 + ((long) this.field3819) > this.field3800 && ((long) this.field3814 + this.field3800) >= ((long) this.field3819 + this.field3820)) {
                var4 = (long) this.field3819 + this.field3820;
            } else if (((long) this.field3814 + this.field3800) > this.field3820 && ((long) this.field3819 + this.field3820) >= ((long) this.field3814 + this.field3800)) {
                var4 = (long) this.field3814 + this.field3800;
            }
            if (this.field3794 < this.field3795) {
                this.field3794 = this.field3795;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class158.method1051(this.field3798, (int) (var2 - this.field3820), this.field3821, (int) (var2 - this.field3800), var6);
            }
            this.field3819 = 0;
            this.field3820 = -1L;
        }
        int var7 = -30 / ((arg0 - 64) / 56);
        field3810++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)I")
    public static final int method1685(byte arg0, int arg1) {
        field3811++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 > -92) {
            return -13;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILfa;)[Ljj;")
    public static final class110[] method1686(int arg0, int arg1, int arg2, class273 arg3) {
        field3804++;
        int var4 = 27 / ((arg2 + 22) / 62);
        return class163.method1081(0, arg3, arg0, arg1) ? class184.method1217(0) : null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ[BI)V")
    public final void method1687(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field3805++;
        try {
            if (arg2.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1) {
                return;
            }
            if (this.field3820 != -1L && this.field3815 >= this.field3820 && ((long) arg3 + this.field3815) <= (this.field3820 + ((long) this.field3819))) {
                class158.method1051(this.field3798, (int) (this.field3815 - this.field3820), arg2, arg0, arg3);
                this.field3815 += (long) arg3;
                return;
            }
            long var5 = this.field3815;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field3800 <= this.field3815 && this.field3815 < ((long) this.field3814 + this.field3800)) {
                int var9 = (int) ((long) this.field3814 + this.field3800 - this.field3815);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class158.method1051(this.field3821, (int) (this.field3815 - this.field3800), arg2, arg0, var9);
                arg0 += var9;
                arg3 -= var9;
                this.field3815 += (long) var9;
            }
            if (this.field3821.length < arg3) {
                this.field3812.method1657(false, this.field3815);
                this.field3795 = this.field3815;
                while (arg3 > 0) {
                    int var10 = this.field3812.method1659(arg3, arg0, -96, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3815 += (long) var10;
                    arg3 -= var10;
                    this.field3795 += (long) var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                this.method1677(true);
                int var11 = arg3;
                if (this.field3814 < arg3) {
                    var11 = this.field3814;
                }
                class158.method1051(this.field3821, 0, arg2, arg0, var11);
                this.field3815 += (long) var11;
                arg3 -= var11;
                arg0 += var11;
            }
            if (this.field3820 != -1L) {
                if (this.field3815 < this.field3820 && arg3 > 0) {
                    int var12 = (int) (this.field3820 - this.field3815) + arg0;
                    if (arg0 + arg3 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field3815++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3820 && (var5 + ((long) var8)) > this.field3820) {
                    var13 = this.field3820;
                } else if (var5 >= this.field3820 && (long) this.field3819 + this.field3820 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field3819 + this.field3820 > var5 && ((long) var8 + var5) >= (this.field3820 + ((long) this.field3819))) {
                    var15 = (long) this.field3819 + this.field3820;
                } else if (((long) var8 + var5) > this.field3820 && (long) var8 + var5 <= (long) this.field3819 + this.field3820) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class158.method1051(this.field3798, (int) (var13 - this.field3820), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field3815 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field3815));
                        this.field3815 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3795 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)J")
    public final long method1688(int arg0) {
        if (arg0 == 0) {
            field3802++;
            return this.field3807;
        } else {
            return -57L;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lck;II)V")
    public class241(class238 arg0, int arg1, int arg2) throws IOException {
        this.field3812 = arg0;
        this.field3807 = this.field3794 = arg0.method1658(125);
        this.field3815 = 0L;
        this.field3821 = new byte[arg1];
        this.field3798 = new byte[arg2];
    }
}
