import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CMGGUSPR")
public class class10 extends class26 {

    @OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "I")
    private int field626 = 536;

    @OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "B")
    private byte field627 = -20;

    @OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "I")
    private int field628 = -4554;

    @OriginalMember(owner = "client!CMGGUSPR", name = "m", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "client!CMGGUSPR", name = "n", descriptor = "B")
    private byte field631 = 73;

    @OriginalMember(owner = "client!CMGGUSPR", name = "o", descriptor = "B")
    private byte field632 = 4;

    @OriginalMember(owner = "client!CMGGUSPR", name = "p", descriptor = "I")
    private int field633 = -784;

    @OriginalMember(owner = "client!CMGGUSPR", name = "q", descriptor = "B")
    private byte field634 = 7;

    @OriginalMember(owner = "client!CMGGUSPR", name = "r", descriptor = "I")
    private int field635 = -39668;

    @OriginalMember(owner = "client!CMGGUSPR", name = "s", descriptor = "Z")
    private boolean field636 = true;

    @OriginalMember(owner = "client!CMGGUSPR", name = "t", descriptor = "I")
    private int field637 = 8;

    @OriginalMember(owner = "client!CMGGUSPR", name = "u", descriptor = "B")
    private byte field638 = 6;

    @OriginalMember(owner = "client!CMGGUSPR", name = "v", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "client!CMGGUSPR", name = "x", descriptor = "I")
    private int field641 = 890;

    @OriginalMember(owner = "client!CMGGUSPR", name = "y", descriptor = "Z")
    private boolean field642 = true;

    @OriginalMember(owner = "client!CMGGUSPR", name = "A", descriptor = "Z")
    private boolean field644 = false;

    @OriginalMember(owner = "client!CMGGUSPR", name = "B", descriptor = "[B")
    public byte[] field645;

    @OriginalMember(owner = "client!CMGGUSPR", name = "C", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!CMGGUSPR", name = "z", descriptor = "I")
    private static int field643 = -12929;

    @OriginalMember(owner = "client!CMGGUSPR", name = "E", descriptor = "[I")
    private static int[] field648 = new int[256];

    @OriginalMember(owner = "client!CMGGUSPR", name = "F", descriptor = "[I")
    private static final int[] field649;

    @OriginalMember(owner = "client!CMGGUSPR", name = "K", descriptor = "LWCVCMGLX;")
    private static class62 field654;

    @OriginalMember(owner = "client!CMGGUSPR", name = "L", descriptor = "LWCVCMGLX;")
    private static class62 field655;

    @OriginalMember(owner = "client!CMGGUSPR", name = "M", descriptor = "LWCVCMGLX;")
    private static class62 field656;

    @OriginalMember(owner = "client!CMGGUSPR", name = "N", descriptor = "[C")
    private static char[] field657;

    @OriginalMember(owner = "client!CMGGUSPR", name = "l", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!CMGGUSPR", name = "w", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!CMGGUSPR", name = "D", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!CMGGUSPR", name = "H", descriptor = "I")
    private static int field651;

    @OriginalMember(owner = "client!CMGGUSPR", name = "I", descriptor = "I")
    private static int field652;

    @OriginalMember(owner = "client!CMGGUSPR", name = "J", descriptor = "I")
    private static int field653;

    @OriginalMember(owner = "client!CMGGUSPR", name = "G", descriptor = "LRYDUASDW;")
    public class49 field650;

    @OriginalMember(owner = "client!CMGGUSPR", name = "O", descriptor = "Z")
    public static boolean field658;

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(II)LCMGGUSPR;")
    public static class10 method182(int arg0, int arg1) {
        class62 var2 = field655;
        synchronized (field655) {
            class10 var3 = null;
            if (arg0 == 0 && field651 > 0) {
                field651--;
                var3 = (class10) field654.method566();
            } else if (arg0 == 1 && field652 > 0) {
                field652--;
                var3 = (class10) field655.method566();
            } else if (arg0 == 2 && field653 > 0) {
                field653--;
                var3 = (class10) field656.method566();
            }
            if (var3 != null) {
                var3.field646 = 0;
                return var3;
            }
        }
        class10 var5 = new class10(18493);
        if (arg1 <= 0) {
            field643 = -287;
        }
        var5.field646 = 0;
        if (arg0 == 0) {
            var5.field645 = new byte[100];
        } else if (arg0 == 1) {
            var5.field645 = new byte[5000];
        } else {
            var5.field645 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "<init>", descriptor = "(I)V")
    private class10(int arg0) {
        if (arg0 != 18493) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "<init>", descriptor = "([BI)V")
    public class10(byte[] arg0, int arg1) {
        this.field645 = arg0;
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        this.field646 = 0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(II)V")
    public void method183(int arg0, int arg1) {
        int var3 = 92 / arg1;
        this.field645[this.field646++] = (byte) (arg0 + this.field650.method437());
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(I)V")
    public void method184(int arg0) {
        this.field645[this.field646++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(I)V")
    public void method185(int arg0) {
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        this.field645[this.field646++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(II)V")
    public void method186(int arg0, int arg1) {
        this.field645[this.field646++] = (byte) arg0;
        if (arg1 != 0) {
            this.field626 = -356;
        }
        this.field645[this.field646++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(I)V")
    public void method187(int arg0) {
        this.field645[this.field646++] = (byte) (arg0 >> 16);
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        this.field645[this.field646++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(I)V")
    public void method188(int arg0) {
        this.field645[this.field646++] = (byte) (arg0 >> 24);
        this.field645[this.field646++] = (byte) (arg0 >> 16);
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        this.field645[this.field646++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IZ)V")
    public void method189(int arg0, boolean arg1) {
        this.field645[this.field646++] = (byte) arg0;
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        this.field645[this.field646++] = (byte) (arg0 >> 16);
        if (arg1) {
            this.field645[this.field646++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IJ)V")
    public void method190(int arg0, long arg1) {
        this.field645[this.field646++] = (byte) (arg1 >> 56);
        this.field645[this.field646++] = (byte) (arg1 >> 48);
        if (arg0 < 5 || arg0 > 5) {
            return;
        }
        this.field645[this.field646++] = (byte) (arg1 >> 40);
        this.field645[this.field646++] = (byte) (arg1 >> 32);
        this.field645[this.field646++] = (byte) (arg1 >> 24);
        this.field645[this.field646++] = (byte) (arg1 >> 16);
        this.field645[this.field646++] = (byte) (arg1 >> 8);
        this.field645[this.field646++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method191(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field645, this.field646);
        this.field646 += arg0.length();
        this.field645[this.field646++] = 10;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(B[BII)V")
    public void method192(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (this.field627 != arg0) {
            this.field641 = -77;
        }
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            this.field645[this.field646++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(IZ)V")
    public void method193(int arg0, boolean arg1) {
        if (arg1) {
            this.field641 = -334;
        }
        this.field645[this.field646 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "()I")
    public int method194() {
        return this.field645[this.field646++] & 0xFF;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "()B")
    public byte method195() {
        return this.field645[this.field646++];
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "()I")
    public int method196() {
        this.field646 += 2;
        return ((this.field645[this.field646 - 2] & 0xFF) << 8) + (this.field645[this.field646 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "()I")
    public int method197() {
        this.field646 += 2;
        int var1 = ((this.field645[this.field646 - 2] & 0xFF) << 8) + (this.field645[this.field646 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "()I")
    public int method198() {
        this.field646 += 3;
        return (this.field645[this.field646 - 1] & 0xFF) + ((this.field645[this.field646 - 3] & 0xFF) << 16) + ((this.field645[this.field646 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "h", descriptor = "()I")
    public int method199() {
        this.field646 += 4;
        return (this.field645[this.field646 - 1] & 0xFF) + ((this.field645[this.field646 - 2] & 0xFF) << 8) + ((this.field645[this.field646 - 4] & 0xFF) << 24) + ((this.field645[this.field646 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(I)J")
    public long method200(int arg0) {
        if (arg0 != 3838) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method199() & 0xFFFFFFFFL;
        long var4 = (long) this.method199() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "()Ljava/lang/String;")
    public String method201() {
        int var1 = this.field646;
        while (this.field645[this.field646++] != 10) {
        }
        return new String(this.field645, var1, this.field646 - var1 - 1);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(Z)[B")
    public byte[] method202(boolean arg0) {
        int var2 = this.field646;
        if (!arg0) {
            this.field626 = 58;
        }
        while (this.field645[this.field646++] != 10) {
        }
        byte[] var3 = new byte[this.field646 - var2 - 1];
        for (int var4 = var2; var4 < this.field646 - 1; var4++) {
            var3[var4 - var2] = this.field645[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(II[BI)V")
    public void method203(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 <= 0) {
            this.field644 = !this.field644;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            arg2[var5] = this.field645[this.field646++];
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(B)V")
    public void method204(byte arg0) {
        if (arg0 != -36) {
            this.field644 = !this.field644;
        }
        this.field647 = this.field646 * 8;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(II)I")
    public int method205(int arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field647 >> 3;
        int var5 = 8 - (this.field647 & 0x7);
        int var6 = 0;
        this.field647 += arg0;
        while (arg0 > var5) {
            var6 += (this.field645[var4++] & field649[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (this.field645[var4] & field649[var5]) + var6;
        } else {
            var7 = (this.field645[var4] >> var5 - arg0 & field649[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(I)V")
    public void method206(int arg0) {
        int var2 = 63 / arg0;
        this.field646 = (this.field647 + 7) / 8;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "()I")
    public int method207() {
        int var1 = this.field645[this.field646] & 0xFF;
        return var1 < 128 ? this.method194() - 64 : this.method196() - 49152;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "()I")
    public int method208() {
        int var1 = this.field645[this.field646] & 0xFF;
        return var1 < 128 ? this.method194() : this.method196() - 32768;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method209(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field646;
        this.field646 = 0;
        byte[] var5 = new byte[var4];
        this.method203(956, 0, var5, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field646 = 0;
        this.method184(var8.length);
        this.method192((byte) -20, var8, var8.length, 0);
        if (arg0 != 0) {
            this.field630 = !this.field630;
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IB)V")
    public void method210(int arg0, byte arg1) {
        if (this.field631 != arg1) {
            this.field628 = 181;
        }
        this.field645[this.field646++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(IB)V")
    public void method211(int arg0, byte arg1) {
        if (arg1 != 51) {
            this.field629 = -261;
        }
        this.field645[this.field646++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(Z)I")
    public int method212(boolean arg0) {
        return arg0 ? 0 : this.field645[this.field646++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(B)I")
    public int method213(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
            return -this.field645[this.field646++] & 0xFF;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(Z)I")
    public int method214(boolean arg0) {
        return arg0 ? 1 : 128 - this.field645[this.field646++] & 0xFF;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(B)B")
    public byte method215(byte arg0) {
        if (this.field632 != arg0) {
            this.field641 = 349;
        }
        return (byte) (this.field645[this.field646++] - 128);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(B)B")
    public byte method216(byte arg0) {
        if (arg0 != 7) {
            this.field641 = 441;
        }
        return (byte) -this.field645[this.field646++];
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(B)B")
    public byte method217(byte arg0) {
        if (arg0 != 2) {
            this.field629 = -401;
        }
        return (byte) (128 - this.field645[this.field646++]);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(II)V")
    public void method218(int arg0, int arg1) {
        this.field645[this.field646++] = (byte) arg0;
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        if (arg1 != 0) {
            this.field630 = !this.field630;
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(II)V")
    public void method219(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        this.field645[this.field646++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "(II)V")
    public void method220(int arg0, int arg1) {
        this.field645[this.field646++] = (byte) (arg0 + 128);
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        if (arg1 == -7774) {
            ;
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "(I)I")
    public int method221(int arg0) {
        while (arg0 >= 0) {
            this.field642 = !this.field642;
        }
        this.field646 += 2;
        return ((this.field645[this.field646 - 1] & 0xFF) << 8) + (this.field645[this.field646 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "h", descriptor = "(I)I")
    public int method222(int arg0) {
        if (arg0 == 0) {
            this.field646 += 2;
            return ((this.field645[this.field646 - 2] & 0xFF) << 8) + (this.field645[this.field646 - 1] - 128 & 0xFF);
        } else {
            return field643;
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "(I)I")
    public int method223(int arg0) {
        this.field646 += 2;
        if (arg0 < 2 || arg0 > 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field645[this.field646 - 1] & 0xFF) << 8) + (this.field645[this.field646 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(B)I")
    public int method224(byte arg0) {
        this.field646 += 2;
        int var2 = ((this.field645[this.field646 - 2] & 0xFF) << 8) + (this.field645[this.field646 - 1] - 128 & 0xFF);
        if (arg0 != 6) {
            this.field626 = -39;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "(I)I")
    public int method225(int arg0) {
        if (arg0 != 17447) {
            this.field640 = 76;
        }
        this.field646 += 3;
        return (this.field645[this.field646 - 1] & 0xFF) + ((this.field645[this.field646 - 2] & 0xFF) << 16) + ((this.field645[this.field646 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(IB)V")
    public void method226(int arg0, byte arg1) {
        this.field645[this.field646++] = (byte) (arg0 >> 8);
        if (arg1 != -74) {
            this.field628 = 180;
        }
        this.field645[this.field646++] = (byte) arg0;
        this.field645[this.field646++] = (byte) (arg0 >> 24);
        this.field645[this.field646++] = (byte) (arg0 >> 16);
        if (class1.field4) {
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(Z)I")
    public int method227(boolean arg0) {
        this.field646 += 4;
        if (arg0) {
            this.field630 = !this.field630;
        }
        return (this.field645[this.field646 - 4] & 0xFF) + ((this.field645[this.field646 - 3] & 0xFF) << 8) + ((this.field645[this.field646 - 1] & 0xFF) << 24) + ((this.field645[this.field646 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "(I)I")
    public int method228(int arg0) {
        this.field646 += 4;
        return arg0 == -39668 ? (this.field645[this.field646 - 2] & 0xFF) + ((this.field645[this.field646 - 1] & 0xFF) << 8) + ((this.field645[this.field646 - 3] & 0xFF) << 24) + ((this.field645[this.field646 - 4] & 0xFF) << 16) : this.field629;
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(BI[BI)V")
    public void method229(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 6) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1 + arg3 - 1; var6 >= arg3; var6--) {
            this.field645[this.field646++] = (byte) (arg2[var6] + 128);
        }
    }

    @OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(II[BI)V")
    public void method230(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 58 / arg3;
        for (int var6 = arg0 + arg1 - 1; var6 >= arg0; var6--) {
            arg2[var6] = (byte) (this.field645[this.field646++] - 128);
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
            field648[var0] = var1;
        }
        field649 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field654 = new class62(-388);
        field655 = new class62(-388);
        field656 = new class62(-388);
        field657 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
