import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class189 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "J")
    private long field2899 = -1L;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "J")
    private long field2910 = -1L;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    private int field2911 = 0;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lce;")
    private class222 field2898;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "J")
    private long field2907;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "J")
    private long field2902;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "J")
    private long field2897;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "[B")
    private byte[] field2915;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[B")
    private byte[] field2905;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
    public static boolean field2896 = true;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2908 = "wave:";

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2904 = null;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "J")
    private long field2900;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lpf;")
    public static class294 field2893;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
    public final long method1180(int arg0) {
        if (arg0 != -1) {
            method1186((byte) -79);
        }
        field2912++;
        return this.field2902;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1181(byte arg0) {
        if (arg0 == -112) {
            field2916++;
            return this.field2898.method1420(-126);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[B)V")
    public final void method1182(int arg0, byte[] arg1) throws IOException {
        field2913++;
        this.method1183(arg1.length, arg1, false, arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BZI)V")
    public final void method1183(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field2901++;
        try {
            if (arg1.length < arg3 + arg0) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field2899 != -1L && this.field2897 >= this.field2899 && ((long) this.field2911 + this.field2899) >= ((long) arg0 + this.field2897)) {
                class193.method1210(this.field2905, (int) (this.field2897 - this.field2899), arg1, arg3, arg0);
                this.field2897 += (long) arg0;
                return;
            }
            long var5 = this.field2897;
            if (arg2) {
                field2908 = null;
            }
            int var7 = arg3;
            int var8 = arg0;
            if (this.field2910 <= this.field2897 && ((long) this.field2918 + this.field2910) > this.field2897) {
                int var9 = (int) (this.field2910 + (long) this.field2918 - this.field2897);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class193.method1210(this.field2915, (int) (this.field2897 - this.field2910), arg1, arg3, var9);
                arg3 += var9;
                this.field2897 += (long) var9;
            }
            if (this.field2915.length < arg0) {
                this.field2898.method1424(this.field2897, 0);
                this.field2900 = this.field2897;
                while (arg0 > 0) {
                    int var10 = this.field2898.method1423(arg3, arg0, arg1, (byte) -94);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2900 += (long) var10;
                    arg0 -= var10;
                    this.field2897 += (long) var10;
                    arg3 += var10;
                }
            } else if (arg0 > 0) {
                this.method1185((byte) 113);
                int var11 = arg0;
                if (this.field2918 < arg0) {
                    var11 = this.field2918;
                }
                arg0 -= var11;
                class193.method1210(this.field2915, 0, arg1, arg3, var11);
                this.field2897 += (long) var11;
                arg3 += var11;
            }
            if (this.field2899 != -1L) {
                if (this.field2897 < this.field2899 && arg0 > 0) {
                    int var12 = (int) (this.field2899 - this.field2897) + arg3;
                    if (arg0 + arg3 < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field2897++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (((long) this.field2911 + this.field2899) > var5 && (long) var8 + var5 >= (long) this.field2911 + this.field2899) {
                    var13 = this.field2899 + ((long) this.field2911);
                } else if ((var5 + ((long) var8)) > this.field2899 && (long) this.field2911 + this.field2899 >= var5 - -((long) var8)) {
                    var13 = var5 + ((long) var8);
                }
                if (var5 <= this.field2899 && this.field2899 < (var5 + ((long) var8))) {
                    var15 = this.field2899;
                } else if (this.field2899 <= var5 && ((long) this.field2911 + this.field2899) > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class193.method1210(this.field2905, (int) (var15 - this.field2899), arg1, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field2897) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field2897));
                        this.field2897 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2900 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        field2893 = null;
        field2904 = null;
        if (arg0 == -52) {
            field2908 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(B)V")
    private final void method1185(byte arg0) throws IOException {
        field2914++;
        this.field2918 = 0;
        if (this.field2900 != this.field2897) {
            this.field2898.method1424(this.field2897, arg0 - 113);
            this.field2900 = this.field2897;
        }
        this.field2910 = this.field2897;
        while (this.field2915.length > this.field2918) {
            int var2 = this.field2915.length - this.field2918;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2898.method1423(this.field2918, var2, this.field2915, (byte) -94);
            if (var3 == -1) {
                break;
            }
            this.field2900 += (long) var3;
            this.field2918 += var3;
        }
        if (arg0 != 113) {
            method1189(true, (byte[]) null, -42, (class31[]) null, 118, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
    public static final void method1186(byte arg0) {
        if (arg0 == 50) {
            class250.field3799.method1782(arg0 - 50);
            field2906++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(JB)V")
    public final void method1187(long arg0, byte arg1) throws IOException {
        if (arg1 < 33) {
            this.field2907 = -85L;
        }
        field2909++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1181((byte) -112));
        }
        this.field2897 = arg0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BIII)V")
    public final void method1188(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2917++;
        try {
            if ((long) arg3 + this.field2897 > this.field2902) {
                this.field2902 = this.field2897 + ((long) arg3);
            }
            if ((long) arg1 != this.field2899 && (this.field2897 < this.field2899 || this.field2897 > (this.field2899 + ((long) this.field2911)))) {
                this.method1191((byte) 57);
            }
            if (this.field2899 != -1L && ((long) arg3 + this.field2897) > ((long) this.field2905.length + this.field2899)) {
                int var5 = (int) (this.field2899 + (long) this.field2905.length - this.field2897);
                class193.method1210(arg0, arg2, this.field2905, (int) (this.field2897 - this.field2899), var5);
                arg3 -= var5;
                this.field2897 += (long) var5;
                this.field2911 = this.field2905.length;
                this.method1191((byte) 57);
                arg2 += var5;
            }
            if (arg3 > this.field2905.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2900 != this.field2897) {
                    this.field2898.method1424(this.field2897, 0);
                    this.field2900 = this.field2897;
                }
                this.field2898.method1425(arg2, (byte) -43, arg0, arg3);
                if ((long) arg3 + this.field2897 > this.field2910 && (long) arg3 + this.field2897 <= (long) this.field2918 + this.field2910) {
                    var8 = (long) arg3 + this.field2897;
                } else if ((long) this.field2918 + this.field2910 > this.field2897 && (long) arg3 + this.field2897 >= (long) this.field2918 + this.field2910) {
                    var8 = (long) this.field2918 + this.field2910;
                }
                this.field2900 += (long) arg3;
                if (this.field2907 < this.field2900) {
                    this.field2907 = this.field2900;
                }
                if (this.field2897 >= this.field2910 && this.field2897 < (long) this.field2918 + this.field2910) {
                    var6 = this.field2897;
                } else if (this.field2910 >= this.field2897 && this.field2897 + ((long) arg3) > this.field2910) {
                    var6 = this.field2910;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class193.method1210(arg0, (int) ((long) arg2 + var6 - this.field2897), this.field2915, (int) (var6 - this.field2910), var10);
                }
                this.field2897 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2899 == -1L) {
                    this.field2899 = this.field2897;
                }
                class193.method1210(arg0, arg2, this.field2905, (int) (this.field2897 - this.field2899), arg3);
                this.field2897 += (long) arg3;
                if ((this.field2897 - this.field2899) > ((long) this.field2911)) {
                    this.field2911 = (int) (this.field2897 - this.field2899);
                }
            }
        } catch (IOException var12) {
            this.field2900 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[BI[Lha;IB)V")
    public static final void method1189(boolean arg0, byte[] arg1, int arg2, class31[] arg3, int arg4, byte arg5) {
        if (arg5 != -70) {
            return;
        }
        class248 var6 = new class248(arg1);
        field2895++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1607(0);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1563((byte) 3);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method1593((byte) 27);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg4 + var12;
                int var17 = var9 >> 12;
                int var18 = arg2 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class31 var19 = null;
                    if (!arg0) {
                        int var20 = var17;
                        if ((class221.field3333[1][var16][var18] & 0x2) == 2) {
                            var20 = var17 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class65.method444(var17, var15, var19, var16, var7, var14, var17, !arg0, arg0, 0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I")
    public static final int method1190(boolean arg0, String arg1, String arg2, int arg3) {
        field2894++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        if (!arg0) {
            return -42;
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || (var7 - var9) < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class220.method1411(-3202, var22);
            var9 = class220.method1411(-3202, var24);
            char var26 = class246.method1544((byte) 90, var22, arg3);
            char var27 = class246.method1544((byte) 90, var24, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class100.method643(-1631918684, var28, arg3) - class100.method643(-1631918684, var29, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg2.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class100.method643(-1631918684, var20, arg3) - class100.method643(-1631918684, var21, arg3);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class100.method643(-1631918684, var14, arg3) - class100.method643(-1631918684, var15, arg3);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
    private final void method1191(byte arg0) throws IOException {
        if (arg0 != 57) {
            return;
        }
        if (this.field2899 != -1L) {
            if (this.field2900 != this.field2899) {
                this.field2898.method1424(this.field2899, arg0 ^ 0x39);
                this.field2900 = this.field2899;
            }
            long var2 = -1L;
            this.field2898.method1425(0, (byte) -72, this.field2905, this.field2911);
            long var4 = -1L;
            if (this.field2910 <= this.field2899 && this.field2899 < ((long) this.field2918 + this.field2910)) {
                var2 = this.field2899;
            } else if (this.field2899 <= this.field2910 && this.field2910 < this.field2899 + ((long) this.field2911)) {
                var2 = this.field2910;
            }
            if (this.field2910 < (this.field2899 + ((long) this.field2911)) && ((long) this.field2918 + this.field2910) >= (this.field2899 + ((long) this.field2911))) {
                var4 = this.field2899 + ((long) this.field2911);
            } else if (((long) this.field2918 + this.field2910) > this.field2899 && ((long) this.field2918 + this.field2910) <= ((long) this.field2911 + this.field2899)) {
                var4 = (long) this.field2918 + this.field2910;
            }
            this.field2900 += (long) this.field2911;
            if (this.field2907 < this.field2900) {
                this.field2907 = this.field2900;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class193.method1210(this.field2905, (int) (var2 - this.field2899), this.field2915, (int) (var2 - this.field2910), var6);
            }
            this.field2911 = 0;
            this.field2899 = -1L;
        }
        field2903++;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lce;II)V")
    public class189(class222 arg0, int arg1, int arg2) throws IOException {
        this.field2898 = arg0;
        this.field2902 = this.field2907 = arg0.method1421((byte) -106);
        this.field2897 = 0L;
        this.field2915 = new byte[arg1];
        this.field2905 = new byte[arg2];
    }
}
