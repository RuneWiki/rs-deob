import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LBBVYYXO")
public class class32 extends class29 {

    @OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "Z")
    private boolean field1014 = true;

    @OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "B")
    private byte field1015 = 8;

    @OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "I")
    private int field1016 = -565;

    @OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "I")
    private int field1017 = -778;

    @OriginalMember(owner = "client!LBBVYYXO", name = "l", descriptor = "I")
    private int field1018 = 558;

    @OriginalMember(owner = "client!LBBVYYXO", name = "m", descriptor = "B")
    private byte field1019 = 0;

    @OriginalMember(owner = "client!LBBVYYXO", name = "n", descriptor = "B")
    private byte field1020 = 1;

    @OriginalMember(owner = "client!LBBVYYXO", name = "o", descriptor = "B")
    private byte field1021 = 2;

    @OriginalMember(owner = "client!LBBVYYXO", name = "p", descriptor = "I")
    private int field1022 = 1;

    @OriginalMember(owner = "client!LBBVYYXO", name = "q", descriptor = "Z")
    private boolean field1023 = false;

    @OriginalMember(owner = "client!LBBVYYXO", name = "r", descriptor = "I")
    private int field1024 = -324;

    @OriginalMember(owner = "client!LBBVYYXO", name = "s", descriptor = "I")
    private int field1025 = 5;

    @OriginalMember(owner = "client!LBBVYYXO", name = "t", descriptor = "I")
    private int field1026 = -308;

    @OriginalMember(owner = "client!LBBVYYXO", name = "u", descriptor = "Z")
    private boolean field1027 = true;

    @OriginalMember(owner = "client!LBBVYYXO", name = "v", descriptor = "I")
    private int field1028 = 3169;

    @OriginalMember(owner = "client!LBBVYYXO", name = "w", descriptor = "Z")
    private boolean field1029 = false;

    @OriginalMember(owner = "client!LBBVYYXO", name = "x", descriptor = "I")
    private int field1030 = 7;

    @OriginalMember(owner = "client!LBBVYYXO", name = "y", descriptor = "[B")
    public byte[] field1031;

    @OriginalMember(owner = "client!LBBVYYXO", name = "z", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!LBBVYYXO", name = "B", descriptor = "[I")
    private static int[] field1034 = new int[256];

    @OriginalMember(owner = "client!LBBVYYXO", name = "C", descriptor = "[I")
    private static final int[] field1035;

    @OriginalMember(owner = "client!LBBVYYXO", name = "H", descriptor = "LPACANLMY;")
    private static class42 field1040;

    @OriginalMember(owner = "client!LBBVYYXO", name = "I", descriptor = "LPACANLMY;")
    private static class42 field1041;

    @OriginalMember(owner = "client!LBBVYYXO", name = "J", descriptor = "LPACANLMY;")
    private static class42 field1042;

    @OriginalMember(owner = "client!LBBVYYXO", name = "K", descriptor = "[C")
    private static char[] field1043;

    @OriginalMember(owner = "client!LBBVYYXO", name = "A", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!LBBVYYXO", name = "E", descriptor = "I")
    private static int field1037;

    @OriginalMember(owner = "client!LBBVYYXO", name = "F", descriptor = "I")
    private static int field1038;

    @OriginalMember(owner = "client!LBBVYYXO", name = "G", descriptor = "I")
    private static int field1039;

    @OriginalMember(owner = "client!LBBVYYXO", name = "D", descriptor = "LNIUUCTKL;")
    public class36 field1036;

    @OriginalMember(owner = "client!LBBVYYXO", name = "L", descriptor = "Z")
    public static boolean field1044;

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(II)LLBBVYYXO;")
    public static class32 method357(int arg0, int arg1) {
        class42 var2 = field1041;
        synchronized (field1041) {
            class32 var3 = null;
            if (arg1 == 0 && field1037 > 0) {
                field1037--;
                var3 = (class32) field1040.method448();
            } else if (arg1 == 1 && field1038 > 0) {
                field1038--;
                var3 = (class32) field1041.method448();
            } else if (arg1 == 2 && field1039 > 0) {
                field1039--;
                var3 = (class32) field1042.method448();
            }
            if (var3 != null) {
                var3.field1032 = 0;
                return var3;
            }
        }
        class32 var5 = new class32(false);
        var5.field1032 = 0;
        if (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg1 == 0) {
            var5.field1031 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1031 = new byte[5000];
        } else {
            var5.field1031 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "<init>", descriptor = "(Z)V")
    private class32(boolean arg0) {
        if (arg0) {
            this.field1030 = -485;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "<init>", descriptor = "(B[B)V")
    public class32(byte arg0, byte[] arg1) {
        this.field1031 = arg1;
        this.field1032 = 0;
        if (arg0 != 114) {
            this.field1030 = 229;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(II)V")
    public void method358(int arg0, int arg1) {
        if (arg0 != 7793) {
            this.field1029 = !this.field1029;
        }
        this.field1031[this.field1032++] = (byte) (arg1 + this.field1036.method424());
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(I)V")
    public void method359(int arg0) {
        this.field1031[this.field1032++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(I)V")
    public void method360(int arg0) {
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(ZI)V")
    public void method361(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1014 = !this.field1014;
        }
        this.field1031[this.field1032++] = (byte) arg1;
        this.field1031[this.field1032++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(I)V")
    public void method362(int arg0) {
        this.field1031[this.field1032++] = (byte) (arg0 >> 16);
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(I)V")
    public void method363(int arg0) {
        this.field1031[this.field1032++] = (byte) (arg0 >> 24);
        this.field1031[this.field1032++] = (byte) (arg0 >> 16);
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(II)V")
    public void method364(int arg0, int arg1) {
        this.field1031[this.field1032++] = (byte) arg0;
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) (arg0 >> 16);
        if (arg1 >= 6 && arg1 <= 6) {
            this.field1031[this.field1032++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(JB)V")
    public void method365(long arg0, byte arg1) {
        this.field1031[this.field1032++] = (byte) (arg0 >> 56);
        if (arg1 != 56) {
            return;
        }
        this.field1031[this.field1032++] = (byte) (arg0 >> 48);
        this.field1031[this.field1032++] = (byte) (arg0 >> 40);
        this.field1031[this.field1032++] = (byte) (arg0 >> 32);
        this.field1031[this.field1032++] = (byte) (arg0 >> 24);
        this.field1031[this.field1032++] = (byte) (arg0 >> 16);
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method366(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1031, this.field1032);
        this.field1032 += arg0.length();
        this.field1031[this.field1032++] = 10;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(I[BII)V")
    public void method367(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != -21870) {
            this.field1030 = -315;
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            this.field1031[this.field1032++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(II)V")
    public void method368(int arg0, int arg1) {
        this.field1031[this.field1032 - arg0 - 1] = (byte) arg0;
        if (arg1 < 8 || arg1 > 8) {
            this.field1026 = 488;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "()I")
    public int method369() {
        return this.field1031[this.field1032++] & 0xFF;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "()B")
    public byte method370() {
        return this.field1031[this.field1032++];
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "()I")
    public int method371() {
        this.field1032 += 2;
        return ((this.field1031[this.field1032 - 2] & 0xFF) << 8) + (this.field1031[this.field1032 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "()I")
    public int method372() {
        this.field1032 += 2;
        int var1 = ((this.field1031[this.field1032 - 2] & 0xFF) << 8) + (this.field1031[this.field1032 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "()I")
    public int method373() {
        this.field1032 += 3;
        return (this.field1031[this.field1032 - 1] & 0xFF) + ((this.field1031[this.field1032 - 3] & 0xFF) << 16) + ((this.field1031[this.field1032 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "()I")
    public int method374() {
        this.field1032 += 4;
        return (this.field1031[this.field1032 - 1] & 0xFF) + ((this.field1031[this.field1032 - 2] & 0xFF) << 8) + ((this.field1031[this.field1032 - 4] & 0xFF) << 24) + ((this.field1031[this.field1032 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Z)J")
    public long method375(boolean arg0) {
        if (!arg0) {
            this.field1014 = !this.field1014;
        }
        long var2 = (long) this.method374() & 0xFFFFFFFFL;
        long var4 = (long) this.method374() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method376() {
        int var1 = this.field1032;
        while (this.field1031[this.field1032++] != 10) {
        }
        return new String(this.field1031, var1, this.field1032 - var1 - 1);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(B)[B")
    public byte[] method377(byte arg0) {
        int var2 = this.field1032;
        while (this.field1031[this.field1032++] != 10) {
        }
        byte[] var3 = new byte[this.field1032 - var2 - 1];
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        for (int var5 = var2; var5 < this.field1032 - 1; var5++) {
            var3[var5 - var2] = this.field1031[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "([BIII)V")
    public void method378(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 1 && arg1 <= 1) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                arg0[var5] = this.field1031[this.field1032++];
            }
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(I)V")
    public void method379(int arg0) {
        if (arg0 != -604) {
            this.field1025 = -122;
        }
        this.field1033 = this.field1032 * 8;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(IB)I")
    public int method380(int arg0, byte arg1) {
        int var3 = this.field1033 >> 3;
        int var4 = 8 - (this.field1033 & 0x7);
        int var5 = 0;
        this.field1033 += arg0;
        if (arg1 != -50) {
            this.field1014 = !this.field1014;
        }
        while (arg0 > var4) {
            var5 += (this.field1031[var3++] & field1035[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1031[var3] & field1035[var4]) + var5;
        } else {
            var6 = (this.field1031[var3] >> var4 - arg0 & field1035[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(Z)V")
    public void method381(boolean arg0) {
        this.field1032 = (this.field1033 + 7) / 8;
        if (!arg0) {
            this.field1014 = !this.field1014;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "()I")
    public int method382() {
        int var1 = this.field1031[this.field1032] & 0xFF;
        return var1 < 128 ? this.method369() - 64 : this.method371() - 49152;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "()I")
    public int method383() {
        int var1 = this.field1031[this.field1032] & 0xFF;
        return var1 < 128 ? this.method369() : this.method371() - 32768;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method384(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field1032;
        this.field1032 = 0;
        byte[] var5 = new byte[var4];
        this.method378(var5, 1, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1032 = 0;
        this.method359(var8.length);
        if (arg2) {
            this.field1030 = 206;
        }
        this.method367(0, var8, -21870, var8.length);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(II)V")
    public void method385(int arg0, int arg1) {
        this.field1031[this.field1032++] = (byte) -arg1;
        if (arg0 != 0) {
            this.field1029 = !this.field1029;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(II)V")
    public void method386(int arg0, int arg1) {
        this.field1031[this.field1032++] = (byte) (128 - arg0);
        if (arg1 < 4 || arg1 > 4) {
            this.field1027 = !this.field1027;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(B)I")
    public int method387(byte arg0) {
        return arg0 == 104 ? this.field1031[this.field1032++] - 128 & 0xFF : this.field1030;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(Z)I")
    public int method388(boolean arg0) {
        if (arg0) {
            this.field1027 = !this.field1027;
        }
        return -this.field1031[this.field1032++] & 0xFF;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(I)I")
    public int method389(int arg0) {
        if (arg0 != -13491) {
            this.field1028 = 448;
        }
        return 128 - this.field1031[this.field1032++] & 0xFF;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(Z)B")
    public byte method390(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1031[this.field1032++] - 128);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(B)B")
    public byte method391(byte arg0) {
        if (arg0 != 87) {
            throw new NullPointerException();
        }
        return (byte) -this.field1031[this.field1032++];
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(IZ)V")
    public void method392(int arg0, boolean arg1) {
        this.field1031[this.field1032++] = (byte) arg0;
        if (!arg1) {
            this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "b", descriptor = "(IB)V")
    public void method393(int arg0, byte arg1) {
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) (arg0 + 128);
        if (this.field1020 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "(II)V")
    public void method394(int arg0, int arg1) {
        this.field1031[this.field1032++] = (byte) (arg1 + 128);
        if (arg0 < 6 || arg0 > 6) {
            this.field1027 = !this.field1027;
        }
        this.field1031[this.field1032++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "d", descriptor = "(B)I")
    public int method395(byte arg0) {
        if (arg0 == 56) {
            this.field1032 += 2;
            return ((this.field1031[this.field1032 - 1] & 0xFF) << 8) + (this.field1031[this.field1032 - 2] & 0xFF);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "g", descriptor = "(I)I")
    public int method396(int arg0) {
        if (arg0 == -30785) {
            this.field1032 += 2;
            return ((this.field1031[this.field1032 - 2] & 0xFF) << 8) + (this.field1031[this.field1032 - 1] - 128 & 0xFF);
        } else {
            return this.field1018;
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(Z)I")
    public int method397(boolean arg0) {
        this.field1032 += 2;
        return arg0 ? ((this.field1031[this.field1032 - 1] & 0xFF) << 8) + (this.field1031[this.field1032 - 2] - 128 & 0xFF) : 4;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "h", descriptor = "(I)I")
    public int method398(int arg0) {
        if (arg0 != 0) {
            this.field1029 = !this.field1029;
        }
        this.field1032 += 2;
        int var2 = ((this.field1031[this.field1032 - 1] & 0xFF) << 8) + (this.field1031[this.field1032 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "e", descriptor = "(B)I")
    public int method399(byte arg0) {
        this.field1032 += 2;
        int var2 = ((this.field1031[this.field1032 - 2] & 0xFF) << 8) + (this.field1031[this.field1032 - 1] - 128 & 0xFF);
        if (arg0 != 1) {
            this.field1028 = 50;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "i", descriptor = "(I)I")
    public int method400(int arg0) {
        this.field1032 += 2;
        if (arg0 != 0) {
            return this.field1017;
        }
        int var2 = ((this.field1031[this.field1032 - 1] & 0xFF) << 8) + (this.field1031[this.field1032 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "c", descriptor = "(IB)V")
    public void method401(int arg0, byte arg1) {
        if (this.field1021 == arg1) {
            boolean var3 = false;
        } else {
            this.field1029 = !this.field1029;
        }
        this.field1031[this.field1032++] = (byte) arg0;
        this.field1031[this.field1032++] = (byte) (arg0 >> 8);
        this.field1031[this.field1032++] = (byte) (arg0 >> 16);
        this.field1031[this.field1032++] = (byte) (arg0 >> 24);
        if (class45.field1317) {
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "f", descriptor = "(Z)I")
    public int method402(boolean arg0) {
        if (!arg0) {
            this.field1029 = !this.field1029;
        }
        this.field1032 += 4;
        return (this.field1031[this.field1032 - 4] & 0xFF) + ((this.field1031[this.field1032 - 3] & 0xFF) << 8) + ((this.field1031[this.field1032 - 1] & 0xFF) << 24) + ((this.field1031[this.field1032 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "j", descriptor = "(I)I")
    public int method403(int arg0) {
        this.field1032 += 4;
        if (this.field1022 != arg0) {
            this.field1029 = !this.field1029;
        }
        return (this.field1031[this.field1032 - 3] & 0xFF) + ((this.field1031[this.field1032 - 4] & 0xFF) << 8) + ((this.field1031[this.field1032 - 2] & 0xFF) << 24) + ((this.field1031[this.field1032 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "k", descriptor = "(I)I")
    public int method404(int arg0) {
        if (arg0 <= 0) {
            this.field1014 = !this.field1014;
        }
        this.field1032 += 4;
        return (this.field1031[this.field1032 - 2] & 0xFF) + ((this.field1031[this.field1032 - 1] & 0xFF) << 8) + ((this.field1031[this.field1032 - 3] & 0xFF) << 24) + ((this.field1031[this.field1032 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(ZI[BI)V")
    public void method405(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            for (int var5 = arg1 + arg3 - 1; var5 >= arg1; var5--) {
                this.field1031[this.field1032++] = (byte) (arg2[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "client!LBBVYYXO", name = "a", descriptor = "(II[BZ)V")
    public void method406(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg0 + arg1 - 1; var5 >= arg1; var5--) {
                arg2[var5] = this.field1031[this.field1032++];
            }
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
            field1034[var0] = var1;
        }
        field1035 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1040 = new class42(0);
        field1041 = new class42(0);
        field1042 = new class42(0);
        field1043 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
