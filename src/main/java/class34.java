import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LDILQFVA")
public class class34 extends class30 {

    @OriginalMember(owner = "LDILQFVA", name = "i", descriptor = "I")
    private int field1058 = -969;

    @OriginalMember(owner = "LDILQFVA", name = "k", descriptor = "I")
    private int field1060 = 49272;

    @OriginalMember(owner = "LDILQFVA", name = "l", descriptor = "B")
    private byte field1061 = 5;

    @OriginalMember(owner = "LDILQFVA", name = "m", descriptor = "I")
    private int field1062 = 5;

    @OriginalMember(owner = "LDILQFVA", name = "n", descriptor = "B")
    private byte field1063 = 85;

    @OriginalMember(owner = "LDILQFVA", name = "o", descriptor = "I")
    private int field1064 = 2;

    @OriginalMember(owner = "LDILQFVA", name = "p", descriptor = "I")
    private int field1065 = 185;

    @OriginalMember(owner = "LDILQFVA", name = "q", descriptor = "Z")
    private boolean field1066 = false;

    @OriginalMember(owner = "LDILQFVA", name = "r", descriptor = "I")
    private int field1067 = 603;

    @OriginalMember(owner = "LDILQFVA", name = "s", descriptor = "Z")
    private boolean field1068 = false;

    @OriginalMember(owner = "LDILQFVA", name = "t", descriptor = "Z")
    private boolean field1069 = true;

    @OriginalMember(owner = "LDILQFVA", name = "u", descriptor = "Z")
    private boolean field1070 = false;

    @OriginalMember(owner = "LDILQFVA", name = "v", descriptor = "Z")
    private boolean field1071 = true;

    @OriginalMember(owner = "LDILQFVA", name = "w", descriptor = "[B")
    public byte[] field1072;

    @OriginalMember(owner = "LDILQFVA", name = "x", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "LDILQFVA", name = "z", descriptor = "[I")
    private static int[] field1075 = new int[256];

    @OriginalMember(owner = "LDILQFVA", name = "A", descriptor = "[I")
    private static final int[] field1076;

    @OriginalMember(owner = "LDILQFVA", name = "F", descriptor = "LLOISKKJJ;")
    private static class36 field1081;

    @OriginalMember(owner = "LDILQFVA", name = "G", descriptor = "LLOISKKJJ;")
    private static class36 field1082;

    @OriginalMember(owner = "LDILQFVA", name = "H", descriptor = "LLOISKKJJ;")
    private static class36 field1083;

    @OriginalMember(owner = "LDILQFVA", name = "I", descriptor = "[C")
    private static char[] field1084;

    @OriginalMember(owner = "LDILQFVA", name = "j", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "LDILQFVA", name = "y", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "LDILQFVA", name = "C", descriptor = "I")
    private static int field1078;

    @OriginalMember(owner = "LDILQFVA", name = "D", descriptor = "I")
    private static int field1079;

    @OriginalMember(owner = "LDILQFVA", name = "E", descriptor = "I")
    private static int field1080;

    @OriginalMember(owner = "LDILQFVA", name = "B", descriptor = "LKUQMNLGP;")
    public class33 field1077;

    @OriginalMember(owner = "LDILQFVA", name = "J", descriptor = "Z")
    public static boolean field1085;

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(II)LLDILQFVA;")
    public static class34 method390(int arg0, int arg1) {
        if (arg1 != 35998) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class36 var3 = field1082;
        synchronized (field1082) {
            class34 var4 = null;
            if (arg0 == 0 && field1078 > 0) {
                field1078--;
                var4 = (class34) field1081.method450();
            } else if (arg0 == 1 && field1079 > 0) {
                field1079--;
                var4 = (class34) field1082.method450();
            } else if (arg0 == 2 && field1080 > 0) {
                field1080--;
                var4 = (class34) field1083.method450();
            }
            if (var4 != null) {
                var4.field1073 = 0;
                return var4;
            }
        }
        class34 var6 = new class34(-225);
        var6.field1073 = 0;
        if (arg0 == 0) {
            var6.field1072 = new byte[100];
        } else if (arg0 == 1) {
            var6.field1072 = new byte[5000];
        } else {
            var6.field1072 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "LDILQFVA", name = "<init>", descriptor = "(I)V")
    private class34(int arg0) {
        while (arg0 >= 0) {
            this.field1058 = 466;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "<init>", descriptor = "([BI)V")
    public class34(byte[] arg0, int arg1) {
        this.field1072 = arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1073 = 0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(II)V")
    public void method391(int arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1072[this.field1073++] = (byte) (arg0 + this.field1077.method387());
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(I)V")
    public void method392(int arg0) {
        this.field1072[this.field1073++] = (byte) arg0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(I)V")
    public void method393(int arg0) {
        this.field1072[this.field1073++] = (byte) (arg0 >> 8);
        this.field1072[this.field1073++] = (byte) arg0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "(II)V")
    public void method394(int arg0, int arg1) {
        this.field1072[this.field1073++] = (byte) arg0;
        if (this.field1060 == arg1) {
            this.field1072[this.field1073++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "(I)V")
    public void method395(int arg0) {
        this.field1072[this.field1073++] = (byte) (arg0 >> 16);
        this.field1072[this.field1073++] = (byte) (arg0 >> 8);
        this.field1072[this.field1073++] = (byte) arg0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "d", descriptor = "(I)V")
    public void method396(int arg0) {
        this.field1072[this.field1073++] = (byte) (arg0 >> 24);
        this.field1072[this.field1073++] = (byte) (arg0 >> 16);
        this.field1072[this.field1073++] = (byte) (arg0 >> 8);
        this.field1072[this.field1073++] = (byte) arg0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "d", descriptor = "(II)V")
    public void method397(int arg0, int arg1) {
        this.field1072[this.field1073++] = (byte) arg1;
        this.field1072[this.field1073++] = (byte) (arg1 >> 8);
        this.field1072[this.field1073++] = (byte) (arg1 >> 16);
        this.field1072[this.field1073++] = (byte) (arg1 >> 24);
        while (arg0 >= 0) {
            this.field1060 = 101;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(ZJ)V")
    public void method398(boolean arg0, long arg1) {
        this.field1072[this.field1073++] = (byte) (arg1 >> 56);
        this.field1072[this.field1073++] = (byte) (arg1 >> 48);
        this.field1072[this.field1073++] = (byte) (arg1 >> 40);
        this.field1072[this.field1073++] = (byte) (arg1 >> 32);
        this.field1072[this.field1073++] = (byte) (arg1 >> 24);
        this.field1072[this.field1073++] = (byte) (arg1 >> 16);
        this.field1072[this.field1073++] = (byte) (arg1 >> 8);
        this.field1072[this.field1073++] = (byte) arg1;
        if (!arg0) {
            this.field1069 = !this.field1069;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method399(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1072, this.field1073);
        this.field1073 += arg0.length();
        this.field1072[this.field1073++] = 10;
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(IB[BI)V")
    public void method400(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 != 48) {
            this.field1059 = 330;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            this.field1072[this.field1073++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(ZI)V")
    public void method401(boolean arg0, int arg1) {
        this.field1072[this.field1073 - arg1 - 1] = (byte) arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "()I")
    public int method402() {
        return this.field1072[this.field1073++] & 0xFF;
    }

    @OriginalMember(owner = "LDILQFVA", name = "d", descriptor = "()B")
    public byte method403() {
        return this.field1072[this.field1073++];
    }

    @OriginalMember(owner = "LDILQFVA", name = "e", descriptor = "()I")
    public int method404() {
        this.field1073 += 2;
        return ((this.field1072[this.field1073 - 2] & 0xFF) << 8) + (this.field1072[this.field1073 - 1] & 0xFF);
    }

    @OriginalMember(owner = "LDILQFVA", name = "f", descriptor = "()I")
    public int method405() {
        this.field1073 += 2;
        int var1 = ((this.field1072[this.field1073 - 2] & 0xFF) << 8) + (this.field1072[this.field1073 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "LDILQFVA", name = "g", descriptor = "()I")
    public int method406() {
        this.field1073 += 3;
        return (this.field1072[this.field1073 - 1] & 0xFF) + ((this.field1072[this.field1073 - 3] & 0xFF) << 16) + ((this.field1072[this.field1073 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "LDILQFVA", name = "h", descriptor = "()I")
    public int method407() {
        this.field1073 += 4;
        return (this.field1072[this.field1073 - 1] & 0xFF) + ((this.field1072[this.field1073 - 2] & 0xFF) << 8) + ((this.field1072[this.field1073 - 4] & 0xFF) << 24) + ((this.field1072[this.field1073 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "LDILQFVA", name = "e", descriptor = "(I)J")
    public long method408(int arg0) {
        long var2 = (long) this.method407() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            this.field1059 = -365;
        }
        long var4 = (long) this.method407() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "LDILQFVA", name = "i", descriptor = "()Ljava/lang/String;")
    public String method409() {
        int var1 = this.field1073;
        while (this.field1072[this.field1073++] != 10) {
        }
        return new String(this.field1072, var1, this.field1073 - var1 - 1);
    }

    @OriginalMember(owner = "LDILQFVA", name = "f", descriptor = "(I)[B")
    public byte[] method410(int arg0) {
        int var2 = this.field1073;
        if (arg0 != -34454) {
            throw new NullPointerException();
        }
        while (this.field1072[this.field1073++] != 10) {
        }
        byte[] var3 = new byte[this.field1073 - var2 - 1];
        for (int var4 = var2; var4 < this.field1073 - 1; var4++) {
            var3[var4 - var2] = this.field1072[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(IB[BI)V")
    public void method411(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 == 0) {
            boolean var5 = false;
            for (int var6 = arg3; var6 < arg0 + arg3; var6++) {
                arg2[var6] = this.field1072[this.field1073++];
            }
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(Z)V")
    public void method412(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1074 = this.field1073 * 8;
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(ZI)I")
    public int method413(boolean arg0, int arg1) {
        int var3 = this.field1074 >> 3;
        int var4 = 8 - (this.field1074 & 0x7);
        int var5 = 0;
        this.field1074 += arg1;
        if (!arg0) {
            this.field1060 = 229;
        }
        while (arg1 > var4) {
            var5 += (this.field1072[var3++] & field1076[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1072[var3] & field1076[var4]) + var5;
        } else {
            var6 = (this.field1072[var3] >> var4 - arg1 & field1076[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(Z)V")
    public void method414(boolean arg0) {
        this.field1073 = (this.field1074 + 7) / 8;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "j", descriptor = "()I")
    public int method415() {
        int var1 = this.field1072[this.field1073] & 0xFF;
        return var1 < 128 ? this.method402() - 64 : this.method404() - 49152;
    }

    @OriginalMember(owner = "LDILQFVA", name = "k", descriptor = "()I")
    public int method416() {
        int var1 = this.field1072[this.field1073] & 0xFF;
        return var1 < 128 ? this.method402() : this.method404() - 32768;
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method417(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1073;
        this.field1073 = 0;
        byte[] var5 = new byte[var4];
        this.method411(var4, (byte) 0, var5, 0);
        BigInteger var6 = new BigInteger(var5);
        if (arg0 <= 0) {
            return;
        }
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1073 = 0;
        this.method392(var8.length);
        this.method400(var8.length, (byte) 48, var8, 0);
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(IZ)V")
    public void method418(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1058 = 231;
        }
        this.field1072[this.field1073++] = (byte) -arg0;
    }

    @OriginalMember(owner = "LDILQFVA", name = "e", descriptor = "(II)V")
    public void method419(int arg0, int arg1) {
        this.field1072[this.field1073++] = (byte) (128 - arg0);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "g", descriptor = "(I)I")
    public int method420(int arg0) {
        if (arg0 != 0) {
            this.field1069 = !this.field1069;
        }
        return this.field1072[this.field1073++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "LDILQFVA", name = "h", descriptor = "(I)I")
    public int method421(int arg0) {
        if (arg0 <= 0) {
            this.field1066 = !this.field1066;
        }
        return -this.field1072[this.field1073++] & 0xFF;
    }

    @OriginalMember(owner = "LDILQFVA", name = "i", descriptor = "(I)I")
    public int method422(int arg0) {
        if (arg0 != 0) {
            this.field1069 = !this.field1069;
        }
        return 128 - this.field1072[this.field1073++] & 0xFF;
    }

    @OriginalMember(owner = "LDILQFVA", name = "j", descriptor = "(I)B")
    public byte method423(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        return (byte) (this.field1072[this.field1073++] - 128);
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "(Z)B")
    public byte method424(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1072[this.field1073++];
    }

    @OriginalMember(owner = "LDILQFVA", name = "k", descriptor = "(I)B")
    public byte method425(int arg0) {
        if (arg0 != 0) {
            this.field1068 = !this.field1068;
        }
        return (byte) (128 - this.field1072[this.field1073++]);
    }

    @OriginalMember(owner = "LDILQFVA", name = "f", descriptor = "(II)V")
    public void method426(int arg0, int arg1) {
        this.field1072[this.field1073++] = (byte) arg1;
        this.field1072[this.field1073++] = (byte) (arg1 >> 8);
        if (arg0 != 0) {
            this.field1070 = !this.field1070;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "g", descriptor = "(II)V")
    public void method427(int arg0, int arg1) {
        this.field1072[this.field1073++] = (byte) (arg0 >> 8);
        if (arg1 != 38866) {
            this.field1060 = 460;
        }
        this.field1072[this.field1073++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "(ZI)V")
    public void method428(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1072[this.field1073++] = (byte) (arg1 + 128);
            this.field1072[this.field1073++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "d", descriptor = "(Z)I")
    public int method429(boolean arg0) {
        this.field1073 += 2;
        if (!arg0) {
            this.field1065 = 173;
        }
        return ((this.field1072[this.field1073 - 1] & 0xFF) << 8) + (this.field1072[this.field1073 - 2] & 0xFF);
    }

    @OriginalMember(owner = "LDILQFVA", name = "e", descriptor = "(Z)I")
    public int method430(boolean arg0) {
        if (arg0) {
            this.field1073 += 2;
            return ((this.field1072[this.field1073 - 2] & 0xFF) << 8) + (this.field1072[this.field1073 - 1] - 128 & 0xFF);
        } else {
            return this.field1064;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "f", descriptor = "(Z)I")
    public int method431(boolean arg0) {
        this.field1073 += 2;
        if (!arg0) {
            this.field1066 = !this.field1066;
        }
        return ((this.field1072[this.field1073 - 1] & 0xFF) << 8) + (this.field1072[this.field1073 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "LDILQFVA", name = "l", descriptor = "(I)I")
    public int method432(int arg0) {
        if (arg0 != 8754) {
            return 2;
        }
        this.field1073 += 2;
        int var2 = ((this.field1072[this.field1073 - 1] & 0xFF) << 8) + (this.field1072[this.field1073 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "LDILQFVA", name = "m", descriptor = "(I)I")
    public int method433(int arg0) {
        this.field1073 += 2;
        int var2 = ((this.field1072[this.field1073 - 2] & 0xFF) << 8) + (this.field1072[this.field1073 - 1] - 128 & 0xFF);
        if (arg0 == 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return this.field1067;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "g", descriptor = "(Z)I")
    public int method434(boolean arg0) {
        this.field1073 += 2;
        int var2 = ((this.field1072[this.field1073 - 1] & 0xFF) << 8) + (this.field1072[this.field1073 - 2] - 128 & 0xFF);
        if (arg0) {
            return 3;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(B)I")
    public int method435(byte arg0) {
        this.field1073 += 3;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1072[this.field1073 - 1] & 0xFF) + ((this.field1072[this.field1073 - 2] & 0xFF) << 16) + ((this.field1072[this.field1073 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "LDILQFVA", name = "b", descriptor = "(B)I")
    public int method436(byte arg0) {
        this.field1073 += 4;
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1070 = !this.field1070;
        }
        return (this.field1072[this.field1073 - 4] & 0xFF) + ((this.field1072[this.field1073 - 3] & 0xFF) << 8) + ((this.field1072[this.field1073 - 1] & 0xFF) << 24) + ((this.field1072[this.field1073 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "LDILQFVA", name = "c", descriptor = "(B)I")
    public int method437(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            this.field1073 += 4;
            return (this.field1072[this.field1073 - 2] & 0xFF) + ((this.field1072[this.field1073 - 1] & 0xFF) << 8) + ((this.field1072[this.field1073 - 3] & 0xFF) << 24) + ((this.field1072[this.field1073 - 4] & 0xFF) << 16);
        } else {
            return this.field1067;
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(IZ[BI)V")
    public void method438(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            this.field1065 = -469;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            this.field1072[this.field1073++] = (byte) (arg2[var5] + 128);
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(IIZ[B)V")
    public void method439(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg2) {
            this.field1071 = !this.field1071;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
            arg3[var5] = this.field1072[this.field1073++];
        }
    }

    @OriginalMember(owner = "LDILQFVA", name = "a", descriptor = "(I[BIZ)V")
    public void method440(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg1[var5] = (byte) (this.field1072[this.field1073++] - 128);
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
            field1075[var0] = var1;
        }
        field1076 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1081 = new class36(6);
        field1082 = new class36(6);
        field1083 = new class36(6);
        field1084 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
