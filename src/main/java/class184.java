import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class184 {

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "J")
    private long field2932 = -1L;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "J")
    private long field2936 = -1L;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    private int field2939 = 0;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Leg;")
    private class37 field2927;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "J")
    private long field2946;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "J")
    private long field2937;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "J")
    private long field2942;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[B")
    private byte[] field2948;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "[B")
    private byte[] field2943;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    private int field2947;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "J")
    private long field2938;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[[S")
    public static short[][] field2950;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    private final void method1279(int arg0) throws IOException {
        if (arg0 != -30173) {
            this.field2939 = -49;
        }
        if (this.field2936 != -1L) {
            if (this.field2938 != this.field2936) {
                this.field2927.method199(0, this.field2936);
                this.field2938 = this.field2936;
            }
            this.field2927.method195(this.field2939, this.field2948, arg0 + 15211, 0);
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2932 < (long) this.field2939 + this.field2936 && ((long) this.field2947 + this.field2932) >= (this.field2936 + ((long) this.field2939))) {
                var2 = (long) this.field2939 + this.field2936;
            } else if (this.field2936 < (long) this.field2947 + this.field2932 && ((long) this.field2947 + this.field2932) <= ((long) this.field2939 + this.field2936)) {
                var2 = (long) this.field2947 + this.field2932;
            }
            if (this.field2936 >= this.field2932 && this.field2936 < ((long) this.field2947 + this.field2932)) {
                var4 = this.field2936;
            } else if (this.field2932 >= this.field2936 && ((long) this.field2939 + this.field2936) > this.field2932) {
                var4 = this.field2932;
            }
            this.field2938 += (long) this.field2939;
            if (this.field2946 < this.field2938) {
                this.field2946 = this.field2938;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class72.method403(this.field2948, (int) (var4 - this.field2936), this.field2943, (int) (var4 - this.field2932), var6);
            }
            this.field2939 = 0;
            this.field2936 = -1L;
        }
        field2941++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILjava/lang/String;Z)I")
    public static final int method1280(int arg0, int arg1, String arg2, boolean arg3) {
        field2934++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg2.length();
        int var7 = 0;
        if (arg0 >= -67) {
            method1287(99, -24, -80, -6, (class264) null, (class264) null, -39, -109, -4L);
        }
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg1 * var7 + var11;
            if (var10 / arg1 != var7) {
                throw new NumberFormatException();
            }
            var7 = var10;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JB)V")
    public final void method1281(long arg0, byte arg1) throws IOException {
        int var4 = -109 / ((-arg1 - 4) / 43);
        field2926++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1289(-1));
        }
        this.field2942 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BIII)V")
    public final void method1282(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2949++;
        try {
            if (this.field2937 < (this.field2942 + ((long) arg2))) {
                this.field2937 = (long) arg2 + this.field2942;
            }
            if (this.field2936 != -1L && (this.field2942 < this.field2936 || this.field2942 > (long) this.field2939 + this.field2936)) {
                this.method1279(-30173);
            }
            if (this.field2936 != -1L && (long) this.field2948.length + this.field2936 < (long) arg2 + this.field2942) {
                int var5 = (int) (this.field2936 + (long) this.field2948.length - this.field2942);
                class72.method403(arg0, arg1, this.field2948, (int) (this.field2942 - this.field2936), var5);
                arg2 -= var5;
                arg1 += var5;
                this.field2942 += (long) var5;
                this.field2939 = this.field2948.length;
                this.method1279(-30173);
            }
            if (arg3 == -5342) {
                if (arg2 > this.field2948.length) {
                    if (this.field2942 != this.field2938) {
                        this.field2927.method199(0, this.field2942);
                        this.field2938 = this.field2942;
                    }
                    this.field2927.method195(arg2, arg0, -14962, arg1);
                    long var6 = -1L;
                    if (this.field2932 < ((long) arg2 + this.field2942) && ((long) arg2 + this.field2942) <= ((long) this.field2947 + this.field2932)) {
                        var6 = (long) arg2 + this.field2942;
                    } else if (this.field2942 < ((long) this.field2947 + this.field2932) && (long) this.field2947 + this.field2932 <= (long) arg2 + this.field2942) {
                        var6 = (long) this.field2947 + this.field2932;
                    }
                    this.field2938 += (long) arg2;
                    long var8 = -1L;
                    if (this.field2946 < this.field2938) {
                        this.field2946 = this.field2938;
                    }
                    if (this.field2932 <= this.field2942 && this.field2932 + ((long) this.field2947) > this.field2942) {
                        var8 = this.field2942;
                    } else if (this.field2942 <= this.field2932 && (long) arg2 + this.field2942 > this.field2932) {
                        var8 = this.field2932;
                    }
                    if (var8 > -1L && var8 < var6) {
                        int var10 = (int) (var6 - var8);
                        class72.method403(arg0, (int) ((long) arg1 + var8 - this.field2942), this.field2943, (int) (var8 - this.field2932), var10);
                    }
                    this.field2942 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field2936 == -1L) {
                        this.field2936 = this.field2942;
                    }
                    class72.method403(arg0, arg1, this.field2948, (int) (this.field2942 - this.field2936), arg2);
                    this.field2942 += (long) arg2;
                    if ((long) this.field2939 < this.field2942 - this.field2936) {
                        this.field2939 = (int) (this.field2942 - this.field2936);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2938 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    private final void method1283(byte arg0) throws IOException {
        int var2 = -20 % ((arg0 + 86) / 37);
        this.field2947 = 0;
        if (this.field2942 != this.field2938) {
            this.field2927.method199(0, this.field2942);
            this.field2938 = this.field2942;
        }
        field2928++;
        this.field2932 = this.field2942;
        while (this.field2943.length > this.field2947) {
            int var3 = this.field2943.length - this.field2947;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field2927.method196(this.field2947, 0, var3, this.field2943);
            if (var4 == -1) {
                break;
            }
            this.field2947 += var4;
            this.field2938 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static final void method1284(byte arg0) {
        int var1 = -68 / ((arg0 - 69) / 39);
        class88.field1082.method1701((byte) 57);
        class234.field3867.method1701((byte) 56);
        field2924++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2940++;
        if (arg2 != -28062) {
            return;
        }
        int var6 = arg3 - arg0;
        int var7 = arg4 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class139.method965(arg0, arg4, arg5, arg1, false);
            }
        } else if (var7 == 0) {
            client.method737(arg1, arg0, (byte) -122, arg5, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class116.field1653) {
                var10 = class116.field1653;
                var11 = (class116.field1653 * var8 >> 12) + var9;
            } else if (arg0 > class114.field1634) {
                var10 = class114.field1634;
                var11 = (class114.field1634 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg0;
            }
            int var12;
            int var13;
            if (class116.field1653 > arg3) {
                var12 = var9 + (class116.field1653 * var8 >> 12);
                var13 = class116.field1653;
            } else if (class114.field1634 < arg3) {
                var13 = class114.field1634;
                var12 = (class114.field1634 * var8 >> 12) + var9;
            } else {
                var12 = arg4;
                var13 = arg3;
            }
            if (var12 < class117.field1656) {
                var13 = (class117.field1656 - var9 << 12) / var8;
                var12 = class117.field1656;
            } else if (class132.field2105 < var12) {
                var12 = class132.field2105;
                var13 = (class132.field2105 - var9 << 12) / var8;
            }
            if (var11 < class117.field1656) {
                var10 = (class117.field1656 - var9 << 12) / var8;
                var11 = class117.field1656;
            } else if (class132.field2105 < var11) {
                var10 = (class132.field2105 - var9 << 12) / var8;
                var11 = class132.field2105;
            }
            class230.method1633(var12, var11, var13, var10, true, arg5);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V")
    public final void method1286(byte[] arg0, int arg1) throws IOException {
        field2931++;
        if (arg1 != -11614) {
            this.field2936 = -40L;
        }
        this.method1290(0, (byte) -124, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILpb;Lpb;IIJ)V")
    public static final void method1287(int arg0, int arg1, int arg2, int arg3, class264 arg4, class264 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class187 var10 = new class187();
        var10.field2977 = arg8;
        var10.field2988 = arg1 * 128 + 64;
        var10.field2986 = arg2 * 128 + 64;
        var10.field2982 = arg3;
        var10.field2983 = arg4;
        var10.field2990 = arg5;
        var10.field2981 = arg6;
        var10.field2987 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class46.field585[var11][arg1][arg2] == null) {
                class46.field585[var11][arg1][arg2] = new class246(var11, arg1, arg2);
            }
        }
        class46.field585[arg0][arg1][arg2].field4046 = var10;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static void method1288(boolean arg0) {
        field2950 = null;
        if (!arg0) {
            method1284((byte) 5);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1289(int arg0) {
        if (arg0 == -1) {
            field2945++;
            return this.field2927.method194((byte) 73);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBI[B)V")
    public final void method1290(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2930++;
        try {
            if (arg0 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field2936 != -1L && this.field2936 <= this.field2942 && ((long) this.field2939 + this.field2936) >= ((long) arg2 + this.field2942)) {
                class72.method403(this.field2948, (int) (this.field2942 - this.field2936), arg3, arg0, arg2);
                this.field2942 += (long) arg2;
                return;
            }
            long var5 = this.field2942;
            int var7 = 54 / ((2 - arg1) / 58);
            int var8 = arg0;
            int var9 = arg2;
            if (this.field2932 <= this.field2942 && this.field2942 < ((long) this.field2947 + this.field2932)) {
                int var10 = (int) ((long) this.field2947 + this.field2932 - this.field2942);
                if (arg2 < var10) {
                    var10 = arg2;
                }
                class72.method403(this.field2943, (int) (this.field2942 - this.field2932), arg3, arg0, var10);
                this.field2942 += (long) var10;
                arg2 -= var10;
                arg0 += var10;
            }
            if (this.field2943.length < arg2) {
                this.field2927.method199(0, this.field2942);
                this.field2938 = this.field2942;
                while (arg2 > 0) {
                    int var12 = this.field2927.method196(arg0, 0, arg2, arg3);
                    if (var12 == -1) {
                        break;
                    }
                    arg0 += var12;
                    this.field2938 += (long) var12;
                    this.field2942 += (long) var12;
                    arg2 -= var12;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method1283((byte) -127);
                if (arg2 > this.field2947) {
                    var11 = this.field2947;
                }
                class72.method403(this.field2943, 0, arg3, arg0, var11);
                arg2 -= var11;
                this.field2942 += (long) var11;
                arg0 += var11;
            }
            if (this.field2936 != -1L) {
                if (this.field2942 < this.field2936 && arg2 > 0) {
                    int var13 = arg0 + ((int) (this.field2936 - this.field2942));
                    if (arg0 + arg2 < var13) {
                        var13 = arg0 + arg2;
                    }
                    while (arg0 < var13) {
                        arg3[arg0++] = 0;
                        arg2--;
                        this.field2942++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (((long) this.field2939 + this.field2936) > var5 && (long) var9 + var5 >= (long) this.field2939 + this.field2936) {
                    var16 = (long) this.field2939 + this.field2936;
                } else if ((var5 + ((long) var9)) > this.field2936 && (long) var9 + var5 <= (long) this.field2939 + this.field2936) {
                    var16 = var5 + ((long) var9);
                }
                if (var5 <= this.field2936 && this.field2936 < ((long) var9 + var5)) {
                    var14 = this.field2936;
                } else if (var5 >= this.field2936 && var5 < ((long) this.field2939 + this.field2936)) {
                    var14 = var5;
                }
                if (var14 > -1L && var16 > var14) {
                    int var18 = (int) (var16 - var14);
                    class72.method403(this.field2948, (int) (var14 - this.field2936), arg3, (int) (var14 - var5) + var8, var18);
                    if (this.field2942 < var16) {
                        arg2 = (int) ((long) arg2 - (var16 - this.field2942));
                        this.field2942 = var16;
                    }
                }
            }
        } catch (IOException var20) {
            this.field2938 = -1L;
            throw var20;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
    public static final void method1291(byte arg0) {
        field2929++;
        for (class220 var1 = (class220) class24.field339.method1802(43); var1 != null; var1 = (class220) class24.field339.method1815(0)) {
            if (var1.field3520 == -1) {
                var1.field3516 = 0;
                class36.method191(var1, (byte) 73);
            } else {
                var1.method1673(arg0 ^ 0x38F6);
            }
        }
        if (arg0 != 88) {
            field2950 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IBII)V")
    public static final void method1292(int arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class163.field2595++;
            class4.field57.method1932(false, 110);
            class4.field57.method580((byte) 60, 5);
        }
        if (arg2 == 1) {
            class162.field2585++;
            class4.field57.method1932(false, 40);
            class4.field57.method580((byte) 77, 19);
        }
        int var4 = 18 / ((arg1 + 79) / 46);
        class4.field57.method568(arg0 + class167.field2683, (byte) 103);
        class4.field57.method536(class36.field467[82] ? 1 : 0, (byte) -128);
        field2925++;
        class4.field57.method572(true, class181.field2883 + arg3);
        class91.field1135 = arg3;
        class233.field3856 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)J")
    public final long method1293(int arg0) {
        if (arg0 >= -55) {
            return 1L;
        } else {
            field2933++;
            return this.field2937;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Leg;II)V")
    public class184(class37 arg0, int arg1, int arg2) throws IOException {
        this.field2927 = arg0;
        this.field2937 = this.field2946 = arg0.method198((byte) -53);
        this.field2942 = 0L;
        this.field2948 = new byte[arg2];
        this.field2943 = new byte[arg1];
    }
}
