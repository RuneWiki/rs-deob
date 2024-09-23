import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NHEPCMLW")
public class class35 extends class28 {

    @OriginalMember(owner = "NHEPCMLW", name = "i", descriptor = "I")
    private int field1091 = 10041;

    @OriginalMember(owner = "NHEPCMLW", name = "j", descriptor = "Z")
    private boolean field1092 = false;

    @OriginalMember(owner = "NHEPCMLW", name = "k", descriptor = "I")
    private int field1093 = -584;

    @OriginalMember(owner = "NHEPCMLW", name = "l", descriptor = "B")
    private byte field1094 = 49;

    @OriginalMember(owner = "NHEPCMLW", name = "m", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "NHEPCMLW", name = "n", descriptor = "B")
    private byte field1096 = -105;

    @OriginalMember(owner = "NHEPCMLW", name = "o", descriptor = "B")
    private byte field1097 = 81;

    @OriginalMember(owner = "NHEPCMLW", name = "p", descriptor = "Z")
    private boolean field1098 = true;

    @OriginalMember(owner = "NHEPCMLW", name = "q", descriptor = "I")
    private int field1099 = -520;

    @OriginalMember(owner = "NHEPCMLW", name = "r", descriptor = "Z")
    private boolean field1100 = false;

    @OriginalMember(owner = "NHEPCMLW", name = "s", descriptor = "B")
    private byte field1101 = 6;

    @OriginalMember(owner = "NHEPCMLW", name = "t", descriptor = "I")
    private int field1102 = 3;

    @OriginalMember(owner = "NHEPCMLW", name = "u", descriptor = "Z")
    private boolean field1103 = true;

    @OriginalMember(owner = "NHEPCMLW", name = "v", descriptor = "I")
    private int field1104 = -4;

    @OriginalMember(owner = "NHEPCMLW", name = "w", descriptor = "Z")
    private boolean field1105 = true;

    @OriginalMember(owner = "NHEPCMLW", name = "x", descriptor = "[B")
    public byte[] field1106;

    @OriginalMember(owner = "NHEPCMLW", name = "y", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "NHEPCMLW", name = "h", descriptor = "I")
    private static int field1090 = 389;

    @OriginalMember(owner = "NHEPCMLW", name = "A", descriptor = "[I")
    private static int[] field1109 = new int[256];

    @OriginalMember(owner = "NHEPCMLW", name = "B", descriptor = "[I")
    private static final int[] field1110;

    @OriginalMember(owner = "NHEPCMLW", name = "G", descriptor = "LOCPYCLUF;")
    private static class38 field1115;

    @OriginalMember(owner = "NHEPCMLW", name = "H", descriptor = "LOCPYCLUF;")
    private static class38 field1116;

    @OriginalMember(owner = "NHEPCMLW", name = "I", descriptor = "LOCPYCLUF;")
    private static class38 field1117;

    @OriginalMember(owner = "NHEPCMLW", name = "J", descriptor = "[C")
    private static char[] field1118;

    @OriginalMember(owner = "NHEPCMLW", name = "z", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "NHEPCMLW", name = "D", descriptor = "I")
    private static int field1112;

    @OriginalMember(owner = "NHEPCMLW", name = "E", descriptor = "I")
    private static int field1113;

    @OriginalMember(owner = "NHEPCMLW", name = "F", descriptor = "I")
    private static int field1114;

    @OriginalMember(owner = "NHEPCMLW", name = "C", descriptor = "LIPEHOOFG;")
    public class22 field1111;

    @OriginalMember(owner = "NHEPCMLW", name = "K", descriptor = "Z")
    public static boolean field1119;

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(II)LNHEPCMLW;")
    public static class35 method337(int arg0, int arg1) {
        class38 var2 = field1116;
        synchronized (field1116) {
            class35 var3 = null;
            if (arg1 == 0 && field1112 > 0) {
                field1112--;
                var3 = (class35) field1115.method413();
            } else if (arg1 == 1 && field1113 > 0) {
                field1113--;
                var3 = (class35) field1116.method413();
            } else if (arg1 == 2 && field1114 > 0) {
                field1114--;
                var3 = (class35) field1117.method413();
            }
            if (var3 != null) {
                var3.field1107 = 0;
                return var3;
            }
        }
        class35 var5 = new class35((byte) 9);
        int var6 = 70 / arg0;
        var5.field1107 = 0;
        if (arg1 == 0) {
            var5.field1106 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1106 = new byte[5000];
        } else {
            var5.field1106 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "<init>", descriptor = "(B)V")
    private class35(byte arg0) {
        if (arg0 != 9) {
            this.field1105 = !this.field1105;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "<init>", descriptor = "(B[B)V")
    public class35(byte arg0, byte[] arg1) {
        this.field1106 = arg1;
        this.field1107 = 0;
        if (arg0 != -103) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(II)V")
    public void method338(int arg0, int arg1) {
        if (this.field1091 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1106[this.field1107++] = (byte) (arg0 + this.field1111.method278());
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(I)V")
    public void method339(int arg0) {
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(I)V")
    public void method340(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "c", descriptor = "(II)V")
    public void method341(int arg0, int arg1) {
        if (arg1 != 37278) {
            this.field1103 = !this.field1103;
        }
        this.field1106[this.field1107++] = (byte) arg0;
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "c", descriptor = "(I)V")
    public void method342(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "d", descriptor = "(I)V")
    public void method343(int arg0) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 24);
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "d", descriptor = "(II)V")
    public void method344(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) arg1;
        this.field1106[this.field1107++] = (byte) (arg1 >> 8);
        this.field1106[this.field1107++] = (byte) (arg1 >> 16);
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1106[this.field1107++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(JB)V")
    public void method345(long arg0, byte arg1) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 56);
        this.field1106[this.field1107++] = (byte) (arg0 >> 48);
        this.field1106[this.field1107++] = (byte) (arg0 >> 40);
        this.field1106[this.field1107++] = (byte) (arg0 >> 32);
        this.field1106[this.field1107++] = (byte) (arg0 >> 24);
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        if (arg1 != 7) {
            field1090 = -484;
        }
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        this.field1106[this.field1107++] = (byte) arg0;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method346(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1106, this.field1107);
        this.field1107 += arg0.length();
        this.field1106[this.field1107++] = 10;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(I[BII)V")
    public void method347(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 >= 0 && arg3 <= 0) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                this.field1106[this.field1107++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "e", descriptor = "(II)V")
    public void method348(int arg0, int arg1) {
        this.field1106[this.field1107 - arg1 - 1] = (byte) arg1;
        if (arg0 < 6 || arg0 > 6) {
            field1090 = -289;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "c", descriptor = "()I")
    public int method349() {
        return this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "d", descriptor = "()B")
    public byte method350() {
        return this.field1106[this.field1107++];
    }

    @OriginalMember(owner = "NHEPCMLW", name = "e", descriptor = "()I")
    public int method351() {
        this.field1107 += 2;
        return ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] & 0xFF);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "f", descriptor = "()I")
    public int method352() {
        this.field1107 += 2;
        int var1 = ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "g", descriptor = "()I")
    public int method353() {
        this.field1107 += 3;
        return (this.field1106[this.field1107 - 1] & 0xFF) + ((this.field1106[this.field1107 - 3] & 0xFF) << 16) + ((this.field1106[this.field1107 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "h", descriptor = "()I")
    public int method354() {
        this.field1107 += 4;
        return (this.field1106[this.field1107 - 1] & 0xFF) + ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + ((this.field1106[this.field1107 - 4] & 0xFF) << 24) + ((this.field1106[this.field1107 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "e", descriptor = "(I)J")
    public long method355(int arg0) {
        long var2 = (long) this.method354() & 0xFFFFFFFFL;
        long var4 = (long) this.method354() & 0xFFFFFFFFL;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "i", descriptor = "()Ljava/lang/String;")
    public String method356() {
        int var1 = this.field1107;
        while (this.field1106[this.field1107++] != 10) {
        }
        return new String(this.field1106, var1, this.field1107 - var1 - 1);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "f", descriptor = "(I)[B")
    public byte[] method357(int arg0) {
        int var2 = this.field1107;
        while (this.field1106[this.field1107++] != 10) {
        }
        byte[] var3 = new byte[this.field1107 - var2 - 1];
        if (arg0 != 5841) {
            this.field1093 = -375;
        }
        for (int var4 = var2; var4 < this.field1107 - 1; var4++) {
            var3[var4 - var2] = this.field1106[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(III[B)V")
    public void method358(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 >= 6 && arg0 <= 6) {
            for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
                arg3[var5] = this.field1106[this.field1107++];
            }
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(Z)V")
    public void method359(boolean arg0) {
        if (!arg0) {
            this.field1108 = this.field1107 * 8;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "f", descriptor = "(II)I")
    public int method360(int arg0, int arg1) {
        int var3 = this.field1108 >> 3;
        int var4 = 8 - (this.field1108 & 0x7);
        int var5 = 0;
        if (arg0 <= 0) {
            this.field1105 = !this.field1105;
        }
        this.field1108 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1106[var3++] & field1110[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1106[var3] & field1110[var4]) + var5;
        } else {
            var6 = (this.field1106[var3] >> var4 - arg1 & field1110[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "g", descriptor = "(I)V")
    public void method361(int arg0) {
        if (arg0 < 0) {
            this.field1107 = (this.field1108 + 7) / 8;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "j", descriptor = "()I")
    public int method362() {
        int var1 = this.field1106[this.field1107] & 0xFF;
        return var1 < 128 ? this.method349() - 64 : this.method351() - 49152;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "k", descriptor = "()I")
    public int method363() {
        int var1 = this.field1106[this.field1107] & 0xFF;
        return var1 < 128 ? this.method349() : this.method351() - 32768;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method364(boolean arg0, BigInteger arg1, BigInteger arg2) {
        if (arg0) {
            this.field1091 = 78;
        }
        int var4 = this.field1107;
        this.field1107 = 0;
        byte[] var5 = new byte[var4];
        this.method358(6, var4, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1107 = 0;
        this.method339(var8.length);
        this.method347(var8.length, var8, 0, 0);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(IB)V")
    public void method365(int arg0, byte arg1) {
        if (arg1 == -100) {
            this.field1106[this.field1107++] = (byte) -arg0;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "g", descriptor = "(II)V")
    public void method366(int arg0, int arg1) {
        if (arg0 == 2) {
            this.field1106[this.field1107++] = (byte) (128 - arg1);
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "h", descriptor = "(I)I")
    public int method367(int arg0) {
        return arg0 == 34652 ? this.field1106[this.field1107++] - 128 & 0xFF : this.field1093;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "i", descriptor = "(I)I")
    public int method368(int arg0) {
        if (arg0 != 0) {
            this.field1103 = !this.field1103;
        }
        return -this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "j", descriptor = "(I)I")
    public int method369(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field1106[this.field1107++] & 0xFF;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "k", descriptor = "(I)B")
    public byte method370(int arg0) {
        int var2 = 80 / arg0;
        return (byte) (this.field1106[this.field1107++] - 128);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "l", descriptor = "(I)B")
    public byte method371(int arg0) {
        if (arg0 != 24248) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field1106[this.field1107++];
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(IZ)V")
    public void method372(int arg0, boolean arg1) {
        this.field1106[this.field1107++] = (byte) arg0;
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        if (!arg1) {
            this.field1105 = !this.field1105;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "h", descriptor = "(II)V")
    public void method373(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) (arg1 >> 8);
        if (arg0 >= 8 && arg0 <= 8) {
            this.field1106[this.field1107++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(IZ)V")
    public void method374(int arg0, boolean arg1) {
        this.field1106[this.field1107++] = (byte) (arg0 + 128);
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "m", descriptor = "(I)I")
    public int method375(int arg0) {
        this.field1107 += 2;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] & 0xFF);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "n", descriptor = "(I)I")
    public int method376(int arg0) {
        if (arg0 == 5) {
            this.field1107 += 2;
            return ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] - 128 & 0xFF);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(Z)I")
    public int method377(boolean arg0) {
        this.field1107 += 2;
        if (!arg0) {
            this.field1105 = !this.field1105;
        }
        return ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(B)I")
    public int method378(byte arg0) {
        if (arg0 != -12) {
            this.field1092 = !this.field1092;
        }
        this.field1107 += 2;
        int var2 = ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "o", descriptor = "(I)I")
    public int method379(int arg0) {
        this.field1107 += 2;
        int var2 = ((this.field1106[this.field1107 - 2] & 0xFF) << 8) + (this.field1106[this.field1107 - 1] - 128 & 0xFF);
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(B)I")
    public int method380(byte arg0) {
        if (this.field1097 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1107 += 2;
        int var3 = ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + (this.field1106[this.field1107 - 2] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "NHEPCMLW", name = "i", descriptor = "(II)V")
    public void method381(int arg0, int arg1) {
        this.field1106[this.field1107++] = (byte) (arg0 >> 16);
        this.field1106[this.field1107++] = (byte) (arg0 >> 24);
        this.field1106[this.field1107++] = (byte) arg0;
        this.field1106[this.field1107++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "c", descriptor = "(Z)I")
    public int method382(boolean arg0) {
        this.field1107 += 4;
        if (!arg0) {
            this.field1102 = -108;
        }
        return (this.field1106[this.field1107 - 4] & 0xFF) + ((this.field1106[this.field1107 - 3] & 0xFF) << 8) + ((this.field1106[this.field1107 - 1] & 0xFF) << 24) + ((this.field1106[this.field1107 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "p", descriptor = "(I)I")
    public int method383(int arg0) {
        this.field1107 += 4;
        return arg0 <= 0 ? this.field1104 : (this.field1106[this.field1107 - 3] & 0xFF) + ((this.field1106[this.field1107 - 4] & 0xFF) << 8) + ((this.field1106[this.field1107 - 2] & 0xFF) << 24) + ((this.field1106[this.field1107 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "d", descriptor = "(Z)I")
    public int method384(boolean arg0) {
        this.field1107 += 4;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1106[this.field1107 - 2] & 0xFF) + ((this.field1106[this.field1107 - 1] & 0xFF) << 8) + ((this.field1106[this.field1107 - 3] & 0xFF) << 24) + ((this.field1106[this.field1107 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "NHEPCMLW", name = "b", descriptor = "(III[B)V")
    public void method385(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 >= 0) {
            this.field1098 = !this.field1098;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg2; var5--) {
            this.field1106[this.field1107++] = (byte) (arg3[var5] + 128);
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(II[BI)V")
    public void method386(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 44885) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0 + arg3 - 1; var6 >= arg0; var6--) {
            arg2[var6] = this.field1106[this.field1107++];
        }
    }

    @OriginalMember(owner = "NHEPCMLW", name = "a", descriptor = "(IB[BI)V")
    public void method387(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (this.field1101 != arg1) {
            this.field1092 = !this.field1092;
        }
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg2[var5] = (byte) (this.field1106[this.field1107++] - 128);
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
            field1109[var0] = var1;
        }
        field1110 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1115 = new class38((byte) 118);
        field1116 = new class38((byte) 118);
        field1117 = new class38((byte) 118);
        field1118 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
