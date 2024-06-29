import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EMWAMCXW")
public class class14 extends class64 {

    @OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "Z")
    private boolean field693 = false;

    @OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "B")
    private byte field694 = 119;

    @OriginalMember(owner = "client!EMWAMCXW", name = "l", descriptor = "Z")
    private boolean field695 = true;

    @OriginalMember(owner = "client!EMWAMCXW", name = "m", descriptor = "I")
    private int field696 = 7;

    @OriginalMember(owner = "client!EMWAMCXW", name = "n", descriptor = "I")
    private int field697 = 12497;

    @OriginalMember(owner = "client!EMWAMCXW", name = "o", descriptor = "Z")
    private boolean field698 = false;

    @OriginalMember(owner = "client!EMWAMCXW", name = "q", descriptor = "I")
    private int field700 = -899;

    @OriginalMember(owner = "client!EMWAMCXW", name = "r", descriptor = "Z")
    private boolean field701 = false;

    @OriginalMember(owner = "client!EMWAMCXW", name = "s", descriptor = "Z")
    private boolean field702 = false;

    @OriginalMember(owner = "client!EMWAMCXW", name = "t", descriptor = "Z")
    private boolean field703 = true;

    @OriginalMember(owner = "client!EMWAMCXW", name = "u", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "client!EMWAMCXW", name = "v", descriptor = "Z")
    private boolean field705 = false;

    @OriginalMember(owner = "client!EMWAMCXW", name = "w", descriptor = "[B")
    public byte[] field706;

    @OriginalMember(owner = "client!EMWAMCXW", name = "x", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!EMWAMCXW", name = "z", descriptor = "[I")
    private static int[] field709 = new int[256];

    @OriginalMember(owner = "client!EMWAMCXW", name = "A", descriptor = "[I")
    private static final int[] field710;

    @OriginalMember(owner = "client!EMWAMCXW", name = "F", descriptor = "LWTGHTNMN;")
    private static class57 field715;

    @OriginalMember(owner = "client!EMWAMCXW", name = "G", descriptor = "LWTGHTNMN;")
    private static class57 field716;

    @OriginalMember(owner = "client!EMWAMCXW", name = "H", descriptor = "LWTGHTNMN;")
    private static class57 field717;

    @OriginalMember(owner = "client!EMWAMCXW", name = "I", descriptor = "[C")
    private static char[] field718;

    @OriginalMember(owner = "client!EMWAMCXW", name = "p", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "client!EMWAMCXW", name = "y", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!EMWAMCXW", name = "C", descriptor = "I")
    private static int field712;

    @OriginalMember(owner = "client!EMWAMCXW", name = "D", descriptor = "I")
    private static int field713;

    @OriginalMember(owner = "client!EMWAMCXW", name = "E", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "client!EMWAMCXW", name = "B", descriptor = "LYJYHBEIS;")
    public class63 field711;

    @OriginalMember(owner = "client!EMWAMCXW", name = "J", descriptor = "Z")
    public static boolean field719;

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IB)LEMWAMCXW;")
    public static class14 method205(int arg0, byte arg1) {
        class57 var2 = field716;
        synchronized (field716) {
            class14 var3 = null;
            if (arg0 == 0 && field712 > 0) {
                field712--;
                var3 = (class14) field715.method469();
            } else if (arg0 == 1 && field713 > 0) {
                field713--;
                var3 = (class14) field716.method469();
            } else if (arg0 == 2 && field714 > 0) {
                field714--;
                var3 = (class14) field717.method469();
            }
            if (var3 != null) {
                var3.field707 = 0;
                return var3;
            }
        }
        class14 var5 = new class14(1);
        var5.field707 = 0;
        if (arg1 != -102) {
            throw new NullPointerException();
        }
        if (arg0 == 0) {
            var5.field706 = new byte[100];
        } else if (arg0 == 1) {
            var5.field706 = new byte[5000];
        } else {
            var5.field706 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "<init>", descriptor = "(I)V")
    private class14(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field705 = !this.field705;
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "<init>", descriptor = "([BZ)V")
    public class14(byte[] arg0, boolean arg1) {
        this.field706 = arg0;
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field707 = 0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(II)V")
    public void method206(int arg0, int arg1) {
        this.field706[this.field707++] = (byte) (arg0 + this.field711.method496());
        int var3 = 18 / arg1;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(I)V")
    public void method207(int arg0) {
        this.field706[this.field707++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(I)V")
    public void method208(int arg0) {
        this.field706[this.field707++] = (byte) (arg0 >> 8);
        this.field706[this.field707++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(II)V")
    public void method209(int arg0, int arg1) {
        if (arg1 == 1) {
            this.field706[this.field707++] = (byte) arg0;
            this.field706[this.field707++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(I)V")
    public void method210(int arg0) {
        this.field706[this.field707++] = (byte) (arg0 >> 16);
        this.field706[this.field707++] = (byte) (arg0 >> 8);
        this.field706[this.field707++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(I)V")
    public void method211(int arg0) {
        this.field706[this.field707++] = (byte) (arg0 >> 24);
        this.field706[this.field707++] = (byte) (arg0 >> 16);
        this.field706[this.field707++] = (byte) (arg0 >> 8);
        this.field706[this.field707++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(II)V")
    public void method212(int arg0, int arg1) {
        this.field706[this.field707++] = (byte) arg1;
        this.field706[this.field707++] = (byte) (arg1 >> 8);
        if (arg0 > 0) {
            this.field706[this.field707++] = (byte) (arg1 >> 16);
            this.field706[this.field707++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(JZ)V")
    public void method213(long arg0, boolean arg1) {
        this.field706[this.field707++] = (byte) (arg0 >> 56);
        this.field706[this.field707++] = (byte) (arg0 >> 48);
        this.field706[this.field707++] = (byte) (arg0 >> 40);
        this.field706[this.field707++] = (byte) (arg0 >> 32);
        this.field706[this.field707++] = (byte) (arg0 >> 24);
        if (arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field706[this.field707++] = (byte) (arg0 >> 16);
        this.field706[this.field707++] = (byte) (arg0 >> 8);
        this.field706[this.field707++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method214(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field706, this.field707);
        this.field707 += arg0.length();
        this.field706[this.field707++] = 10;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "([BBII)V")
    public void method215(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -18) {
            this.field704 = !this.field704;
        }
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            this.field706[this.field707++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(ZI)V")
    public void method216(boolean arg0, int arg1) {
        this.field706[this.field707 - arg1 - 1] = (byte) arg1;
        if (arg0) {
            this.field703 = !this.field703;
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "()I")
    public int method217() {
        return this.field706[this.field707++] & 0xFF;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "()B")
    public byte method218() {
        return this.field706[this.field707++];
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "()I")
    public int method219() {
        this.field707 += 2;
        return ((this.field706[this.field707 - 2] & 0xFF) << 8) + (this.field706[this.field707 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "()I")
    public int method220() {
        this.field707 += 2;
        int var1 = ((this.field706[this.field707 - 2] & 0xFF) << 8) + (this.field706[this.field707 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "()I")
    public int method221() {
        this.field707 += 3;
        return (this.field706[this.field707 - 1] & 0xFF) + ((this.field706[this.field707 - 3] & 0xFF) << 16) + ((this.field706[this.field707 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "()I")
    public int method222() {
        this.field707 += 4;
        return (this.field706[this.field707 - 1] & 0xFF) + ((this.field706[this.field707 - 2] & 0xFF) << 8) + ((this.field706[this.field707 - 4] & 0xFF) << 24) + ((this.field706[this.field707 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(I)J")
    public long method223(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field700 = -282;
        }
        long var2 = (long) this.method222() & 0xFFFFFFFFL;
        long var4 = (long) this.method222() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "i", descriptor = "()Ljava/lang/String;")
    public String method224() {
        int var1 = this.field707;
        while (this.field706[this.field707++] != 10) {
        }
        return new String(this.field706, var1, this.field707 - var1 - 1);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "(I)[B")
    public byte[] method225(int arg0) {
        while (arg0 >= 0) {
            this.field695 = !this.field695;
        }
        int var2 = this.field707;
        while (this.field706[this.field707++] != 10) {
        }
        byte[] var3 = new byte[this.field707 - var2 - 1];
        for (int var4 = var2; var4 < this.field707 - 1; var4++) {
            var3[var4 - var2] = this.field706[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "([BIII)V")
    public void method226(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                arg0[var5] = this.field706[this.field707++];
            }
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(B)V")
    public void method227(byte arg0) {
        if (arg0 == 31) {
            this.field708 = this.field707 * 8;
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(II)I")
    public int method228(int arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            return this.field700;
        }
        int var3 = this.field708 >> 3;
        int var4 = 8 - (this.field708 & 0x7);
        int var5 = 0;
        this.field708 += arg0;
        while (arg0 > var4) {
            var5 += (this.field706[var3++] & field710[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field706[var3] & field710[var4]) + var5;
        } else {
            var6 = (this.field706[var3] >> var4 - arg0 & field710[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(B)V")
    public void method229(byte arg0) {
        this.field707 = (this.field708 + 7) / 8;
        if (arg0 != 92) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "()I")
    public int method230() {
        int var1 = this.field706[this.field707] & 0xFF;
        return var1 < 128 ? this.method217() - 64 : this.method219() - 49152;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "()I")
    public int method231() {
        int var1 = this.field706[this.field707] & 0xFF;
        return var1 < 128 ? this.method217() : this.method219() - 32768;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method232(boolean arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field707;
        this.field707 = 0;
        byte[] var5 = new byte[var4];
        this.method226(var5, 0, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        if (arg0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        this.field707 = 0;
        this.method207(var8.length);
        this.method215(var8, (byte) -18, var8.length, 0);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(II)V")
    public void method233(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field699 = 249;
        }
        this.field706[this.field707++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IZ)V")
    public void method234(int arg0, boolean arg1) {
        if (arg1) {
            this.field706[this.field707++] = (byte) -arg0;
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "(II)V")
    public void method235(int arg0, int arg1) {
        this.field706[this.field707++] = (byte) (128 - arg1);
        if (arg0 != 0) {
            this.field700 = -23;
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "(I)I")
    public int method236(int arg0) {
        if (arg0 != 29396) {
            this.field701 = !this.field701;
        }
        return this.field706[this.field707++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(Z)I")
    public int method237(boolean arg0) {
        return arg0 ? -this.field706[this.field707++] & 0xFF : this.field699;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(B)I")
    public int method238(byte arg0) {
        return arg0 == 93 ? 128 - this.field706[this.field707++] & 0xFF : 2;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "(I)B")
    public byte method239(int arg0) {
        if (arg0 != 7085) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.field706[this.field707++] - 128);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(Z)B")
    public byte method240(boolean arg0) {
        if (arg0) {
            this.field701 = !this.field701;
        }
        return (byte) -this.field706[this.field707++];
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "i", descriptor = "(I)B")
    public byte method241(int arg0) {
        if (arg0 >= 0) {
            this.field700 = -24;
        }
        return (byte) (128 - this.field706[this.field707++]);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "(II)V")
    public void method242(int arg0, int arg1) {
        this.field706[this.field707++] = (byte) arg0;
        this.field706[this.field707++] = (byte) (arg0 >> 8);
        if (arg1 != 28989) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(BI)V")
    public void method243(byte arg0, int arg1) {
        if (arg0 == 15) {
            this.field706[this.field707++] = (byte) (arg1 >> 8);
            this.field706[this.field707++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(ZI)V")
    public void method244(boolean arg0, int arg1) {
        if (!arg0) {
            this.field699 = 211;
        }
        this.field706[this.field707++] = (byte) (arg1 + 128);
        this.field706[this.field707++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "(I)I")
    public int method245(int arg0) {
        this.field707 += 2;
        while (arg0 >= 0) {
            this.field699 = 214;
        }
        return ((this.field706[this.field707 - 1] & 0xFF) << 8) + (this.field706[this.field707 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "(I)I")
    public int method246(int arg0) {
        this.field707 += 2;
        if (arg0 <= 0) {
            this.field693 = !this.field693;
        }
        return ((this.field706[this.field707 - 2] & 0xFF) << 8) + (this.field706[this.field707 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "l", descriptor = "(I)I")
    public int method247(int arg0) {
        this.field707 += 2;
        if (arg0 >= 0) {
            this.field695 = !this.field695;
        }
        return ((this.field706[this.field707 - 1] & 0xFF) << 8) + (this.field706[this.field707 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(B)I")
    public int method248(byte arg0) {
        this.field707 += 2;
        int var2 = ((this.field706[this.field707 - 1] & 0xFF) << 8) + (this.field706[this.field707 - 2] & 0xFF);
        if (arg0 != 93) {
            this.field705 = !this.field705;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "m", descriptor = "(I)I")
    public int method249(int arg0) {
        this.field707 += 2;
        int var2 = ((this.field706[this.field707 - 1] & 0xFF) << 8) + (this.field706[this.field707 - 2] - 128 & 0xFF);
        int var3 = 0 / arg0;
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(B)I")
    public int method250(byte arg0) {
        this.field707 += 3;
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field696 = 309;
        }
        return (this.field706[this.field707 - 3] & 0xFF) + ((this.field706[this.field707 - 1] & 0xFF) << 16) + ((this.field706[this.field707 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "(II)V")
    public void method251(int arg0, int arg1) {
        this.field706[this.field707++] = (byte) (arg1 >> 8);
        this.field706[this.field707++] = (byte) arg1;
        if (arg0 == 0) {
            this.field706[this.field707++] = (byte) (arg1 >> 24);
            this.field706[this.field707++] = (byte) (arg1 >> 16);
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(Z)I")
    public int method252(boolean arg0) {
        if (arg0) {
            return 1;
        } else {
            this.field707 += 4;
            return (this.field706[this.field707 - 3] & 0xFF) + ((this.field706[this.field707 - 4] & 0xFF) << 8) + ((this.field706[this.field707 - 2] & 0xFF) << 24) + ((this.field706[this.field707 - 1] & 0xFF) << 16);
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(Z)I")
    public int method253(boolean arg0) {
        this.field707 += 4;
        if (arg0) {
            this.field699 = 458;
        }
        return (this.field706[this.field707 - 2] & 0xFF) + ((this.field706[this.field707 - 1] & 0xFF) << 8) + ((this.field706[this.field707 - 3] & 0xFF) << 24) + ((this.field706[this.field707 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IB[BI)V")
    public void method254(int arg0, byte arg1, byte[] arg2, int arg3) {
        if (arg1 == 8) {
            for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
                this.field706[this.field707++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(I[BII)V")
    public void method255(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 == -18210) {
            for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
                arg1[var5] = (byte) (this.field706[this.field707++] - 128);
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
            field709[var0] = var1;
        }
        field710 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field715 = new class57(36113);
        field716 = new class57(36113);
        field717 = new class57(36113);
        field718 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
