import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IUVBENCV")
public class class25 extends class26 {

    @OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "I")
    private int field820 = 18462;

    @OriginalMember(owner = "client!IUVBENCV", name = "l", descriptor = "B")
    private byte field821 = -33;

    @OriginalMember(owner = "client!IUVBENCV", name = "n", descriptor = "I")
    private int field823 = 7;

    @OriginalMember(owner = "client!IUVBENCV", name = "o", descriptor = "Z")
    private boolean field824 = false;

    @OriginalMember(owner = "client!IUVBENCV", name = "p", descriptor = "I")
    private int field825 = 9;

    @OriginalMember(owner = "client!IUVBENCV", name = "q", descriptor = "Z")
    private boolean field826 = false;

    @OriginalMember(owner = "client!IUVBENCV", name = "r", descriptor = "I")
    private int field827 = 7;

    @OriginalMember(owner = "client!IUVBENCV", name = "s", descriptor = "Z")
    private boolean field828 = true;

    @OriginalMember(owner = "client!IUVBENCV", name = "t", descriptor = "Z")
    private boolean field829 = true;

    @OriginalMember(owner = "client!IUVBENCV", name = "u", descriptor = "I")
    private int field830 = -39421;

    @OriginalMember(owner = "client!IUVBENCV", name = "v", descriptor = "Z")
    private boolean field831 = false;

    @OriginalMember(owner = "client!IUVBENCV", name = "w", descriptor = "Z")
    private boolean field832 = false;

    @OriginalMember(owner = "client!IUVBENCV", name = "z", descriptor = "I")
    private int field835 = -66;

    @OriginalMember(owner = "client!IUVBENCV", name = "A", descriptor = "[B")
    public byte[] field836;

    @OriginalMember(owner = "client!IUVBENCV", name = "B", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!IUVBENCV", name = "y", descriptor = "I")
    private static int field834 = -521;

    @OriginalMember(owner = "client!IUVBENCV", name = "D", descriptor = "[I")
    private static int[] field839 = new int[256];

    @OriginalMember(owner = "client!IUVBENCV", name = "E", descriptor = "[I")
    private static final int[] field840;

    @OriginalMember(owner = "client!IUVBENCV", name = "J", descriptor = "LZEEWTYXI;")
    private static class69 field845;

    @OriginalMember(owner = "client!IUVBENCV", name = "K", descriptor = "LZEEWTYXI;")
    private static class69 field846;

    @OriginalMember(owner = "client!IUVBENCV", name = "L", descriptor = "LZEEWTYXI;")
    private static class69 field847;

    @OriginalMember(owner = "client!IUVBENCV", name = "M", descriptor = "[C")
    private static char[] field848;

    @OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "client!IUVBENCV", name = "m", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "client!IUVBENCV", name = "x", descriptor = "I")
    private int field833;

    @OriginalMember(owner = "client!IUVBENCV", name = "C", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!IUVBENCV", name = "G", descriptor = "I")
    private static int field842;

    @OriginalMember(owner = "client!IUVBENCV", name = "H", descriptor = "I")
    private static int field843;

    @OriginalMember(owner = "client!IUVBENCV", name = "I", descriptor = "I")
    private static int field844;

    @OriginalMember(owner = "client!IUVBENCV", name = "F", descriptor = "LICHYZYSQ;")
    public class24 field841;

    @OriginalMember(owner = "client!IUVBENCV", name = "N", descriptor = "Z")
    public static boolean field849;

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(ZI)LIUVBENCV;")
    public static class25 method233(boolean arg0, int arg1) {
        class69 var2 = field846;
        synchronized (field846) {
            class25 var3 = null;
            if (arg1 == 0 && field842 > 0) {
                field842--;
                var3 = (class25) field845.method579();
            } else if (arg1 == 1 && field843 > 0) {
                field843--;
                var3 = (class25) field846.method579();
            } else if (arg1 == 2 && field844 > 0) {
                field844--;
                var3 = (class25) field847.method579();
            }
            if (var3 != null) {
                var3.field837 = 0;
                return var3;
            }
        }
        class25 var5 = new class25(-22219);
        if (arg0) {
            field834 = -371;
        }
        var5.field837 = 0;
        if (arg1 == 0) {
            var5.field836 = new byte[100];
        } else if (arg1 == 1) {
            var5.field836 = new byte[5000];
        } else {
            var5.field836 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "<init>", descriptor = "(I)V")
    private class25(int arg0) {
        if (arg0 != -22219) {
            this.field832 = !this.field832;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "<init>", descriptor = "([BI)V")
    public class25(byte[] arg0, int arg1) {
        this.field836 = arg0;
        this.field837 = 0;
        int var3 = 35 / arg1;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(II)V")
    public void method234(int arg0, int arg1) {
        if (arg0 < 0) {
            this.field836[this.field837++] = (byte) (arg1 + this.field841.method230());
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I)V")
    public void method235(int arg0) {
        this.field836[this.field837++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(I)V")
    public void method236(int arg0) {
        this.field836[this.field837++] = (byte) (arg0 >> 8);
        this.field836[this.field837++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(II)V")
    public void method237(int arg0, int arg1) {
        if (arg0 == 1) {
            this.field836[this.field837++] = (byte) arg1;
            this.field836[this.field837++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(I)V")
    public void method238(int arg0) {
        this.field836[this.field837++] = (byte) (arg0 >> 16);
        this.field836[this.field837++] = (byte) (arg0 >> 8);
        this.field836[this.field837++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(I)V")
    public void method239(int arg0) {
        this.field836[this.field837++] = (byte) (arg0 >> 24);
        this.field836[this.field837++] = (byte) (arg0 >> 16);
        this.field836[this.field837++] = (byte) (arg0 >> 8);
        this.field836[this.field837++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(II)V")
    public void method240(int arg0, int arg1) {
        this.field836[this.field837++] = (byte) arg1;
        if (arg0 <= 0) {
            field834 = -494;
        }
        this.field836[this.field837++] = (byte) (arg1 >> 8);
        this.field836[this.field837++] = (byte) (arg1 >> 16);
        this.field836[this.field837++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(JI)V")
    public void method241(long arg0, int arg1) {
        this.field836[this.field837++] = (byte) (arg0 >> 56);
        this.field836[this.field837++] = (byte) (arg0 >> 48);
        this.field836[this.field837++] = (byte) (arg0 >> 40);
        if (arg1 != -45352) {
            this.field833 = -187;
        }
        this.field836[this.field837++] = (byte) (arg0 >> 32);
        this.field836[this.field837++] = (byte) (arg0 >> 24);
        this.field836[this.field837++] = (byte) (arg0 >> 16);
        this.field836[this.field837++] = (byte) (arg0 >> 8);
        this.field836[this.field837++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method242(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field836, this.field837);
        this.field837 += arg0.length();
        this.field836[this.field837++] = 10;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I[BII)V")
    public void method243(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
                this.field836[this.field837++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(II)V")
    public void method244(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field836[this.field837 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "()I")
    public int method245() {
        return this.field836[this.field837++] & 0xFF;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "()B")
    public byte method246() {
        return this.field836[this.field837++];
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "()I")
    public int method247() {
        this.field837 += 2;
        return ((this.field836[this.field837 - 2] & 0xFF) << 8) + (this.field836[this.field837 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "()I")
    public int method248() {
        this.field837 += 2;
        int var1 = ((this.field836[this.field837 - 2] & 0xFF) << 8) + (this.field836[this.field837 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "()I")
    public int method249() {
        this.field837 += 3;
        return (this.field836[this.field837 - 1] & 0xFF) + ((this.field836[this.field837 - 3] & 0xFF) << 16) + ((this.field836[this.field837 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "h", descriptor = "()I")
    public int method250() {
        this.field837 += 4;
        return (this.field836[this.field837 - 1] & 0xFF) + ((this.field836[this.field837 - 2] & 0xFF) << 8) + ((this.field836[this.field837 - 4] & 0xFF) << 24) + ((this.field836[this.field837 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(I)J")
    public long method251(int arg0) {
        long var2 = (long) this.method250() & 0xFFFFFFFFL;
        long var4 = (long) this.method250() & 0xFFFFFFFFL;
        while (arg0 >= 0) {
            this.field832 = !this.field832;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "i", descriptor = "()Ljava/lang/String;")
    public String method252() {
        int var1 = this.field837;
        while (this.field836[this.field837++] != 10) {
        }
        return new String(this.field836, var1, this.field837 - var1 - 1);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(B)[B")
    public byte[] method253(byte arg0) {
        if (arg0 != 85) {
            this.field833 = 457;
        }
        int var2 = this.field837;
        while (this.field836[this.field837++] != 10) {
        }
        byte[] var3 = new byte[this.field837 - var2 - 1];
        for (int var4 = var2; var4 < this.field837 - 1; var4++) {
            var3[var4 - var2] = this.field836[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(IZI[B)V")
    public void method254(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg1) {
            field834 = -418;
        }
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field836[this.field837++];
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(B)V")
    public void method255(byte arg0) {
        this.field838 = this.field837 * 8;
        if (arg0 != 81) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(II)I")
    public int method256(int arg0, int arg1) {
        int var3 = this.field838 >> 3;
        int var4 = 8 - (this.field838 & 0x7);
        int var5 = 0;
        int var6 = 21 / arg0;
        this.field838 += arg1;
        while (arg1 > var4) {
            var5 += (this.field836[var3++] & field840[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field836[var3] & field840[var4]) + var5;
        } else {
            var7 = (this.field836[var3] >> var4 - arg1 & field840[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "(I)V")
    public void method257(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field837 = (this.field838 + 7) / 8;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "()I")
    public int method258() {
        int var1 = this.field836[this.field837] & 0xFF;
        return var1 < 128 ? this.method245() - 64 : this.method247() - 49152;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "()I")
    public int method259() {
        int var1 = this.field836[this.field837] & 0xFF;
        return var1 < 128 ? this.method245() : this.method247() - 32768;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method260(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field837;
        this.field837 = 0;
        byte[] var5 = new byte[var4];
        this.method254(var4, false, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field837 = 0;
        if (!arg1) {
            this.field835 = -47;
        }
        this.method235(var8.length);
        this.method243(0, var8, 0, var8.length);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(ZI)V")
    public void method261(boolean arg0, int arg1) {
        this.field836[this.field837++] = (byte) (128 - arg1);
        if (arg0) {
            this.field832 = !this.field832;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "(I)I")
    public int method262(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field836[this.field837++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(Z)I")
    public int method263(boolean arg0) {
        if (!arg0) {
            this.field830 = 93;
        }
        return -this.field836[this.field837++] & 0xFF;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "h", descriptor = "(I)I")
    public int method264(int arg0) {
        if (this.field825 != arg0) {
            this.field832 = !this.field832;
        }
        return 128 - this.field836[this.field837++] & 0xFF;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(B)B")
    public byte method265(byte arg0) {
        if (arg0 != 117) {
            throw new NullPointerException();
        }
        return (byte) (this.field836[this.field837++] - 128);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "d", descriptor = "(B)B")
    public byte method266(byte arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return (byte) -this.field836[this.field837++];
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "e", descriptor = "(B)B")
    public byte method267(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field836[this.field837++]);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(ZI)V")
    public void method268(boolean arg0, int arg1) {
        this.field836[this.field837++] = (byte) arg1;
        this.field836[this.field837++] = (byte) (arg1 >> 8);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "f", descriptor = "(II)V")
    public void method269(int arg0, int arg1) {
        this.field836[this.field837++] = (byte) (arg1 >> 8);
        this.field836[this.field837++] = (byte) (arg1 + 128);
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "g", descriptor = "(II)V")
    public void method270(int arg0, int arg1) {
        this.field836[this.field837++] = (byte) (arg0 + 128);
        this.field836[this.field837++] = (byte) (arg0 >> 8);
        while (arg1 >= 0) {
            this.field830 = 358;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "i", descriptor = "(I)I")
    public int method271(int arg0) {
        this.field837 += 2;
        while (arg0 >= 0) {
            this.field819 = -40;
        }
        return ((this.field836[this.field837 - 1] & 0xFF) << 8) + (this.field836[this.field837 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "j", descriptor = "(I)I")
    public int method272(int arg0) {
        this.field837 += 2;
        if (this.field827 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field836[this.field837 - 2] & 0xFF) << 8) + (this.field836[this.field837 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "k", descriptor = "(I)I")
    public int method273(int arg0) {
        if (arg0 != -41562) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field837 += 2;
        return ((this.field836[this.field837 - 1] & 0xFF) << 8) + (this.field836[this.field837 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "b", descriptor = "(Z)I")
    public int method274(boolean arg0) {
        this.field837 += 2;
        int var2 = ((this.field836[this.field837 - 1] & 0xFF) << 8) + (this.field836[this.field837 - 2] & 0xFF);
        if (arg0) {
            return this.field822;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "l", descriptor = "(I)I")
    public int method275(int arg0) {
        this.field837 += 2;
        if (arg0 >= 0) {
            return this.field830;
        }
        int var2 = ((this.field836[this.field837 - 2] & 0xFF) << 8) + (this.field836[this.field837 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "m", descriptor = "(I)I")
    public int method276(int arg0) {
        if (arg0 == 0) {
            this.field837 += 3;
            return (this.field836[this.field837 - 1] & 0xFF) + ((this.field836[this.field837 - 2] & 0xFF) << 16) + ((this.field836[this.field837 - 3] & 0xFF) << 8);
        } else {
            return field834;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "c", descriptor = "(Z)I")
    public int method277(boolean arg0) {
        this.field837 += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field836[this.field837 - 4] & 0xFF) + ((this.field836[this.field837 - 3] & 0xFF) << 8) + ((this.field836[this.field837 - 1] & 0xFF) << 24) + ((this.field836[this.field837 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "n", descriptor = "(I)I")
    public int method278(int arg0) {
        this.field837 += 4;
        return arg0 == 0 ? (this.field836[this.field837 - 3] & 0xFF) + ((this.field836[this.field837 - 4] & 0xFF) << 8) + ((this.field836[this.field837 - 2] & 0xFF) << 24) + ((this.field836[this.field837 - 1] & 0xFF) << 16) : 4;
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "o", descriptor = "(I)I")
    public int method279(int arg0) {
        if (arg0 >= 0 && arg0 <= 0) {
            this.field837 += 4;
            return (this.field836[this.field837 - 2] & 0xFF) + ((this.field836[this.field837 - 1] & 0xFF) << 8) + ((this.field836[this.field837 - 3] & 0xFF) << 24) + ((this.field836[this.field837 - 4] & 0xFF) << 16);
        } else {
            return this.field835;
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(III[B)V")
    public void method280(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != -7662) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            this.field836[this.field837++] = (byte) (arg3[var6] + 128);
        }
    }

    @OriginalMember(owner = "client!IUVBENCV", name = "a", descriptor = "(I[BIB)V")
    public void method281(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != -41) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0 + arg2 - 1; var6 >= arg2; var6--) {
            arg1[var6] = this.field836[this.field837++];
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
            field839[var0] = var1;
        }
        field840 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field845 = new class69(223);
        field846 = new class69(223);
        field847 = new class69(223);
        field848 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
