import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KHOMSBHW")
public class class30 extends class37 {

    @OriginalMember(owner = "KHOMSBHW", name = "h", descriptor = "B")
    private byte field1049 = -63;

    @OriginalMember(owner = "KHOMSBHW", name = "i", descriptor = "I")
    private int field1050 = 8;

    @OriginalMember(owner = "KHOMSBHW", name = "j", descriptor = "B")
    private byte field1051 = 105;

    @OriginalMember(owner = "KHOMSBHW", name = "k", descriptor = "Z")
    private boolean field1052 = false;

    @OriginalMember(owner = "KHOMSBHW", name = "l", descriptor = "I")
    private int field1053 = 5;

    @OriginalMember(owner = "KHOMSBHW", name = "m", descriptor = "I")
    private int field1054 = 4;

    @OriginalMember(owner = "KHOMSBHW", name = "n", descriptor = "I")
    private int field1055 = -719;

    @OriginalMember(owner = "KHOMSBHW", name = "p", descriptor = "B")
    private byte field1057 = 2;

    @OriginalMember(owner = "KHOMSBHW", name = "r", descriptor = "I")
    private int field1059 = -519;

    @OriginalMember(owner = "KHOMSBHW", name = "s", descriptor = "Z")
    private boolean field1060 = true;

    @OriginalMember(owner = "KHOMSBHW", name = "t", descriptor = "Z")
    private boolean field1061 = true;

    @OriginalMember(owner = "KHOMSBHW", name = "v", descriptor = "I")
    private int field1063 = 6;

    @OriginalMember(owner = "KHOMSBHW", name = "w", descriptor = "[B")
    public byte[] field1064;

    @OriginalMember(owner = "KHOMSBHW", name = "x", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "KHOMSBHW", name = "z", descriptor = "[I")
    private static int[] field1067 = new int[256];

    @OriginalMember(owner = "KHOMSBHW", name = "A", descriptor = "[I")
    private static final int[] field1068;

    @OriginalMember(owner = "KHOMSBHW", name = "F", descriptor = "LJQOEJEDB;")
    private static class25 field1073;

    @OriginalMember(owner = "KHOMSBHW", name = "G", descriptor = "LJQOEJEDB;")
    private static class25 field1074;

    @OriginalMember(owner = "KHOMSBHW", name = "H", descriptor = "LJQOEJEDB;")
    private static class25 field1075;

    @OriginalMember(owner = "KHOMSBHW", name = "I", descriptor = "[C")
    private static char[] field1076;

    @OriginalMember(owner = "KHOMSBHW", name = "o", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "KHOMSBHW", name = "q", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "KHOMSBHW", name = "y", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "KHOMSBHW", name = "C", descriptor = "I")
    private static int field1070;

    @OriginalMember(owner = "KHOMSBHW", name = "D", descriptor = "I")
    private static int field1071;

    @OriginalMember(owner = "KHOMSBHW", name = "E", descriptor = "I")
    private static int field1072;

    @OriginalMember(owner = "KHOMSBHW", name = "B", descriptor = "LSCSPFXGB;")
    public class53 field1069;

    @OriginalMember(owner = "KHOMSBHW", name = "u", descriptor = "Z")
    private static boolean field1062;

    @OriginalMember(owner = "KHOMSBHW", name = "J", descriptor = "Z")
    public static boolean field1077;

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(II)LKHOMSBHW;")
    public static class30 method337(int arg0, int arg1) {
        class25 var2 = field1074;
        synchronized (field1074) {
            class30 var3 = null;
            if (arg1 == 0 && field1070 > 0) {
                field1070--;
                var3 = (class30) field1073.method328();
            } else if (arg1 == 1 && field1071 > 0) {
                field1071--;
                var3 = (class30) field1074.method328();
            } else if (arg1 == 2 && field1072 > 0) {
                field1072--;
                var3 = (class30) field1075.method328();
            }
            if (var3 != null) {
                var3.field1065 = 0;
                return var3;
            }
        }
        class30 var5 = new class30(772);
        while (arg0 >= 0) {
            field1062 = !field1062;
        }
        var5.field1065 = 0;
        if (arg1 == 0) {
            var5.field1064 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1064 = new byte[5000];
        } else {
            var5.field1064 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "<init>", descriptor = "(I)V")
    private class30(int arg0) {
        int var2 = 60 / arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "<init>", descriptor = "([BI)V")
    public class30(byte[] arg0, int arg1) {
        this.field1064 = arg0;
        this.field1065 = 0;
        if (arg1 >= 0) {
            field1062 = !field1062;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(II)V")
    public void method338(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1058 = -126;
        }
        this.field1064[this.field1065++] = (byte) (arg1 + this.field1069.method526());
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(I)V")
    public void method339(int arg0) {
        this.field1064[this.field1065++] = (byte) arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(I)V")
    public void method340(int arg0) {
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        this.field1064[this.field1065++] = (byte) arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(IB)V")
    public void method341(int arg0, byte arg1) {
        this.field1064[this.field1065++] = (byte) arg0;
        if (this.field1049 == arg1) {
            this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "(I)V")
    public void method342(int arg0) {
        this.field1064[this.field1065++] = (byte) (arg0 >> 16);
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        this.field1064[this.field1065++] = (byte) arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "d", descriptor = "(I)V")
    public void method343(int arg0) {
        this.field1064[this.field1065++] = (byte) (arg0 >> 24);
        this.field1064[this.field1065++] = (byte) (arg0 >> 16);
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        this.field1064[this.field1065++] = (byte) arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "(II)V")
    public void method344(int arg0, int arg1) {
        this.field1064[this.field1065++] = (byte) arg0;
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        this.field1064[this.field1065++] = (byte) (arg0 >> 16);
        if (arg1 < this.field1050 || arg1 > this.field1050) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1064[this.field1065++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(JB)V")
    public void method345(long arg0, byte arg1) {
        this.field1064[this.field1065++] = (byte) (arg0 >> 56);
        this.field1064[this.field1065++] = (byte) (arg0 >> 48);
        this.field1064[this.field1065++] = (byte) (arg0 >> 40);
        this.field1064[this.field1065++] = (byte) (arg0 >> 32);
        this.field1064[this.field1065++] = (byte) (arg0 >> 24);
        this.field1064[this.field1065++] = (byte) (arg0 >> 16);
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        if (arg1 == 12) {
            this.field1064[this.field1065++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method346(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1064, this.field1065);
        this.field1065 += arg0.length();
        this.field1064[this.field1065++] = 10;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(II[BB)V")
    public void method347(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 == 105) {
            for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
                this.field1064[this.field1065++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(IB)V")
    public void method348(int arg0, byte arg1) {
        this.field1064[this.field1065 - arg0 - 1] = (byte) arg0;
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            field1062 = !field1062;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "()I")
    public int method349() {
        return this.field1064[this.field1065++] & 0xFF;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "d", descriptor = "()B")
    public byte method350() {
        return this.field1064[this.field1065++];
    }

    @OriginalMember(owner = "KHOMSBHW", name = "e", descriptor = "()I")
    public int method351() {
        this.field1065 += 2;
        return ((this.field1064[this.field1065 - 2] & 0xFF) << 8) + (this.field1064[this.field1065 - 1] & 0xFF);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "f", descriptor = "()I")
    public int method352() {
        this.field1065 += 2;
        int var1 = ((this.field1064[this.field1065 - 2] & 0xFF) << 8) + (this.field1064[this.field1065 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "g", descriptor = "()I")
    public int method353() {
        this.field1065 += 3;
        return (this.field1064[this.field1065 - 1] & 0xFF) + ((this.field1064[this.field1065 - 3] & 0xFF) << 16) + ((this.field1064[this.field1065 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "h", descriptor = "()I")
    public int method354() {
        this.field1065 += 4;
        return (this.field1064[this.field1065 - 1] & 0xFF) + ((this.field1064[this.field1065 - 2] & 0xFF) << 8) + ((this.field1064[this.field1065 - 4] & 0xFF) << 24) + ((this.field1064[this.field1065 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(Z)J")
    public long method355(boolean arg0) {
        long var2 = (long) this.method354() & 0xFFFFFFFFL;
        long var4 = (long) this.method354() & 0xFFFFFFFFL;
        if (!arg0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "i", descriptor = "()Ljava/lang/String;")
    public String method356() {
        int var1 = this.field1065;
        while (this.field1064[this.field1065++] != 10) {
        }
        return new String(this.field1064, var1, this.field1065 - var1 - 1);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "e", descriptor = "(I)[B")
    public byte[] method357(int arg0) {
        int var2 = this.field1065;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        while (this.field1064[this.field1065++] != 10) {
        }
        byte[] var3 = new byte[this.field1065 - var2 - 1];
        for (int var4 = var2; var4 < this.field1065 - 1; var4++) {
            var3[var4 - var2] = this.field1064[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(IZ[BI)V")
    public void method358(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            this.field1050 = -113;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg2[var5] = this.field1064[this.field1065++];
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(B)V")
    public void method359(byte arg0) {
        this.field1066 = this.field1065 * 8;
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(ZI)I")
    public int method360(boolean arg0, int arg1) {
        int var3 = this.field1066 >> 3;
        int var4 = 8 - (this.field1066 & 0x7);
        int var5 = 0;
        if (!arg0) {
            this.field1059 = -49;
        }
        this.field1066 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1064[var3++] & field1068[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1064[var3] & field1068[var4]) + var5;
        } else {
            var6 = (this.field1064[var3] >> var4 - arg1 & field1068[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(B)V")
    public void method361(byte arg0) {
        if (arg0 != 24) {
            this.field1059 = -235;
        }
        this.field1065 = (this.field1066 + 7) / 8;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "j", descriptor = "()I")
    public int method362() {
        int var1 = this.field1064[this.field1065] & 0xFF;
        return var1 < 128 ? this.method349() - 64 : this.method351() - 49152;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "k", descriptor = "()I")
    public int method363() {
        int var1 = this.field1064[this.field1065] & 0xFF;
        return var1 < 128 ? this.method349() : this.method351() - 32768;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method364(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field1065;
        this.field1065 = 0;
        if (arg1 != 1) {
            return;
        }
        byte[] var5 = new byte[var4];
        this.method358(var4, true, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1065 = 0;
        this.method339(var8.length);
        this.method347(var8.length, 0, var8, this.field1051);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "(IB)V")
    public void method365(int arg0, byte arg1) {
        this.field1064[this.field1065++] = (byte) (arg0 + 128);
        if (arg1 != 64) {
            this.field1061 = !this.field1061;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(IZ)V")
    public void method366(int arg0, boolean arg1) {
        if (arg1) {
            this.field1053 = -329;
        }
        this.field1064[this.field1065++] = (byte) -arg0;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "d", descriptor = "(II)V")
    public void method367(int arg0, int arg1) {
        this.field1064[this.field1065++] = (byte) (128 - arg0);
        if (arg1 != -34719) {
            this.field1063 = -346;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(Z)I")
    public int method368(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1064[this.field1065++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "f", descriptor = "(I)I")
    public int method369(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1064[this.field1065++] & 0xFF;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "g", descriptor = "(I)I")
    public int method370(int arg0) {
        while (arg0 >= 0) {
            this.field1063 = 68;
        }
        return 128 - this.field1064[this.field1065++] & 0xFF;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "(Z)B")
    public byte method371(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.field1064[this.field1065++] - 128);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "d", descriptor = "(Z)B")
    public byte method372(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1064[this.field1065++];
    }

    @OriginalMember(owner = "KHOMSBHW", name = "h", descriptor = "(I)B")
    public byte method373(int arg0) {
        if (arg0 != -40354) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.field1064[this.field1065++]);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "e", descriptor = "(II)V")
    public void method374(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1055 = 250;
        }
        this.field1064[this.field1065++] = (byte) arg1;
        this.field1064[this.field1065++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(IZ)V")
    public void method375(int arg0, boolean arg1) {
        this.field1064[this.field1065++] = (byte) (arg0 >> 8);
        this.field1064[this.field1065++] = (byte) (arg0 + 128);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "b", descriptor = "(ZI)V")
    public void method376(boolean arg0, int arg1) {
        if (arg0) {
            this.field1064[this.field1065++] = (byte) (arg1 + 128);
            this.field1064[this.field1065++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "c", descriptor = "(B)I")
    public int method377(byte arg0) {
        if (arg0 != 46) {
            this.field1063 = 15;
        }
        this.field1065 += 2;
        return ((this.field1064[this.field1065 - 1] & 0xFF) << 8) + (this.field1064[this.field1065 - 2] & 0xFF);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "d", descriptor = "(B)I")
    public int method378(byte arg0) {
        this.field1065 += 2;
        if (arg0 == 7) {
            boolean var2 = false;
            return ((this.field1064[this.field1065 - 2] & 0xFF) << 8) + (this.field1064[this.field1065 - 1] - 128 & 0xFF);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "e", descriptor = "(B)I")
    public int method379(byte arg0) {
        if (arg0 != -102) {
            this.field1050 = 186;
        }
        this.field1065 += 2;
        return ((this.field1064[this.field1065 - 1] & 0xFF) << 8) + (this.field1064[this.field1065 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "i", descriptor = "(I)I")
    public int method380(int arg0) {
        if (arg0 != 0) {
            return 4;
        }
        this.field1065 += 2;
        int var2 = ((this.field1064[this.field1065 - 1] & 0xFF) << 8) + (this.field1064[this.field1065 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "j", descriptor = "(I)I")
    public int method381(int arg0) {
        this.field1065 += 2;
        int var2 = ((this.field1064[this.field1065 - 2] & 0xFF) << 8) + (this.field1064[this.field1065 - 1] - 128 & 0xFF);
        if (arg0 >= 0) {
            return 2;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "k", descriptor = "(I)I")
    public int method382(int arg0) {
        if (arg0 >= 0) {
            return 2;
        }
        this.field1065 += 2;
        int var2 = ((this.field1064[this.field1065 - 1] & 0xFF) << 8) + (this.field1064[this.field1065 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "KHOMSBHW", name = "f", descriptor = "(II)V")
    public void method383(int arg0, int arg1) {
        if (arg0 > 0) {
            this.field1064[this.field1065++] = (byte) (arg1 >> 16);
            this.field1064[this.field1065++] = (byte) (arg1 >> 24);
            this.field1064[this.field1065++] = (byte) arg1;
            this.field1064[this.field1065++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "e", descriptor = "(Z)I")
    public int method384(boolean arg0) {
        this.field1065 += 4;
        return arg0 ? this.field1056 : (this.field1064[this.field1065 - 4] & 0xFF) + ((this.field1064[this.field1065 - 3] & 0xFF) << 8) + ((this.field1064[this.field1065 - 1] & 0xFF) << 24) + ((this.field1064[this.field1065 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "f", descriptor = "(Z)I")
    public int method385(boolean arg0) {
        if (arg0) {
            this.field1065 += 4;
            return (this.field1064[this.field1065 - 3] & 0xFF) + ((this.field1064[this.field1065 - 4] & 0xFF) << 8) + ((this.field1064[this.field1065 - 2] & 0xFF) << 24) + ((this.field1064[this.field1065 - 1] & 0xFF) << 16);
        } else {
            return this.field1059;
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "l", descriptor = "(I)I")
    public int method386(int arg0) {
        if (arg0 != -35940) {
            this.field1059 = -440;
        }
        this.field1065 += 4;
        return (this.field1064[this.field1065 - 2] & 0xFF) + ((this.field1064[this.field1065 - 1] & 0xFF) << 8) + ((this.field1064[this.field1065 - 3] & 0xFF) << 24) + ((this.field1064[this.field1065 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(I[BIZ)V")
    public void method387(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
                this.field1064[this.field1065++] = (byte) (arg1[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "([BIZI)V")
    public void method388(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                arg0[var5] = (byte) (this.field1064[this.field1065++] - 128);
            }
        }
    }

    @OriginalMember(owner = "KHOMSBHW", name = "a", descriptor = "(III[B)V")
    public void method389(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 == 0) {
            for (int var5 = arg0 + arg2 - 1; var5 >= arg2; var5--) {
                arg3[var5] = (byte) (this.field1064[this.field1065++] - 128);
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
            field1067[var0] = var1;
        }
        field1068 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1073 = new class25(3);
        field1074 = new class25(3);
        field1075 = new class25(3);
        field1076 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
