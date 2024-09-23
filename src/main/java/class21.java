import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GLMIQHJI")
public class class21 extends class31 {

    @OriginalMember(owner = "GLMIQHJI", name = "i", descriptor = "I")
    private int field798 = -918;

    @OriginalMember(owner = "GLMIQHJI", name = "j", descriptor = "B")
    private byte field799 = 1;

    @OriginalMember(owner = "GLMIQHJI", name = "k", descriptor = "I")
    private int field800 = 5;

    @OriginalMember(owner = "GLMIQHJI", name = "m", descriptor = "B")
    private byte field802 = 77;

    @OriginalMember(owner = "GLMIQHJI", name = "n", descriptor = "B")
    private byte field803 = 5;

    @OriginalMember(owner = "GLMIQHJI", name = "o", descriptor = "Z")
    private boolean field804 = false;

    @OriginalMember(owner = "GLMIQHJI", name = "q", descriptor = "I")
    private int field806 = 4;

    @OriginalMember(owner = "GLMIQHJI", name = "r", descriptor = "B")
    private byte field807 = -81;

    @OriginalMember(owner = "GLMIQHJI", name = "s", descriptor = "Z")
    private boolean field808 = false;

    @OriginalMember(owner = "GLMIQHJI", name = "t", descriptor = "B")
    private byte field809 = -20;

    @OriginalMember(owner = "GLMIQHJI", name = "u", descriptor = "I")
    private int field810 = -825;

    @OriginalMember(owner = "GLMIQHJI", name = "v", descriptor = "Z")
    private boolean field811 = false;

    @OriginalMember(owner = "GLMIQHJI", name = "w", descriptor = "Z")
    private boolean field812 = false;

    @OriginalMember(owner = "GLMIQHJI", name = "x", descriptor = "Z")
    private boolean field813 = true;

    @OriginalMember(owner = "GLMIQHJI", name = "y", descriptor = "Z")
    private boolean field814 = false;

    @OriginalMember(owner = "GLMIQHJI", name = "z", descriptor = "I")
    private int field815 = 348;

    @OriginalMember(owner = "GLMIQHJI", name = "A", descriptor = "I")
    private int field816 = 9;

    @OriginalMember(owner = "GLMIQHJI", name = "B", descriptor = "[B")
    public byte[] field817;

    @OriginalMember(owner = "GLMIQHJI", name = "C", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "GLMIQHJI", name = "E", descriptor = "[I")
    private static int[] field820 = new int[256];

    @OriginalMember(owner = "GLMIQHJI", name = "F", descriptor = "[I")
    private static final int[] field821;

    @OriginalMember(owner = "GLMIQHJI", name = "K", descriptor = "LVLLJSJTJ;")
    private static class54 field826;

    @OriginalMember(owner = "GLMIQHJI", name = "L", descriptor = "LVLLJSJTJ;")
    private static class54 field827;

    @OriginalMember(owner = "GLMIQHJI", name = "M", descriptor = "LVLLJSJTJ;")
    private static class54 field828;

    @OriginalMember(owner = "GLMIQHJI", name = "N", descriptor = "[C")
    private static char[] field829;

    @OriginalMember(owner = "GLMIQHJI", name = "l", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "GLMIQHJI", name = "p", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "GLMIQHJI", name = "D", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "GLMIQHJI", name = "H", descriptor = "I")
    private static int field823;

    @OriginalMember(owner = "GLMIQHJI", name = "I", descriptor = "I")
    private static int field824;

    @OriginalMember(owner = "GLMIQHJI", name = "J", descriptor = "I")
    private static int field825;

    @OriginalMember(owner = "GLMIQHJI", name = "G", descriptor = "LBPJMPIUS;")
    public class6 field822;

    @OriginalMember(owner = "GLMIQHJI", name = "O", descriptor = "Z")
    public static boolean field830;

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(BI)LGLMIQHJI;")
    public static class21 method232(byte arg0, int arg1) {
        class54 var2 = field827;
        synchronized (field827) {
            class21 var3 = null;
            if (arg1 == 0 && field823 > 0) {
                field823--;
                var3 = (class21) field826.method527();
            } else if (arg1 == 1 && field824 > 0) {
                field824--;
                var3 = (class21) field827.method527();
            } else if (arg1 == 2 && field825 > 0) {
                field825--;
                var3 = (class21) field828.method527();
            }
            if (var3 != null) {
                var3.field818 = 0;
                return var3;
            }
        }
        class21 var5 = new class21(-251);
        if (arg0 == 0) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        var5.field818 = 0;
        if (arg1 == 0) {
            var5.field817 = new byte[100];
        } else if (arg1 == 1) {
            var5.field817 = new byte[5000];
        } else {
            var5.field817 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "<init>", descriptor = "(I)V")
    private class21(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "<init>", descriptor = "([BI)V")
    public class21(byte[] arg0, int arg1) {
        if (arg1 != -49015) {
            this.field811 = !this.field811;
        }
        this.field817 = arg0;
        this.field818 = 0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(II)V")
    public void method233(int arg0, int arg1) {
        this.field817[this.field818++] = (byte) (arg0 + this.field822.method29());
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(I)V")
    public void method234(int arg0) {
        this.field817[this.field818++] = (byte) arg0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(I)V")
    public void method235(int arg0) {
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        this.field817[this.field818++] = (byte) arg0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(BI)V")
    public void method236(byte arg0, int arg1) {
        if (arg0 == -79) {
            this.field817[this.field818++] = (byte) arg1;
            this.field817[this.field818++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "c", descriptor = "(I)V")
    public void method237(int arg0) {
        this.field817[this.field818++] = (byte) (arg0 >> 16);
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        this.field817[this.field818++] = (byte) arg0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "d", descriptor = "(I)V")
    public void method238(int arg0) {
        this.field817[this.field818++] = (byte) (arg0 >> 24);
        this.field817[this.field818++] = (byte) (arg0 >> 16);
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        this.field817[this.field818++] = (byte) arg0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(IZ)V")
    public void method239(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field817[this.field818++] = (byte) arg0;
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        this.field817[this.field818++] = (byte) (arg0 >> 16);
        this.field817[this.field818++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(JI)V")
    public void method240(long arg0, int arg1) {
        this.field817[this.field818++] = (byte) (arg0 >> 56);
        this.field817[this.field818++] = (byte) (arg0 >> 48);
        this.field817[this.field818++] = (byte) (arg0 >> 40);
        this.field817[this.field818++] = (byte) (arg0 >> 32);
        this.field817[this.field818++] = (byte) (arg0 >> 24);
        this.field817[this.field818++] = (byte) (arg0 >> 16);
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        if (arg1 != 7) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field817[this.field818++] = (byte) arg0;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method241(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field817, this.field818);
        this.field818 += arg0.length();
        this.field817[this.field818++] = 10;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(III[B)V")
    public void method242(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0; var6 < arg0 + arg1; var6++) {
            this.field817[this.field818++] = arg3[var6];
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(II)V")
    public void method243(int arg0, int arg1) {
        if (arg0 > 0) {
            this.field817[this.field818 - arg1 - 1] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "c", descriptor = "()I")
    public int method244() {
        return this.field817[this.field818++] & 0xFF;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "d", descriptor = "()B")
    public byte method245() {
        return this.field817[this.field818++];
    }

    @OriginalMember(owner = "GLMIQHJI", name = "e", descriptor = "()I")
    public int method246() {
        this.field818 += 2;
        return ((this.field817[this.field818 - 2] & 0xFF) << 8) + (this.field817[this.field818 - 1] & 0xFF);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "f", descriptor = "()I")
    public int method247() {
        this.field818 += 2;
        int var1 = ((this.field817[this.field818 - 2] & 0xFF) << 8) + (this.field817[this.field818 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "g", descriptor = "()I")
    public int method248() {
        this.field818 += 3;
        return (this.field817[this.field818 - 1] & 0xFF) + ((this.field817[this.field818 - 3] & 0xFF) << 16) + ((this.field817[this.field818 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "h", descriptor = "()I")
    public int method249() {
        this.field818 += 4;
        return (this.field817[this.field818 - 1] & 0xFF) + ((this.field817[this.field818 - 2] & 0xFF) << 8) + ((this.field817[this.field818 - 4] & 0xFF) << 24) + ((this.field817[this.field818 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(Z)J")
    public long method250(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method249() & 0xFFFFFFFFL;
        long var4 = (long) this.method249() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "i", descriptor = "()Ljava/lang/String;")
    public String method251() {
        int var1 = this.field818;
        while (this.field817[this.field818++] != 10) {
        }
        return new String(this.field817, var1, this.field818 - var1 - 1);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(Z)[B")
    public byte[] method252(boolean arg0) {
        int var2 = this.field818;
        if (arg0) {
            this.field813 = !this.field813;
        }
        while (this.field817[this.field818++] != 10) {
        }
        byte[] var3 = new byte[this.field818 - var2 - 1];
        for (int var4 = var2; var4 < this.field818 - 1; var4++) {
            var3[var4 - var2] = this.field817[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "([BZII)V")
    public void method253(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field811 = !this.field811;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg0[var5] = this.field817[this.field818++];
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(B)V")
    public void method254(byte arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field819 = this.field818 * 8;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(IZ)I")
    public int method255(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field819 >> 3;
        int var5 = 8 - (this.field819 & 0x7);
        int var6 = 0;
        this.field819 += arg0;
        while (arg0 > var5) {
            var6 += (this.field817[var4++] & field821[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (this.field817[var4] & field821[var5]) + var6;
        } else {
            var7 = (this.field817[var4] >> var5 - arg0 & field821[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "e", descriptor = "(I)V")
    public void method256(int arg0) {
        this.field818 = (this.field819 + 7) / 8;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "j", descriptor = "()I")
    public int method257() {
        int var1 = this.field817[this.field818] & 0xFF;
        return var1 < 128 ? this.method244() - 64 : this.method246() - 49152;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "k", descriptor = "()I")
    public int method258() {
        int var1 = this.field817[this.field818] & 0xFF;
        return var1 < 128 ? this.method244() : this.method246() - 32768;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method259(byte arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field818;
        this.field818 = 0;
        byte[] var5 = new byte[var4];
        this.method253(var5, true, 0, var4);
        if (arg0 != -121) {
            this.field798 = 484;
        }
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field818 = 0;
        this.method234(var8.length);
        this.method242(0, var8.length, 0, var8);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "c", descriptor = "(II)V")
    public void method260(int arg0, int arg1) {
        if (arg0 != -42019) {
            this.field801 = 323;
        }
        this.field817[this.field818++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(ZI)V")
    public void method261(boolean arg0, int arg1) {
        this.field817[this.field818++] = (byte) -arg1;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "d", descriptor = "(II)V")
    public void method262(int arg0, int arg1) {
        this.field817[this.field818++] = (byte) (128 - arg1);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "f", descriptor = "(I)I")
    public int method263(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field817[this.field818++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "g", descriptor = "(I)I")
    public int method264(int arg0) {
        return arg0 == 3 ? -this.field817[this.field818++] & 0xFF : 2;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "h", descriptor = "(I)I")
    public int method265(int arg0) {
        int var2 = 57 / arg0;
        return 128 - this.field817[this.field818++] & 0xFF;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "i", descriptor = "(I)B")
    public byte method266(int arg0) {
        if (this.field806 != arg0) {
            this.field811 = !this.field811;
        }
        return (byte) (this.field817[this.field818++] - 128);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "j", descriptor = "(I)B")
    public byte method267(int arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return (byte) -this.field817[this.field818++];
    }

    @OriginalMember(owner = "GLMIQHJI", name = "k", descriptor = "(I)B")
    public byte method268(int arg0) {
        if (arg0 != 35432) {
            this.field804 = !this.field804;
        }
        return (byte) (128 - this.field817[this.field818++]);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "e", descriptor = "(II)V")
    public void method269(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field813 = !this.field813;
        }
        this.field817[this.field818++] = (byte) arg1;
        this.field817[this.field818++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(IB)V")
    public void method270(int arg0, byte arg1) {
        this.field817[this.field818++] = (byte) (arg0 >> 8);
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            this.field800 = -154;
        }
        this.field817[this.field818++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "f", descriptor = "(II)V")
    public void method271(int arg0, int arg1) {
        this.field817[this.field818++] = (byte) (arg1 + 128);
        this.field817[this.field818++] = (byte) (arg1 >> 8);
        if (arg0 != -14666) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(B)I")
    public int method272(byte arg0) {
        if (arg0 == -116) {
            this.field818 += 2;
            return ((this.field817[this.field818 - 1] & 0xFF) << 8) + (this.field817[this.field818 - 2] & 0xFF);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "l", descriptor = "(I)I")
    public int method273(int arg0) {
        if (arg0 == 0) {
            this.field818 += 2;
            return ((this.field817[this.field818 - 2] & 0xFF) << 8) + (this.field817[this.field818 - 1] - 128 & 0xFF);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "c", descriptor = "(B)I")
    public int method274(byte arg0) {
        this.field818 += 2;
        if (this.field807 != arg0) {
            this.field805 = -92;
        }
        return ((this.field817[this.field818 - 1] & 0xFF) << 8) + (this.field817[this.field818 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "c", descriptor = "(Z)I")
    public int method275(boolean arg0) {
        this.field818 += 2;
        int var2 = ((this.field817[this.field818 - 1] & 0xFF) << 8) + (this.field817[this.field818 - 2] & 0xFF);
        if (!arg0) {
            this.field798 = -218;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "m", descriptor = "(I)I")
    public int method276(int arg0) {
        if (arg0 != 0) {
            return this.field816;
        }
        this.field818 += 2;
        int var2 = ((this.field817[this.field818 - 1] & 0xFF) << 8) + (this.field817[this.field818 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "GLMIQHJI", name = "b", descriptor = "(ZI)V")
    public void method277(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field817[this.field818++] = (byte) (arg1 >> 16);
        this.field817[this.field818++] = (byte) (arg1 >> 24);
        this.field817[this.field818++] = (byte) arg1;
        this.field817[this.field818++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "n", descriptor = "(I)I")
    public int method278(int arg0) {
        this.field818 += 4;
        if (arg0 != 0) {
            this.field800 = -167;
        }
        return (this.field817[this.field818 - 2] & 0xFF) + ((this.field817[this.field818 - 1] & 0xFF) << 8) + ((this.field817[this.field818 - 3] & 0xFF) << 24) + ((this.field817[this.field818 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "([BIII)V")
    public void method279(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                this.field817[this.field818++] = (byte) (arg0[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "GLMIQHJI", name = "a", descriptor = "(B[BII)V")
    public void method280(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != 5) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2 + arg3 - 1; var6 >= arg3; var6--) {
            arg1[var6] = this.field817[this.field818++];
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
            field820[var0] = var1;
        }
        field821 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field826 = new class54((byte) 3);
        field827 = new class54((byte) 3);
        field828 = new class54((byte) 3);
        field829 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
