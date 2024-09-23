import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EILHLJCE")
public class class17 extends class8 {

    @OriginalMember(owner = "EILHLJCE", name = "h", descriptor = "Z")
    private boolean field762 = false;

    @OriginalMember(owner = "EILHLJCE", name = "i", descriptor = "Z")
    private boolean field763 = true;

    @OriginalMember(owner = "EILHLJCE", name = "j", descriptor = "B")
    private byte field764 = 5;

    @OriginalMember(owner = "EILHLJCE", name = "l", descriptor = "B")
    private byte field766 = 0;

    @OriginalMember(owner = "EILHLJCE", name = "m", descriptor = "I")
    private int field767 = 394;

    @OriginalMember(owner = "EILHLJCE", name = "n", descriptor = "B")
    private byte field768 = 6;

    @OriginalMember(owner = "EILHLJCE", name = "o", descriptor = "I")
    private int field769 = -36736;

    @OriginalMember(owner = "EILHLJCE", name = "p", descriptor = "I")
    private int field770 = 9;

    @OriginalMember(owner = "EILHLJCE", name = "q", descriptor = "I")
    private int field771 = -118;

    @OriginalMember(owner = "EILHLJCE", name = "r", descriptor = "I")
    private int field772 = 20;

    @OriginalMember(owner = "EILHLJCE", name = "s", descriptor = "Z")
    private boolean field773 = false;

    @OriginalMember(owner = "EILHLJCE", name = "t", descriptor = "I")
    private int field774 = 9;

    @OriginalMember(owner = "EILHLJCE", name = "u", descriptor = "Z")
    private boolean field775 = false;

    @OriginalMember(owner = "EILHLJCE", name = "v", descriptor = "I")
    private int field776 = 4;

    @OriginalMember(owner = "EILHLJCE", name = "w", descriptor = "I")
    private int field777 = 534;

    @OriginalMember(owner = "EILHLJCE", name = "x", descriptor = "[B")
    public byte[] field778;

    @OriginalMember(owner = "EILHLJCE", name = "y", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "EILHLJCE", name = "A", descriptor = "[I")
    private static int[] field781 = new int[256];

    @OriginalMember(owner = "EILHLJCE", name = "B", descriptor = "[I")
    private static final int[] field782;

    @OriginalMember(owner = "EILHLJCE", name = "G", descriptor = "LFLJWGVEY;")
    private static class20 field787;

    @OriginalMember(owner = "EILHLJCE", name = "H", descriptor = "LFLJWGVEY;")
    private static class20 field788;

    @OriginalMember(owner = "EILHLJCE", name = "I", descriptor = "LFLJWGVEY;")
    private static class20 field789;

    @OriginalMember(owner = "EILHLJCE", name = "J", descriptor = "[C")
    private static char[] field790;

    @OriginalMember(owner = "EILHLJCE", name = "k", descriptor = "I")
    private int field765;

    @OriginalMember(owner = "EILHLJCE", name = "z", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "EILHLJCE", name = "D", descriptor = "I")
    private static int field784;

    @OriginalMember(owner = "EILHLJCE", name = "E", descriptor = "I")
    private static int field785;

    @OriginalMember(owner = "EILHLJCE", name = "F", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "EILHLJCE", name = "C", descriptor = "LYPXEHIVX;")
    public class70 field783;

    @OriginalMember(owner = "EILHLJCE", name = "K", descriptor = "Z")
    public static boolean field791;

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(IB)LEILHLJCE;")
    public static class17 method212(int arg0, byte arg1) {
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        class20 var2 = field788;
        synchronized (field788) {
            class17 var3 = null;
            if (arg0 == 0 && field784 > 0) {
                field784--;
                var3 = (class17) field787.method274();
            } else if (arg0 == 1 && field785 > 0) {
                field785--;
                var3 = (class17) field788.method274();
            } else if (arg0 == 2 && field786 > 0) {
                field786--;
                var3 = (class17) field789.method274();
            }
            if (var3 != null) {
                var3.field779 = 0;
                return var3;
            }
        }
        class17 var5 = new class17(0);
        var5.field779 = 0;
        if (arg0 == 0) {
            var5.field778 = new byte[100];
        } else if (arg0 == 1) {
            var5.field778 = new byte[5000];
        } else {
            var5.field778 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "EILHLJCE", name = "<init>", descriptor = "(I)V")
    private class17(int arg0) {
        if (arg0 != 0) {
            this.field773 = !this.field773;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "<init>", descriptor = "([BI)V")
    public class17(byte[] arg0, int arg1) {
        if (arg1 != -26583) {
            throw new NullPointerException();
        }
        this.field778 = arg0;
        this.field779 = 0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(II)V")
    public void method213(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) (arg1 + this.field783.method580());
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(I)V")
    public void method214(int arg0) {
        this.field778[this.field779++] = (byte) arg0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "(I)V")
    public void method215(int arg0) {
        this.field778[this.field779++] = (byte) (arg0 >> 8);
        this.field778[this.field779++] = (byte) arg0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "(IB)V")
    public void method216(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.field776 = 122;
        }
        this.field778[this.field779++] = (byte) arg0;
        this.field778[this.field779++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "(I)V")
    public void method217(int arg0) {
        this.field778[this.field779++] = (byte) (arg0 >> 16);
        this.field778[this.field779++] = (byte) (arg0 >> 8);
        this.field778[this.field779++] = (byte) arg0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "(I)V")
    public void method218(int arg0) {
        this.field778[this.field779++] = (byte) (arg0 >> 24);
        this.field778[this.field779++] = (byte) (arg0 >> 16);
        this.field778[this.field779++] = (byte) (arg0 >> 8);
        this.field778[this.field779++] = (byte) arg0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "(II)V")
    public void method219(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) arg0;
        this.field778[this.field779++] = (byte) (arg0 >> 8);
        this.field778[this.field779++] = (byte) (arg0 >> 16);
        if (arg1 <= 0) {
            this.field773 = !this.field773;
        }
        this.field778[this.field779++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(JZ)V")
    public void method220(long arg0, boolean arg1) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field778[this.field779++] = (byte) (arg0 >> 56);
        this.field778[this.field779++] = (byte) (arg0 >> 48);
        this.field778[this.field779++] = (byte) (arg0 >> 40);
        this.field778[this.field779++] = (byte) (arg0 >> 32);
        this.field778[this.field779++] = (byte) (arg0 >> 24);
        this.field778[this.field779++] = (byte) (arg0 >> 16);
        this.field778[this.field779++] = (byte) (arg0 >> 8);
        this.field778[this.field779++] = (byte) arg0;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method221(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field778, this.field779);
        this.field779 += arg0.length();
        this.field778[this.field779++] = 10;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(I[BIB)V")
    public void method222(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != 44) {
            this.field773 = !this.field773;
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            this.field778[this.field779++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "(IB)V")
    public void method223(int arg0, byte arg1) {
        this.field778[this.field779 - arg0 - 1] = (byte) arg0;
        if (arg1 != 1) {
            this.field773 = !this.field773;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "()I")
    public int method224() {
        return this.field778[this.field779++] & 0xFF;
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "()B")
    public byte method225() {
        return this.field778[this.field779++];
    }

    @OriginalMember(owner = "EILHLJCE", name = "e", descriptor = "()I")
    public int method226() {
        this.field779 += 2;
        return ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
    }

    @OriginalMember(owner = "EILHLJCE", name = "f", descriptor = "()I")
    public int method227() {
        this.field779 += 2;
        int var1 = ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "EILHLJCE", name = "g", descriptor = "()I")
    public int method228() {
        this.field779 += 3;
        return (this.field778[this.field779 - 1] & 0xFF) + ((this.field778[this.field779 - 3] & 0xFF) << 16) + ((this.field778[this.field779 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "EILHLJCE", name = "h", descriptor = "()I")
    public int method229() {
        this.field779 += 4;
        return (this.field778[this.field779 - 1] & 0xFF) + ((this.field778[this.field779 - 2] & 0xFF) << 8) + ((this.field778[this.field779 - 4] & 0xFF) << 24) + ((this.field778[this.field779 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(Z)J")
    public long method230(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method229() & 0xFFFFFFFFL;
        long var4 = (long) this.method229() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "EILHLJCE", name = "i", descriptor = "()Ljava/lang/String;")
    public String method231() {
        int var1 = this.field779;
        while (this.field778[this.field779++] != 10) {
        }
        return new String(this.field778, var1, this.field779 - var1 - 1);
    }

    @OriginalMember(owner = "EILHLJCE", name = "e", descriptor = "(I)[B")
    public byte[] method232(int arg0) {
        if (arg0 != -40217) {
            throw new NullPointerException();
        }
        int var2 = this.field779;
        while (this.field778[this.field779++] != 10) {
        }
        byte[] var3 = new byte[this.field779 - var2 - 1];
        for (int var4 = var2; var4 < this.field779 - 1; var4++) {
            var3[var4 - var2] = this.field778[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "([BIII)V")
    public void method233(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 8 && arg1 <= 8) {
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                arg0[var5] = this.field778[this.field779++];
            }
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "(Z)V")
    public void method234(boolean arg0) {
        this.field780 = this.field779 * 8;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "(II)I")
    public int method235(int arg0, int arg1) {
        int var3 = this.field780 >> 3;
        int var4 = 8 - (this.field780 & 0x7);
        int var5 = 0;
        this.field780 += arg0;
        if (arg1 != 24335) {
            return 1;
        }
        while (arg0 > var4) {
            var5 += (this.field778[var3++] & field782[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field778[var3] & field782[var4]) + var5;
        } else {
            var6 = (this.field778[var3] >> var4 - arg0 & field782[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "(Z)V")
    public void method236(boolean arg0) {
        this.field779 = (this.field780 + 7) / 8;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "j", descriptor = "()I")
    public int method237() {
        int var1 = this.field778[this.field779] & 0xFF;
        return var1 < 128 ? this.method224() - 64 : this.method226() - 49152;
    }

    @OriginalMember(owner = "EILHLJCE", name = "k", descriptor = "()I")
    public int method238() {
        int var1 = this.field778[this.field779] & 0xFF;
        return var1 < 128 ? this.method224() : this.method226() - 32768;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method239(boolean arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field779;
        this.field779 = 0;
        if (!arg0) {
            this.field774 = 110;
        }
        byte[] var5 = new byte[var4];
        this.method233(var5, 8, var4, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field779 = 0;
        this.method214(var8.length);
        this.method222(var8.length, var8, 0, (byte) 44);
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "(II)V")
    public void method240(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) (arg1 + 128);
        if (arg0 != -8063) {
            this.field762 = !this.field762;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "e", descriptor = "(II)V")
    public void method241(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) -arg1;
        if (arg0 != 0) {
            this.field762 = !this.field762;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(ZI)V")
    public void method242(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field778[this.field779++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "(Z)I")
    public int method243(boolean arg0) {
        if (!arg0) {
            this.field774 = -227;
        }
        return this.field778[this.field779++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "EILHLJCE", name = "f", descriptor = "(I)I")
    public int method244(int arg0) {
        if (arg0 != 6335) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field778[this.field779++] & 0xFF;
    }

    @OriginalMember(owner = "EILHLJCE", name = "g", descriptor = "(I)I")
    public int method245(int arg0) {
        return arg0 >= 2 && arg0 <= 2 ? 128 - this.field778[this.field779++] & 0xFF : 1;
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(B)B")
    public byte method246(byte arg0) {
        if (arg0 != -55) {
            this.field774 = 202;
        }
        return (byte) (this.field778[this.field779++] - 128);
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "(B)B")
    public byte method247(byte arg0) {
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field778[this.field779++];
    }

    @OriginalMember(owner = "EILHLJCE", name = "h", descriptor = "(I)B")
    public byte method248(int arg0) {
        if (arg0 != 30392) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field778[this.field779++]);
    }

    @OriginalMember(owner = "EILHLJCE", name = "f", descriptor = "(II)V")
    public void method249(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) arg1;
        this.field778[this.field779++] = (byte) (arg1 >> 8);
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "(IB)V")
    public void method250(int arg0, byte arg1) {
        if (this.field766 == arg1) {
            this.field778[this.field779++] = (byte) (arg0 >> 8);
            this.field778[this.field779++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "g", descriptor = "(II)V")
    public void method251(int arg0, int arg1) {
        this.field778[this.field779++] = (byte) (arg1 + 128);
        if (arg0 >= 0) {
            this.field775 = !this.field775;
        }
        this.field778[this.field779++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "EILHLJCE", name = "i", descriptor = "(I)I")
    public int method252(int arg0) {
        if (arg0 == 0) {
            this.field779 += 2;
            return ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] & 0xFF);
        } else {
            return this.field765;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "j", descriptor = "(I)I")
    public int method253(int arg0) {
        this.field779 += 2;
        return arg0 <= 0 ? 1 : ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "EILHLJCE", name = "k", descriptor = "(I)I")
    public int method254(int arg0) {
        if (arg0 != 0) {
            this.field776 = 93;
        }
        this.field779 += 2;
        return ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "EILHLJCE", name = "l", descriptor = "(I)I")
    public int method255(int arg0) {
        this.field779 += 2;
        int var2 = ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] & 0xFF);
        if (arg0 != 47979) {
            this.field762 = !this.field762;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "EILHLJCE", name = "c", descriptor = "(B)I")
    public int method256(byte arg0) {
        this.field779 += 2;
        int var2 = ((this.field778[this.field779 - 2] & 0xFF) << 8) + (this.field778[this.field779 - 1] - 128 & 0xFF);
        if (this.field768 == arg0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "e", descriptor = "(Z)I")
    public int method257(boolean arg0) {
        this.field779 += 2;
        int var2 = ((this.field778[this.field779 - 1] & 0xFF) << 8) + (this.field778[this.field779 - 2] - 128 & 0xFF);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "EILHLJCE", name = "f", descriptor = "(Z)I")
    public int method258(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field779 += 3;
        return (this.field778[this.field779 - 1] & 0xFF) + ((this.field778[this.field779 - 2] & 0xFF) << 16) + ((this.field778[this.field779 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "EILHLJCE", name = "m", descriptor = "(I)I")
    public int method259(int arg0) {
        if (arg0 < 0) {
            this.field779 += 4;
            return (this.field778[this.field779 - 4] & 0xFF) + ((this.field778[this.field779 - 3] & 0xFF) << 8) + ((this.field778[this.field779 - 1] & 0xFF) << 24) + ((this.field778[this.field779 - 2] & 0xFF) << 16);
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "d", descriptor = "(B)I")
    public int method260(byte arg0) {
        this.field779 += 4;
        return arg0 == 54 ? (this.field778[this.field779 - 3] & 0xFF) + ((this.field778[this.field779 - 4] & 0xFF) << 8) + ((this.field778[this.field779 - 2] & 0xFF) << 24) + ((this.field778[this.field779 - 1] & 0xFF) << 16) : this.field767;
    }

    @OriginalMember(owner = "EILHLJCE", name = "n", descriptor = "(I)I")
    public int method261(int arg0) {
        if (arg0 >= 0) {
            this.field762 = !this.field762;
        }
        this.field779 += 4;
        return (this.field778[this.field779 - 2] & 0xFF) + ((this.field778[this.field779 - 1] & 0xFF) << 8) + ((this.field778[this.field779 - 3] & 0xFF) << 24) + ((this.field778[this.field779 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "EILHLJCE", name = "b", descriptor = "([BIII)V")
    public void method262(byte[] arg0, int arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field775 = !this.field775;
        }
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            this.field778[this.field779++] = (byte) (arg0[var5] + 128);
        }
    }

    @OriginalMember(owner = "EILHLJCE", name = "a", descriptor = "(III[B)V")
    public void method263(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 0) {
            this.field762 = !this.field762;
        }
        for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
            arg3[var5] = (byte) (this.field778[this.field779++] - 128);
        }
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
            field781[var0] = var1;
        }
        field782 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field787 = new class20(807);
        field788 = new class20(807);
        field789 = new class20(807);
        field790 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
