import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class346 {

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "J")
    private long field4848 = -1L;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    private int field4867 = 0;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "J")
    private long field4870 = -1L;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Lro;")
    private class2 field4855;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "J")
    private long field4871;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "J")
    private long field4853;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "[B")
    private byte[] field4850;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "[B")
    private byte[] field4857;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "J")
    private long field4864;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4859 = 0;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "[C")
    public static char[] field4863 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field4861 = 0;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    private int field4866;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "J")
    private long field4852;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "[Lhh;")
    public static class140[] field4860;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 6)
    public final void method2195(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field4848 = -74L;
        }
        field4854++;
        this.method2205(false);
        this.field4855.method6(95);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BBII)V", line = 20)
    public final void method2196(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field4865++;
        try {
            if (this.field4853 < (this.field4864 + ((long) arg2))) {
                this.field4853 = (long) arg2 + this.field4864;
            }
            if (this.field4870 != -1L && (this.field4870 > this.field4864 || (long) this.field4867 + this.field4870 < this.field4864)) {
                this.method2205(false);
            }
            if (this.field4870 != -1L && ((long) arg2 + this.field4864) > (this.field4870 + ((long) this.field4857.length))) {
                int var5 = (int) (this.field4870 + (long) this.field4857.length - this.field4864);
                class421.method2534(arg0, arg3, this.field4857, (int) (this.field4864 - this.field4870), var5);
                this.field4864 += var5;
                arg2 -= var5;
                arg3 += var5;
                this.field4867 = this.field4857.length;
                this.method2205(false);
            }
            if (arg2 > this.field4857.length) {
                if (this.field4864 != this.field4852) {
                    this.field4855.method9((byte) -110, this.field4864);
                    this.field4852 = this.field4864;
                }
                this.field4855.method8(arg2, arg3, arg0, 29620);
                this.field4852 += arg2;
                if (this.field4871 < this.field4852) {
                    this.field4871 = this.field4852;
                }
                long var6 = -1L;
                if (this.field4864 >= this.field4848 && this.field4864 < (this.field4848 + ((long) this.field4866))) {
                    var6 = this.field4864;
                } else if (this.field4848 >= this.field4864 && this.field4848 < (long) arg2 + this.field4864) {
                    var6 = this.field4848;
                }
                long var8 = -1L;
                if ((this.field4864 + ((long) arg2)) > this.field4848 && ((long) arg2 + this.field4864) <= (this.field4848 + ((long) this.field4866))) {
                    var8 = this.field4864 + ((long) arg2);
                } else if ((long) this.field4866 + this.field4848 > this.field4864 && ((long) this.field4866 + this.field4848) <= ((long) arg2 + this.field4864)) {
                    var8 = this.field4848 + ((long) this.field4866);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class421.method2534(arg0, (int) ((long) arg3 + var6 - this.field4864), this.field4850, (int) (var6 - this.field4848), var10);
                }
                this.field4864 += arg2;
            } else if (arg2 > 0) {
                if (this.field4870 == -1L) {
                    this.field4870 = this.field4864;
                }
                class421.method2534(arg0, arg3, this.field4857, (int) (this.field4864 - this.field4870), arg2);
                this.field4864 += arg2;
                if ((this.field4864 - this.field4870) > ((long) this.field4867)) {
                    this.field4867 = (int) (this.field4864 - this.field4870);
                }
            } else {
                int var11 = -4 % ((arg1 - 44) / 58);
            }
        } catch (IOException var13) {
            this.field4852 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Ljava/io/File;", line = 143)
    private final File method2197(int arg0) {
        if (arg0 == -2111) {
            field4868++;
            return this.field4855.method10(-1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 158)
    public static void method2198(int arg0) {
        int var1 = 65 % (-arg0 / 43);
        field4863 = null;
        field4860 = null;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V", line = 181)
    private final void method2199(int arg0) throws IOException {
        field4849++;
        if (arg0 != -1) {
            method2200(-83);
        }
        this.field4866 = 0;
        if (this.field4864 != this.field4852) {
            this.field4855.method9((byte) -88, this.field4864);
            this.field4852 = this.field4864;
        }
        this.field4848 = this.field4864;
        while (this.field4850.length > this.field4866) {
            int var2 = this.field4850.length - this.field4866;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4855.method7(var2, this.field4866, this.field4850, arg0 + 1);
            if (var3 == -1) {
                break;
            }
            this.field4852 += var3;
            this.field4866 += var3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V", line = 228)
    public static final void method2200(int arg0) {
        field4851++;
        class170.method1148(arg0, -11239);
        class132.method934(arg0 ^ 0x4B);
        System.gc();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([BI)V", line = 239)
    public final void method2201(byte[] arg0, int arg1) throws IOException {
        this.method2202(arg0.length, arg1, arg0, false);
        field4858++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II[BZ)V", line = 248)
    public final void method2202(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field4869++;
        try {
            if (arg0 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (arg3) {
                method2200(-81);
            }
            if (this.field4870 != -1L && this.field4864 >= this.field4870 && (long) this.field4867 + this.field4870 >= (long) arg0 + this.field4864) {
                class421.method2534(this.field4857, (int) (this.field4864 - this.field4870), arg2, arg1, arg0);
                this.field4864 += arg0;
                return;
            }
            long var5 = this.field4864;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field4864 >= this.field4848 && this.field4864 < this.field4848 + ((long) this.field4866)) {
                int var9 = (int) ((long) this.field4866 + this.field4848 - this.field4864);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class421.method2534(this.field4850, (int) (this.field4864 - this.field4848), arg2, arg1, var9);
                arg0 -= var9;
                this.field4864 += var9;
                arg1 += var9;
            }
            if (arg0 > this.field4850.length) {
                this.field4855.method9((byte) -106, this.field4864);
                this.field4852 = this.field4864;
                while (arg0 > 0) {
                    int var11 = this.field4855.method7(arg0, arg1, arg2, 0);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 += var11;
                    arg0 -= var11;
                    this.field4864 += var11;
                    this.field4852 += var11;
                }
            } else if (arg0 > 0) {
                this.method2199(-1);
                int var10 = arg0;
                if (this.field4866 < arg0) {
                    var10 = this.field4866;
                }
                class421.method2534(this.field4850, 0, arg2, arg1, var10);
                this.field4864 += var10;
                arg1 += var10;
                arg0 -= var10;
            }
            if (this.field4870 != -1L) {
                if (this.field4870 > this.field4864 && arg0 > 0) {
                    int var12 = (int) (this.field4870 - this.field4864) + arg1;
                    if (arg1 + arg0 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg2[arg1++] = 0;
                        arg0--;
                        this.field4864++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field4870 && ((long) var8 + var5) > this.field4870) {
                    var13 = this.field4870;
                } else if (var5 >= this.field4870 && var5 < ((long) this.field4867 + this.field4870)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field4867 + this.field4870 && (long) var8 + var5 >= (long) this.field4867 + this.field4870) {
                    var15 = (long) this.field4867 + this.field4870;
                } else if ((var5 + ((long) var8)) > this.field4870 && (long) var8 + var5 <= (long) this.field4867 + this.field4870) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class421.method2534(this.field4857, (int) (var13 - this.field4870), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field4864) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field4864));
                        this.field4864 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4852 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)V", line = 437)
    public final void method2203(int arg0, long arg1) throws IOException {
        field4856++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2197(-2111));
        }
        this.field4864 = arg1;
        if (arg0 != -5442) {
            this.field4866 = 68;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)J", line = 458)
    public final long method2204(byte arg0) {
        field4862++;
        if (arg0 != 29) {
            method2200(52);
        }
        return this.field4853;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lro;II)V", line = 568)
    public class346(class2 arg0, int arg1, int arg2) throws IOException {
        this.field4855 = arg0;
        this.field4853 = this.field4871 = arg0.method12(-10565);
        this.field4850 = new byte[arg1];
        this.field4857 = new byte[arg2];
        this.field4864 = 0L;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V", line = 490)
    private final void method2205(boolean arg0) throws IOException {
        if (arg0) {
            this.field4870 = -35L;
        }
        field4847++;
        if (this.field4870 == -1L) {
            return;
        }
        if (this.field4870 != this.field4852) {
            this.field4855.method9((byte) -119, this.field4870);
            this.field4852 = this.field4870;
        }
        this.field4855.method8(this.field4867, 0, this.field4857, 29620);
        this.field4852 += this.field4867;
        if (this.field4852 > this.field4871) {
            this.field4871 = this.field4852;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field4848 <= this.field4870 && this.field4870 < (this.field4848 + ((long) this.field4866))) {
            var2 = this.field4870;
        } else if (this.field4848 >= this.field4870 && ((long) this.field4867 + this.field4870) > this.field4848) {
            var2 = this.field4848;
        }
        if (this.field4848 < (long) this.field4867 + this.field4870 && (this.field4848 + ((long) this.field4866)) >= ((long) this.field4867 + this.field4870)) {
            var4 = (long) this.field4867 + this.field4870;
        } else if (this.field4870 < ((long) this.field4866 + this.field4848) && ((long) this.field4867 + this.field4870) >= ((long) this.field4866 + this.field4848)) {
            var4 = this.field4848 + ((long) this.field4866);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class421.method2534(this.field4857, (int) (var2 - this.field4870), this.field4850, (int) (var2 - this.field4848), var6);
        }
        this.field4867 = 0;
        this.field4870 = -1L;
    }
}
