import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GHHPHSRU")
public class class14 extends class33 {

    @OriginalMember(owner = "GHHPHSRU", name = "j", descriptor = "I")
    private int field751 = -527;

    @OriginalMember(owner = "GHHPHSRU", name = "k", descriptor = "I")
    private int field752 = -887;

    @OriginalMember(owner = "GHHPHSRU", name = "m", descriptor = "Z")
    private boolean field754 = true;

    @OriginalMember(owner = "GHHPHSRU", name = "n", descriptor = "I")
    private int field755 = -8518;

    @OriginalMember(owner = "GHHPHSRU", name = "o", descriptor = "I")
    private int field756 = 6;

    @OriginalMember(owner = "GHHPHSRU", name = "p", descriptor = "I")
    private int field757 = 263;

    @OriginalMember(owner = "GHHPHSRU", name = "q", descriptor = "I")
    private int field758 = 43578;

    @OriginalMember(owner = "GHHPHSRU", name = "r", descriptor = "Z")
    private boolean field759 = false;

    @OriginalMember(owner = "GHHPHSRU", name = "s", descriptor = "I")
    private int field760 = -184;

    @OriginalMember(owner = "GHHPHSRU", name = "t", descriptor = "B")
    private byte field761 = 4;

    @OriginalMember(owner = "GHHPHSRU", name = "u", descriptor = "B")
    private byte field762 = 4;

    @OriginalMember(owner = "GHHPHSRU", name = "v", descriptor = "B")
    private byte field763 = -77;

    @OriginalMember(owner = "GHHPHSRU", name = "w", descriptor = "B")
    private byte field764 = 49;

    @OriginalMember(owner = "GHHPHSRU", name = "x", descriptor = "Z")
    private boolean field765 = true;

    @OriginalMember(owner = "GHHPHSRU", name = "y", descriptor = "Z")
    private boolean field766 = true;

    @OriginalMember(owner = "GHHPHSRU", name = "z", descriptor = "Z")
    private boolean field767 = false;

    @OriginalMember(owner = "GHHPHSRU", name = "A", descriptor = "[B")
    public byte[] field768;

    @OriginalMember(owner = "GHHPHSRU", name = "B", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "GHHPHSRU", name = "D", descriptor = "[I")
    private static int[] field771 = new int[256];

    @OriginalMember(owner = "GHHPHSRU", name = "E", descriptor = "[I")
    private static final int[] field772;

    @OriginalMember(owner = "GHHPHSRU", name = "J", descriptor = "LVYBZTNTY;")
    private static class57 field777;

    @OriginalMember(owner = "GHHPHSRU", name = "K", descriptor = "LVYBZTNTY;")
    private static class57 field778;

    @OriginalMember(owner = "GHHPHSRU", name = "L", descriptor = "LVYBZTNTY;")
    private static class57 field779;

    @OriginalMember(owner = "GHHPHSRU", name = "M", descriptor = "[C")
    private static char[] field780;

    @OriginalMember(owner = "GHHPHSRU", name = "i", descriptor = "I")
    private static int field750;

    @OriginalMember(owner = "GHHPHSRU", name = "l", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "GHHPHSRU", name = "C", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "GHHPHSRU", name = "G", descriptor = "I")
    private static int field774;

    @OriginalMember(owner = "GHHPHSRU", name = "H", descriptor = "I")
    private static int field775;

    @OriginalMember(owner = "GHHPHSRU", name = "I", descriptor = "I")
    private static int field776;

    @OriginalMember(owner = "GHHPHSRU", name = "F", descriptor = "LWBHAMUQI;")
    public class60 field773;

    @OriginalMember(owner = "GHHPHSRU", name = "N", descriptor = "Z")
    public static boolean field781;

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(II)LGHHPHSRU;")
    public static class14 method190(int arg0, int arg1) {
        class57 var2 = field778;
        synchronized (field778) {
            class14 var3 = null;
            if (arg1 == 0 && field774 > 0) {
                field774--;
                var3 = (class14) field777.method518();
            } else if (arg1 == 1 && field775 > 0) {
                field775--;
                var3 = (class14) field778.method518();
            } else if (arg1 == 2 && field776 > 0) {
                field776--;
                var3 = (class14) field779.method518();
            }
            if (var3 != null) {
                var3.field769 = 0;
                return var3;
            }
        }
        class14 var5 = new class14(field750);
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        var5.field769 = 0;
        if (arg1 == 0) {
            var5.field768 = new byte[100];
        } else if (arg1 == 1) {
            var5.field768 = new byte[5000];
        } else {
            var5.field768 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "<init>", descriptor = "(I)V")
    private class14(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "<init>", descriptor = "(I[B)V")
    public class14(int arg0, byte[] arg1) {
        this.field768 = arg1;
        this.field769 = 0;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(ZI)V")
    public void method191(boolean arg0, int arg1) {
        if (arg0) {
            this.field768[this.field769++] = (byte) (arg1 + this.field773.method533());
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(I)V")
    public void method192(int arg0) {
        this.field768[this.field769++] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(I)V")
    public void method193(int arg0) {
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        this.field768[this.field769++] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(II)V")
    public void method194(int arg0, int arg1) {
        this.field768[this.field769++] = (byte) arg0;
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        if (arg1 < 4 || arg1 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "c", descriptor = "(I)V")
    public void method195(int arg0) {
        this.field768[this.field769++] = (byte) (arg0 >> 16);
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        this.field768[this.field769++] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "d", descriptor = "(I)V")
    public void method196(int arg0) {
        this.field768[this.field769++] = (byte) (arg0 >> 24);
        this.field768[this.field769++] = (byte) (arg0 >> 16);
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        this.field768[this.field769++] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(BI)V")
    public void method197(byte arg0, int arg1) {
        this.field768[this.field769++] = (byte) arg1;
        this.field768[this.field769++] = (byte) (arg1 >> 8);
        this.field768[this.field769++] = (byte) (arg1 >> 16);
        this.field768[this.field769++] = (byte) (arg1 >> 24);
        if (arg0 != 10) {
            this.field751 = -323;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(JI)V")
    public void method198(long arg0, int arg1) {
        this.field768[this.field769++] = (byte) (arg0 >> 56);
        this.field768[this.field769++] = (byte) (arg0 >> 48);
        this.field768[this.field769++] = (byte) (arg0 >> 40);
        this.field768[this.field769++] = (byte) (arg0 >> 32);
        this.field768[this.field769++] = (byte) (arg0 >> 24);
        if (arg1 != 0) {
            this.field766 = !this.field766;
        }
        this.field768[this.field769++] = (byte) (arg0 >> 16);
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        this.field768[this.field769++] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method199(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field768, this.field769);
        this.field769 += arg0.length();
        this.field768[this.field769++] = 10;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "([BIII)V")
    public void method200(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                this.field768[this.field769++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "c", descriptor = "(II)V")
    public void method201(int arg0, int arg1) {
        if (arg1 != -48308) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field768[this.field769 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "c", descriptor = "()I")
    public int method202() {
        return this.field768[this.field769++] & 0xFF;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "d", descriptor = "()B")
    public byte method203() {
        return this.field768[this.field769++];
    }

    @OriginalMember(owner = "GHHPHSRU", name = "e", descriptor = "()I")
    public int method204() {
        this.field769 += 2;
        return ((this.field768[this.field769 - 2] & 0xFF) << 8) + (this.field768[this.field769 - 1] & 0xFF);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "f", descriptor = "()I")
    public int method205() {
        this.field769 += 2;
        int var1 = ((this.field768[this.field769 - 2] & 0xFF) << 8) + (this.field768[this.field769 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "g", descriptor = "()I")
    public int method206() {
        this.field769 += 3;
        return (this.field768[this.field769 - 1] & 0xFF) + ((this.field768[this.field769 - 3] & 0xFF) << 16) + ((this.field768[this.field769 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "h", descriptor = "()I")
    public int method207() {
        this.field769 += 4;
        return (this.field768[this.field769 - 1] & 0xFF) + ((this.field768[this.field769 - 2] & 0xFF) << 8) + ((this.field768[this.field769 - 4] & 0xFF) << 24) + ((this.field768[this.field769 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(B)J")
    public long method208(byte arg0) {
        long var2 = (long) this.method207() & 0xFFFFFFFFL;
        if (arg0 != 3) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (long) this.method207() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "i", descriptor = "()Ljava/lang/String;")
    public String method209() {
        int var1 = this.field769;
        while (this.field768[this.field769++] != 10) {
        }
        return new String(this.field768, var1, this.field769 - var1 - 1);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "e", descriptor = "(I)[B")
    public byte[] method210(int arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        int var2 = this.field769;
        while (this.field768[this.field769++] != 10) {
        }
        byte[] var3 = new byte[this.field769 - var2 - 1];
        for (int var4 = var2; var4 < this.field769 - 1; var4++) {
            var3[var4 - var2] = this.field768[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(II[BI)V")
    public void method211(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != -2486) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1; var6 < arg0 + arg1; var6++) {
            arg2[var6] = this.field768[this.field769++];
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(Z)V")
    public void method212(boolean arg0) {
        this.field770 = this.field769 * 8;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "d", descriptor = "(II)I")
    public int method213(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.field752 = 386;
        }
        int var3 = this.field770 >> 3;
        int var4 = 8 - (this.field770 & 0x7);
        int var5 = 0;
        this.field770 += arg0;
        while (arg0 > var4) {
            var5 += (this.field768[var3++] & field772[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field768[var3] & field772[var4]) + var5;
        } else {
            var6 = (this.field768[var3] >> var4 - arg0 & field772[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "f", descriptor = "(I)V")
    public void method214(int arg0) {
        if (arg0 == 0) {
            this.field769 = (this.field770 + 7) / 8;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "j", descriptor = "()I")
    public int method215() {
        int var1 = this.field768[this.field769] & 0xFF;
        return var1 < 128 ? this.method202() - 64 : this.method204() - 49152;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "k", descriptor = "()I")
    public int method216() {
        int var1 = this.field768[this.field769] & 0xFF;
        return var1 < 128 ? this.method202() : this.method204() - 32768;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method217(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field769;
        this.field769 = 0;
        byte[] var5 = new byte[var4];
        this.method211(var4, 0, var5, -2486);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        if (arg1 != 8) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        byte[] var9 = var7.toByteArray();
        this.field769 = 0;
        this.method192(var9.length);
        this.method200(var9, 0, var9.length, 717);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "e", descriptor = "(II)V")
    public void method218(int arg0, int arg1) {
        this.field768[this.field769++] = (byte) (arg1 + 128);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "f", descriptor = "(II)V")
    public void method219(int arg0, int arg1) {
        this.field768[this.field769++] = (byte) -arg0;
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(IZ)V")
    public void method220(int arg0, boolean arg1) {
        this.field768[this.field769++] = (byte) (128 - arg0);
        if (arg1) {
            this.field755 = 8;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(B)I")
    public int method221(byte arg0) {
        if (arg0 != 49) {
            this.field767 = !this.field767;
        }
        return this.field768[this.field769++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "g", descriptor = "(I)I")
    public int method222(int arg0) {
        if (arg0 >= 0) {
            this.field753 = 108;
        }
        return -this.field768[this.field769++] & 0xFF;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "c", descriptor = "(B)I")
    public int method223(byte arg0) {
        return arg0 == -82 ? 128 - this.field768[this.field769++] & 0xFF : 2;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "h", descriptor = "(I)B")
    public byte method224(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field768[this.field769++];
    }

    @OriginalMember(owner = "GHHPHSRU", name = "d", descriptor = "(B)B")
    public byte method225(byte arg0) {
        if (arg0 != -91) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.field768[this.field769++]);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "g", descriptor = "(II)V")
    public void method226(int arg0, int arg1) {
        if (arg0 == 9) {
            this.field768[this.field769++] = (byte) arg1;
            this.field768[this.field769++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "h", descriptor = "(II)V")
    public void method227(int arg0, int arg1) {
        this.field768[this.field769++] = (byte) (arg1 >> 8);
        int var3 = 82 / arg0;
        this.field768[this.field769++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "i", descriptor = "(II)V")
    public void method228(int arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field768[this.field769++] = (byte) (arg0 + 128);
        this.field768[this.field769++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "e", descriptor = "(B)I")
    public int method229(byte arg0) {
        if (arg0 != 4) {
            field750 = -175;
        }
        this.field769 += 2;
        return ((this.field768[this.field769 - 1] & 0xFF) << 8) + (this.field768[this.field769 - 2] & 0xFF);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "i", descriptor = "(I)I")
    public int method230(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field769 += 2;
        return ((this.field768[this.field769 - 2] & 0xFF) << 8) + (this.field768[this.field769 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "j", descriptor = "(I)I")
    public int method231(int arg0) {
        this.field769 += 2;
        return arg0 <= 0 ? 4 : ((this.field768[this.field769 - 1] & 0xFF) << 8) + (this.field768[this.field769 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "k", descriptor = "(I)I")
    public int method232(int arg0) {
        this.field769 += 2;
        int var2 = ((this.field768[this.field769 - 1] & 0xFF) << 8) + (this.field768[this.field769 - 2] & 0xFF);
        if (arg0 != 4) {
            this.field756 = 453;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(Z)I")
    public int method233(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field769 += 2;
        int var3 = ((this.field768[this.field769 - 2] & 0xFF) << 8) + (this.field768[this.field769 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "f", descriptor = "(B)I")
    public int method234(byte arg0) {
        this.field769 += 3;
        return arg0 == 61 ? (this.field768[this.field769 - 3] & 0xFF) + ((this.field768[this.field769 - 1] & 0xFF) << 16) + ((this.field768[this.field769 - 2] & 0xFF) << 8) : 0;
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(IZ)V")
    public void method235(int arg0, boolean arg1) {
        this.field768[this.field769++] = (byte) (arg0 >> 8);
        this.field768[this.field769++] = (byte) arg0;
        this.field768[this.field769++] = (byte) (arg0 >> 24);
        this.field768[this.field769++] = (byte) (arg0 >> 16);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "g", descriptor = "(B)I")
    public int method236(byte arg0) {
        if (this.field762 == arg0) {
            boolean var2 = false;
            this.field769 += 4;
            return (this.field768[this.field769 - 4] & 0xFF) + ((this.field768[this.field769 - 3] & 0xFF) << 8) + ((this.field768[this.field769 - 1] & 0xFF) << 24) + ((this.field768[this.field769 - 2] & 0xFF) << 16);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "h", descriptor = "(B)I")
    public int method237(byte arg0) {
        if (arg0 != 102) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field769 += 4;
        return (this.field768[this.field769 - 2] & 0xFF) + ((this.field768[this.field769 - 1] & 0xFF) << 8) + ((this.field768[this.field769 - 3] & 0xFF) << 24) + ((this.field768[this.field769 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "([BIIB)V")
    public void method238(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1; var6 < arg1 + arg2; var6++) {
            this.field768[this.field769++] = (byte) (arg0[var6] + 128);
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "b", descriptor = "(II[BI)V")
    public void method239(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0 + arg3 - 1; var6 >= arg3; var6--) {
            arg2[var6] = this.field768[this.field769++];
        }
    }

    @OriginalMember(owner = "GHHPHSRU", name = "a", descriptor = "(IIZ[B)V")
    public void method240(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (!arg2) {
            this.field756 = -122;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg1; var5--) {
            arg3[var5] = (byte) (this.field768[this.field769++] - 128);
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
            field771[var0] = var1;
        }
        field772 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field777 = new class57((byte) 55);
        field778 = new class57((byte) 55);
        field779 = new class57((byte) 55);
        field780 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
