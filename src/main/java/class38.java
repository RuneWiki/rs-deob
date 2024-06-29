import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MVHXDWGI")
public class class38 extends class37 {

    @OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "I")
    private int field1142 = -641;

    @OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "Z")
    private boolean field1143 = true;

    @OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "I")
    private int field1144 = 8868;

    @OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "Z")
    private boolean field1145 = false;

    @OriginalMember(owner = "client!MVHXDWGI", name = "l", descriptor = "I")
    private int field1146 = -173;

    @OriginalMember(owner = "client!MVHXDWGI", name = "m", descriptor = "Z")
    private boolean field1147 = true;

    @OriginalMember(owner = "client!MVHXDWGI", name = "n", descriptor = "B")
    private byte field1148 = 87;

    @OriginalMember(owner = "client!MVHXDWGI", name = "o", descriptor = "B")
    private byte field1149 = 2;

    @OriginalMember(owner = "client!MVHXDWGI", name = "p", descriptor = "Z")
    private boolean field1150 = false;

    @OriginalMember(owner = "client!MVHXDWGI", name = "q", descriptor = "I")
    private int field1151 = 65;

    @OriginalMember(owner = "client!MVHXDWGI", name = "r", descriptor = "I")
    private int field1152 = 964;

    @OriginalMember(owner = "client!MVHXDWGI", name = "s", descriptor = "B")
    private byte field1153 = -114;

    @OriginalMember(owner = "client!MVHXDWGI", name = "t", descriptor = "Z")
    private boolean field1154 = true;

    @OriginalMember(owner = "client!MVHXDWGI", name = "u", descriptor = "I")
    private int field1155 = 2;

    @OriginalMember(owner = "client!MVHXDWGI", name = "v", descriptor = "I")
    private int field1156 = 34;

    @OriginalMember(owner = "client!MVHXDWGI", name = "w", descriptor = "I")
    private int field1157 = 270;

    @OriginalMember(owner = "client!MVHXDWGI", name = "z", descriptor = "[B")
    public byte[] field1160;

    @OriginalMember(owner = "client!MVHXDWGI", name = "A", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!MVHXDWGI", name = "C", descriptor = "[I")
    private static int[] field1163 = new int[256];

    @OriginalMember(owner = "client!MVHXDWGI", name = "D", descriptor = "[I")
    private static final int[] field1164;

    @OriginalMember(owner = "client!MVHXDWGI", name = "y", descriptor = "Z")
    private static boolean field1159;

    @OriginalMember(owner = "client!MVHXDWGI", name = "I", descriptor = "LIHMCQRZY;")
    private static class24 field1169;

    @OriginalMember(owner = "client!MVHXDWGI", name = "J", descriptor = "LIHMCQRZY;")
    private static class24 field1170;

    @OriginalMember(owner = "client!MVHXDWGI", name = "K", descriptor = "LIHMCQRZY;")
    private static class24 field1171;

    @OriginalMember(owner = "client!MVHXDWGI", name = "L", descriptor = "[C")
    private static char[] field1172;

    @OriginalMember(owner = "client!MVHXDWGI", name = "x", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client!MVHXDWGI", name = "B", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!MVHXDWGI", name = "F", descriptor = "I")
    private static int field1166;

    @OriginalMember(owner = "client!MVHXDWGI", name = "G", descriptor = "I")
    private static int field1167;

    @OriginalMember(owner = "client!MVHXDWGI", name = "H", descriptor = "I")
    private static int field1168;

    @OriginalMember(owner = "client!MVHXDWGI", name = "E", descriptor = "LQIAMMSTQ;")
    public class46 field1165;

    @OriginalMember(owner = "client!MVHXDWGI", name = "M", descriptor = "Z")
    public static boolean field1173;

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(BI)LMVHXDWGI;")
    public static class38 method345(byte arg0, int arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        class24 var3 = field1170;
        synchronized (field1170) {
            class38 var4 = null;
            if (arg1 == 0 && field1166 > 0) {
                field1166--;
                var4 = (class38) field1169.method245();
            } else if (arg1 == 1 && field1167 > 0) {
                field1167--;
                var4 = (class38) field1170.method245();
            } else if (arg1 == 2 && field1168 > 0) {
                field1168--;
                var4 = (class38) field1171.method245();
            }
            if (var4 != null) {
                var4.field1161 = 0;
                return var4;
            }
        }
        class38 var6 = new class38(774);
        var6.field1161 = 0;
        if (arg1 == 0) {
            var6.field1160 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1160 = new byte[5000];
        } else {
            var6.field1160 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "<init>", descriptor = "(I)V")
    private class38(int arg0) {
        if (arg0 <= 0) {
            this.field1142 = 324;
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "<init>", descriptor = "(I[B)V")
    public class38(int arg0, byte[] arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field1160 = arg1;
        this.field1161 = 0;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(IZ)V")
    public void method346(int arg0, boolean arg1) {
        if (arg1) {
            this.field1160[this.field1161++] = (byte) (arg0 + this.field1165.method483());
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(I)V")
    public void method347(int arg0) {
        this.field1160[this.field1161++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(I)V")
    public void method348(int arg0) {
        this.field1160[this.field1161++] = (byte) (arg0 >> 8);
        this.field1160[this.field1161++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(BI)V")
    public void method349(byte arg0, int arg1) {
        this.field1160[this.field1161++] = (byte) arg1;
        this.field1160[this.field1161++] = (byte) (arg1 >> 8);
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field1158 = 415;
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(I)V")
    public void method350(int arg0) {
        this.field1160[this.field1161++] = (byte) (arg0 >> 16);
        this.field1160[this.field1161++] = (byte) (arg0 >> 8);
        this.field1160[this.field1161++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(I)V")
    public void method351(int arg0) {
        this.field1160[this.field1161++] = (byte) (arg0 >> 24);
        this.field1160[this.field1161++] = (byte) (arg0 >> 16);
        this.field1160[this.field1161++] = (byte) (arg0 >> 8);
        this.field1160[this.field1161++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(IB)V")
    public void method352(int arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        }
        this.field1160[this.field1161++] = (byte) arg0;
        this.field1160[this.field1161++] = (byte) (arg0 >> 8);
        this.field1160[this.field1161++] = (byte) (arg0 >> 16);
        this.field1160[this.field1161++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(JI)V")
    public void method353(long arg0, int arg1) {
        this.field1160[this.field1161++] = (byte) (arg0 >> 56);
        this.field1160[this.field1161++] = (byte) (arg0 >> 48);
        this.field1160[this.field1161++] = (byte) (arg0 >> 40);
        this.field1160[this.field1161++] = (byte) (arg0 >> 32);
        this.field1160[this.field1161++] = (byte) (arg0 >> 24);
        this.field1160[this.field1161++] = (byte) (arg0 >> 16);
        this.field1160[this.field1161++] = (byte) (arg0 >> 8);
        this.field1160[this.field1161++] = (byte) arg0;
        if (arg1 < 2 || arg1 > 2) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method354(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1160, this.field1161);
        this.field1161 += arg0.length();
        this.field1160[this.field1161++] = 10;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(I[BII)V")
    public void method355(int arg0, byte[] arg1, int arg2, int arg3) {
        label25: while (true) {
            if (arg0 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label25;
                    }
                    var6++;
                }
            }
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                this.field1160[this.field1161++] = arg1[var5];
            }
            return;
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ZI)V")
    public void method356(boolean arg0, int arg1) {
        this.field1160[this.field1161 - arg1 - 1] = (byte) arg1;
        if (!arg0) {
            field1159 = true;
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "()I")
    public int method357() {
        return this.field1160[this.field1161++] & 0xFF;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "()B")
    public byte method358() {
        return this.field1160[this.field1161++];
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "()I")
    public int method359() {
        this.field1161 += 2;
        return ((this.field1160[this.field1161 - 2] & 0xFF) << 8) + (this.field1160[this.field1161 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "f", descriptor = "()I")
    public int method360() {
        this.field1161 += 2;
        int var1 = ((this.field1160[this.field1161 - 2] & 0xFF) << 8) + (this.field1160[this.field1161 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "g", descriptor = "()I")
    public int method361() {
        this.field1161 += 3;
        return (this.field1160[this.field1161 - 1] & 0xFF) + ((this.field1160[this.field1161 - 3] & 0xFF) << 16) + ((this.field1160[this.field1161 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "()I")
    public int method362() {
        this.field1161 += 4;
        return (this.field1160[this.field1161 - 1] & 0xFF) + ((this.field1160[this.field1161 - 2] & 0xFF) << 8) + ((this.field1160[this.field1161 - 4] & 0xFF) << 24) + ((this.field1160[this.field1161 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "(I)J")
    public long method363(int arg0) {
        long var2 = (long) this.method362() & 0xFFFFFFFFL;
        long var4 = (long) this.method362() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "()Ljava/lang/String;")
    public String method364() {
        int var1 = this.field1161;
        while (this.field1160[this.field1161++] != 10) {
        }
        return new String(this.field1160, var1, this.field1161 - var1 - 1);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(Z)[B")
    public byte[] method365(boolean arg0) {
        int var2 = this.field1161;
        if (!arg0) {
            throw new NullPointerException();
        }
        while (this.field1160[this.field1161++] != 10) {
        }
        byte[] var3 = new byte[this.field1161 - var2 - 1];
        for (int var4 = var2; var4 < this.field1161 - 1; var4++) {
            var3[var4 - var2] = this.field1160[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(I[BII)V")
    public void method366(int arg0, byte[] arg1, int arg2, int arg3) {
        if (this.field1144 != arg2) {
            this.field1158 = 427;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field1160[this.field1161++];
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "f", descriptor = "(I)V")
    public void method367(int arg0) {
        if (arg0 == 0) {
            this.field1162 = this.field1161 * 8;
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(II)I")
    public int method368(int arg0, int arg1) {
        int var3 = this.field1162 >> 3;
        int var4 = 8 - (this.field1162 & 0x7);
        int var5 = 0;
        if (arg0 < 1 || arg0 > 1) {
            return 2;
        }
        this.field1162 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1160[var3++] & field1164[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1160[var3] & field1164[var4]) + var5;
        } else {
            var6 = (this.field1160[var3] >> var4 - arg1 & field1164[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "g", descriptor = "(I)V")
    public void method369(int arg0) {
        if (arg0 != 49924) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1161 = (this.field1162 + 7) / 8;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "()I")
    public int method370() {
        int var1 = this.field1160[this.field1161] & 0xFF;
        return var1 < 128 ? this.method357() - 64 : this.method359() - 49152;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "()I")
    public int method371() {
        int var1 = this.field1160[this.field1161] & 0xFF;
        return var1 < 128 ? this.method357() : this.method359() - 32768;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method372(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1161;
        this.field1161 = 0;
        byte[] var5 = new byte[var4];
        this.method366(var4, var5, 8868, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1161 = 0;
        this.method347(var8.length);
        this.method355(-641, var8, var8.length, 0);
        if (arg0 != 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(BI)V")
    public void method373(byte arg0, int arg1) {
        if (arg0 == 6) {
            boolean var3 = false;
        } else {
            this.field1142 = 0;
        }
        this.field1160[this.field1161++] = (byte) -arg1;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(II)V")
    public void method374(int arg0, int arg1) {
        int var3 = 91 / arg0;
        this.field1160[this.field1161++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "h", descriptor = "(I)I")
    public int method375(int arg0) {
        int var2 = 49 / arg0;
        return this.field1160[this.field1161++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(Z)I")
    public int method376(boolean arg0) {
        return arg0 ? this.field1142 : -this.field1160[this.field1161++] & 0xFF;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(B)I")
    public int method377(byte arg0) {
        if (this.field1153 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field1160[this.field1161++] & 0xFF;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(Z)B")
    public byte method378(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field1160[this.field1161++];
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(B)B")
    public byte method379(byte arg0) {
        if (arg0 != 5) {
            this.field1157 = 287;
        }
        return (byte) (128 - this.field1160[this.field1161++]);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(BI)V")
    public void method380(byte arg0, int arg1) {
        this.field1160[this.field1161++] = (byte) arg1;
        if (arg0 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1160[this.field1161++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "b", descriptor = "(ZI)V")
    public void method381(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1160[this.field1161++] = (byte) (arg1 >> 8);
            this.field1160[this.field1161++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(II)V")
    public void method382(int arg0, int arg1) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1160[this.field1161++] = (byte) (arg1 + 128);
        this.field1160[this.field1161++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(Z)I")
    public int method383(boolean arg0) {
        if (arg0) {
            return 3;
        } else {
            this.field1161 += 2;
            return ((this.field1160[this.field1161 - 1] & 0xFF) << 8) + (this.field1160[this.field1161 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "i", descriptor = "(I)I")
    public int method384(int arg0) {
        this.field1161 += 2;
        if (arg0 != 3) {
            this.field1157 = -207;
        }
        return ((this.field1160[this.field1161 - 2] & 0xFF) << 8) + (this.field1160[this.field1161 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "j", descriptor = "(I)I")
    public int method385(int arg0) {
        this.field1161 += 2;
        if (arg0 != -20383) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1160[this.field1161 - 1] & 0xFF) << 8) + (this.field1160[this.field1161 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(B)I")
    public int method386(byte arg0) {
        if (arg0 != 47) {
            return this.field1144;
        }
        this.field1161 += 2;
        int var2 = ((this.field1160[this.field1161 - 1] & 0xFF) << 8) + (this.field1160[this.field1161 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "k", descriptor = "(I)I")
    public int method387(int arg0) {
        this.field1161 += 2;
        int var2 = ((this.field1160[this.field1161 - 2] & 0xFF) << 8) + (this.field1160[this.field1161 - 1] - 128 & 0xFF);
        if (arg0 != 16892) {
            this.field1150 = !this.field1150;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "d", descriptor = "(II)V")
    public void method388(int arg0, int arg1) {
        this.field1160[this.field1161++] = (byte) (arg1 >> 16);
        this.field1160[this.field1161++] = (byte) (arg1 >> 24);
        if (arg0 >= 0) {
            this.field1147 = !this.field1147;
        }
        this.field1160[this.field1161++] = (byte) arg1;
        this.field1160[this.field1161++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "l", descriptor = "(I)I")
    public int method389(int arg0) {
        int var2 = 55 / arg0;
        this.field1161 += 4;
        return (this.field1160[this.field1161 - 4] & 0xFF) + ((this.field1160[this.field1161 - 3] & 0xFF) << 8) + ((this.field1160[this.field1161 - 1] & 0xFF) << 24) + ((this.field1160[this.field1161 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "m", descriptor = "(I)I")
    public int method390(int arg0) {
        this.field1161 += 4;
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1160[this.field1161 - 3] & 0xFF) + ((this.field1160[this.field1161 - 4] & 0xFF) << 8) + ((this.field1160[this.field1161 - 2] & 0xFF) << 24) + ((this.field1160[this.field1161 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "e", descriptor = "(Z)I")
    public int method391(boolean arg0) {
        this.field1161 += 4;
        if (arg0) {
            this.field1147 = !this.field1147;
        }
        return (this.field1160[this.field1161 - 2] & 0xFF) + ((this.field1160[this.field1161 - 1] & 0xFF) << 8) + ((this.field1160[this.field1161 - 3] & 0xFF) << 24) + ((this.field1160[this.field1161 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "a", descriptor = "(ZII[B)V")
    public void method392(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1 + arg2 - 1; var6 >= arg1; var6--) {
            arg3[var6] = this.field1160[this.field1161++];
        }
    }

    @OriginalMember(owner = "client!MVHXDWGI", name = "c", descriptor = "(I[BII)V")
    public void method393(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 59 / arg3;
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            arg1[var6] = (byte) (this.field1160[this.field1161++] - 128);
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
            field1163[var0] = var1;
        }
        field1164 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1169 = new class24(field1159);
        field1170 = new class24(field1159);
        field1171 = new class24(field1159);
        field1172 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
