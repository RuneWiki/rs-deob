import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NQUAUMDT")
public class class36 extends class55 {

    @OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "Z")
    private boolean field1048 = true;

    @OriginalMember(owner = "client!NQUAUMDT", name = "l", descriptor = "I")
    private int field1050 = -818;

    @OriginalMember(owner = "client!NQUAUMDT", name = "m", descriptor = "I")
    private int field1051 = -10495;

    @OriginalMember(owner = "client!NQUAUMDT", name = "n", descriptor = "B")
    private byte field1052 = 65;

    @OriginalMember(owner = "client!NQUAUMDT", name = "o", descriptor = "Z")
    private boolean field1053 = false;

    @OriginalMember(owner = "client!NQUAUMDT", name = "p", descriptor = "I")
    private int field1054 = 6;

    @OriginalMember(owner = "client!NQUAUMDT", name = "q", descriptor = "Z")
    private boolean field1055 = false;

    @OriginalMember(owner = "client!NQUAUMDT", name = "r", descriptor = "I")
    private int field1056 = 32446;

    @OriginalMember(owner = "client!NQUAUMDT", name = "s", descriptor = "B")
    private byte field1057 = 3;

    @OriginalMember(owner = "client!NQUAUMDT", name = "t", descriptor = "I")
    private int field1058 = 22251;

    @OriginalMember(owner = "client!NQUAUMDT", name = "u", descriptor = "B")
    private byte field1059 = -60;

    @OriginalMember(owner = "client!NQUAUMDT", name = "v", descriptor = "Z")
    private boolean field1060 = false;

    @OriginalMember(owner = "client!NQUAUMDT", name = "w", descriptor = "B")
    private byte field1061 = -94;

    @OriginalMember(owner = "client!NQUAUMDT", name = "y", descriptor = "I")
    private int field1063 = -962;

    @OriginalMember(owner = "client!NQUAUMDT", name = "z", descriptor = "B")
    private byte field1064 = -92;

    @OriginalMember(owner = "client!NQUAUMDT", name = "A", descriptor = "B")
    private byte field1065 = 6;

    @OriginalMember(owner = "client!NQUAUMDT", name = "B", descriptor = "I")
    private int field1066 = 174;

    @OriginalMember(owner = "client!NQUAUMDT", name = "C", descriptor = "I")
    private int field1067 = -529;

    @OriginalMember(owner = "client!NQUAUMDT", name = "E", descriptor = "Z")
    private boolean field1069 = false;

    @OriginalMember(owner = "client!NQUAUMDT", name = "G", descriptor = "[B")
    public byte[] field1071;

    @OriginalMember(owner = "client!NQUAUMDT", name = "H", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "B")
    private static byte field1049 = -6;

    @OriginalMember(owner = "client!NQUAUMDT", name = "J", descriptor = "[I")
    private static int[] field1074 = new int[256];

    @OriginalMember(owner = "client!NQUAUMDT", name = "K", descriptor = "[I")
    private static final int[] field1075;

    @OriginalMember(owner = "client!NQUAUMDT", name = "P", descriptor = "LFYVRCFGT;")
    private static class16 field1080;

    @OriginalMember(owner = "client!NQUAUMDT", name = "Q", descriptor = "LFYVRCFGT;")
    private static class16 field1081;

    @OriginalMember(owner = "client!NQUAUMDT", name = "R", descriptor = "LFYVRCFGT;")
    private static class16 field1082;

    @OriginalMember(owner = "client!NQUAUMDT", name = "S", descriptor = "[C")
    private static char[] field1083;

    @OriginalMember(owner = "client!NQUAUMDT", name = "x", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client!NQUAUMDT", name = "D", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!NQUAUMDT", name = "F", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!NQUAUMDT", name = "I", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!NQUAUMDT", name = "M", descriptor = "I")
    private static int field1077;

    @OriginalMember(owner = "client!NQUAUMDT", name = "N", descriptor = "I")
    private static int field1078;

    @OriginalMember(owner = "client!NQUAUMDT", name = "O", descriptor = "I")
    private static int field1079;

    @OriginalMember(owner = "client!NQUAUMDT", name = "L", descriptor = "LKAZZDHJI;")
    public class24 field1076;

    @OriginalMember(owner = "client!NQUAUMDT", name = "T", descriptor = "Z")
    public static boolean field1084;

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(II)LNQUAUMDT;")
    public static class36 method327(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class16 var3 = field1081;
        synchronized (field1081) {
            class36 var4 = null;
            if (arg0 == 0 && field1077 > 0) {
                field1077--;
                var4 = (class36) field1080.method199();
            } else if (arg0 == 1 && field1078 > 0) {
                field1078--;
                var4 = (class36) field1081.method199();
            } else if (arg0 == 2 && field1079 > 0) {
                field1079--;
                var4 = (class36) field1082.method199();
            }
            if (var4 != null) {
                var4.field1072 = 0;
                return var4;
            }
        }
        class36 var6 = new class36(field1049);
        var6.field1072 = 0;
        if (arg0 == 0) {
            var6.field1071 = new byte[100];
        } else if (arg0 == 1) {
            var6.field1071 = new byte[5000];
        } else {
            var6.field1071 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "<init>", descriptor = "(B)V")
    private class36(byte arg0) {
        if (arg0 != -6) {
            this.field1069 = !this.field1069;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "<init>", descriptor = "(I[B)V")
    public class36(int arg0, byte[] arg1) {
        this.field1071 = arg1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1072 = 0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(II)V")
    public void method328(int arg0, int arg1) {
        this.field1071[this.field1072++] = (byte) (arg1 + this.field1076.method241());
        while (arg0 >= 0) {
            this.field1070 = -454;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(I)V")
    public void method329(int arg0) {
        this.field1071[this.field1072++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(I)V")
    public void method330(int arg0) {
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        this.field1071[this.field1072++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(IZ)V")
    public void method331(int arg0, boolean arg1) {
        this.field1071[this.field1072++] = (byte) arg0;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(I)V")
    public void method332(int arg0) {
        this.field1071[this.field1072++] = (byte) (arg0 >> 16);
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        this.field1071[this.field1072++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(I)V")
    public void method333(int arg0) {
        this.field1071[this.field1072++] = (byte) (arg0 >> 24);
        this.field1071[this.field1072++] = (byte) (arg0 >> 16);
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        this.field1071[this.field1072++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(IB)V")
    public void method334(int arg0, byte arg1) {
        this.field1071[this.field1072++] = (byte) arg0;
        if (arg1 == 11) {
            this.field1071[this.field1072++] = (byte) (arg0 >> 8);
            this.field1071[this.field1072++] = (byte) (arg0 >> 16);
            this.field1071[this.field1072++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(JZ)V")
    public void method335(long arg0, boolean arg1) {
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1071[this.field1072++] = (byte) (arg0 >> 56);
        this.field1071[this.field1072++] = (byte) (arg0 >> 48);
        this.field1071[this.field1072++] = (byte) (arg0 >> 40);
        this.field1071[this.field1072++] = (byte) (arg0 >> 32);
        this.field1071[this.field1072++] = (byte) (arg0 >> 24);
        this.field1071[this.field1072++] = (byte) (arg0 >> 16);
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        this.field1071[this.field1072++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method336(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1071, this.field1072);
        this.field1072 += arg0.length();
        this.field1071[this.field1072++] = 10;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "([BIII)V")
    public void method337(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1051 != arg3) {
            this.field1048 = !this.field1048;
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            this.field1071[this.field1072++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(II)V")
    public void method338(int arg0, int arg1) {
        this.field1071[this.field1072 - arg1 - 1] = (byte) arg1;
        if (arg0 == -13105) {
            ;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "()I")
    public int method339() {
        return this.field1071[this.field1072++] & 0xFF;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "()B")
    public byte method340() {
        return this.field1071[this.field1072++];
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "()I")
    public int method341() {
        this.field1072 += 2;
        return ((this.field1071[this.field1072 - 2] & 0xFF) << 8) + (this.field1071[this.field1072 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "()I")
    public int method342() {
        this.field1072 += 2;
        int var1 = ((this.field1071[this.field1072 - 2] & 0xFF) << 8) + (this.field1071[this.field1072 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "()I")
    public int method343() {
        this.field1072 += 3;
        return (this.field1071[this.field1072 - 1] & 0xFF) + ((this.field1071[this.field1072 - 3] & 0xFF) << 16) + ((this.field1071[this.field1072 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "h", descriptor = "()I")
    public int method344() {
        this.field1072 += 4;
        return (this.field1071[this.field1072 - 1] & 0xFF) + ((this.field1071[this.field1072 - 2] & 0xFF) << 8) + ((this.field1071[this.field1072 - 4] & 0xFF) << 24) + ((this.field1071[this.field1072 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Z)J")
    public long method345(boolean arg0) {
        long var2 = (long) this.method344() & 0xFFFFFFFFL;
        long var4 = (long) this.method344() & 0xFFFFFFFFL;
        if (arg0) {
            this.field1050 = 255;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "i", descriptor = "()Ljava/lang/String;")
    public String method346() {
        int var1 = this.field1072;
        while (this.field1071[this.field1072++] != 10) {
        }
        return new String(this.field1071, var1, this.field1072 - var1 - 1);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(I)[B")
    public byte[] method347(int arg0) {
        int var2 = this.field1072;
        if (arg0 != 0) {
            this.field1053 = !this.field1053;
        }
        while (this.field1071[this.field1072++] != 10) {
        }
        byte[] var3 = new byte[this.field1072 - var2 - 1];
        for (int var4 = var2; var4 < this.field1072 - 1; var4++) {
            var3[var4 - var2] = this.field1071[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(I[BII)V")
    public void method348(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 99 / arg3;
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            arg1[var6] = this.field1071[this.field1072++];
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(I)V")
    public void method349(int arg0) {
        if (arg0 != -31487) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1073 = this.field1072 * 8;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(II)I")
    public int method350(int arg0, int arg1) {
        int var3 = this.field1073 >> 3;
        int var4 = 8 - (this.field1073 & 0x7);
        int var5 = 0;
        this.field1073 += arg1;
        int var6 = 43 / arg0;
        while (arg1 > var4) {
            var5 += (this.field1071[var3++] & field1075[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field1071[var3] & field1075[var4]) + var5;
        } else {
            var7 = (this.field1071[var3] >> var4 - arg1 & field1075[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "(I)V")
    public void method351(int arg0) {
        int var2 = 37 / arg0;
        this.field1072 = (this.field1073 + 7) / 8;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "()I")
    public int method352() {
        int var1 = this.field1071[this.field1072] & 0xFF;
        return var1 < 128 ? this.method339() - 64 : this.method341() - 49152;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "()I")
    public int method353() {
        int var1 = this.field1071[this.field1072] & 0xFF;
        return var1 < 128 ? this.method339() : this.method341() - 32768;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method354(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field1072;
        this.field1072 = 0;
        byte[] var5 = new byte[var4];
        this.method348(0, var5, var4, 520);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        while (arg1 >= 0) {
            this.field1056 = 254;
        }
        this.field1072 = 0;
        this.method329(var8.length);
        this.method337(var8, var8.length, 0, -10495);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(BI)V")
    public void method355(byte arg0, int arg1) {
        this.field1071[this.field1072++] = (byte) (arg1 + 128);
        if (arg0 == 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(II)V")
    public void method356(int arg0, int arg1) {
        this.field1071[this.field1072++] = (byte) (128 - arg0);
        if (arg1 != 38949) {
            this.field1069 = !this.field1069;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(B)I")
    public int method357(byte arg0) {
        return arg0 == 99 ? this.field1071[this.field1072++] - 128 & 0xFF : this.field1058;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "h", descriptor = "(I)I")
    public int method358(int arg0) {
        return arg0 == 0 ? -this.field1071[this.field1072++] & 0xFF : this.field1070;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "i", descriptor = "(I)I")
    public int method359(int arg0) {
        return arg0 <= 0 ? this.field1051 : 128 - this.field1071[this.field1072++] & 0xFF;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "j", descriptor = "(I)B")
    public byte method360(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1071[this.field1072++] - 128);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(B)B")
    public byte method361(byte arg0) {
        if (this.field1061 != arg0) {
            this.field1060 = !this.field1060;
        }
        return (byte) -this.field1071[this.field1072++];
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(Z)B")
    public byte method362(boolean arg0) {
        if (!arg0) {
            this.field1051 = -167;
        }
        return (byte) (128 - this.field1071[this.field1072++]);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "(IZ)V")
    public void method363(int arg0, boolean arg1) {
        if (arg1) {
            this.field1071[this.field1072++] = (byte) arg0;
            this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(IZ)V")
    public void method364(int arg0, boolean arg1) {
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field1071[this.field1072++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(II)V")
    public void method365(int arg0, int arg1) {
        this.field1071[this.field1072++] = (byte) (arg0 + 128);
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        if (arg1 != 0) {
            this.field1055 = !this.field1055;
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(B)I")
    public int method366(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field1060 = !this.field1060;
        }
        this.field1072 += 2;
        return ((this.field1071[this.field1072 - 1] & 0xFF) << 8) + (this.field1071[this.field1072 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "k", descriptor = "(I)I")
    public int method367(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1072 += 2;
        return ((this.field1071[this.field1072 - 2] & 0xFF) << 8) + (this.field1071[this.field1072 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "d", descriptor = "(B)I")
    public int method368(byte arg0) {
        this.field1072 += 2;
        if (arg0 != -123) {
            this.field1056 = -94;
        }
        return ((this.field1071[this.field1072 - 1] & 0xFF) << 8) + (this.field1071[this.field1072 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "e", descriptor = "(B)I")
    public int method369(byte arg0) {
        if (arg0 != 115) {
            return this.field1070;
        }
        this.field1072 += 2;
        int var2 = ((this.field1071[this.field1072 - 1] & 0xFF) << 8) + (this.field1071[this.field1072 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "l", descriptor = "(I)I")
    public int method370(int arg0) {
        if (arg0 != 43327) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1072 += 2;
        int var3 = ((this.field1071[this.field1072 - 1] & 0xFF) << 8) + (this.field1071[this.field1072 - 2] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "c", descriptor = "(Z)I")
    public int method371(boolean arg0) {
        this.field1072 += 3;
        return arg0 ? (this.field1071[this.field1072 - 2] & 0xFF) + ((this.field1071[this.field1072 - 3] & 0xFF) << 16) + ((this.field1071[this.field1072 - 1] & 0xFF) << 8) : this.field1056;
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "g", descriptor = "(II)V")
    public void method372(int arg0, int arg1) {
        if (arg1 != 49978) {
            this.field1050 = 79;
        }
        this.field1071[this.field1072++] = (byte) arg0;
        this.field1071[this.field1072++] = (byte) (arg0 >> 8);
        this.field1071[this.field1072++] = (byte) (arg0 >> 16);
        this.field1071[this.field1072++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "f", descriptor = "(B)I")
    public int method373(byte arg0) {
        this.field1072 += 4;
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field1050 = -389;
        }
        return (this.field1071[this.field1072 - 4] & 0xFF) + ((this.field1071[this.field1072 - 3] & 0xFF) << 8) + ((this.field1071[this.field1072 - 1] & 0xFF) << 24) + ((this.field1071[this.field1072 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "m", descriptor = "(I)I")
    public int method374(int arg0) {
        if (arg0 != 15285) {
            this.field1062 = 242;
        }
        this.field1072 += 4;
        return (this.field1071[this.field1072 - 3] & 0xFF) + ((this.field1071[this.field1072 - 4] & 0xFF) << 8) + ((this.field1071[this.field1072 - 2] & 0xFF) << 24) + ((this.field1071[this.field1072 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "n", descriptor = "(I)I")
    public int method375(int arg0) {
        this.field1072 += 4;
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1071[this.field1072 - 2] & 0xFF) + ((this.field1071[this.field1072 - 1] & 0xFF) << 8) + ((this.field1071[this.field1072 - 3] & 0xFF) << 24) + ((this.field1071[this.field1072 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "a", descriptor = "(BI[BI)V")
    public void method376(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 5) {
            boolean var5 = false;
        } else {
            this.field1060 = !this.field1060;
        }
        for (int var6 = arg3; var6 < arg1 + arg3; var6++) {
            this.field1071[this.field1072++] = (byte) (arg2[var6] + 128);
        }
    }

    @OriginalMember(owner = "client!NQUAUMDT", name = "b", descriptor = "([BIII)V")
    public void method377(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field1068 = 262;
        }
        for (int var5 = arg1 + arg3 - 1; var5 >= arg3; var5--) {
            arg0[var5] = this.field1071[this.field1072++];
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
            field1074[var0] = var1;
        }
        field1075 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1080 = new class16(true);
        field1081 = new class16(true);
        field1082 = new class16(true);
        field1083 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
