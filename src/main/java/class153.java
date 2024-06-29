import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class153 {

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "J")
    private long field2903 = -1L;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    private int field2907 = 0;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "J")
    private long field2910 = -1L;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lnh;")
    private class137 field2915;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "J")
    private long field2912;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "J")
    private long field2891;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[B")
    private byte[] field2892;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "J")
    private long field2889;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "[B")
    private byte[] field2893;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Lrd;")
    private static class173 field2895 = class133.method843("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 94);

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lrd;")
    public static class173 field2899 = class133.method843("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 52);

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lrd;")
    public static class173 field2905 = field2895;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "J")
    private long field2909;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Lbc;")
    public static class14 field2887;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lbc;")
    public static class14 field2897;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIBI)V")
    public final void method1001(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field2886++;
        try {
            if (arg2 >= 107) {
                if ((long) arg3 + this.field2889 > this.field2891) {
                    this.field2891 = this.field2889 + (long) arg3;
                }
                if (this.field2903 != -1L && (this.field2903 > this.field2889 || this.field2889 > (long) this.field2907 + this.field2903)) {
                    this.method1015(-111);
                }
                if (this.field2903 != -1L && (long) this.field2893.length + this.field2903 < (long) arg3 + this.field2889) {
                    int var5 = (int) ((long) this.field2893.length + this.field2903 - this.field2889);
                    arg3 -= var5;
                    class85.method553(arg0, arg1, this.field2893, (int) (this.field2889 - this.field2903), var5);
                    arg1 += var5;
                    this.field2889 += var5;
                    this.field2907 = this.field2893.length;
                    this.method1015(-109);
                }
                if (arg3 > this.field2893.length) {
                    if (this.field2909 != this.field2889) {
                        this.field2915.method859(this.field2889, 0);
                        this.field2909 = this.field2889;
                    }
                    long var6 = -1L;
                    this.field2915.method861(127, arg1, arg3, arg0);
                    this.field2909 += arg3;
                    if (this.field2909 > this.field2912) {
                        this.field2912 = this.field2909;
                    }
                    if (this.field2889 >= this.field2910 && this.field2889 < (long) this.field2906 + this.field2910) {
                        var6 = this.field2889;
                    } else if (this.field2910 >= this.field2889 && (long) arg3 + this.field2889 > this.field2910) {
                        var6 = this.field2910;
                    }
                    long var8 = -1L;
                    if ((long) arg3 + this.field2889 > this.field2910 && (long) arg3 + this.field2889 <= (long) this.field2906 + this.field2910) {
                        var8 = this.field2889 + (long) arg3;
                    } else if (this.field2889 < (long) this.field2906 + this.field2910 && (long) arg3 + this.field2889 >= (long) this.field2906 + this.field2910) {
                        var8 = this.field2910 + (long) this.field2906;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class85.method553(arg0, (int) (var6 + (long) arg1 - this.field2889), this.field2892, (int) (var6 - this.field2910), var10);
                    }
                    this.field2889 += arg3;
                } else if (arg3 > 0) {
                    if (this.field2903 == -1L) {
                        this.field2903 = this.field2889;
                    }
                    class85.method553(arg0, arg1, this.field2893, (int) (this.field2889 - this.field2903), arg3);
                    this.field2889 += arg3;
                    if (this.field2889 - this.field2903 > (long) this.field2907) {
                        this.field2907 = (int) (this.field2889 - this.field2903);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2909 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JI)V")
    public final void method1002(long arg0, int arg1) throws IOException {
        field2890++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1009(-17343));
        }
        this.field2889 = arg0;
        if (arg1 != -1837) {
            method1006(12, -69, 65, 111, null, -90L, null, null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B[B)V")
    public final void method1003(byte arg0, byte[] arg1) throws IOException {
        field2913++;
        this.method1010(arg1.length, arg1, -1, 0);
        if (arg0 > -15) {
            this.field2912 = 52L;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method1004(boolean arg0) {
        while (true) {
            if (class70.field1358.method1022(class45.field919, 0) >= 11) {
                int var1 = class70.field1358.method1029(11, 0);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class183.field3600[var1] == null) {
                        class183.field3600[var1] = new class212();
                        if (class76.field1489[var1] != null) {
                            class183.field3600[var1].method1392(class76.field1489[var1], 11449);
                        }
                        var2 = true;
                    }
                    class189.field3703[class18.field378++] = var1;
                    class212 var3 = class183.field3600[var1];
                    var3.field2800 = class217.field4203;
                    int var4 = class135.field2559[class70.field1358.method1029(3, 0)];
                    if (var2) {
                        var3.field2794 = var3.field2786 = var4;
                    }
                    int var5 = class70.field1358.method1029(1, 0);
                    int var6 = class70.field1358.method1029(5, 0);
                    int var7 = class70.field1358.method1029(1, 0);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var7 == 1) {
                        class4.field97[class36.field783++] = var1;
                    }
                    int var8 = class70.field1358.method1029(5, 0);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method970(128, var5 == 1, class175.field3447.field2764[0] + var8, class175.field3447.field2814[0] + var6);
                    continue;
                }
            }
            if (arg0) {
                method1008(-75, (byte) 26);
            }
            field2900++;
            class70.field1358.method1025(-124);
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)J")
    public final long method1005(byte arg0) {
        int var2 = 70 / ((arg0 + 1) / 54);
        field2902++;
        return this.field2891;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILdd;JLdd;Ldd;)V")
    public static final void method1006(int arg0, int arg1, int arg2, int arg3, class35 arg4, long arg5, class35 arg6, class35 arg7) {
        class148 var9 = new class148();
        var9.field2821 = arg4;
        var9.field2827 = arg1 * 128 + 64;
        var9.field2832 = arg2 * 128 + 64;
        var9.field2830 = arg3;
        var9.field2829 = arg5;
        var9.field2824 = arg6;
        var9.field2822 = arg7;
        short var10 = 0;
        class105 var11 = class208.field4055[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1972; var12++) {
                if ((var11.field1948[var12].field123 & 0x400000L) == 4194304L && var11.field1948[var12].field113 instanceof class213) {
                    class213 var13 = (class213) var11.field1948[var12].field113;
                    var13.method1404();
                    if (var13.field758 < var10) {
                        var10 = var13.field758;
                    }
                }
            }
        }
        var9.field2836 = -var10;
        if (class208.field4055[arg0][arg1][arg2] == null) {
            class208.field4055[arg0][arg1][arg2] = new class105(arg0, arg1, arg2);
        }
        class208.field4055[arg0][arg1][arg2].field1952 = var9;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    private final void method1007(int arg0) throws IOException {
        this.field2906 = 0;
        if (arg0 != 255) {
            return;
        }
        if (this.field2909 != this.field2889) {
            this.field2915.method859(this.field2889, 0);
            this.field2909 = this.field2889;
        }
        field2904++;
        this.field2910 = this.field2889;
        while (this.field2892.length > this.field2906) {
            int var2 = this.field2892.length - this.field2906;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2915.method862(var2, this.field2892, (byte) 56, this.field2906);
            if (var3 == -1) {
                break;
            }
            this.field2906 += var3;
            this.field2909 += var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)I")
    public static final int method1008(int arg0, byte arg1) {
        if (arg1 < 97) {
            return -52;
        } else {
            field2911++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1009(int arg0) {
        if (arg0 == -17343) {
            field2908++;
            return this.field2915.method860(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[BII)V")
    public final void method1010(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2896++;
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field2903 != -1L && this.field2889 >= this.field2903 && (long) this.field2907 + this.field2903 >= this.field2889 - -((long) arg0)) {
                class85.method553(this.field2893, (int) (this.field2889 - this.field2903), arg1, arg3, arg0);
                this.field2889 += arg0;
                return;
            }
            int var5 = arg0;
            int var6 = arg3;
            long var7 = this.field2889;
            if (this.field2889 >= this.field2910 && this.field2889 < (long) this.field2906 + this.field2910) {
                int var9 = (int) (this.field2910 + (long) this.field2906 - this.field2889);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class85.method553(this.field2892, (int) (this.field2889 - this.field2910), arg1, arg3, var9);
                arg3 += var9;
                this.field2889 += var9;
                arg0 -= var9;
            }
            if (arg0 > this.field2892.length) {
                this.field2915.method859(this.field2889, arg2 + 1);
                this.field2909 = this.field2889;
                while (arg0 > 0) {
                    int var11 = this.field2915.method862(arg0, arg1, (byte) 56, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2909 += var11;
                    arg0 -= var11;
                    this.field2889 += var11;
                    arg3 += var11;
                }
            } else if (arg0 > 0) {
                this.method1007(255);
                int var10 = arg0;
                if (arg0 > this.field2906) {
                    var10 = this.field2906;
                }
                arg0 -= var10;
                class85.method553(this.field2892, 0, arg1, arg3, var10);
                this.field2889 += var10;
                arg3 += var10;
            }
            if (this.field2903 != -1L) {
                if (this.field2889 < this.field2903 && arg0 > 0) {
                    int var12 = (int) (this.field2903 - this.field2889) + arg3;
                    if (var12 > arg3 + arg0) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1[arg3++] = 0;
                        arg0--;
                        this.field2889++;
                    }
                }
                long var13 = -1L;
                if (var7 < (long) this.field2907 + this.field2903 && (long) this.field2907 + this.field2903 <= (long) var5 + var7) {
                    var13 = (long) this.field2907 + this.field2903;
                } else if ((long) var5 + var7 > this.field2903 && (long) this.field2907 + this.field2903 >= (long) var5 + var7) {
                    var13 = (long) var5 + var7;
                }
                long var15 = -1L;
                if (this.field2903 >= var7 && this.field2903 < (long) var5 + var7) {
                    var15 = this.field2903;
                } else if (this.field2903 <= var7 && var7 < (long) this.field2907 + this.field2903) {
                    var15 = var7;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class85.method553(this.field2893, (int) (var15 - this.field2903), arg1, var6 + (int) (var15 - var7), var17);
                    if (this.field2889 < var13) {
                        arg0 = (int) ((long) arg0 + this.field2889 - var13);
                        this.field2889 = var13;
                    }
                }
            }
            if (arg2 != -1) {
                field2887 = null;
            }
        } catch (IOException var19) {
            this.field2909 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static void method1011(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field2887 = null;
        field2895 = null;
        field2897 = null;
        field2899 = null;
        field2905 = null;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public final void method1012(int arg0) throws IOException {
        field2901++;
        if (arg0 != 7416) {
            field2887 = null;
        }
        this.method1015(-37);
        this.field2915.method858(arg0 ^ 0x1C9F);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Component;IB)Lid;")
    public static final class84 method1013(int arg0, Component arg1, int arg2, byte arg3) {
        field2898++;
        try {
            if (arg3 > -32) {
                return null;
            } else {
                Class var4 = Class.forName("ge");
                class84 var5 = (class84) var4.getDeclaredConstructor().newInstance();
                var5.method409(arg0, arg2, -13717, arg1);
                return var5;
            }
        } catch (Throwable var7) {
            class99 var6 = new class99();
            var6.method409(arg0, arg2, -13717, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIILdd;JZ)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, class35 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class22 var8 = new class22();
        var8.field475 = arg4;
        var8.field488 = arg1 * 128 + 64;
        var8.field481 = arg2 * 128 + 64;
        var8.field478 = arg3;
        var8.field487 = arg5;
        if (class208.field4055[arg0][arg1][arg2] == null) {
            class208.field4055[arg0][arg1][arg2] = new class105(arg0, arg1, arg2);
        }
        class208.field4055[arg0][arg1][arg2].field1954 = var8;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    private final void method1015(int arg0) throws IOException {
        if (arg0 >= -28) {
            this.field2912 = -23L;
        }
        if (this.field2903 != -1L) {
            if (this.field2909 != this.field2903) {
                this.field2915.method859(this.field2903, 0);
                this.field2909 = this.field2903;
            }
            this.field2915.method861(127, 0, this.field2907, this.field2893);
            this.field2909 += this.field2907;
            long var2 = -1L;
            if (this.field2912 < this.field2909) {
                this.field2912 = this.field2909;
            }
            long var4 = -1L;
            if (this.field2910 <= this.field2903 && this.field2903 < (long) this.field2906 + this.field2910) {
                var4 = this.field2903;
            } else if (this.field2903 <= this.field2910 && this.field2910 < this.field2903 + (long) this.field2907) {
                var4 = this.field2910;
            }
            if (this.field2910 < (long) this.field2907 + this.field2903 && (long) this.field2906 + this.field2910 >= this.field2903 - -((long) this.field2907)) {
                var2 = this.field2903 + (long) this.field2907;
            } else if (this.field2910 + (long) this.field2906 > this.field2903 && this.field2903 + (long) this.field2907 >= (long) this.field2906 + this.field2910) {
                var2 = (long) this.field2906 + this.field2910;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class85.method553(this.field2893, (int) (var4 - this.field2903), this.field2892, (int) (var4 - this.field2910), var6);
            }
            this.field2907 = 0;
            this.field2903 = -1L;
        }
        field2914++;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lnh;II)V")
    public class153(class137 arg0, int arg1, int arg2) throws IOException {
        this.field2915 = arg0;
        this.field2891 = this.field2912 = arg0.method857(0);
        this.field2892 = new byte[arg1];
        this.field2889 = 0L;
        this.field2893 = new byte[arg2];
    }
}
