import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BJPWOXRJ")
public class class3 extends class20 {

    @OriginalMember(owner = "BJPWOXRJ", name = "i", descriptor = "B")
    private byte field9 = -92;

    @OriginalMember(owner = "BJPWOXRJ", name = "j", descriptor = "I")
    private int field10 = 3;

    @OriginalMember(owner = "BJPWOXRJ", name = "k", descriptor = "I")
    private int field11 = -270;

    @OriginalMember(owner = "BJPWOXRJ", name = "l", descriptor = "I")
    private int field12 = 111;

    @OriginalMember(owner = "BJPWOXRJ", name = "m", descriptor = "B")
    private byte field13 = 107;

    @OriginalMember(owner = "BJPWOXRJ", name = "n", descriptor = "I")
    private int field14 = 5;

    @OriginalMember(owner = "BJPWOXRJ", name = "p", descriptor = "Z")
    private boolean field16 = false;

    @OriginalMember(owner = "BJPWOXRJ", name = "q", descriptor = "Z")
    private boolean field17 = false;

    @OriginalMember(owner = "BJPWOXRJ", name = "r", descriptor = "Z")
    private boolean field18 = false;

    @OriginalMember(owner = "BJPWOXRJ", name = "s", descriptor = "[B")
    public byte[] field19;

    @OriginalMember(owner = "BJPWOXRJ", name = "t", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "BJPWOXRJ", name = "o", descriptor = "I")
    private static int field15 = 3;

    @OriginalMember(owner = "BJPWOXRJ", name = "v", descriptor = "[I")
    private static int[] field22 = new int[256];

    @OriginalMember(owner = "BJPWOXRJ", name = "w", descriptor = "[I")
    private static final int[] field23;

    @OriginalMember(owner = "BJPWOXRJ", name = "B", descriptor = "LRGZIHLRP;")
    private static class50 field28;

    @OriginalMember(owner = "BJPWOXRJ", name = "C", descriptor = "LRGZIHLRP;")
    private static class50 field29;

    @OriginalMember(owner = "BJPWOXRJ", name = "D", descriptor = "LRGZIHLRP;")
    private static class50 field30;

    @OriginalMember(owner = "BJPWOXRJ", name = "E", descriptor = "[C")
    private static char[] field31;

    @OriginalMember(owner = "BJPWOXRJ", name = "u", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "BJPWOXRJ", name = "y", descriptor = "I")
    private static int field25;

    @OriginalMember(owner = "BJPWOXRJ", name = "z", descriptor = "I")
    private static int field26;

    @OriginalMember(owner = "BJPWOXRJ", name = "A", descriptor = "I")
    private static int field27;

    @OriginalMember(owner = "BJPWOXRJ", name = "F", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "BJPWOXRJ", name = "h", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "BJPWOXRJ", name = "x", descriptor = "LFMTLAPCJ;")
    public class11 field24;

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(IB)LBJPWOXRJ;")
    public static class3 method3(int arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var2 = false;
        } else {
            field15 = -216;
        }
        class50 var3 = field29;
        synchronized (field29) {
            class3 var4 = null;
            if (arg0 == 0 && field25 > 0) {
                field25--;
                var4 = (class3) field28.method470();
            } else if (arg0 == 1 && field26 > 0) {
                field26--;
                var4 = (class3) field29.method470();
            } else if (arg0 == 2 && field27 > 0) {
                field27--;
                var4 = (class3) field30.method470();
            }
            if (var4 != null) {
                var4.field20 = 0;
                return var4;
            }
        }
        class3 var6 = new class3(false);
        var6.field20 = 0;
        if (arg0 == 0) {
            var6.field19 = new byte[100];
        } else if (arg0 == 1) {
            var6.field19 = new byte[5000];
        } else {
            var6.field19 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "<init>", descriptor = "(Z)V")
    private class3(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "<init>", descriptor = "(Z[B)V")
    public class3(boolean arg0, byte[] arg1) {
        if (arg0) {
            field15 = -107;
        }
        this.field19 = arg1;
        this.field20 = 0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(II)V")
    public void method4(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field14 = 264;
        }
        this.field19[this.field20++] = (byte) (arg0 + this.field24.method203());
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(I)V")
    public void method5(int arg0) {
        this.field19[this.field20++] = (byte) arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "b", descriptor = "(I)V")
    public void method6(int arg0) {
        this.field19[this.field20++] = (byte) (arg0 >> 8);
        this.field19[this.field20++] = (byte) arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "b", descriptor = "(II)V")
    public void method7(int arg0, int arg1) {
        this.field19[this.field20++] = (byte) arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field19[this.field20++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "c", descriptor = "(I)V")
    public void method8(int arg0) {
        this.field19[this.field20++] = (byte) (arg0 >> 16);
        this.field19[this.field20++] = (byte) (arg0 >> 8);
        this.field19[this.field20++] = (byte) arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "d", descriptor = "(I)V")
    public void method9(int arg0) {
        this.field19[this.field20++] = (byte) (arg0 >> 24);
        this.field19[this.field20++] = (byte) (arg0 >> 16);
        this.field19[this.field20++] = (byte) (arg0 >> 8);
        this.field19[this.field20++] = (byte) arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "c", descriptor = "(II)V")
    public void method10(int arg0, int arg1) {
        this.field19[this.field20++] = (byte) arg1;
        this.field19[this.field20++] = (byte) (arg1 >> 8);
        this.field19[this.field20++] = (byte) (arg1 >> 16);
        this.field19[this.field20++] = (byte) (arg1 >> 24);
        int var3 = 55 / arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(JI)V")
    public void method11(long arg0, int arg1) {
        this.field19[this.field20++] = (byte) (arg0 >> 56);
        this.field19[this.field20++] = (byte) (arg0 >> 48);
        this.field19[this.field20++] = (byte) (arg0 >> 40);
        if (arg1 != 5) {
            this.field17 = !this.field17;
        }
        this.field19[this.field20++] = (byte) (arg0 >> 32);
        this.field19[this.field20++] = (byte) (arg0 >> 24);
        this.field19[this.field20++] = (byte) (arg0 >> 16);
        this.field19[this.field20++] = (byte) (arg0 >> 8);
        this.field19[this.field20++] = (byte) arg0;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method12(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field19, this.field20);
        this.field20 += arg0.length();
        this.field19[this.field20++] = 10;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(I[BII)V")
    public void method13(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 == -44665) {
            for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
                this.field19[this.field20++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(ZI)V")
    public void method14(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field19[this.field20 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "c", descriptor = "()I")
    public int method15() {
        return this.field19[this.field20++] & 0xFF;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "d", descriptor = "()B")
    public byte method16() {
        return this.field19[this.field20++];
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "e", descriptor = "()I")
    public int method17() {
        this.field20 += 2;
        return ((this.field19[this.field20 - 2] & 0xFF) << 8) + (this.field19[this.field20 - 1] & 0xFF);
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "f", descriptor = "()I")
    public int method18() {
        this.field20 += 2;
        int var1 = ((this.field19[this.field20 - 2] & 0xFF) << 8) + (this.field19[this.field20 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "g", descriptor = "()I")
    public int method19() {
        this.field20 += 3;
        return (this.field19[this.field20 - 1] & 0xFF) + ((this.field19[this.field20 - 3] & 0xFF) << 16) + ((this.field19[this.field20 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "h", descriptor = "()I")
    public int method20() {
        this.field20 += 4;
        return (this.field19[this.field20 - 1] & 0xFF) + ((this.field19[this.field20 - 2] & 0xFF) << 8) + ((this.field19[this.field20 - 4] & 0xFF) << 24) + ((this.field19[this.field20 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(B)J")
    public long method21(byte arg0) {
        long var2 = (long) this.method20() & 0xFFFFFFFFL;
        long var4 = (long) this.method20() & 0xFFFFFFFFL;
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "i", descriptor = "()Ljava/lang/String;")
    public String method22() {
        int var1 = this.field20;
        while (this.field19[this.field20++] != 10) {
        }
        return new String(this.field19, var1, this.field20 - var1 - 1);
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "e", descriptor = "(I)[B")
    public byte[] method23(int arg0) {
        int var2 = this.field20;
        while (this.field19[this.field20++] != 10) {
        }
        byte[] var3 = new byte[this.field20 - var2 - 1];
        int var4 = 0 / arg0;
        for (int var5 = var2; var5 < this.field20 - 1; var5++) {
            var3[var5 - var2] = this.field19[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "b", descriptor = "(I[BII)V")
    public void method24(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 < 3 || arg2 > 3) {
            this.field8 = 245;
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field19[this.field20++];
        }
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "b", descriptor = "(B)V")
    public void method25(byte arg0) {
        if (arg0 != -82) {
            this.field11 = 465;
        }
        this.field21 = this.field20 * 8;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "b", descriptor = "(ZI)I")
    public int method26(boolean arg0, int arg1) {
        if (arg0) {
            field15 = -188;
        }
        int var3 = this.field21 >> 3;
        int var4 = 8 - (this.field21 & 0x7);
        int var5 = 0;
        this.field21 += arg1;
        while (arg1 > var4) {
            var5 += (this.field19[var3++] & field23[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field19[var3] & field23[var4]) + var5;
        } else {
            var6 = (this.field19[var3] >> var4 - arg1 & field23[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "f", descriptor = "(I)V")
    public void method27(int arg0) {
        this.field20 = (this.field21 + 7) / 8;
        if (arg0 != 0) {
            this.field16 = !this.field16;
        }
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "j", descriptor = "()I")
    public int method28() {
        int var1 = this.field19[this.field20] & 0xFF;
        return var1 < 128 ? this.method15() - 64 : this.method17() - 49152;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "k", descriptor = "()I")
    public int method29() {
        int var1 = this.field19[this.field20] & 0xFF;
        return var1 < 128 ? this.method15() : this.method17() - 32768;
    }

    @OriginalMember(owner = "BJPWOXRJ", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method30(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field20;
        this.field20 = 0;
        byte[] var5 = new byte[var4];
        if (arg0 != 7) {
            this.field17 = !this.field17;
        }
        this.method24(0, var5, 3, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field20 = 0;
        this.method5(var8.length);
        this.method13(var8.length, var8, -44665, 0);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field22[var0] = var1;
        }
        field23 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field28 = new class50(field15);
        field29 = new class50(field15);
        field30 = new class50(field15);
        field31 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
