import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BFQIDHPO")
public class class3 extends class13 {

    @OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "Z")
    private boolean field26 = true;

    @OriginalMember(owner = "client!BFQIDHPO", name = "l", descriptor = "I")
    private int field29 = 8;

    @OriginalMember(owner = "client!BFQIDHPO", name = "m", descriptor = "B")
    private byte field30 = -119;

    @OriginalMember(owner = "client!BFQIDHPO", name = "n", descriptor = "B")
    private byte field31 = 6;

    @OriginalMember(owner = "client!BFQIDHPO", name = "o", descriptor = "Z")
    private boolean field32 = false;

    @OriginalMember(owner = "client!BFQIDHPO", name = "p", descriptor = "B")
    private byte field33 = 60;

    @OriginalMember(owner = "client!BFQIDHPO", name = "r", descriptor = "Z")
    private boolean field35 = true;

    @OriginalMember(owner = "client!BFQIDHPO", name = "s", descriptor = "B")
    private byte field36 = 55;

    @OriginalMember(owner = "client!BFQIDHPO", name = "t", descriptor = "B")
    private byte field37 = 44;

    @OriginalMember(owner = "client!BFQIDHPO", name = "u", descriptor = "B")
    private byte field38 = 44;

    @OriginalMember(owner = "client!BFQIDHPO", name = "v", descriptor = "B")
    private byte field39 = 8;

    @OriginalMember(owner = "client!BFQIDHPO", name = "w", descriptor = "I")
    private int field40 = -719;

    @OriginalMember(owner = "client!BFQIDHPO", name = "x", descriptor = "Z")
    private boolean field41 = false;

    @OriginalMember(owner = "client!BFQIDHPO", name = "y", descriptor = "B")
    private byte field42 = 115;

    @OriginalMember(owner = "client!BFQIDHPO", name = "z", descriptor = "I")
    private int field43 = 8;

    @OriginalMember(owner = "client!BFQIDHPO", name = "A", descriptor = "Z")
    private boolean field44 = true;

    @OriginalMember(owner = "client!BFQIDHPO", name = "B", descriptor = "I")
    private int field45 = 681;

    @OriginalMember(owner = "client!BFQIDHPO", name = "C", descriptor = "Z")
    private boolean field46 = true;

    @OriginalMember(owner = "client!BFQIDHPO", name = "F", descriptor = "[B")
    public byte[] field49;

    @OriginalMember(owner = "client!BFQIDHPO", name = "G", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!BFQIDHPO", name = "E", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "I")
    private static int field27 = 122;

    @OriginalMember(owner = "client!BFQIDHPO", name = "I", descriptor = "[I")
    private static int[] field52 = new int[256];

    @OriginalMember(owner = "client!BFQIDHPO", name = "J", descriptor = "[I")
    private static final int[] field53;

    @OriginalMember(owner = "client!BFQIDHPO", name = "O", descriptor = "LZXKMWHPZ;")
    private static class72 field58;

    @OriginalMember(owner = "client!BFQIDHPO", name = "P", descriptor = "LZXKMWHPZ;")
    private static class72 field59;

    @OriginalMember(owner = "client!BFQIDHPO", name = "Q", descriptor = "LZXKMWHPZ;")
    private static class72 field60;

    @OriginalMember(owner = "client!BFQIDHPO", name = "R", descriptor = "[C")
    private static char[] field61;

    @OriginalMember(owner = "client!BFQIDHPO", name = "q", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!BFQIDHPO", name = "D", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!BFQIDHPO", name = "H", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!BFQIDHPO", name = "L", descriptor = "I")
    private static int field55;

    @OriginalMember(owner = "client!BFQIDHPO", name = "M", descriptor = "I")
    private static int field56;

    @OriginalMember(owner = "client!BFQIDHPO", name = "N", descriptor = "I")
    private static int field57;

    @OriginalMember(owner = "client!BFQIDHPO", name = "K", descriptor = "LWMQKHABS;")
    public class64 field54;

    @OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "Z")
    private static boolean field28;

    @OriginalMember(owner = "client!BFQIDHPO", name = "S", descriptor = "Z")
    public static boolean field62;

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(II)LBFQIDHPO;")
    public static class3 method42(int arg0, int arg1) {
        class72 var2 = field59;
        synchronized (field59) {
            class3 var3 = null;
            if (arg1 == 0 && field55 > 0) {
                field55--;
                var3 = (class3) field58.method597();
            } else if (arg1 == 1 && field56 > 0) {
                field56--;
                var3 = (class3) field59.method597();
            } else if (arg1 == 2 && field57 > 0) {
                field57--;
                var3 = (class3) field60.method597();
            }
            if (var3 != null) {
                var3.field50 = 0;
                return var3;
            }
        }
        class3 var5 = new class3(field28);
        var5.field50 = 0;
        int var6 = 80 / arg0;
        if (arg1 == 0) {
            var5.field49 = new byte[100];
        } else if (arg1 == 1) {
            var5.field49 = new byte[5000];
        } else {
            var5.field49 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "<init>", descriptor = "(Z)V")
    private class3(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "<init>", descriptor = "([BI)V")
    public class3(byte[] arg0, int arg1) {
        this.field49 = arg0;
        this.field50 = 0;
        while (arg1 >= 0) {
            this.field48 = 188;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(II)V")
    public void method43(int arg0, int arg1) {
        this.field49[this.field50++] = (byte) (arg1 + this.field54.method534());
        if (arg0 != 0) {
            this.field48 = -387;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I)V")
    public void method44(int arg0) {
        this.field49[this.field50++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(I)V")
    public void method45(int arg0) {
        this.field49[this.field50++] = (byte) (arg0 >> 8);
        this.field49[this.field50++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(II)V")
    public void method46(int arg0, int arg1) {
        if (arg1 == 7) {
            this.field49[this.field50++] = (byte) arg0;
            this.field49[this.field50++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(I)V")
    public void method47(int arg0) {
        this.field49[this.field50++] = (byte) (arg0 >> 16);
        this.field49[this.field50++] = (byte) (arg0 >> 8);
        this.field49[this.field50++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(I)V")
    public void method48(int arg0) {
        this.field49[this.field50++] = (byte) (arg0 >> 24);
        this.field49[this.field50++] = (byte) (arg0 >> 16);
        this.field49[this.field50++] = (byte) (arg0 >> 8);
        this.field49[this.field50++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IB)V")
    public void method49(int arg0, byte arg1) {
        this.field49[this.field50++] = (byte) arg0;
        this.field49[this.field50++] = (byte) (arg0 >> 8);
        this.field49[this.field50++] = (byte) (arg0 >> 16);
        this.field49[this.field50++] = (byte) (arg0 >> 24);
        if (arg1 != 4) {
            this.field26 = !this.field26;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IJ)V")
    public void method50(int arg0, long arg1) {
        this.field49[this.field50++] = (byte) (arg1 >> 56);
        this.field49[this.field50++] = (byte) (arg1 >> 48);
        this.field49[this.field50++] = (byte) (arg1 >> 40);
        this.field49[this.field50++] = (byte) (arg1 >> 32);
        this.field49[this.field50++] = (byte) (arg1 >> 24);
        this.field49[this.field50++] = (byte) (arg1 >> 16);
        this.field49[this.field50++] = (byte) (arg1 >> 8);
        this.field49[this.field50++] = (byte) arg1;
        if (arg0 < this.field29 || arg0 > this.field29) {
            ;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method51(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field49, this.field50);
        this.field50 += arg0.length();
        this.field49[this.field50++] = 10;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "([BIBI)V")
    public void method52(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (this.field30 != arg2) {
            field28 = !field28;
        }
        for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
            this.field49[this.field50++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IZ)V")
    public void method53(int arg0, boolean arg1) {
        if (arg1) {
            this.field26 = !this.field26;
        }
        this.field49[this.field50 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "()I")
    public int method54() {
        return this.field49[this.field50++] & 0xFF;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "()B")
    public byte method55() {
        return this.field49[this.field50++];
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "()I")
    public int method56() {
        this.field50 += 2;
        return ((this.field49[this.field50 - 2] & 0xFF) << 8) + (this.field49[this.field50 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "f", descriptor = "()I")
    public int method57() {
        this.field50 += 2;
        int var1 = ((this.field49[this.field50 - 2] & 0xFF) << 8) + (this.field49[this.field50 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "g", descriptor = "()I")
    public int method58() {
        this.field50 += 3;
        return (this.field49[this.field50 - 1] & 0xFF) + ((this.field49[this.field50 - 3] & 0xFF) << 16) + ((this.field49[this.field50 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "h", descriptor = "()I")
    public int method59() {
        this.field50 += 4;
        return (this.field49[this.field50 - 1] & 0xFF) + ((this.field49[this.field50 - 2] & 0xFF) << 8) + ((this.field49[this.field50 - 4] & 0xFF) << 24) + ((this.field49[this.field50 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(Z)J")
    public long method60(boolean arg0) {
        long var2 = (long) this.method59() & 0xFFFFFFFFL;
        if (!arg0) {
            throw new NullPointerException();
        }
        long var4 = (long) this.method59() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method61() {
        int var1 = this.field50;
        while (this.field49[this.field50++] != 10) {
        }
        return new String(this.field49, var1, this.field50 - var1 - 1);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(I)[B")
    public byte[] method62(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field50;
        while (this.field49[this.field50++] != 10) {
        }
        byte[] var4 = new byte[this.field50 - var3 - 1];
        for (int var5 = var3; var5 < this.field50 - 1; var5++) {
            var4[var5 - var3] = this.field49[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I[BIB)V")
    public void method63(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != 5) {
            this.field34 = 147;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg1[var5] = this.field49[this.field50++];
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "f", descriptor = "(I)V")
    public void method64(int arg0) {
        if (arg0 == 0) {
            this.field51 = this.field50 * 8;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(BI)I")
    public int method65(byte arg0, int arg1) {
        int var3 = this.field51 >> 3;
        int var4 = 8 - (this.field51 & 0x7);
        int var5 = 0;
        this.field51 += arg1;
        if (arg0 != 88) {
            this.field45 = 123;
        }
        while (arg1 > var4) {
            var5 += (this.field49[var3++] & field53[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field49[var3] & field53[var4]) + var5;
        } else {
            var6 = (this.field49[var3] >> var4 - arg1 & field53[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(Z)V")
    public void method66(boolean arg0) {
        this.field50 = (this.field51 + 7) / 8;
        if (arg0) {
            this.field26 = !this.field26;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "()I")
    public int method67() {
        int var1 = this.field49[this.field50] & 0xFF;
        return var1 < 128 ? this.method54() - 64 : this.method56() - 49152;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "()I")
    public int method68() {
        int var1 = this.field49[this.field50] & 0xFF;
        return var1 < 128 ? this.method54() : this.method56() - 32768;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method69(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field50;
        this.field50 = 0;
        byte[] var5 = new byte[var4];
        this.method63(0, var5, var4, (byte) 5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field50 = 0;
        this.method44(var8.length);
        if (arg0 != -23339) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.method52(var8, var8.length, (byte) -119, 0);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(II)V")
    public void method70(int arg0, int arg1) {
        if (arg1 == -12346) {
            this.field49[this.field50++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(IB)V")
    public void method71(int arg0, byte arg1) {
        if (this.field39 == arg1) {
            this.field49[this.field50++] = (byte) -arg0;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(BI)V")
    public void method72(byte arg0, int arg1) {
        if (arg0 != 116) {
            this.field46 = !this.field46;
        }
        this.field49[this.field50++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "g", descriptor = "(I)I")
    public int method73(int arg0) {
        return arg0 >= 0 ? this.field34 : this.field49[this.field50++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "h", descriptor = "(I)I")
    public int method74(int arg0) {
        return arg0 < 0 ? -this.field49[this.field50++] & 0xFF : field27;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(Z)I")
    public int method75(boolean arg0) {
        if (arg0) {
            field28 = !field28;
        }
        return 128 - this.field49[this.field50++] & 0xFF;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "(I)B")
    public byte method76(int arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return (byte) (this.field49[this.field50++] - 128);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(B)B")
    public byte method77(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field49[this.field50++]);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(II)V")
    public void method78(int arg0, int arg1) {
        if (arg0 != 4) {
            field28 = !field28;
        }
        this.field49[this.field50++] = (byte) arg1;
        this.field49[this.field50++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(ZI)V")
    public void method79(boolean arg0, int arg1) {
        this.field49[this.field50++] = (byte) (arg1 >> 8);
        this.field49[this.field50++] = (byte) (arg1 + 128);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(ZI)V")
    public void method80(boolean arg0, int arg1) {
        this.field49[this.field50++] = (byte) (arg1 + 128);
        this.field49[this.field50++] = (byte) (arg1 >> 8);
        if (!arg0) {
            this.field47 = 5;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(Z)I")
    public int method81(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field50 += 2;
        return ((this.field49[this.field50 - 1] & 0xFF) << 8) + (this.field49[this.field50 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(B)I")
    public int method82(byte arg0) {
        this.field50 += 2;
        if (arg0 != 3) {
            this.field35 = !this.field35;
        }
        return ((this.field49[this.field50 - 2] & 0xFF) << 8) + (this.field49[this.field50 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(B)I")
    public int method83(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field46 = !this.field46;
        }
        this.field50 += 2;
        return ((this.field49[this.field50 - 1] & 0xFF) << 8) + (this.field49[this.field50 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "(I)I")
    public int method84(int arg0) {
        this.field50 += 2;
        int var2 = ((this.field49[this.field50 - 1] & 0xFF) << 8) + (this.field49[this.field50 - 2] & 0xFF);
        if (arg0 != 9) {
            field27 = 457;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "(I)I")
    public int method85(int arg0) {
        this.field50 += 2;
        int var2 = ((this.field49[this.field50 - 2] & 0xFF) << 8) + (this.field49[this.field50 - 1] - 128 & 0xFF);
        if (arg0 >= 0) {
            return 0;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(Z)I")
    public int method86(boolean arg0) {
        this.field50 += 2;
        if (arg0) {
            this.field34 = 260;
        }
        int var2 = ((this.field49[this.field50 - 1] & 0xFF) << 8) + (this.field49[this.field50 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(B)I")
    public int method87(byte arg0) {
        this.field50 += 3;
        if (arg0 != -86) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field49[this.field50 - 1] & 0xFF) + ((this.field49[this.field50 - 2] & 0xFF) << 16) + ((this.field49[this.field50 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "l", descriptor = "(I)I")
    public int method88(int arg0) {
        this.field50 += 4;
        if (arg0 >= 0) {
            this.field34 = -54;
        }
        return (this.field49[this.field50 - 4] & 0xFF) + ((this.field49[this.field50 - 3] & 0xFF) << 8) + ((this.field49[this.field50 - 1] & 0xFF) << 24) + ((this.field49[this.field50 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "m", descriptor = "(I)I")
    public int method89(int arg0) {
        this.field50 += 4;
        int var2 = 42 / arg0;
        return (this.field49[this.field50 - 2] & 0xFF) + ((this.field49[this.field50 - 1] & 0xFF) << 8) + ((this.field49[this.field50 - 3] & 0xFF) << 24) + ((this.field49[this.field50 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I[BZI)V")
    public void method90(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (!arg2) {
            this.field35 = !this.field35;
        }
        for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
            this.field49[this.field50++] = (byte) (arg1[var5] + 128);
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
            field52[var0] = var1;
        }
        field53 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field58 = new class72((byte) 8);
        field59 = new class72((byte) 8);
        field60 = new class72((byte) 8);
        field61 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
