import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PKHWFJLM")
public class class43 extends class40 {

    @OriginalMember(owner = "PKHWFJLM", name = "i", descriptor = "I")
    private int field1083 = -34470;

    @OriginalMember(owner = "PKHWFJLM", name = "j", descriptor = "I")
    private int field1084 = -160;

    @OriginalMember(owner = "PKHWFJLM", name = "k", descriptor = "I")
    private int field1085 = 1;

    @OriginalMember(owner = "PKHWFJLM", name = "l", descriptor = "I")
    private int field1086 = 5;

    @OriginalMember(owner = "PKHWFJLM", name = "m", descriptor = "I")
    private int field1087 = 44659;

    @OriginalMember(owner = "PKHWFJLM", name = "n", descriptor = "B")
    private byte field1088 = 9;

    @OriginalMember(owner = "PKHWFJLM", name = "o", descriptor = "I")
    private int field1089 = -973;

    @OriginalMember(owner = "PKHWFJLM", name = "q", descriptor = "I")
    private int field1091 = 1;

    @OriginalMember(owner = "PKHWFJLM", name = "r", descriptor = "I")
    private int field1092 = -838;

    @OriginalMember(owner = "PKHWFJLM", name = "s", descriptor = "I")
    private int field1093 = 1;

    @OriginalMember(owner = "PKHWFJLM", name = "t", descriptor = "I")
    private int field1094 = -166;

    @OriginalMember(owner = "PKHWFJLM", name = "u", descriptor = "I")
    private int field1095 = -166;

    @OriginalMember(owner = "PKHWFJLM", name = "v", descriptor = "I")
    private int field1096 = 44758;

    @OriginalMember(owner = "PKHWFJLM", name = "w", descriptor = "I")
    private int field1097 = 929;

    @OriginalMember(owner = "PKHWFJLM", name = "x", descriptor = "Z")
    private boolean field1098 = true;

    @OriginalMember(owner = "PKHWFJLM", name = "y", descriptor = "I")
    private int field1099 = -475;

    @OriginalMember(owner = "PKHWFJLM", name = "z", descriptor = "Z")
    private boolean field1100 = true;

    @OriginalMember(owner = "PKHWFJLM", name = "A", descriptor = "Z")
    private boolean field1101 = false;

    @OriginalMember(owner = "PKHWFJLM", name = "B", descriptor = "Z")
    private boolean field1102 = true;

    @OriginalMember(owner = "PKHWFJLM", name = "C", descriptor = "Z")
    private boolean field1103 = false;

    @OriginalMember(owner = "PKHWFJLM", name = "D", descriptor = "[B")
    public byte[] field1104;

    @OriginalMember(owner = "PKHWFJLM", name = "E", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "PKHWFJLM", name = "G", descriptor = "[I")
    private static int[] field1107 = new int[256];

    @OriginalMember(owner = "PKHWFJLM", name = "H", descriptor = "[I")
    private static final int[] field1108;

    @OriginalMember(owner = "PKHWFJLM", name = "M", descriptor = "LUEUHLQTT;")
    private static class61 field1113;

    @OriginalMember(owner = "PKHWFJLM", name = "N", descriptor = "LUEUHLQTT;")
    private static class61 field1114;

    @OriginalMember(owner = "PKHWFJLM", name = "O", descriptor = "LUEUHLQTT;")
    private static class61 field1115;

    @OriginalMember(owner = "PKHWFJLM", name = "P", descriptor = "[C")
    private static char[] field1116;

    @OriginalMember(owner = "PKHWFJLM", name = "p", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "PKHWFJLM", name = "F", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "PKHWFJLM", name = "J", descriptor = "I")
    private static int field1110;

    @OriginalMember(owner = "PKHWFJLM", name = "K", descriptor = "I")
    private static int field1111;

    @OriginalMember(owner = "PKHWFJLM", name = "L", descriptor = "I")
    private static int field1112;

    @OriginalMember(owner = "PKHWFJLM", name = "I", descriptor = "LLAXXBEFB;")
    public class29 field1109;

    @OriginalMember(owner = "PKHWFJLM", name = "Q", descriptor = "Z")
    public static boolean field1117;

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(II)LPKHWFJLM;")
    public static class43 method318(int arg0, int arg1) {
        int var2 = 12 / arg0;
        class61 var3 = field1114;
        synchronized (field1114) {
            class43 var4 = null;
            if (arg1 == 0 && field1110 > 0) {
                field1110--;
                var4 = (class43) field1113.method509();
            } else if (arg1 == 1 && field1111 > 0) {
                field1111--;
                var4 = (class43) field1114.method509();
            } else if (arg1 == 2 && field1112 > 0) {
                field1112--;
                var4 = (class43) field1115.method509();
            }
            if (var4 != null) {
                var4.field1105 = 0;
                return var4;
            }
        }
        class43 var6 = new class43((byte) -116);
        var6.field1105 = 0;
        if (arg1 == 0) {
            var6.field1104 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1104 = new byte[5000];
        } else {
            var6.field1104 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "<init>", descriptor = "(B)V")
    private class43(byte arg0) {
        if (arg0 != -116) {
            this.field1099 = 104;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "<init>", descriptor = "([BI)V")
    public class43(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1104 = arg0;
        this.field1105 = 0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(IZ)V")
    public void method319(int arg0, boolean arg1) {
        this.field1104[this.field1105++] = (byte) (arg0 + this.field1109.method276());
        if (arg1) {
            this.field1100 = !this.field1100;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(I)V")
    public void method320(int arg0) {
        this.field1104[this.field1105++] = (byte) arg0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "b", descriptor = "(I)V")
    public void method321(int arg0) {
        this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        this.field1104[this.field1105++] = (byte) arg0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(IB)V")
    public void method322(int arg0, byte arg1) {
        if (arg1 == 35) {
            this.field1104[this.field1105++] = (byte) arg0;
            this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "c", descriptor = "(I)V")
    public void method323(int arg0) {
        this.field1104[this.field1105++] = (byte) (arg0 >> 16);
        this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        this.field1104[this.field1105++] = (byte) arg0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "d", descriptor = "(I)V")
    public void method324(int arg0) {
        this.field1104[this.field1105++] = (byte) (arg0 >> 24);
        this.field1104[this.field1105++] = (byte) (arg0 >> 16);
        this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        this.field1104[this.field1105++] = (byte) arg0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "b", descriptor = "(II)V")
    public void method325(int arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) arg0;
        this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        this.field1104[this.field1105++] = (byte) (arg0 >> 16);
        this.field1104[this.field1105++] = (byte) (arg0 >> 24);
        if (arg1 != 0) {
            this.field1100 = !this.field1100;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(IJ)V")
    public void method326(int arg0, long arg1) {
        this.field1104[this.field1105++] = (byte) (arg1 >> 56);
        this.field1104[this.field1105++] = (byte) (arg1 >> 48);
        this.field1104[this.field1105++] = (byte) (arg1 >> 40);
        while (arg0 >= 0) {
            this.field1083 = -12;
        }
        this.field1104[this.field1105++] = (byte) (arg1 >> 32);
        this.field1104[this.field1105++] = (byte) (arg1 >> 24);
        this.field1104[this.field1105++] = (byte) (arg1 >> 16);
        this.field1104[this.field1105++] = (byte) (arg1 >> 8);
        this.field1104[this.field1105++] = (byte) arg1;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method327(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1104, this.field1105);
        this.field1105 += arg0.length();
        this.field1104[this.field1105++] = 10;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "([BIIB)V")
    public void method328(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var5 = false;
            for (int var6 = arg2; var6 < arg1 + arg2; var6++) {
                this.field1104[this.field1105++] = arg0[var6];
            }
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(BI)V")
    public void method329(byte arg0, int arg1) {
        this.field1104[this.field1105 - arg1 - 1] = (byte) arg1;
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "c", descriptor = "()I")
    public int method330() {
        return this.field1104[this.field1105++] & 0xFF;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "d", descriptor = "()B")
    public byte method331() {
        return this.field1104[this.field1105++];
    }

    @OriginalMember(owner = "PKHWFJLM", name = "e", descriptor = "()I")
    public int method332() {
        this.field1105 += 2;
        return ((this.field1104[this.field1105 - 2] & 0xFF) << 8) + (this.field1104[this.field1105 - 1] & 0xFF);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "f", descriptor = "()I")
    public int method333() {
        this.field1105 += 2;
        int var1 = ((this.field1104[this.field1105 - 2] & 0xFF) << 8) + (this.field1104[this.field1105 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "g", descriptor = "()I")
    public int method334() {
        this.field1105 += 3;
        return (this.field1104[this.field1105 - 1] & 0xFF) + ((this.field1104[this.field1105 - 3] & 0xFF) << 16) + ((this.field1104[this.field1105 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "h", descriptor = "()I")
    public int method335() {
        this.field1105 += 4;
        return (this.field1104[this.field1105 - 1] & 0xFF) + ((this.field1104[this.field1105 - 2] & 0xFF) << 8) + ((this.field1104[this.field1105 - 4] & 0xFF) << 24) + ((this.field1104[this.field1105 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "e", descriptor = "(I)J")
    public long method336(int arg0) {
        long var2 = (long) this.method335() & 0xFFFFFFFFL;
        long var4 = (long) this.method335() & 0xFFFFFFFFL;
        if (arg0 < 7 || arg0 > 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "i", descriptor = "()Ljava/lang/String;")
    public String method337() {
        int var1 = this.field1105;
        while (this.field1104[this.field1105++] != 10) {
        }
        return new String(this.field1104, var1, this.field1105 - var1 - 1);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "f", descriptor = "(I)[B")
    public byte[] method338(int arg0) {
        int var2 = this.field1105;
        if (arg0 < this.field1086 || arg0 > this.field1086) {
            throw new NullPointerException();
        }
        while (this.field1104[this.field1105++] != 10) {
        }
        byte[] var3 = new byte[this.field1105 - var2 - 1];
        for (int var4 = var2; var4 < this.field1105 - 1; var4++) {
            var3[var4 - var2] = this.field1104[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(II[BI)V")
    public void method339(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 44 / arg0;
        for (int var6 = arg1; var6 < arg1 + arg3; var6++) {
            arg2[var6] = this.field1104[this.field1105++];
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "g", descriptor = "(I)V")
    public void method340(int arg0) {
        if (arg0 == 2) {
            this.field1106 = this.field1105 * 8;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "b", descriptor = "(BI)I")
    public int method341(byte arg0, int arg1) {
        int var3 = this.field1106 >> 3;
        int var4 = 8 - (this.field1106 & 0x7);
        int var5 = 0;
        this.field1106 += arg1;
        if (arg0 != 39) {
            return this.field1086;
        }
        while (arg1 > var4) {
            var5 += (this.field1104[var3++] & field1108[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1104[var3] & field1108[var4]) + var5;
        } else {
            var6 = (this.field1104[var3] >> var4 - arg1 & field1108[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "h", descriptor = "(I)V")
    public void method342(int arg0) {
        if (arg0 == -29596) {
            this.field1105 = (this.field1106 + 7) / 8;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "j", descriptor = "()I")
    public int method343() {
        int var1 = this.field1104[this.field1105] & 0xFF;
        return var1 < 128 ? this.method330() - 64 : this.method332() - 49152;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "k", descriptor = "()I")
    public int method344() {
        int var1 = this.field1104[this.field1105] & 0xFF;
        return var1 < 128 ? this.method330() : this.method332() - 32768;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method345(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field1105;
        this.field1105 = 0;
        byte[] var5 = new byte[var4];
        this.method339(990, 0, var5, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        if (arg1 != -83) {
            this.field1100 = !this.field1100;
        }
        byte[] var8 = var7.toByteArray();
        this.field1105 = 0;
        this.method320(var8.length);
        this.method328(var8, var8.length, 0, (byte) 8);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "c", descriptor = "(II)V")
    public void method346(int arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) (arg1 + 128);
        if (arg0 != 7) {
            this.field1102 = !this.field1102;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "d", descriptor = "(II)V")
    public void method347(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1099 = -124;
        }
        this.field1104[this.field1105++] = (byte) -arg1;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "e", descriptor = "(II)V")
    public void method348(int arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) (128 - arg1);
        if (arg0 < 8 || arg0 > 8) {
            ;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(B)I")
    public int method349(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1100 = !this.field1100;
        }
        return this.field1104[this.field1105++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "b", descriptor = "(B)I")
    public int method350(byte arg0) {
        if (arg0 != 40) {
            this.field1090 = 482;
        }
        return -this.field1104[this.field1105++] & 0xFF;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "i", descriptor = "(I)I")
    public int method351(int arg0) {
        return arg0 == 0 ? 128 - this.field1104[this.field1105++] & 0xFF : this.field1083;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "j", descriptor = "(I)B")
    public byte method352(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1104[this.field1105++] - 128);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "c", descriptor = "(B)B")
    public byte method353(byte arg0) {
        if (arg0 != -56) {
            throw new NullPointerException();
        }
        return (byte) -this.field1104[this.field1105++];
    }

    @OriginalMember(owner = "PKHWFJLM", name = "f", descriptor = "(II)V")
    public void method354(int arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) arg1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1104[this.field1105++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "c", descriptor = "(BI)V")
    public void method355(byte arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) (arg1 >> 8);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1104[this.field1105++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "g", descriptor = "(II)V")
    public void method356(int arg0, int arg1) {
        if (arg1 == 35793) {
            this.field1104[this.field1105++] = (byte) (arg0 + 128);
            this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "k", descriptor = "(I)I")
    public int method357(int arg0) {
        if (arg0 != 31063) {
            this.field1083 = -384;
        }
        this.field1105 += 2;
        return ((this.field1104[this.field1105 - 1] & 0xFF) << 8) + (this.field1104[this.field1105 - 2] & 0xFF);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "d", descriptor = "(B)I")
    public int method358(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
            this.field1105 += 2;
            return ((this.field1104[this.field1105 - 2] & 0xFF) << 8) + (this.field1104[this.field1105 - 1] - 128 & 0xFF);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PKHWFJLM", name = "l", descriptor = "(I)I")
    public int method359(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field1089 = 218;
        }
        this.field1105 += 2;
        return ((this.field1104[this.field1105 - 1] & 0xFF) << 8) + (this.field1104[this.field1105 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "e", descriptor = "(B)I")
    public int method360(byte arg0) {
        this.field1105 += 2;
        int var2 = ((this.field1104[this.field1105 - 1] & 0xFF) << 8) + (this.field1104[this.field1105 - 2] & 0xFF);
        if (arg0 != 10) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "m", descriptor = "(I)I")
    public int method361(int arg0) {
        this.field1105 += 2;
        if (arg0 != 0) {
            return 1;
        }
        int var2 = ((this.field1104[this.field1105 - 2] & 0xFF) << 8) + (this.field1104[this.field1105 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "n", descriptor = "(I)I")
    public int method362(int arg0) {
        this.field1105 += 3;
        return arg0 == -22499 ? (this.field1104[this.field1105 - 1] & 0xFF) + ((this.field1104[this.field1105 - 2] & 0xFF) << 16) + ((this.field1104[this.field1105 - 3] & 0xFF) << 8) : 0;
    }

    @OriginalMember(owner = "PKHWFJLM", name = "h", descriptor = "(II)V")
    public void method363(int arg0, int arg1) {
        this.field1104[this.field1105++] = (byte) arg0;
        this.field1104[this.field1105++] = (byte) (arg0 >> 8);
        this.field1104[this.field1105++] = (byte) (arg0 >> 16);
        if (this.field1093 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1104[this.field1105++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "o", descriptor = "(I)I")
    public int method364(int arg0) {
        this.field1105 += 4;
        while (arg0 >= 0) {
            this.field1100 = !this.field1100;
        }
        return (this.field1104[this.field1105 - 4] & 0xFF) + ((this.field1104[this.field1105 - 3] & 0xFF) << 8) + ((this.field1104[this.field1105 - 1] & 0xFF) << 24) + ((this.field1104[this.field1105 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "p", descriptor = "(I)I")
    public int method365(int arg0) {
        this.field1105 += 4;
        if (arg0 != 32520) {
            this.field1103 = !this.field1103;
        }
        return (this.field1104[this.field1105 - 3] & 0xFF) + ((this.field1104[this.field1105 - 4] & 0xFF) << 8) + ((this.field1104[this.field1105 - 2] & 0xFF) << 24) + ((this.field1104[this.field1105 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "q", descriptor = "(I)I")
    public int method366(int arg0) {
        this.field1105 += 4;
        if (arg0 != 44758) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1104[this.field1105 - 2] & 0xFF) + ((this.field1104[this.field1105 - 1] & 0xFF) << 8) + ((this.field1104[this.field1105 - 3] & 0xFF) << 24) + ((this.field1104[this.field1105 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PKHWFJLM", name = "a", descriptor = "(I[BII)V")
    public void method367(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -37496) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2 + arg3 - 1; var6 >= arg3; var6--) {
            this.field1104[this.field1105++] = (byte) (arg1[var6] + 128);
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
            field1107[var0] = var1;
        }
        field1108 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1113 = new class61(0);
        field1114 = new class61(0);
        field1115 = new class61(0);
        field1116 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
