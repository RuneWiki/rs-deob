import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DNRIFKTO")
public class class11 extends class36 {

    @OriginalMember(owner = "DNRIFKTO", name = "j", descriptor = "Z")
    private boolean field628 = true;

    @OriginalMember(owner = "DNRIFKTO", name = "k", descriptor = "Z")
    private boolean field629 = true;

    @OriginalMember(owner = "DNRIFKTO", name = "l", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "DNRIFKTO", name = "m", descriptor = "Z")
    private boolean field631 = false;

    @OriginalMember(owner = "DNRIFKTO", name = "n", descriptor = "I")
    private int field632 = 14846;

    @OriginalMember(owner = "DNRIFKTO", name = "o", descriptor = "Z")
    private boolean field633 = false;

    @OriginalMember(owner = "DNRIFKTO", name = "p", descriptor = "I")
    private int field634 = -18450;

    @OriginalMember(owner = "DNRIFKTO", name = "r", descriptor = "I")
    private int field636 = -507;

    @OriginalMember(owner = "DNRIFKTO", name = "s", descriptor = "I")
    private int field637 = -23971;

    @OriginalMember(owner = "DNRIFKTO", name = "t", descriptor = "Z")
    private boolean field638 = false;

    @OriginalMember(owner = "DNRIFKTO", name = "u", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "DNRIFKTO", name = "v", descriptor = "I")
    private int field640 = -30892;

    @OriginalMember(owner = "DNRIFKTO", name = "x", descriptor = "[B")
    public byte[] field642;

    @OriginalMember(owner = "DNRIFKTO", name = "y", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "DNRIFKTO", name = "w", descriptor = "I")
    private static int field641 = 44965;

    @OriginalMember(owner = "DNRIFKTO", name = "A", descriptor = "[I")
    private static int[] field645 = new int[256];

    @OriginalMember(owner = "DNRIFKTO", name = "B", descriptor = "[I")
    private static final int[] field646;

    @OriginalMember(owner = "DNRIFKTO", name = "G", descriptor = "LZCVCEQHJ;")
    private static class70 field651;

    @OriginalMember(owner = "DNRIFKTO", name = "H", descriptor = "LZCVCEQHJ;")
    private static class70 field652;

    @OriginalMember(owner = "DNRIFKTO", name = "I", descriptor = "LZCVCEQHJ;")
    private static class70 field653;

    @OriginalMember(owner = "DNRIFKTO", name = "J", descriptor = "[C")
    private static char[] field654;

    @OriginalMember(owner = "DNRIFKTO", name = "i", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "DNRIFKTO", name = "q", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "DNRIFKTO", name = "z", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "DNRIFKTO", name = "D", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "DNRIFKTO", name = "E", descriptor = "I")
    private static int field649;

    @OriginalMember(owner = "DNRIFKTO", name = "F", descriptor = "I")
    private static int field650;

    @OriginalMember(owner = "DNRIFKTO", name = "C", descriptor = "LGOLMSHHL;")
    public class17 field647;

    @OriginalMember(owner = "DNRIFKTO", name = "K", descriptor = "Z")
    public static boolean field655;

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(II)LDNRIFKTO;")
    public static class11 method177(int arg0, int arg1) {
        class70 var2 = field652;
        synchronized (field652) {
            class11 var3 = null;
            if (arg0 == 0 && field648 > 0) {
                field648--;
                var3 = (class11) field651.method591();
            } else if (arg0 == 1 && field649 > 0) {
                field649--;
                var3 = (class11) field652.method591();
            } else if (arg0 == 2 && field650 > 0) {
                field650--;
                var3 = (class11) field653.method591();
            }
            if (var3 != null) {
                var3.field643 = 0;
                return var3;
            }
        }
        if (arg1 <= 0) {
            field641 = 362;
        }
        class11 var5 = new class11(0);
        var5.field643 = 0;
        if (arg0 == 0) {
            var5.field642 = new byte[100];
        } else if (arg0 == 1) {
            var5.field642 = new byte[5000];
        } else {
            var5.field642 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "<init>", descriptor = "(I)V")
    private class11(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "<init>", descriptor = "([BZ)V")
    public class11(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.field629 = !this.field629;
        }
        this.field642 = arg0;
        this.field643 = 0;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(ZI)V")
    public void method178(boolean arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg1 + this.field647.method256());
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(I)V")
    public void method179(int arg0) {
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "b", descriptor = "(I)V")
    public void method180(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "b", descriptor = "(II)V")
    public void method181(int arg0, int arg1) {
        int var3 = 58 / arg0;
        this.field642[this.field643++] = (byte) arg1;
        this.field642[this.field643++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "c", descriptor = "(I)V")
    public void method182(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "d", descriptor = "(I)V")
    public void method183(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 24);
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "c", descriptor = "(II)V")
    public void method184(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) arg1;
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        this.field642[this.field643++] = (byte) (arg1 >> 16);
        this.field642[this.field643++] = (byte) (arg1 >> 24);
        if (arg0 < 7 || arg0 > 7) {
            ;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(BJ)V")
    public void method185(byte arg0, long arg1) {
        this.field642[this.field643++] = (byte) (arg1 >> 56);
        this.field642[this.field643++] = (byte) (arg1 >> 48);
        this.field642[this.field643++] = (byte) (arg1 >> 40);
        this.field642[this.field643++] = (byte) (arg1 >> 32);
        this.field642[this.field643++] = (byte) (arg1 >> 24);
        this.field642[this.field643++] = (byte) (arg1 >> 16);
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        if (arg0 != 35) {
            field641 = -332;
        }
        this.field642[this.field643++] = (byte) arg1;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method186(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field642, this.field643);
        this.field643 += arg0.length();
        this.field642[this.field643++] = 10;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(I[BII)V")
    public void method187(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg3; var6 < arg0 + arg3; var6++) {
            this.field642[this.field643++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "d", descriptor = "(II)V")
    public void method188(int arg0, int arg1) {
        this.field642[this.field643 - arg0 - 1] = (byte) arg0;
        if (arg1 >= 0) {
            this.field640 = -255;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "c", descriptor = "()I")
    public int method189() {
        return this.field642[this.field643++] & 0xFF;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "d", descriptor = "()B")
    public byte method190() {
        return this.field642[this.field643++];
    }

    @OriginalMember(owner = "DNRIFKTO", name = "e", descriptor = "()I")
    public int method191() {
        this.field643 += 2;
        return ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] & 0xFF);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "f", descriptor = "()I")
    public int method192() {
        this.field643 += 2;
        int var1 = ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "g", descriptor = "()I")
    public int method193() {
        this.field643 += 3;
        return (this.field642[this.field643 - 1] & 0xFF) + ((this.field642[this.field643 - 3] & 0xFF) << 16) + ((this.field642[this.field643 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "h", descriptor = "()I")
    public int method194() {
        this.field643 += 4;
        return (this.field642[this.field643 - 1] & 0xFF) + ((this.field642[this.field643 - 2] & 0xFF) << 8) + ((this.field642[this.field643 - 4] & 0xFF) << 24) + ((this.field642[this.field643 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "e", descriptor = "(I)J")
    public long method195(int arg0) {
        long var2 = (long) this.method194() & 0xFFFFFFFFL;
        long var4 = (long) this.method194() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method196() {
        int var1 = this.field643;
        while (this.field642[this.field643++] != 10) {
        }
        return new String(this.field642, var1, this.field643 - var1 - 1);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "f", descriptor = "(I)[B")
    public byte[] method197(int arg0) {
        int var2 = this.field643;
        while (this.field642[this.field643++] != 10) {
        }
        byte[] var3 = new byte[this.field643 - var2 - 1];
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = var2; var5 < this.field643 - 1; var5++) {
            var3[var5 - var2] = this.field642[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(III[B)V")
    public void method198(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1; var6 < arg0 + arg1; var6++) {
            arg3[var6] = this.field642[this.field643++];
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(B)V")
    public void method199(byte arg0) {
        this.field644 = this.field643 * 8;
        if (arg0 != 113) {
            this.field628 = !this.field628;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "e", descriptor = "(II)I")
    public int method200(int arg0, int arg1) {
        int var3 = this.field644 >> 3;
        int var4 = 8 - (this.field644 & 0x7);
        int var5 = 0;
        if (arg0 < 5 || arg0 > 5) {
            field641 = -188;
        }
        this.field644 += arg1;
        while (arg1 > var4) {
            var5 += (this.field642[var3++] & field646[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field642[var3] & field646[var4]) + var5;
        } else {
            var6 = (this.field642[var3] >> var4 - arg1 & field646[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "g", descriptor = "(I)V")
    public void method201(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field643 = (this.field644 + 7) / 8;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "j", descriptor = "()I")
    public int method202() {
        int var1 = this.field642[this.field643] & 0xFF;
        return var1 < 128 ? this.method189() - 64 : this.method191() - 49152;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "k", descriptor = "()I")
    public int method203() {
        int var1 = this.field642[this.field643] & 0xFF;
        return var1 < 128 ? this.method189() : this.method191() - 32768;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method204(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field643;
        this.field643 = 0;
        byte[] var5 = new byte[var4];
        this.method198(var4, 0, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        if (arg1 < 0) {
            byte[] var8 = var7.toByteArray();
            this.field643 = 0;
            this.method179(var8.length);
            this.method187(var8.length, var8, 0, 0);
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "f", descriptor = "(II)V")
    public void method205(int arg0, int arg1) {
        if (arg1 < 6 || arg1 > 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field642[this.field643++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "b", descriptor = "(B)I")
    public int method206(byte arg0) {
        return arg0 == -35 ? this.field642[this.field643++] - 128 & 0xFF : this.field636;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "c", descriptor = "(B)I")
    public int method207(byte arg0) {
        if (arg0 != 7) {
            this.field629 = !this.field629;
        }
        return -this.field642[this.field643++] & 0xFF;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "d", descriptor = "(B)I")
    public int method208(byte arg0) {
        return arg0 == 97 ? 128 - this.field642[this.field643++] & 0xFF : 2;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "e", descriptor = "(B)B")
    public byte method209(byte arg0) {
        if (arg0 != 51) {
            throw new NullPointerException();
        }
        return (byte) -this.field642[this.field643++];
    }

    @OriginalMember(owner = "DNRIFKTO", name = "h", descriptor = "(I)B")
    public byte method210(int arg0) {
        if (arg0 != 9) {
            this.field633 = !this.field633;
        }
        return (byte) (128 - this.field642[this.field643++]);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "g", descriptor = "(II)V")
    public void method211(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) arg1;
        if (arg0 == 35516) {
            this.field642[this.field643++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(BI)V")
    public void method212(byte arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field627 = -272;
        }
        this.field642[this.field643++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(IZ)V")
    public void method213(int arg0, boolean arg1) {
        this.field642[this.field643++] = (byte) (arg0 + 128);
        if (arg1) {
            this.field628 = !this.field628;
        }
        this.field642[this.field643++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "f", descriptor = "(B)I")
    public int method214(byte arg0) {
        if (arg0 == 5) {
            this.field643 += 2;
            return ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] & 0xFF);
        } else {
            return this.field635;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "i", descriptor = "(I)I")
    public int method215(int arg0) {
        this.field643 += 2;
        return arg0 < 0 ? ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] - 128 & 0xFF) : 1;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "j", descriptor = "(I)I")
    public int method216(int arg0) {
        this.field643 += 2;
        return arg0 == 0 ? ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] - 128 & 0xFF) : this.field640;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "k", descriptor = "(I)I")
    public int method217(int arg0) {
        this.field643 += 2;
        int var2 = ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] & 0xFF);
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "l", descriptor = "(I)I")
    public int method218(int arg0) {
        this.field643 += 2;
        int var2 = ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] - 128 & 0xFF);
        if (arg0 == 15662) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return field641;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "m", descriptor = "(I)I")
    public int method219(int arg0) {
        this.field643 += 2;
        int var2 = ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] - 128 & 0xFF);
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "n", descriptor = "(I)I")
    public int method220(int arg0) {
        this.field643 += 3;
        return arg0 == 8 ? (this.field642[this.field643 - 2] & 0xFF) + ((this.field642[this.field643 - 3] & 0xFF) << 16) + ((this.field642[this.field643 - 1] & 0xFF) << 8) : this.field637;
    }

    @OriginalMember(owner = "DNRIFKTO", name = "h", descriptor = "(II)V")
    public void method221(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 24);
        if (arg1 != 0) {
            this.field629 = !this.field629;
        }
        this.field642[this.field643++] = (byte) arg0;
        this.field642[this.field643++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "g", descriptor = "(B)I")
    public int method222(byte arg0) {
        this.field643 += 4;
        if (arg0 == 0) {
            boolean var2 = false;
            return (this.field642[this.field643 - 4] & 0xFF) + ((this.field642[this.field643 - 3] & 0xFF) << 8) + ((this.field642[this.field643 - 1] & 0xFF) << 24) + ((this.field642[this.field643 - 2] & 0xFF) << 16);
        } else {
            return this.field627;
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "o", descriptor = "(I)I")
    public int method223(int arg0) {
        this.field643 += 4;
        return arg0 <= 0 ? 0 : (this.field642[this.field643 - 3] & 0xFF) + ((this.field642[this.field643 - 4] & 0xFF) << 8) + ((this.field642[this.field643 - 2] & 0xFF) << 24) + ((this.field642[this.field643 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "p", descriptor = "(I)I")
    public int method224(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field643 += 4;
        return (this.field642[this.field643 - 2] & 0xFF) + ((this.field642[this.field643 - 1] & 0xFF) << 8) + ((this.field642[this.field643 - 3] & 0xFF) << 24) + ((this.field642[this.field643 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "DNRIFKTO", name = "b", descriptor = "(I[BII)V")
    public void method225(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 31 / arg2;
        for (int var6 = arg0 + arg3 - 1; var6 >= arg3; var6--) {
            this.field642[this.field643++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "DNRIFKTO", name = "a", descriptor = "(II[BI)V")
    public void method226(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 > 0) {
            for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
                arg2[var5] = (byte) (this.field642[this.field643++] - 128);
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
            field645[var0] = var1;
        }
        field646 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field651 = new class70(-489);
        field652 = new class70(-489);
        field653 = new class70(-489);
        field654 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
