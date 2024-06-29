import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FTMSICIZ")
public class class13 extends class9 {

    @OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "I")
    private int field625 = 358;

    @OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "I")
    private int field626 = 8;

    @OriginalMember(owner = "client!FTMSICIZ", name = "m", descriptor = "I")
    private int field628 = -33469;

    @OriginalMember(owner = "client!FTMSICIZ", name = "n", descriptor = "I")
    private int field629 = 9453;

    @OriginalMember(owner = "client!FTMSICIZ", name = "o", descriptor = "Z")
    private boolean field630 = false;

    @OriginalMember(owner = "client!FTMSICIZ", name = "p", descriptor = "I")
    private int field631 = -48253;

    @OriginalMember(owner = "client!FTMSICIZ", name = "q", descriptor = "Z")
    private boolean field632 = false;

    @OriginalMember(owner = "client!FTMSICIZ", name = "r", descriptor = "B")
    private byte field633 = 102;

    @OriginalMember(owner = "client!FTMSICIZ", name = "s", descriptor = "I")
    private int field634 = 865;

    @OriginalMember(owner = "client!FTMSICIZ", name = "t", descriptor = "B")
    private byte field635 = 5;

    @OriginalMember(owner = "client!FTMSICIZ", name = "u", descriptor = "I")
    private int field636 = 25957;

    @OriginalMember(owner = "client!FTMSICIZ", name = "v", descriptor = "Z")
    private boolean field637 = true;

    @OriginalMember(owner = "client!FTMSICIZ", name = "w", descriptor = "I")
    private int field638 = -3404;

    @OriginalMember(owner = "client!FTMSICIZ", name = "x", descriptor = "Z")
    private boolean field639 = false;

    @OriginalMember(owner = "client!FTMSICIZ", name = "y", descriptor = "Z")
    private boolean field640 = true;

    @OriginalMember(owner = "client!FTMSICIZ", name = "z", descriptor = "I")
    private int field641 = 402;

    @OriginalMember(owner = "client!FTMSICIZ", name = "A", descriptor = "[B")
    public byte[] field642;

    @OriginalMember(owner = "client!FTMSICIZ", name = "B", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!FTMSICIZ", name = "D", descriptor = "[I")
    private static int[] field645 = new int[256];

    @OriginalMember(owner = "client!FTMSICIZ", name = "E", descriptor = "[I")
    private static final int[] field646;

    @OriginalMember(owner = "client!FTMSICIZ", name = "J", descriptor = "LQGWIBVPG;")
    private static class42 field651;

    @OriginalMember(owner = "client!FTMSICIZ", name = "K", descriptor = "LQGWIBVPG;")
    private static class42 field652;

    @OriginalMember(owner = "client!FTMSICIZ", name = "L", descriptor = "LQGWIBVPG;")
    private static class42 field653;

    @OriginalMember(owner = "client!FTMSICIZ", name = "M", descriptor = "[C")
    private static char[] field654;

    @OriginalMember(owner = "client!FTMSICIZ", name = "l", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!FTMSICIZ", name = "C", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!FTMSICIZ", name = "G", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "client!FTMSICIZ", name = "H", descriptor = "I")
    private static int field649;

    @OriginalMember(owner = "client!FTMSICIZ", name = "I", descriptor = "I")
    private static int field650;

    @OriginalMember(owner = "client!FTMSICIZ", name = "F", descriptor = "LYEQNFKYU;")
    public class65 field647;

    @OriginalMember(owner = "client!FTMSICIZ", name = "N", descriptor = "Z")
    public static boolean field655;

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II)LFTMSICIZ;")
    public static class13 method201(int arg0, int arg1) {
        if (arg0 != 21834) {
            throw new NullPointerException();
        }
        class42 var2 = field652;
        synchronized (field652) {
            class13 var3 = null;
            if (arg1 == 0 && field648 > 0) {
                field648--;
                var3 = (class13) field651.method421();
            } else if (arg1 == 1 && field649 > 0) {
                field649--;
                var3 = (class13) field652.method421();
            } else if (arg1 == 2 && field650 > 0) {
                field650--;
                var3 = (class13) field653.method421();
            }
            if (var3 != null) {
                var3.field643 = 0;
                return var3;
            }
        }
        class13 var5 = new class13(false);
        var5.field643 = 0;
        if (arg1 == 0) {
            var5.field642 = new byte[100];
        } else if (arg1 == 1) {
            var5.field642 = new byte[5000];
        } else {
            var5.field642 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "<init>", descriptor = "(Z)V")
    private class13(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "<init>", descriptor = "([BB)V")
    public class13(byte[] arg0, byte arg1) {
        this.field642 = arg0;
        this.field643 = 0;
        if (arg1 != 3) {
            this.field639 = !this.field639;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(BI)V")
    public void method202(byte arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg1 + this.field647.method544());
        if (arg0 != 64) {
            this.field638 = 429;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(I)V")
    public void method203(int arg0) {
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(I)V")
    public void method204(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(II)V")
    public void method205(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) arg1;
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        if (arg0 != -20315) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(I)V")
    public void method206(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field642[this.field643++] = (byte) (arg0 >> 24);
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(ZI)V")
    public void method208(boolean arg0, int arg1) {
        this.field642[this.field643++] = (byte) arg1;
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        if (arg0) {
            this.field642[this.field643++] = (byte) (arg1 >> 16);
            this.field642[this.field643++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(JB)V")
    public void method209(long arg0, byte arg1) {
        this.field642[this.field643++] = (byte) (arg0 >> 56);
        if (arg1 != 7) {
            return;
        }
        boolean var4 = false;
        this.field642[this.field643++] = (byte) (arg0 >> 48);
        this.field642[this.field643++] = (byte) (arg0 >> 40);
        this.field642[this.field643++] = (byte) (arg0 >> 32);
        this.field642[this.field643++] = (byte) (arg0 >> 24);
        this.field642[this.field643++] = (byte) (arg0 >> 16);
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method210(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field642, this.field643);
        this.field643 += arg0.length();
        this.field642[this.field643++] = 10;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II[BI)V")
    public void method211(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 > 0) {
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                this.field642[this.field643++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(ZI)V")
    public void method212(boolean arg0, int arg1) {
        this.field642[this.field643 - arg1 - 1] = (byte) arg1;
        if (arg0) {
            this.field638 = 460;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "()I")
    public int method213() {
        return this.field642[this.field643++] & 0xFF;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "()B")
    public byte method214() {
        return this.field642[this.field643++];
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "()I")
    public int method215() {
        this.field643 += 2;
        return ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "()I")
    public int method216() {
        this.field643 += 2;
        int var1 = ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "()I")
    public int method217() {
        this.field643 += 3;
        return (this.field642[this.field643 - 1] & 0xFF) + ((this.field642[this.field643 - 3] & 0xFF) << 16) + ((this.field642[this.field643 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "()I")
    public int method218() {
        this.field643 += 4;
        return (this.field642[this.field643 - 1] & 0xFF) + ((this.field642[this.field643 - 2] & 0xFF) << 8) + ((this.field642[this.field643 - 4] & 0xFF) << 24) + ((this.field642[this.field643 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(Z)J")
    public long method219(boolean arg0) {
        long var2 = (long) this.method218() & 0xFFFFFFFFL;
        long var4 = (long) this.method218() & 0xFFFFFFFFL;
        if (arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "()Ljava/lang/String;")
    public String method220() {
        int var1 = this.field643;
        while (this.field642[this.field643++] != 10) {
        }
        return new String(this.field642, var1, this.field643 - var1 - 1);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "(I)[B")
    public byte[] method221(int arg0) {
        int var2 = this.field643;
        while (this.field642[this.field643++] != 10) {
        }
        byte[] var3 = new byte[this.field643 - var2 - 1];
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var4 = var2; var4 < this.field643 - 1; var4++) {
            var3[var4 - var2] = this.field642[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(I[BII)V")
    public void method222(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 0) {
            for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
                arg1[var5] = this.field642[this.field643++];
            }
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "(I)V")
    public void method223(int arg0) {
        this.field644 = this.field643 * 8;
        if (arg0 != -25838) {
            this.field641 = -62;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(II)I")
    public int method224(int arg0, int arg1) {
        int var3 = 18 / arg1;
        int var4 = this.field644 >> 3;
        int var5 = 8 - (this.field644 & 0x7);
        int var6 = 0;
        this.field644 += arg0;
        while (arg0 > var5) {
            var6 += (this.field642[var4++] & field646[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (this.field642[var4] & field646[var5]) + var6;
        } else {
            var7 = (this.field642[var4] >> var5 - arg0 & field646[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "(I)V")
    public void method225(int arg0) {
        this.field643 = (this.field644 + 7) / 8;
        int var2 = 10 / arg0;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "()I")
    public int method226() {
        int var1 = this.field642[this.field643] & 0xFF;
        return var1 < 128 ? this.method213() - 64 : this.method215() - 49152;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "()I")
    public int method227() {
        int var1 = this.field642[this.field643] & 0xFF;
        return var1 < 128 ? this.method213() : this.method215() - 32768;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method228(int arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field643;
        this.field643 = 0;
        byte[] var5 = new byte[var4];
        this.method222(0, var5, var4, -10);
        BigInteger var6 = new BigInteger(var5);
        if (arg0 != -29356) {
            this.field627 = -248;
        }
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field643 = 0;
        this.method203(var8.length);
        this.method211(0, 531, var8, var8.length);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(II)V")
    public void method229(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg0 + 128);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(ZI)V")
    public void method230(boolean arg0, int arg1) {
        if (arg0) {
            this.field630 = !this.field630;
        }
        this.field642[this.field643++] = (byte) -arg1;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "(II)V")
    public void method231(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) (128 - arg1);
        if (arg0 != 0) {
            this.field639 = !this.field639;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "(I)I")
    public int method232(int arg0) {
        if (this.field631 != arg0) {
            this.field639 = !this.field639;
        }
        return this.field642[this.field643++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "(I)I")
    public int method233(int arg0) {
        return arg0 == 7 ? -this.field642[this.field643++] & 0xFF : 3;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(Z)I")
    public int method234(boolean arg0) {
        if (arg0) {
            this.field638 = -150;
        }
        return 128 - this.field642[this.field643++] & 0xFF;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(Z)B")
    public byte method235(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field642[this.field643++] - 128);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "(I)B")
    public byte method236(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field642[this.field643++];
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(Z)B")
    public byte method237(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field642[this.field643++]);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(IB)V")
    public void method238(int arg0, byte arg1) {
        if (this.field633 == arg1) {
            this.field642[this.field643++] = (byte) arg0;
            this.field642[this.field643++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "(II)V")
    public void method239(int arg0, int arg1) {
        if (arg1 != -14191) {
            this.field629 = -172;
        }
        this.field642[this.field643++] = (byte) (arg0 >> 8);
        this.field642[this.field643++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "(II)V")
    public void method240(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg1 + 128);
        if (arg0 > 0) {
            this.field642[this.field643++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "(I)I")
    public int method241(int arg0) {
        this.field643 += 2;
        return arg0 == -12702 ? ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] & 0xFF) : 3;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "l", descriptor = "(I)I")
    public int method242(int arg0) {
        if (arg0 == 4) {
            this.field643 += 2;
            return ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] - 128 & 0xFF);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(B)I")
    public int method243(byte arg0) {
        this.field643 += 2;
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "m", descriptor = "(I)I")
    public int method244(int arg0) {
        this.field643 += 2;
        int var2 = ((this.field642[this.field643 - 2] & 0xFF) << 8) + (this.field642[this.field643 - 1] - 128 & 0xFF);
        int var3 = 40 / arg0;
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(B)I")
    public int method245(byte arg0) {
        this.field643 += 2;
        int var2 = ((this.field642[this.field643 - 1] & 0xFF) << 8) + (this.field642[this.field643 - 2] - 128 & 0xFF);
        if (arg0 != -80) {
            this.field630 = !this.field630;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "n", descriptor = "(I)I")
    public int method246(int arg0) {
        this.field643 += 3;
        return arg0 < 0 ? (this.field642[this.field643 - 3] & 0xFF) + ((this.field642[this.field643 - 1] & 0xFF) << 16) + ((this.field642[this.field643 - 2] & 0xFF) << 8) : this.field631;
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "(II)V")
    public void method247(int arg0, int arg1) {
        this.field642[this.field643++] = (byte) (arg1 >> 8);
        this.field642[this.field643++] = (byte) arg1;
        this.field642[this.field643++] = (byte) (arg1 >> 24);
        int var3 = 54 / arg0;
        this.field642[this.field643++] = (byte) (arg1 >> 16);
        if (class41.field1195) {
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(B)I")
    public int method248(byte arg0) {
        this.field643 += 4;
        if (arg0 == 5) {
            boolean var2 = false;
            return (this.field642[this.field643 - 4] & 0xFF) + ((this.field642[this.field643 - 3] & 0xFF) << 8) + ((this.field642[this.field643 - 1] & 0xFF) << 24) + ((this.field642[this.field643 - 2] & 0xFF) << 16);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "o", descriptor = "(I)I")
    public int method249(int arg0) {
        if (arg0 != 25957) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field643 += 4;
        return (this.field642[this.field643 - 3] & 0xFF) + ((this.field642[this.field643 - 4] & 0xFF) << 8) + ((this.field642[this.field643 - 2] & 0xFF) << 24) + ((this.field642[this.field643 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "p", descriptor = "(I)I")
    public int method250(int arg0) {
        this.field643 += 4;
        if (arg0 != 0) {
            this.field640 = !this.field640;
        }
        return (this.field642[this.field643 - 2] & 0xFF) + ((this.field642[this.field643 - 1] & 0xFF) << 8) + ((this.field642[this.field643 - 3] & 0xFF) << 24) + ((this.field642[this.field643 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II[BB)V")
    public void method251(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 != 7) {
            this.field624 = !this.field624;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
            this.field642[this.field643++] = (byte) (arg2[var5] + 128);
        }
    }

    @OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(II[BI)V")
    public void method252(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 >= 0) {
            this.field640 = !this.field640;
        }
        for (int var5 = arg1 + arg3 - 1; var5 >= arg1; var5--) {
            arg2[var5] = this.field642[this.field643++];
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
        field651 = new class42(9203);
        field652 = new class42(9203);
        field653 = new class42(9203);
        field654 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
