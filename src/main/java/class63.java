import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class63 {

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "J")
    private long field831 = -1L;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    private int field826 = 0;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "J")
    private long field851 = -1L;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lba;")
    private class286 field829;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "J")
    private long field845;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "J")
    private long field848;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[B")
    private byte[] field853;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "J")
    private long field839;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[B")
    private byte[] field827;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "Luf;")
    public static class168 field833 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    private int field850;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "J")
    private long field838;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[I")
    public static int[] field842;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[[[I")
    public static int[][][] field832;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BIII)V", line = 7)
    public final void method353(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field846++;
        try {
            if (this.field848 < (long) arg2 + this.field839) {
                this.field848 = this.field839 + ((long) arg2);
            }
            if (this.field831 != -1L && (this.field839 < this.field831 || this.field839 > (long) this.field826 + this.field831)) {
                this.method355((byte) -102);
            }
            if ((long) arg3 != this.field831 && ((long) this.field853.length + this.field831) < ((long) arg2 + this.field839)) {
                int var5 = (int) ((long) this.field853.length + this.field831 - this.field839);
                class185.method1308(arg0, arg1, this.field853, (int) (this.field839 - this.field831), var5);
                arg2 -= var5;
                this.field839 += (long) var5;
                arg1 += var5;
                this.field826 = this.field853.length;
                this.method355((byte) -124);
            }
            if (arg2 > this.field853.length) {
                if (this.field839 != this.field838) {
                    this.field829.method1973(this.field839, 125);
                    this.field838 = this.field839;
                }
                this.field829.method1978(arg1, arg0, arg2, true);
                long var6 = -1L;
                if (this.field851 < (long) arg2 + this.field839 && (long) this.field850 + this.field851 >= (long) arg2 + this.field839) {
                    var6 = (long) arg2 + this.field839;
                } else if ((long) this.field850 + this.field851 > this.field839 && (long) this.field850 + this.field851 <= (long) arg2 + this.field839) {
                    var6 = (long) this.field850 + this.field851;
                }
                this.field838 += (long) arg2;
                if (this.field838 > this.field845) {
                    this.field845 = this.field838;
                }
                long var8 = -1L;
                if (this.field839 >= this.field851 && (long) this.field850 + this.field851 > this.field839) {
                    var8 = this.field839;
                } else if (this.field851 >= this.field839 && (this.field839 + ((long) arg2)) > this.field851) {
                    var8 = this.field851;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class185.method1308(arg0, (int) ((long) arg1 + var8 - this.field839), this.field827, (int) (var8 - this.field851), var10);
                }
                this.field839 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field831 == -1L) {
                    this.field831 = this.field839;
                }
                class185.method1308(arg0, arg1, this.field853, (int) (this.field839 - this.field831), arg2);
                this.field839 += (long) arg2;
                if (this.field839 - this.field831 > (long) this.field826) {
                    this.field826 = (int) (this.field839 - this.field831);
                }
            }
        } catch (IOException var12) {
            this.field838 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 140)
    public static final void method354(int arg0) {
        field825++;
        if (class19.field221 != -1) {
            class12.method45(-1, class19.field221);
        }
        for (int var1 = 0; var1 < class227.field3685; var1++) {
            if (class214.field3495[var1]) {
                class131.field2028[var1] = true;
            }
            class216.field3518[var1] = class214.field3495[var1];
            class214.field3495[var1] = false;
        }
        class127.field1976 = class203.field3335;
        class72.field962 = null;
        class183.field2940 = -1;
        class99.field1551 = -1;
        class226.field3677 = true;
        if (class19.field221 != -1) {
            class227.field3685 = 0;
            class183.method1301(class14.field142, 0, -1, class299.field5069, 0, class19.field221, 0, (byte) 61, 0);
        }
        class228.method1559();
        class274.field4619 = 0;
        if (arg0 != 1023) {
            method364(-34);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 186)
    private final void method355(byte arg0) throws IOException {
        if (this.field831 != -1L) {
            if (this.field838 != this.field831) {
                this.field829.method1973(this.field831, -101);
                this.field838 = this.field831;
            }
            this.field829.method1978(0, this.field853, this.field826, true);
            this.field838 += (long) this.field826;
            if (this.field845 < this.field838) {
                this.field845 = this.field838;
            }
            long var2 = -1L;
            if (this.field851 <= this.field831 && ((long) this.field850 + this.field851) > this.field831) {
                var2 = this.field831;
            } else if (this.field851 >= this.field831 && ((long) this.field826 + this.field831) > this.field851) {
                var2 = this.field851;
            }
            long var4 = -1L;
            if (this.field851 < (long) this.field826 + this.field831 && (this.field831 + ((long) this.field826)) <= ((long) this.field850 + this.field851)) {
                var4 = this.field831 + ((long) this.field826);
            } else if (this.field831 < (long) this.field850 + this.field851 && ((long) this.field850 + this.field851) <= ((long) this.field826 + this.field831)) {
                var4 = (long) this.field850 + this.field851;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class185.method1308(this.field853, (int) (var2 - this.field831), this.field827, (int) (var2 - this.field851), var6);
            }
            this.field831 = -1L;
            this.field826 = 0;
        }
        field843++;
        if (arg0 >= -80) {
            this.field853 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)J", line = 264)
    public final long method356(int arg0) {
        if (arg0 != 32) {
            this.field853 = (byte[]) null;
        }
        field835++;
        return this.field848;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[B)V", line = 275)
    public final void method357(int arg0, byte[] arg1) throws IOException {
        this.method359(arg1, arg1.length, (byte) 93, arg0);
        field840++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(JI)V", line = 284)
    public final void method358(long arg0, int arg1) throws IOException {
        field836++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method360((byte) 117));
        }
        this.field839 = arg0;
        if (arg1 >= -67) {
            field833 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BIBI)V", line = 301)
    public final void method359(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field852++;
        try {
            if (arg0.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field831 != -1L && this.field839 >= this.field831 && ((long) this.field826 + this.field831) >= ((long) arg1 + this.field839)) {
                class185.method1308(this.field853, (int) (this.field839 - this.field831), arg0, arg3, arg1);
                this.field839 += (long) arg1;
                return;
            }
            long var5 = this.field839;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field839 >= this.field851 && this.field839 < (long) this.field850 + this.field851) {
                int var9 = (int) ((long) this.field850 + this.field851 - this.field839);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class185.method1308(this.field827, (int) (this.field839 - this.field851), arg0, arg3, var9);
                this.field839 += (long) var9;
                arg3 += var9;
            }
            if (arg1 > this.field827.length) {
                this.field829.method1973(this.field839, -65);
                this.field838 = this.field839;
                while (arg1 > 0) {
                    int var10 = this.field829.method1976(arg3, arg0, (byte) 109, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field838 += (long) var10;
                    this.field839 += (long) var10;
                    arg1 -= var10;
                    arg3 += var10;
                }
            } else if (arg1 > 0) {
                this.method366(0);
                int var11 = arg1;
                if (this.field850 < arg1) {
                    var11 = this.field850;
                }
                class185.method1308(this.field827, 0, arg0, arg3, var11);
                arg3 += var11;
                arg1 -= var11;
                this.field839 += (long) var11;
            }
            if (this.field831 != -1L) {
                if (this.field839 < this.field831 && arg1 > 0) {
                    int var12 = (int) (this.field831 - this.field839) + arg3;
                    if (var12 > arg3 + arg1) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field839++;
                    }
                }
                long var13 = -1L;
                if (this.field831 >= var5 && (long) var8 + var5 > this.field831) {
                    var13 = this.field831;
                } else if (this.field831 <= var5 && this.field831 + ((long) this.field826) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field831 + ((long) this.field826)) && ((long) var8 + var5) >= ((long) this.field826 + this.field831)) {
                    var15 = (long) this.field826 + this.field831;
                } else if (var5 + ((long) var8) > this.field831 && (long) var8 + var5 <= (long) this.field826 + this.field831) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class185.method1308(this.field853, (int) (var13 - this.field831), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field839) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field839));
                        this.field839 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field838 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        } else if (arg2 < 46) {
            field830 = 0;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Ljava/io/File;", line = 484)
    private final File method360(byte arg0) {
        if (arg0 <= 99) {
            field830 = 20;
        }
        field828++;
        return this.field829.method1975(-1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 500)
    public static final void method361(int arg0, int arg1) {
        field837++;
        class194.field3147.method1428(arg1, 29946);
        if (arg0 != -1) {
            method354(-62);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 513)
    public static final String method362(Throwable arg0, byte arg1) throws IOException {
        int var2 = -81 % ((-arg1 - 23) / 33);
        field849++;
        String var4;
        if (arg0 instanceof class8) {
            class8 var3 = (class8) arg0;
            var4 = var3.field107 + " | ";
            arg0 = var3.field101;
        } else {
            var4 = "";
        }
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg0.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var4 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var4 = var4 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var4 = var4 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZII[BI[Lcg;BIII)V", line = 595)
    public static final void method363(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, class253[] arg6, byte arg7, int arg8, int arg9, int arg10) {
        field844++;
        if (!arg1) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg3 + var11 > 0 && (arg3 + var11) < 103 && (arg2 + var12) > 0 && arg2 + var12 < 103) {
                        arg6[arg5].field4317[arg3 + var11][arg2 + var12] = class159.method1119(arg6[arg5].field4317[arg3 + var11][arg2 + var12], -16777217);
                    }
                }
            }
        }
        int var13 = 57 / ((21 - arg7) / 48);
        byte var14;
        if (arg1) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        class153 var15 = new class153(arg4);
        for (int var16 = 0; var16 < var14; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    if (arg0 == var16 && arg10 <= var17 && var17 < arg10 + 8 && arg9 <= var18 && var18 < arg9 + 8) {
                        class19.method89(class102.method768(arg8, var17 & 0x7, -15072, var18 & 0x7) + arg2, arg1, arg8, class18.method86(var18 & 0x7, var17 & 0x7, true, arg8) + arg3, arg5, 0, 0, -65536, var15);
                    } else {
                        class19.method89(-1, arg1, 0, -1, 0, 0, 0, -65536, var15);
                    }
                }
            }
        }
        if (arg1) {
            return;
        }
        class148 var19 = null;
        while (true) {
            while (var15.field2359.length > var15.field2367) {
                int var20 = var15.method1042((byte) 96);
                if (var20 == 0) {
                    var19 = new class148(var15);
                } else if (var20 == 1) {
                    int var21 = var15.method1042((byte) -88);
                    if (var21 > 0) {
                        for (int var22 = 0; var22 < var21; var22++) {
                            class291 var23 = new class291(var15);
                            int var24 = var23.field4909 >> 7;
                            int var25 = var23.field4905 >> 7;
                            if (var23.field4889 == arg0 && arg10 <= var25 && var25 < arg10 + 8 && arg9 <= var24 && var24 < (arg9 + 8)) {
                                int var26 = (arg3 << 7) + class133.method930(var23.field4909 & 0x3FF, arg8, var23.field4905 & 0x3FF, 13485);
                                int var27 = (arg2 << 7) + class238.method1608(var23.field4905 & 0x3FF, var23.field4909 & 0x3FF, (byte) -34, arg8);
                                var23.field4909 = var27;
                                var23.field4905 = var26;
                                int var28 = var23.field4905 >> 7;
                                int var29 = var23.field4909 >> 7;
                                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                                    var23.field4902 = class227.field3686[var23.field4889][var28][var29] - var23.field4902;
                                    class257.method1757(var23);
                                }
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var19 == null) {
                var19 = new class148();
            }
            class271.field4559[arg3 >> 3][arg2 >> 3] = var19;
            break;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 743)
    public static void method364(int arg0) {
        field832 = (int[][][]) null;
        field833 = null;
        field842 = null;
        if (arg0 != -15747) {
            field830 = -85;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 758)
    public final void method365(boolean arg0) throws IOException {
        this.method355((byte) -99);
        field834++;
        this.field829.method1977(103);
        if (!arg0) {
            field832 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 774)
    private final void method366(int arg0) throws IOException {
        field841++;
        this.field850 = arg0;
        if (this.field839 != this.field838) {
            this.field829.method1973(this.field839, arg0 - 128);
            this.field838 = this.field839;
        }
        this.field851 = this.field839;
        while (this.field827.length > this.field850) {
            int var2 = this.field827.length - this.field850;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field829.method1976(this.field850, this.field827, (byte) 109, var2);
            if (var3 == -1) {
                break;
            }
            this.field838 += (long) var3;
            this.field850 += var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lba;II)V", line = 828)
    public class63(class286 arg0, int arg1, int arg2) throws IOException {
        this.field829 = arg0;
        this.field848 = this.field845 = arg0.method1974(-1);
        this.field853 = new byte[arg2];
        this.field839 = 0L;
        this.field827 = new byte[arg1];
    }
}
