import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class539 {

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public int field7925 = 0;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "Z")
    private boolean field7930 = false;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public int field7935 = 0;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "[J")
    public static long[] field7928 = new long[256];

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Z")
    public static boolean field7936;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    public int field7920;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public int field7921;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public int field7923;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public int field7924;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public int field7926;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public int field7933;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public int field7934;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    private int field7938;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public int field7940;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "J")
    public long field7927;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "[I")
    public static int[] field7939;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "[[S")
    public static short[][] field7922;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field7928[var0] = var1;
        }
        field7936 = true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIJIILtf;Li;II)V", line = 4)
    public static final void method3171(int arg0, int arg1, long arg2, int arg3, int arg4, class198 arg5, class31 arg6, int arg7, int arg8) {
        field7918++;
        int var10 = arg3 * arg3 + arg8 * arg8;
        if (((long) var10) > arg2) {
            return;
        }
        int var11 = Math.min(arg5.field3008 / 2, arg5.field2988 / arg4);
        if (var11 * var11 >= var10) {
            class75.method584(arg6, arg3, (byte) -44, arg0, arg8, arg7, arg5, class468.field6798[arg1]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class294.field4381 == 4) {
            var12 = (int) class508.field7354 & 0x3FFF;
        } else {
            var12 = (int) class508.field7354 + class78.field1280 & 0x3FFF;
        }
        int var13 = class358.field5204[var12];
        int var14 = class358.field5203[var12];
        if (class294.field4381 != 4) {
            var13 = var13 * 256 / (class384.field5495 + 256);
            var14 = var14 * 256 / (class384.field5495 + 256);
        }
        int var15 = arg8 * var13 + (arg3 * var14) >> 15;
        int var16 = arg8 * var14 - (arg3 * var13) >> 15;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class503.field7264[arg1].method2174((float) arg5.field3008 / 2.0F + (float) arg0 + (float) var19, (float) arg5.field2988 / 2.0F + (float) arg7 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILwn;)V", line = 55)
    private final void method3172(int arg0, int arg1, class519 arg2) {
        if (arg0 == 1) {
            this.field7938 = arg2.method3018(566990904);
        } else if (arg0 == 2) {
            arg2.method3072((byte) -127);
        } else if (arg0 == 3) {
            this.field7923 = arg2.method3053(arg1 + 5483);
            this.field7924 = arg2.method3053(-129);
            this.field7934 = arg2.method3053(-129);
        } else if (arg0 == 4) {
            this.field7920 = arg2.method3072((byte) -127);
            this.field7933 = arg2.method3053(-129);
        } else if (arg0 == 6) {
            this.field7921 = arg2.method3072((byte) -125);
        } else if (arg0 == 8) {
            this.field7925 = 1;
        } else if (arg0 == 9) {
            this.field7935 = 1;
        } else if (arg0 == 10) {
            this.field7930 = true;
        }
        field7931++;
        if (arg1 != -5612) {
            this.method3172(-127, -49, null);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Ltf;", line = 110)
    public static final class198 method3173(int arg0, int arg1, int arg2) {
        field7929++;
        class198 var3 = class154.method1087(arg0, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3013 == null || arg2 >= var3.field3013.length) {
            return null;
        } else {
            return var3.field3013[arg2];
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLwn;)V", line = 135)
    public final void method3174(byte arg0, class519 arg1) {
        while (true) {
            int var3 = arg1.method3072((byte) -127);
            if (var3 == 0) {
                if (arg0 != 51) {
                    field7928 = null;
                }
                field7932++;
                return;
            }
            this.method3172(var3, -5612, arg1);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V", line = 166)
    public static void method3175(int arg0) {
        field7939 = null;
        field7928 = null;
        field7922 = null;
        if (arg0 > -79) {
            method3171(69, 50, 25L, 55, -13, null, null, -70, 90);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V", line = 217)
    public final void method3176(boolean arg0) {
        this.field7926 = class358.field5203[this.field7938 << 3];
        field7937++;
        this.field7919 = (int) Math.sqrt((double) (this.field7934 * this.field7934 + this.field7924 * this.field7924 + this.field7923 * this.field7923));
        if (this.field7933 == 0) {
            this.field7933 = 1;
        }
        if (this.field7920 == 0) {
            this.field7927 = 2147483647L;
        } else if (this.field7920 == 1) {
            this.field7927 = (this.field7919 * 8 / this.field7933);
            this.field7927 *= this.field7927;
        } else if (this.field7920 == 2) {
            this.field7927 = (this.field7919 * 8 / this.field7933);
        }
        if (this.field7930) {
            this.field7919 *= -1;
        }
        if (arg0) {
            this.method3172(-110, 45, null);
        }
    }
}
