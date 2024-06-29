import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class504 {

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    private int field7042 = 0;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "J")
    private long field7052 = -1L;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "J")
    private long field7060 = -1L;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "Lel;")
    private class721 field7058;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "J")
    private long field7050;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "J")
    private long field7055;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "[B")
    private byte[] field7040;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "J")
    private long field7051;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "[B")
    private byte[] field7063;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public static int field7045 = -1;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "[I")
    public static int[] field7062 = new int[2];

    @OriginalMember(owner = "client!on", name = "s", descriptor = "F")
    public static float field7053;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    private int field7056;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "J")
    private long field7057;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[Z")
    public static boolean[] field7038;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 5)
    public final void method3006(int arg0) throws IOException {
        field7054++;
        this.method3009(-1);
        if (arg0 != 0) {
            this.field7057 = -32L;
        }
        this.field7058.method4048(arg0 + 1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)J", line = 19)
    public final long method3007(boolean arg0) {
        if (arg0) {
            method3014(88, 95);
        }
        field7041++;
        return this.field7055;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JB)V", line = 40)
    public final void method3008(long arg0, byte arg1) throws IOException {
        field7037++;
        if (arg1 >= -20) {
            field7062 = null;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3010(true));
        }
        this.field7051 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lel;II)V", line = 804)
    public class504(class721 arg0, int arg1, int arg2) throws IOException {
        this.field7058 = arg0;
        this.field7055 = this.field7050 = arg0.method4049(98);
        this.field7040 = new byte[arg2];
        this.field7051 = 0L;
        this.field7063 = new byte[arg1];
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 58)
    private final void method3009(int arg0) throws IOException {
        field7048++;
        if ((long) arg0 == this.field7060) {
            return;
        }
        if (this.field7060 != this.field7057) {
            this.field7058.method4050(5491, this.field7060);
            this.field7057 = this.field7060;
        }
        this.field7058.method4042(this.field7040, this.field7042, -14, 0);
        this.field7057 += this.field7042;
        if (this.field7057 > this.field7050) {
            this.field7050 = this.field7057;
        }
        long var2 = -1L;
        if (this.field7060 >= this.field7052 && this.field7060 < ((long) this.field7056 + this.field7052)) {
            var2 = this.field7060;
        } else if (this.field7052 >= this.field7060 && (long) this.field7042 + this.field7060 > this.field7052) {
            var2 = this.field7052;
        }
        long var4 = -1L;
        if ((long) this.field7042 + this.field7060 > this.field7052 && (long) this.field7042 + this.field7060 <= (long) this.field7056 + this.field7052) {
            var4 = this.field7060 + ((long) this.field7042);
        } else if (this.field7060 < (long) this.field7056 + this.field7052 && (long) this.field7042 + this.field7060 >= (long) this.field7056 + this.field7052) {
            var4 = (long) this.field7056 + this.field7052;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class34.method245(this.field7040, (int) (var2 - this.field7060), this.field7063, (int) (var2 - this.field7052), var6);
        }
        this.field7042 = 0;
        this.field7060 = -1L;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)Ljava/io/File;", line = 133)
    private final File method3010(boolean arg0) {
        if (!arg0) {
            this.field7051 = 88L;
        }
        field7044++;
        return this.field7058.method4047((byte) -69);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)I", line = 144)
    public static final int method3011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -1) {
            method3011(-61, 9, 85, 3, 84, -68);
        }
        field7049++;
        if (class52.field741 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg1 >> 9;
            int var7 = arg4 >> 9;
            if (arg3 < 0 || arg0 < 0 || arg3 > class514.field7179 - 1 || arg0 > class456.field6281 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > class514.field7179 - 1 || var7 > (class456.field6281 - 1)) {
                return 0;
            }
            boolean var8 = (class429.field5916[1][arg1 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg1 & 0x1FF) == 0) {
                boolean var9 = (class429.field5916[1][var6 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var10 = (class429.field5916[1][var6][arg4 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class429.field5916[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var11 = (class429.field5916[1][arg1 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class429.field5916[1][arg1 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class429.field5916[1][arg3][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        return class52.field741[arg5].method1960(arg1, arg4, 125);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 206)
    private final void method3012(byte arg0) throws IOException {
        field7036++;
        this.field7056 = 0;
        if (this.field7057 != this.field7051) {
            this.field7058.method4050(5491, this.field7051);
            this.field7057 = this.field7051;
        }
        this.field7052 = this.field7051;
        if (arg0 != -35) {
            method3011(76, -102, -117, -2, 67, -100);
        }
        while (this.field7056 < this.field7063.length) {
            int var2 = this.field7063.length - this.field7056;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7058.method4046(this.field7063, this.field7056, arg0 + 34, var2);
            if (var3 == -1) {
                break;
            }
            this.field7056 += var3;
            this.field7057 += var3;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BI[BIIBIII)V", line = 254)
    public static final void method3013(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field7047++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg5 != -25) {
            return;
        }
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg0[var10001] += arg2[arg4++];
                int var14 = arg8++;
                arg0[var14] += arg2[arg4++];
                int var15 = arg8++;
                arg0[var15] += arg2[arg4++];
                int var16 = arg8++;
                arg0[var16] += arg2[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg0[var10001] += arg2[arg4++];
            }
            arg8 += arg3;
            arg4 += arg6;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V", line = 308)
    public static final void method3014(int arg0, int arg1) {
        class387.field5412 = -1;
        class137.field1830 = 100;
        class507.field7075 = arg1;
        class536.field7505 = 3;
        field7064++;
        if (arg0 != 21006) {
            method3011(-55, -108, -14, -19, 124, 111);
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(Z)V", line = 323)
    public static void method3015(boolean arg0) {
        field7038 = null;
        if (!arg0) {
            method3019(-123, 117, null, null);
        }
        field7062 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BB)V", line = 337)
    public final void method3016(byte[] arg0, byte arg1) throws IOException {
        if (arg1 == -31) {
            field7035++;
            this.method3017(arg0, (byte) 75, 0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BBII)V", line = 349)
    public final void method3017(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 75) {
            return;
        }
        field7043++;
        try {
            if ((arg2 + arg3) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field7060 != -1L && this.field7060 <= this.field7051 && (long) arg3 + this.field7051 <= (long) this.field7042 + this.field7060) {
                class34.method245(this.field7040, (int) (this.field7051 - this.field7060), arg0, arg2, arg3);
                this.field7051 += arg3;
                return;
            }
            long var5 = this.field7051;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field7051 >= this.field7052 && this.field7051 < ((long) this.field7056 + this.field7052)) {
                int var9 = (int) (this.field7052 + (long) this.field7056 - this.field7051);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class34.method245(this.field7063, (int) (this.field7051 - this.field7052), arg0, arg2, var9);
                arg3 -= var9;
                arg2 += var9;
                this.field7051 += var9;
            }
            if (arg3 > this.field7063.length) {
                this.field7058.method4050(5491, this.field7051);
                this.field7057 = this.field7051;
                while (arg3 > 0) {
                    int var11 = this.field7058.method4046(arg0, arg2, -1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field7057 += var11;
                    arg2 += var11;
                    arg3 -= var11;
                    this.field7051 += var11;
                }
            } else if (arg3 > 0) {
                this.method3012((byte) -35);
                int var10 = arg3;
                if (arg3 > this.field7056) {
                    var10 = this.field7056;
                }
                class34.method245(this.field7063, 0, arg0, arg2, var10);
                arg3 -= var10;
                arg2 += var10;
                this.field7051 += var10;
            }
            if (this.field7060 != -1L) {
                if (this.field7060 > this.field7051 && arg3 > 0) {
                    int var12 = (int) (this.field7060 - this.field7051) + arg2;
                    if (var12 > (arg2 + arg3)) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        arg3--;
                        this.field7051++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field7060 >= var5 && ((long) var8 + var5) > this.field7060) {
                    var13 = this.field7060;
                } else if (var5 >= this.field7060 && this.field7060 + ((long) this.field7042) > var5) {
                    var13 = var5;
                }
                if ((long) this.field7042 + this.field7060 > var5 && ((long) var8 + var5) >= ((long) this.field7042 + this.field7060)) {
                    var15 = this.field7060 + ((long) this.field7042);
                } else if (this.field7060 < (var5 + ((long) var8)) && ((long) this.field7042 + this.field7060) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class34.method245(this.field7040, (int) (var13 - this.field7060), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field7051 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field7051));
                        this.field7051 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7057 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II[BB)V", line = 540)
    public final void method3018(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field7039++;
        try {
            if (this.field7055 < (long) arg0 + this.field7051) {
                this.field7055 = (long) arg0 + this.field7051;
            }
            if (this.field7060 != -1L && (this.field7051 < this.field7060 || this.field7051 > ((long) this.field7042 + this.field7060))) {
                this.method3009(-1);
            }
            if (arg3 < -28) {
                if (this.field7060 != -1L && ((long) arg0 + this.field7051) > ((long) this.field7040.length + this.field7060)) {
                    int var5 = (int) ((long) this.field7040.length + this.field7060 - this.field7051);
                    class34.method245(arg2, arg1, this.field7040, (int) (this.field7051 - this.field7060), var5);
                    this.field7051 += var5;
                    arg0 -= var5;
                    arg1 += var5;
                    this.field7042 = this.field7040.length;
                    this.method3009(-1);
                }
                if (this.field7040.length < arg0) {
                    if (this.field7057 != this.field7051) {
                        this.field7058.method4050(5491, this.field7051);
                        this.field7057 = this.field7051;
                    }
                    this.field7058.method4042(arg2, arg0, -72, arg1);
                    this.field7057 += arg0;
                    if (this.field7057 > this.field7050) {
                        this.field7050 = this.field7057;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field7052 <= this.field7051 && this.field7051 < (long) this.field7056 + this.field7052) {
                        var6 = this.field7051;
                    } else if (this.field7052 >= this.field7051 && this.field7052 < this.field7051 + ((long) arg0)) {
                        var6 = this.field7052;
                    }
                    if ((this.field7051 + ((long) arg0)) > this.field7052 && (long) arg0 + this.field7051 <= this.field7052 - -((long) this.field7056)) {
                        var8 = (long) arg0 + this.field7051;
                    } else if (this.field7051 < ((long) this.field7056 + this.field7052) && ((long) this.field7056 + this.field7052) <= ((long) arg0 + this.field7051)) {
                        var8 = (long) this.field7056 + this.field7052;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class34.method245(arg2, (int) ((long) arg1 + var6 - this.field7051), this.field7063, (int) (var6 - this.field7052), var10);
                    }
                    this.field7051 += arg0;
                } else if (arg0 > 0) {
                    if (this.field7060 == -1L) {
                        this.field7060 = this.field7051;
                    }
                    class34.method245(arg2, arg1, this.field7040, (int) (this.field7051 - this.field7060), arg0);
                    this.field7051 += arg0;
                    if (((long) this.field7042) < (this.field7051 - this.field7060)) {
                        this.field7042 = (int) (this.field7051 - this.field7060);
                    }
                }
            }
        } catch (IOException var12) {
            this.field7057 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I", line = 668)
    public static final int method3019(int arg0, int arg1, String arg2, String arg3) {
        field7046++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = arg1;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class734.method4077(var22, 210);
            var9 = class734.method4077(var24, 210);
            char var26 = class515.method3070(arg0, (byte) 49, var22);
            char var27 = class515.method3070(arg0, (byte) -107, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class366.method2056((byte) -83, var28, arg0) - class366.method2056((byte) 112, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class366.method2056((byte) -104, var20, arg0) - class366.method2056((byte) 107, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class366.method2056((byte) -127, var14, arg0) - class366.method2056((byte) -104, var15, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZ)V", line = 822)
    public static final void method3020(int arg0, int arg1, boolean arg2) {
        field7061++;
        class344 var3 = class70.method444(arg1, arg2, Integer.MIN_VALUE);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < var3.field4392.length; var4++) {
            var3.field4392[var4] = -1;
            var3.field4391[var4] = 0;
        }
        int var5 = -34 % ((70 - arg0) / 33);
    }
}
