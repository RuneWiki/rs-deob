import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MLYYHULT")
public class class30 extends class10 {

    @OriginalMember(owner = "MLYYHULT", name = "j", descriptor = "B")
    private byte field1072 = -38;

    @OriginalMember(owner = "MLYYHULT", name = "k", descriptor = "B")
    private byte field1073 = 119;

    @OriginalMember(owner = "MLYYHULT", name = "l", descriptor = "Z")
    private boolean field1074 = true;

    @OriginalMember(owner = "MLYYHULT", name = "m", descriptor = "I")
    private int field1075 = 1;

    @OriginalMember(owner = "MLYYHULT", name = "n", descriptor = "Z")
    private boolean field1076 = true;

    @OriginalMember(owner = "MLYYHULT", name = "o", descriptor = "I")
    private int field1077 = 560;

    @OriginalMember(owner = "MLYYHULT", name = "q", descriptor = "Z")
    private boolean field1079 = false;

    @OriginalMember(owner = "MLYYHULT", name = "r", descriptor = "B")
    private byte field1080 = -53;

    @OriginalMember(owner = "MLYYHULT", name = "t", descriptor = "B")
    private byte field1082 = 2;

    @OriginalMember(owner = "MLYYHULT", name = "u", descriptor = "I")
    private int field1083 = 5;

    @OriginalMember(owner = "MLYYHULT", name = "v", descriptor = "B")
    private byte field1084 = 4;

    @OriginalMember(owner = "MLYYHULT", name = "w", descriptor = "I")
    private int field1085 = 435;

    @OriginalMember(owner = "MLYYHULT", name = "x", descriptor = "Z")
    private boolean field1086 = true;

    @OriginalMember(owner = "MLYYHULT", name = "y", descriptor = "I")
    private int field1087 = 778;

    @OriginalMember(owner = "MLYYHULT", name = "z", descriptor = "Z")
    private boolean field1088 = false;

    @OriginalMember(owner = "MLYYHULT", name = "A", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "MLYYHULT", name = "C", descriptor = "[B")
    public byte[] field1091;

    @OriginalMember(owner = "MLYYHULT", name = "D", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "MLYYHULT", name = "i", descriptor = "B")
    private static byte field1071 = -38;

    @OriginalMember(owner = "MLYYHULT", name = "B", descriptor = "I")
    private static int field1090 = -389;

    @OriginalMember(owner = "MLYYHULT", name = "F", descriptor = "[I")
    private static int[] field1094 = new int[256];

    @OriginalMember(owner = "MLYYHULT", name = "G", descriptor = "[I")
    private static final int[] field1095;

    @OriginalMember(owner = "MLYYHULT", name = "L", descriptor = "LZWZXPJNQ;")
    private static class72 field1100;

    @OriginalMember(owner = "MLYYHULT", name = "M", descriptor = "LZWZXPJNQ;")
    private static class72 field1101;

    @OriginalMember(owner = "MLYYHULT", name = "N", descriptor = "LZWZXPJNQ;")
    private static class72 field1102;

    @OriginalMember(owner = "MLYYHULT", name = "O", descriptor = "[C")
    private static char[] field1103;

    @OriginalMember(owner = "MLYYHULT", name = "p", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "MLYYHULT", name = "s", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "MLYYHULT", name = "E", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "MLYYHULT", name = "I", descriptor = "I")
    private static int field1097;

    @OriginalMember(owner = "MLYYHULT", name = "J", descriptor = "I")
    private static int field1098;

    @OriginalMember(owner = "MLYYHULT", name = "K", descriptor = "I")
    private static int field1099;

    @OriginalMember(owner = "MLYYHULT", name = "H", descriptor = "LSSCDCBAC;")
    public class49 field1096;

    @OriginalMember(owner = "MLYYHULT", name = "P", descriptor = "Z")
    public static boolean field1104;

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(II)LMLYYHULT;")
    public static class30 method284(int arg0, int arg1) {
        class72 var2 = field1101;
        synchronized (field1101) {
            class30 var3 = null;
            if (arg1 == 0 && field1097 > 0) {
                field1097--;
                var3 = (class30) field1100.method599();
            } else if (arg1 == 1 && field1098 > 0) {
                field1098--;
                var3 = (class30) field1101.method599();
            } else if (arg1 == 2 && field1099 > 0) {
                field1099--;
                var3 = (class30) field1102.method599();
            }
            if (var3 != null) {
                var3.field1092 = 0;
                return var3;
            }
        }
        class30 var5 = new class30(field1071);
        var5.field1092 = 0;
        if (arg0 != 9448) {
            field1090 = -402;
        }
        if (arg1 == 0) {
            var5.field1091 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1091 = new byte[5000];
        } else {
            var5.field1091 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "MLYYHULT", name = "<init>", descriptor = "(B)V")
    private class30(byte arg0) {
        if (this.field1072 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "<init>", descriptor = "(Z[B)V")
    public class30(boolean arg0, byte[] arg1) {
        this.field1091 = arg1;
        if (!arg0) {
            throw new NullPointerException();
        }
        this.field1092 = 0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(II)V")
    public void method285(int arg0, int arg1) {
        int var3 = 11 / arg1;
        this.field1091[this.field1092++] = (byte) (arg0 + this.field1096.method450());
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(I)V")
    public void method286(int arg0) {
        this.field1091[this.field1092++] = (byte) arg0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(I)V")
    public void method287(int arg0) {
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) arg0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(BI)V")
    public void method288(byte arg0, int arg1) {
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1091[this.field1092++] = (byte) arg1;
        this.field1091[this.field1092++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "MLYYHULT", name = "c", descriptor = "(I)V")
    public void method289(int arg0) {
        this.field1091[this.field1092++] = (byte) (arg0 >> 16);
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) arg0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "d", descriptor = "(I)V")
    public void method290(int arg0) {
        this.field1091[this.field1092++] = (byte) (arg0 >> 24);
        this.field1091[this.field1092++] = (byte) (arg0 >> 16);
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) arg0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(IB)V")
    public void method291(int arg0, byte arg1) {
        this.field1091[this.field1092++] = (byte) arg0;
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) (arg0 >> 16);
        this.field1091[this.field1092++] = (byte) (arg0 >> 24);
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(JB)V")
    public void method292(long arg0, byte arg1) {
        if (arg1 != 45) {
            this.field1088 = !this.field1088;
        }
        this.field1091[this.field1092++] = (byte) (arg0 >> 56);
        this.field1091[this.field1092++] = (byte) (arg0 >> 48);
        this.field1091[this.field1092++] = (byte) (arg0 >> 40);
        this.field1091[this.field1092++] = (byte) (arg0 >> 32);
        this.field1091[this.field1092++] = (byte) (arg0 >> 24);
        this.field1091[this.field1092++] = (byte) (arg0 >> 16);
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) arg0;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method293(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1091, this.field1092);
        this.field1092 += arg0.length();
        this.field1091[this.field1092++] = 10;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(II[BI)V")
    public void method294(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > 0) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                this.field1091[this.field1092++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "c", descriptor = "(II)V")
    public void method295(int arg0, int arg1) {
        this.field1091[this.field1092 - arg0 - 1] = (byte) arg0;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "c", descriptor = "()I")
    public int method296() {
        return this.field1091[this.field1092++] & 0xFF;
    }

    @OriginalMember(owner = "MLYYHULT", name = "d", descriptor = "()B")
    public byte method297() {
        return this.field1091[this.field1092++];
    }

    @OriginalMember(owner = "MLYYHULT", name = "e", descriptor = "()I")
    public int method298() {
        this.field1092 += 2;
        return ((this.field1091[this.field1092 - 2] & 0xFF) << 8) + (this.field1091[this.field1092 - 1] & 0xFF);
    }

    @OriginalMember(owner = "MLYYHULT", name = "f", descriptor = "()I")
    public int method299() {
        this.field1092 += 2;
        int var1 = ((this.field1091[this.field1092 - 2] & 0xFF) << 8) + (this.field1091[this.field1092 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "MLYYHULT", name = "g", descriptor = "()I")
    public int method300() {
        this.field1092 += 3;
        return (this.field1091[this.field1092 - 1] & 0xFF) + ((this.field1091[this.field1092 - 3] & 0xFF) << 16) + ((this.field1091[this.field1092 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "MLYYHULT", name = "h", descriptor = "()I")
    public int method301() {
        this.field1092 += 4;
        return (this.field1091[this.field1092 - 1] & 0xFF) + ((this.field1091[this.field1092 - 2] & 0xFF) << 8) + ((this.field1091[this.field1092 - 4] & 0xFF) << 24) + ((this.field1091[this.field1092 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(B)J")
    public long method302(byte arg0) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        long var3 = (long) this.method301() & 0xFFFFFFFFL;
        long var5 = (long) this.method301() & 0xFFFFFFFFL;
        return (var3 << 32) + var5;
    }

    @OriginalMember(owner = "MLYYHULT", name = "i", descriptor = "()Ljava/lang/String;")
    public String method303() {
        int var1 = this.field1092;
        while (this.field1091[this.field1092++] != 10) {
        }
        return new String(this.field1091, var1, this.field1092 - var1 - 1);
    }

    @OriginalMember(owner = "MLYYHULT", name = "e", descriptor = "(I)[B")
    public byte[] method304(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        int var2 = this.field1092;
        while (this.field1091[this.field1092++] != 10) {
        }
        byte[] var3 = new byte[this.field1092 - var2 - 1];
        for (int var4 = var2; var4 < this.field1092 - 1; var4++) {
            var3[var4 - var2] = this.field1091[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(II[BB)V")
    public void method305(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (this.field1073 != arg3) {
            this.field1088 = !this.field1088;
        }
        for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field1091[this.field1092++];
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "f", descriptor = "(I)V")
    public void method306(int arg0) {
        this.field1093 = this.field1092 * 8;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "d", descriptor = "(II)I")
    public int method307(int arg0, int arg1) {
        int var3 = this.field1093 >> 3;
        int var4 = 8 - (this.field1093 & 0x7);
        int var5 = 0;
        if (arg1 <= 0) {
            this.field1089 = !this.field1089;
        }
        this.field1093 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1091[var3++] & field1095[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1091[var3] & field1095[var4]) + var5;
        } else {
            var6 = (this.field1091[var3] >> var4 - arg0 & field1095[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(B)V")
    public void method308(byte arg0) {
        if (arg0 == -108) {
            this.field1092 = (this.field1093 + 7) / 8;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "j", descriptor = "()I")
    public int method309() {
        int var1 = this.field1091[this.field1092] & 0xFF;
        return var1 < 128 ? this.method296() - 64 : this.method298() - 49152;
    }

    @OriginalMember(owner = "MLYYHULT", name = "k", descriptor = "()I")
    public int method310() {
        int var1 = this.field1091[this.field1092] & 0xFF;
        return var1 < 128 ? this.method296() : this.method298() - 32768;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method311(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1092;
        this.field1092 = 0;
        byte[] var5 = new byte[var4];
        this.method305(var4, 0, var5, (byte) 119);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1092 = 0;
        this.method286(var8.length);
        if (arg0 >= 3 && arg0 <= 3) {
            this.method294(399, 0, var8, var8.length);
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(ZI)V")
    public void method312(boolean arg0, int arg1) {
        this.field1091[this.field1092++] = (byte) (arg1 + 128);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "e", descriptor = "(II)V")
    public void method313(int arg0, int arg1) {
        if (arg0 == 2) {
            this.field1091[this.field1092++] = (byte) -arg1;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "f", descriptor = "(II)V")
    public void method314(int arg0, int arg1) {
        this.field1091[this.field1092++] = (byte) (128 - arg1);
        while (arg0 >= 0) {
            this.field1074 = !this.field1074;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "g", descriptor = "(I)I")
    public int method315(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1076 = !this.field1076;
        }
        return this.field1091[this.field1092++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "MLYYHULT", name = "h", descriptor = "(I)I")
    public int method316(int arg0) {
        if (arg0 != 5715) {
            this.field1078 = -431;
        }
        return -this.field1091[this.field1092++] & 0xFF;
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(Z)I")
    public int method317(boolean arg0) {
        if (arg0) {
            this.field1074 = !this.field1074;
        }
        return 128 - this.field1091[this.field1092++] & 0xFF;
    }

    @OriginalMember(owner = "MLYYHULT", name = "c", descriptor = "(B)B")
    public byte method318(byte arg0) {
        if (this.field1080 != arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1091[this.field1092++] - 128);
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(Z)B")
    public byte method319(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1091[this.field1092++];
    }

    @OriginalMember(owner = "MLYYHULT", name = "c", descriptor = "(Z)B")
    public byte method320(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1091[this.field1092++]);
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(IB)V")
    public void method321(int arg0, byte arg1) {
        this.field1091[this.field1092++] = (byte) arg0;
        if (arg1 == 1) {
            this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "g", descriptor = "(II)V")
    public void method322(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1091[this.field1092++] = (byte) (arg0 >> 8);
        this.field1091[this.field1092++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "MLYYHULT", name = "b", descriptor = "(BI)V")
    public void method323(byte arg0, int arg1) {
        this.field1091[this.field1092++] = (byte) (arg1 + 128);
        this.field1091[this.field1092++] = (byte) (arg1 >> 8);
        if (this.field1082 != arg0) {
            this.field1078 = -169;
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "i", descriptor = "(I)I")
    public int method324(int arg0) {
        if (arg0 >= 0) {
            return this.field1077;
        } else {
            this.field1092 += 2;
            return ((this.field1091[this.field1092 - 1] & 0xFF) << 8) + (this.field1091[this.field1092 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "j", descriptor = "(I)I")
    public int method325(int arg0) {
        if (arg0 <= 0) {
            return 2;
        } else {
            this.field1092 += 2;
            return ((this.field1091[this.field1092 - 2] & 0xFF) << 8) + (this.field1091[this.field1092 - 1] - 128 & 0xFF);
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "k", descriptor = "(I)I")
    public int method326(int arg0) {
        this.field1092 += 2;
        return arg0 < 0 ? ((this.field1091[this.field1092 - 1] & 0xFF) << 8) + (this.field1091[this.field1092 - 2] - 128 & 0xFF) : 3;
    }

    @OriginalMember(owner = "MLYYHULT", name = "l", descriptor = "(I)I")
    public int method327(int arg0) {
        if (arg0 >= 0) {
            return 2;
        }
        this.field1092 += 2;
        int var2 = ((this.field1091[this.field1092 - 1] & 0xFF) << 8) + (this.field1091[this.field1092 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MLYYHULT", name = "d", descriptor = "(B)I")
    public int method328(byte arg0) {
        if (arg0 != -95) {
            return this.field1077;
        }
        this.field1092 += 2;
        int var2 = ((this.field1091[this.field1092 - 2] & 0xFF) << 8) + (this.field1091[this.field1092 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MLYYHULT", name = "m", descriptor = "(I)I")
    public int method329(int arg0) {
        if (arg0 != 0) {
            this.field1075 = -113;
        }
        this.field1092 += 2;
        int var2 = ((this.field1091[this.field1092 - 1] & 0xFF) << 8) + (this.field1091[this.field1092 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "MLYYHULT", name = "n", descriptor = "(I)I")
    public int method330(int arg0) {
        this.field1092 += 3;
        if (arg0 != 42287) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1091[this.field1092 - 1] & 0xFF) + ((this.field1091[this.field1092 - 2] & 0xFF) << 16) + ((this.field1091[this.field1092 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "MLYYHULT", name = "o", descriptor = "(I)I")
    public int method331(int arg0) {
        if (arg0 != -32869) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1092 += 4;
        return (this.field1091[this.field1092 - 4] & 0xFF) + ((this.field1091[this.field1092 - 3] & 0xFF) << 8) + ((this.field1091[this.field1092 - 1] & 0xFF) << 24) + ((this.field1091[this.field1092 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MLYYHULT", name = "p", descriptor = "(I)I")
    public int method332(int arg0) {
        this.field1092 += 4;
        if (arg0 <= 0) {
            this.field1081 = 365;
        }
        return (this.field1091[this.field1092 - 3] & 0xFF) + ((this.field1091[this.field1092 - 4] & 0xFF) << 8) + ((this.field1091[this.field1092 - 2] & 0xFF) << 24) + ((this.field1091[this.field1092 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MLYYHULT", name = "d", descriptor = "(Z)I")
    public int method333(boolean arg0) {
        this.field1092 += 4;
        if (arg0) {
            this.field1079 = !this.field1079;
        }
        return (this.field1091[this.field1092 - 2] & 0xFF) + ((this.field1091[this.field1092 - 1] & 0xFF) << 8) + ((this.field1091[this.field1092 - 3] & 0xFF) << 24) + ((this.field1091[this.field1092 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "([BIII)V")
    public void method334(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 4) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                this.field1091[this.field1092++] = (byte) (arg0[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "MLYYHULT", name = "a", descriptor = "(IB[BI)V")
    public void method335(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != -35) {
            this.field1079 = !this.field1079;
        }
        for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
            arg2[var5] = (byte) (this.field1091[this.field1092++] - 128);
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
            field1094[var0] = var1;
        }
        field1095 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1100 = new class72(708);
        field1101 = new class72(708);
        field1102 = new class72(708);
        field1103 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
