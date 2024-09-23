import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MQZHAILV")
public class class33 extends class68 {

    @OriginalMember(owner = "MQZHAILV", name = "h", descriptor = "B")
    private byte field927 = 3;

    @OriginalMember(owner = "MQZHAILV", name = "i", descriptor = "B")
    private byte field928 = 3;

    @OriginalMember(owner = "MQZHAILV", name = "j", descriptor = "B")
    private byte field929 = 8;

    @OriginalMember(owner = "MQZHAILV", name = "k", descriptor = "B")
    private byte field930 = 84;

    @OriginalMember(owner = "MQZHAILV", name = "l", descriptor = "I")
    private int field931 = -48672;

    @OriginalMember(owner = "MQZHAILV", name = "m", descriptor = "B")
    private byte field932 = 2;

    @OriginalMember(owner = "MQZHAILV", name = "n", descriptor = "Z")
    private boolean field933 = true;

    @OriginalMember(owner = "MQZHAILV", name = "o", descriptor = "Z")
    private boolean field934 = true;

    @OriginalMember(owner = "MQZHAILV", name = "p", descriptor = "Z")
    private boolean field935 = false;

    @OriginalMember(owner = "MQZHAILV", name = "q", descriptor = "Z")
    private boolean field936 = false;

    @OriginalMember(owner = "MQZHAILV", name = "r", descriptor = "Z")
    private boolean field937 = false;

    @OriginalMember(owner = "MQZHAILV", name = "s", descriptor = "I")
    private int field938 = -606;

    @OriginalMember(owner = "MQZHAILV", name = "t", descriptor = "I")
    private int field939 = 9;

    @OriginalMember(owner = "MQZHAILV", name = "v", descriptor = "I")
    private int field941 = 7;

    @OriginalMember(owner = "MQZHAILV", name = "w", descriptor = "Z")
    private boolean field942 = true;

    @OriginalMember(owner = "MQZHAILV", name = "x", descriptor = "Z")
    private boolean field943 = false;

    @OriginalMember(owner = "MQZHAILV", name = "y", descriptor = "[B")
    public byte[] field944;

    @OriginalMember(owner = "MQZHAILV", name = "z", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "MQZHAILV", name = "B", descriptor = "[I")
    private static int[] field947 = new int[256];

    @OriginalMember(owner = "MQZHAILV", name = "C", descriptor = "[I")
    private static final int[] field948;

    @OriginalMember(owner = "MQZHAILV", name = "H", descriptor = "LPUBJBHOK;")
    private static class42 field953;

    @OriginalMember(owner = "MQZHAILV", name = "I", descriptor = "LPUBJBHOK;")
    private static class42 field954;

    @OriginalMember(owner = "MQZHAILV", name = "J", descriptor = "LPUBJBHOK;")
    private static class42 field955;

    @OriginalMember(owner = "MQZHAILV", name = "K", descriptor = "[C")
    private static char[] field956;

    @OriginalMember(owner = "MQZHAILV", name = "u", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "MQZHAILV", name = "A", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "MQZHAILV", name = "E", descriptor = "I")
    private static int field950;

    @OriginalMember(owner = "MQZHAILV", name = "F", descriptor = "I")
    private static int field951;

    @OriginalMember(owner = "MQZHAILV", name = "G", descriptor = "I")
    private static int field952;

    @OriginalMember(owner = "MQZHAILV", name = "D", descriptor = "LRCWDZCCF;")
    public class45 field949;

    @OriginalMember(owner = "MQZHAILV", name = "L", descriptor = "Z")
    public static boolean field957;

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(II)LMQZHAILV;")
    public static class33 method313(int arg0, int arg1) {
        class42 var2 = field954;
        synchronized (field954) {
            class33 var3 = null;
            if (arg0 == 0 && field950 > 0) {
                field950--;
                var3 = (class33) field953.method375();
            } else if (arg0 == 1 && field951 > 0) {
                field951--;
                var3 = (class33) field954.method375();
            } else if (arg0 == 2 && field952 > 0) {
                field952--;
                var3 = (class33) field955.method375();
            }
            if (var3 != null) {
                var3.field945 = 0;
                return var3;
            }
        }
        class33 var5 = new class33((byte) 8);
        var5.field945 = 0;
        int var6 = 80 / arg1;
        if (arg0 == 0) {
            var5.field944 = new byte[100];
        } else if (arg0 == 1) {
            var5.field944 = new byte[5000];
        } else {
            var5.field944 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "MQZHAILV", name = "<init>", descriptor = "(B)V")
    private class33(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field937 = !this.field937;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "<init>", descriptor = "(Z[B)V")
    public class33(boolean arg0, byte[] arg1) {
        this.field944 = arg1;
        this.field945 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(II)V")
    public void method314(int arg0, int arg1) {
        if (arg0 != 43776) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field944[this.field945++] = (byte) (arg1 + this.field949.method402());
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(I)V")
    public void method315(int arg0) {
        this.field944[this.field945++] = (byte) arg0;
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(I)V")
    public void method316(int arg0) {
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        this.field944[this.field945++] = (byte) arg0;
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(IZ)V")
    public void method317(int arg0, boolean arg1) {
        this.field944[this.field945++] = (byte) arg0;
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "c", descriptor = "(I)V")
    public void method318(int arg0) {
        this.field944[this.field945++] = (byte) (arg0 >> 16);
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        this.field944[this.field945++] = (byte) arg0;
    }

    @OriginalMember(owner = "MQZHAILV", name = "d", descriptor = "(I)V")
    public void method319(int arg0) {
        this.field944[this.field945++] = (byte) (arg0 >> 24);
        this.field944[this.field945++] = (byte) (arg0 >> 16);
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        this.field944[this.field945++] = (byte) arg0;
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(IB)V")
    public void method320(int arg0, byte arg1) {
        this.field944[this.field945++] = (byte) arg0;
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        this.field944[this.field945++] = (byte) (arg0 >> 16);
        if (this.field927 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field944[this.field945++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(BJ)V")
    public void method321(byte arg0, long arg1) {
        this.field944[this.field945++] = (byte) (arg1 >> 56);
        this.field944[this.field945++] = (byte) (arg1 >> 48);
        this.field944[this.field945++] = (byte) (arg1 >> 40);
        if (arg0 != 73) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field944[this.field945++] = (byte) (arg1 >> 32);
        this.field944[this.field945++] = (byte) (arg1 >> 24);
        this.field944[this.field945++] = (byte) (arg1 >> 16);
        this.field944[this.field945++] = (byte) (arg1 >> 8);
        this.field944[this.field945++] = (byte) arg1;
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method322(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field944, this.field945);
        this.field945 += arg0.length();
        this.field944[this.field945++] = 10;
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(II[BI)V")
    public void method323(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 <= 0) {
            this.field941 = 242;
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            this.field944[this.field945++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(IZ)V")
    public void method324(int arg0, boolean arg1) {
        if (arg1) {
            this.field937 = !this.field937;
        }
        this.field944[this.field945 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "MQZHAILV", name = "c", descriptor = "()I")
    public int method325() {
        return this.field944[this.field945++] & 0xFF;
    }

    @OriginalMember(owner = "MQZHAILV", name = "d", descriptor = "()B")
    public byte method326() {
        return this.field944[this.field945++];
    }

    @OriginalMember(owner = "MQZHAILV", name = "e", descriptor = "()I")
    public int method327() {
        this.field945 += 2;
        return ((this.field944[this.field945 - 2] & 0xFF) << 8) + (this.field944[this.field945 - 1] & 0xFF);
    }

    @OriginalMember(owner = "MQZHAILV", name = "f", descriptor = "()I")
    public int method328() {
        this.field945 += 2;
        int var1 = ((this.field944[this.field945 - 2] & 0xFF) << 8) + (this.field944[this.field945 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "MQZHAILV", name = "g", descriptor = "()I")
    public int method329() {
        this.field945 += 3;
        return (this.field944[this.field945 - 1] & 0xFF) + ((this.field944[this.field945 - 3] & 0xFF) << 16) + ((this.field944[this.field945 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "MQZHAILV", name = "h", descriptor = "()I")
    public int method330() {
        this.field945 += 4;
        return (this.field944[this.field945 - 1] & 0xFF) + ((this.field944[this.field945 - 2] & 0xFF) << 8) + ((this.field944[this.field945 - 4] & 0xFF) << 24) + ((this.field944[this.field945 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(Z)J")
    public long method331(boolean arg0) {
        long var2 = (long) this.method330() & 0xFFFFFFFFL;
        long var4 = (long) this.method330() & 0xFFFFFFFFL;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "MQZHAILV", name = "i", descriptor = "()Ljava/lang/String;")
    public String method332() {
        int var1 = this.field945;
        while (this.field944[this.field945++] != 10) {
        }
        return new String(this.field944, var1, this.field945 - var1 - 1);
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(B)[B")
    public byte[] method333(byte arg0) {
        int var2 = this.field945;
        while (this.field944[this.field945++] != 10) {
        }
        byte[] var3 = new byte[this.field945 - var2 - 1];
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        for (int var5 = var2; var5 < this.field945 - 1; var5++) {
            var3[var5 - var2] = this.field944[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(II[BI)V")
    public void method334(int arg0, int arg1, byte[] arg2, int arg3) {
        label25: while (true) {
            if (arg3 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label25;
                    }
                    var6++;
                }
            }
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                arg2[var5] = this.field944[this.field945++];
            }
            return;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "e", descriptor = "(I)V")
    public void method335(int arg0) {
        if (arg0 > 0) {
            this.field946 = this.field945 * 8;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "c", descriptor = "(II)I")
    public int method336(int arg0, int arg1) {
        if (arg0 != -29762) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field946 >> 3;
        int var5 = 8 - (this.field946 & 0x7);
        int var6 = 0;
        this.field946 += arg1;
        while (arg1 > var5) {
            var6 += (this.field944[var4++] & field948[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (this.field944[var4] & field948[var5]) + var6;
        } else {
            var7 = (this.field944[var4] >> var5 - arg1 & field948[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(B)V")
    public void method337(byte arg0) {
        if (arg0 == -97) {
            this.field945 = (this.field946 + 7) / 8;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "j", descriptor = "()I")
    public int method338() {
        int var1 = this.field944[this.field945] & 0xFF;
        return var1 < 128 ? this.method325() - 64 : this.method327() - 49152;
    }

    @OriginalMember(owner = "MQZHAILV", name = "k", descriptor = "()I")
    public int method339() {
        int var1 = this.field944[this.field945] & 0xFF;
        return var1 < 128 ? this.method325() : this.method327() - 32768;
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method340(boolean arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field945;
        this.field945 = 0;
        byte[] var5 = new byte[var4];
        if (!arg0) {
            this.field942 = !this.field942;
        }
        this.method334(0, var4, var5, -162);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field945 = 0;
        this.method315(var8.length);
        this.method323(0, 1, var8, var8.length);
    }

    @OriginalMember(owner = "MQZHAILV", name = "d", descriptor = "(II)V")
    public void method341(int arg0, int arg1) {
        if (arg1 > 0) {
            this.field944[this.field945++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "e", descriptor = "(II)V")
    public void method342(int arg0, int arg1) {
        this.field944[this.field945++] = (byte) -arg0;
        if (arg1 != 43665) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(BI)V")
    public void method343(byte arg0, int arg1) {
        if (arg0 == 8) {
            this.field944[this.field945++] = (byte) (128 - arg1);
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "f", descriptor = "(I)I")
    public int method344(int arg0) {
        return arg0 >= 0 ? 3 : this.field944[this.field945++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "MQZHAILV", name = "g", descriptor = "(I)I")
    public int method345(int arg0) {
        return arg0 <= 0 ? this.field940 : -this.field944[this.field945++] & 0xFF;
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(Z)I")
    public int method346(boolean arg0) {
        return arg0 ? this.field941 : 128 - this.field944[this.field945++] & 0xFF;
    }

    @OriginalMember(owner = "MQZHAILV", name = "h", descriptor = "(I)B")
    public byte method347(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field944[this.field945++] - 128);
    }

    @OriginalMember(owner = "MQZHAILV", name = "i", descriptor = "(I)B")
    public byte method348(int arg0) {
        if (arg0 != -23701) {
            this.field938 = 330;
        }
        return (byte) (128 - this.field944[this.field945++]);
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(ZI)V")
    public void method349(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field944[this.field945++] = (byte) arg1;
        this.field944[this.field945++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "MQZHAILV", name = "f", descriptor = "(II)V")
    public void method350(int arg0, int arg1) {
        this.field944[this.field945++] = (byte) (arg0 >> 8);
        if (arg1 == -13310) {
            this.field944[this.field945++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "g", descriptor = "(II)V")
    public void method351(int arg0, int arg1) {
        this.field944[this.field945++] = (byte) (arg0 + 128);
        if (arg1 != 46574) {
            this.field943 = !this.field943;
        }
        this.field944[this.field945++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "MQZHAILV", name = "c", descriptor = "(B)I")
    public int method352(byte arg0) {
        if (arg0 == 117) {
            this.field945 += 2;
            return ((this.field944[this.field945 - 1] & 0xFF) << 8) + (this.field944[this.field945 - 2] & 0xFF);
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "j", descriptor = "(I)I")
    public int method353(int arg0) {
        if (arg0 != 0) {
            this.field931 = -491;
        }
        this.field945 += 2;
        return ((this.field944[this.field945 - 2] & 0xFF) << 8) + (this.field944[this.field945 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "MQZHAILV", name = "d", descriptor = "(B)I")
    public int method354(byte arg0) {
        if (arg0 != -59) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field945 += 2;
        return ((this.field944[this.field945 - 1] & 0xFF) << 8) + (this.field944[this.field945 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "MQZHAILV", name = "k", descriptor = "(I)I")
    public int method355(int arg0) {
        this.field945 += 2;
        if (arg0 < 7 || arg0 > 7) {
            this.field941 = 153;
        }
        int var2 = ((this.field944[this.field945 - 1] & 0xFF) << 8) + (this.field944[this.field945 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MQZHAILV", name = "e", descriptor = "(B)I")
    public int method356(byte arg0) {
        if (arg0 != 35) {
            this.field939 = 106;
        }
        this.field945 += 2;
        int var2 = ((this.field944[this.field945 - 2] & 0xFF) << 8) + (this.field944[this.field945 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MQZHAILV", name = "c", descriptor = "(Z)I")
    public int method357(boolean arg0) {
        this.field945 += 2;
        int var2 = ((this.field944[this.field945 - 1] & 0xFF) << 8) + (this.field944[this.field945 - 2] - 128 & 0xFF);
        if (!arg0) {
            this.field941 = -6;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MQZHAILV", name = "l", descriptor = "(I)I")
    public int method358(int arg0) {
        if (arg0 == -39582) {
            this.field945 += 3;
            return (this.field944[this.field945 - 1] & 0xFF) + ((this.field944[this.field945 - 2] & 0xFF) << 16) + ((this.field944[this.field945 - 3] & 0xFF) << 8);
        } else {
            return this.field940;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "b", descriptor = "(ZI)V")
    public void method359(boolean arg0, int arg1) {
        if (arg0) {
            this.field942 = !this.field942;
        }
        this.field944[this.field945++] = (byte) (arg1 >> 16);
        this.field944[this.field945++] = (byte) (arg1 >> 24);
        this.field944[this.field945++] = (byte) arg1;
        this.field944[this.field945++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "MQZHAILV", name = "d", descriptor = "(Z)I")
    public int method360(boolean arg0) {
        this.field945 += 4;
        if (!arg0) {
            this.field931 = -364;
        }
        return (this.field944[this.field945 - 4] & 0xFF) + ((this.field944[this.field945 - 3] & 0xFF) << 8) + ((this.field944[this.field945 - 1] & 0xFF) << 24) + ((this.field944[this.field945 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MQZHAILV", name = "f", descriptor = "(B)I")
    public int method361(byte arg0) {
        if (arg0 == 47) {
            this.field945 += 4;
            return (this.field944[this.field945 - 3] & 0xFF) + ((this.field944[this.field945 - 4] & 0xFF) << 8) + ((this.field944[this.field945 - 2] & 0xFF) << 24) + ((this.field944[this.field945 - 1] & 0xFF) << 16);
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "MQZHAILV", name = "a", descriptor = "(I[BII)V")
    public void method362(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            this.field931 = -294;
        }
        for (int var5 = arg2 + arg3 - 1; var5 >= arg2; var5--) {
            arg1[var5] = this.field944[this.field945++];
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
            field947[var0] = var1;
        }
        field948 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field953 = new class42(-591);
        field954 = new class42(-591);
        field955 = new class42(-591);
        field956 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
