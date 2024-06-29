import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class183 {

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "J")
    private long field2905 = -1L;

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "J")
    private long field2914 = -1L;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    private int field2913 = 0;

    @OriginalMember(owner = "client!cka", name = "r", descriptor = "Llm;")
    private class527 field2917;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "J")
    private long field2904;

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "J")
    private long field2901;

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "[B")
    private byte[] field2919;

    @OriginalMember(owner = "client!cka", name = "t", descriptor = "[B")
    private byte[] field2916;

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "J")
    private long field2910;

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2922 = new String[] { method1730(method1729(">6\u0003H\u001au")), method1730(method1729("3(\u000e\n")), method1730(method1729("&sLH%")), method1730(method1729(">6\u0003H\u0012u")), method1730(method1729(">6\u0003H\u001eu")), method1730(method1729(">6\u0003H\u0011u")), method1730(method1729(">6\u0003H\u001du")), method1730(method1729(">6\u0003H\u001cu")), method1730(method1729(">6\u0003H\u001fu")), method1730(method1729(">6\u0003Hd43\u000b\u0012fu")), method1730(method1729("\u00143\u0014\u0007449B\u0015=86B\u00127}")), method1730(method1729(">6\u0003H\u0010u")), method1730(method1729("}4\fF>41\u0007F")), method1730(method1729(">6\u0003H\u0019u")), method1730(method1729(">6\u0003H\u001bu")) };

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!cka", name = "m", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!cka", name = "u", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!cka", name = "s", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!cka", name = "p", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!cka", name = "q", descriptor = "J")
    private long field2918;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1719(int arg0) {
        try {
            field2921++;
            if (arg0 != -15118) {
                this.field2905 = 46L;
            }
            return this.field2917.method3936(true);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2922[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(B)V")
    public final void method1720(byte arg0) throws IOException {
        try {
            field2908++;
            this.method1728((byte) -125);
            int var2 = -95 / ((arg0 + 11) / 42);
            this.field2917.method3940(1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2922[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ILgda;IIZII)V")
    public static final void method1721(int arg0, class58 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        try {
            class787.field11509 = arg1;
            class32.field389 = arg2;
            class550.field8070 = null;
            field2903++;
            class60.field780 = arg4;
            class785.field11466 = arg0;
            class458.field7069 = arg5;
            class516.field7614 = arg3;
            class328.field5391 = arg6;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2922[3] + arg0 + ',' + (arg1 == null ? field2922[1] : field2922[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([BI)V")
    public final void method1722(byte[] arg0, int arg1) throws IOException {
        try {
            this.method1726(arg0, arg1 ^ 0xFFFFFB33, 0, arg0.length);
            if (arg1 == 12229) {
                field2907++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2922[6] + (arg0 == null ? field2922[1] : field2922[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)J")
    public final long method1723(int arg0) {
        try {
            field2915++;
            if (arg0 != -1) {
                this.field2905 = 118L;
            }
            return this.field2901;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2922[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IJ)V")
    public final void method1724(int arg0, long arg1) throws IOException {
        try {
            if (arg0 == 8259) {
                field2906++;
                if (arg1 < 0L) {
                    throw new IOException(field2922[10] + arg1 + field2922[12] + this.method1719(-15118));
                }
                this.field2910 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2922[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(III[B)V")
    public final void method1725(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field2920++;
            try {
                if (this.field2901 < (long) arg2 + this.field2910) {
                    this.field2901 = (long) arg2 + this.field2910;
                }
                if (this.field2914 != -1L && (this.field2910 < this.field2914 || (long) this.field2913 + this.field2914 < this.field2910)) {
                    this.method1728((byte) -118);
                }
                if (this.field2914 != -1L && (long) this.field2916.length + this.field2914 < (long) arg2 + this.field2910) {
                    int var5 = (int) ((long) this.field2916.length + this.field2914 - this.field2910);
                    class405.method3259(arg3, arg0, this.field2916, (int) (this.field2910 - this.field2914), var5);
                    arg0 += var5;
                    this.field2910 += var5;
                    arg2 -= var5;
                    this.field2913 = this.field2916.length;
                    this.method1728((byte) -120);
                }
                if (this.field2916.length >= arg2) {
                    if (arg1 != -11999) {
                        this.method1719(45);
                    }
                    if (arg2 > 0) {
                        if (this.field2914 == -1L) {
                            this.field2914 = this.field2910;
                        }
                        class405.method3259(arg3, arg0, this.field2916, (int) (this.field2910 - this.field2914), arg2);
                        this.field2910 += arg2;
                        if ((this.field2910 - this.field2914) > ((long) this.field2913)) {
                            this.field2913 = (int) (this.field2910 - this.field2914);
                        }
                    }
                } else {
                    if (this.field2918 != this.field2910) {
                        this.field2917.method3937((byte) 116, this.field2910);
                        this.field2918 = this.field2910;
                    }
                    this.field2917.method3941(-1, arg2, arg0, arg3);
                    this.field2918 += arg2;
                    if (this.field2904 < this.field2918) {
                        this.field2904 = this.field2918;
                    }
                    long var6 = -1L;
                    if (this.field2910 >= this.field2905 && this.field2910 < (long) this.field2902 + this.field2905) {
                        var6 = this.field2910;
                    } else if (this.field2910 <= this.field2905 && this.field2905 < (long) arg2 + this.field2910) {
                        var6 = this.field2905;
                    }
                    long var8 = -1L;
                    if (((long) arg2 + this.field2910) > this.field2905 && (long) arg2 + this.field2910 <= (long) this.field2902 + this.field2905) {
                        var8 = (long) arg2 + this.field2910;
                    } else if ((long) this.field2902 + this.field2905 > this.field2910 && ((long) this.field2902 + this.field2905) <= ((long) arg2 + this.field2910)) {
                        var8 = this.field2905 + ((long) this.field2902);
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class405.method3259(arg3, (int) ((long) arg0 + var6 - this.field2910), this.field2919, (int) (var6 - this.field2905), var10);
                    }
                    this.field2910 += arg2;
                }
            } catch (IOException var13) {
                this.field2918 = -1L;
                throw var13;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field2922[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2922[1] : field2922[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([BIII)V")
    public final void method1726(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            field2909++;
            try {
                if ((arg2 + arg3) > arg0.length) {
                    throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
                }
                if (this.field2914 != -1L && this.field2910 >= this.field2914 && this.field2910 + ((long) arg3) <= (long) this.field2913 + this.field2914) {
                    class405.method3259(this.field2916, (int) (this.field2910 - this.field2914), arg0, arg2, arg3);
                    this.field2910 += arg3;
                    return;
                }
                long var5 = this.field2910;
                int var7 = arg2;
                int var8 = arg3;
                if (this.field2910 >= this.field2905 && this.field2910 < (long) this.field2902 + this.field2905) {
                    int var9 = (int) (this.field2905 + (long) this.field2902 - this.field2910);
                    if (arg3 < var9) {
                        var9 = arg3;
                    }
                    class405.method3259(this.field2919, (int) (this.field2910 - this.field2905), arg0, arg2, var9);
                    this.field2910 += var9;
                    arg3 -= var9;
                    arg2 += var9;
                }
                if (arg3 > this.field2919.length) {
                    this.field2917.method3937((byte) 116, this.field2910);
                    this.field2918 = this.field2910;
                    while (arg3 > 0) {
                        int var10 = this.field2917.method3935(false, arg2, arg3, arg0);
                        if (var10 == -1) {
                            break;
                        }
                        arg3 -= var10;
                        this.field2918 += var10;
                        this.field2910 += var10;
                        arg2 += var10;
                    }
                } else if (arg3 > 0) {
                    this.method1727((byte) -16);
                    int var11 = arg3;
                    if (arg3 > this.field2902) {
                        var11 = this.field2902;
                    }
                    class405.method3259(this.field2919, 0, arg0, arg2, var11);
                    this.field2910 += var11;
                    arg3 -= var11;
                    arg2 += var11;
                }
                if (this.field2914 != -1L) {
                    if (this.field2910 < this.field2914 && arg3 > 0) {
                        int var12 = (int) (this.field2914 - this.field2910) + arg2;
                        if ((arg2 + arg3) < var12) {
                            var12 = arg2 + arg3;
                        }
                        while (arg2 < var12) {
                            arg0[arg2++] = 0;
                            arg3--;
                            this.field2910++;
                        }
                    }
                    long var13 = -1L;
                    long var15 = -1L;
                    if (var5 <= this.field2914 && (long) var8 + var5 > this.field2914) {
                        var13 = this.field2914;
                    } else if (this.field2914 <= var5 && var5 < (this.field2914 + ((long) this.field2913))) {
                        var13 = var5;
                    }
                    if (var5 < (long) this.field2913 + this.field2914 && ((long) this.field2913 + this.field2914) <= (var5 + ((long) var8))) {
                        var15 = (long) this.field2913 + this.field2914;
                    } else if ((var5 + ((long) var8)) > this.field2914 && this.field2914 + ((long) this.field2913) >= (long) var8 + var5) {
                        var15 = var5 + ((long) var8);
                    }
                    if (var13 > -1L && var13 < var15) {
                        int var17 = (int) (var15 - var13);
                        class405.method3259(this.field2916, (int) (var13 - this.field2914), arg0, var7 + ((int) (var13 - var5)), var17);
                        if (var15 > this.field2910) {
                            arg3 = (int) ((long) arg3 - (var15 - this.field2910));
                            this.field2910 = var15;
                        }
                    }
                }
            } catch (IOException var20) {
                this.field2918 = -1L;
                throw var20;
            }
            if (arg1 == -11018 && arg3 > 0) {
                throw new EOFException();
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field2922[4] + (arg0 == null ? field2922[1] : field2922[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V")
    private final void method1727(byte arg0) throws IOException {
        try {
            this.field2902 = 0;
            field2912++;
            if (this.field2918 != this.field2910) {
                this.field2917.method3937((byte) 116, this.field2910);
                this.field2918 = this.field2910;
            }
            this.field2905 = this.field2910;
            if (arg0 <= -15) {
                while (this.field2919.length > this.field2902) {
                    int var2 = this.field2919.length - this.field2902;
                    if (var2 > 200000000) {
                        var2 = 200000000;
                    }
                    int var3 = this.field2917.method3935(false, this.field2902, var2, this.field2919);
                    if (var3 == -1) {
                        break;
                    }
                    this.field2902 += var3;
                    this.field2918 += var3;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2922[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)V")
    private final void method1728(byte arg0) throws IOException {
        try {
            if (this.field2914 != -1L) {
                if (this.field2918 != this.field2914) {
                    this.field2917.method3937((byte) 116, this.field2914);
                    this.field2918 = this.field2914;
                }
                this.field2917.method3941(-1, this.field2913, 0, this.field2916);
                this.field2918 += this.field2913;
                if (this.field2918 > this.field2904) {
                    this.field2904 = this.field2918;
                }
                long var2 = -1L;
                if (this.field2914 >= this.field2905 && this.field2914 < ((long) this.field2902 + this.field2905)) {
                    var2 = this.field2914;
                } else if (this.field2914 <= this.field2905 && ((long) this.field2913 + this.field2914) > this.field2905) {
                    var2 = this.field2905;
                }
                long var4 = -1L;
                if ((long) this.field2913 + this.field2914 > this.field2905 && ((long) this.field2902 + this.field2905) >= (this.field2914 + ((long) this.field2913))) {
                    var4 = (long) this.field2913 + this.field2914;
                } else if (this.field2914 < (this.field2905 + ((long) this.field2902)) && (this.field2914 + ((long) this.field2913)) >= ((long) this.field2902 + this.field2905)) {
                    var4 = this.field2905 + ((long) this.field2902);
                }
                if (var2 > -1L && var2 < var4) {
                    int var6 = (int) (var4 - var2);
                    class405.method3259(this.field2916, (int) (var2 - this.field2914), this.field2919, (int) (var2 - this.field2905), var6);
                }
                this.field2913 = 0;
                this.field2914 = -1L;
            }
            field2911++;
            if (arg0 > -107) {
                this.field2902 = 94;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2922[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Llm;II)V")
    public class183(class527 arg0, int arg1, int arg2) throws IOException {
        try {
            this.field2917 = arg0;
            this.field2901 = this.field2904 = arg0.method3938(-27115);
            this.field2919 = new byte[arg1];
            this.field2916 = new byte[arg2];
            this.field2910 = 0L;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2922[9] + (arg0 == null ? field2922[1] : field2922[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1729(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1730(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
