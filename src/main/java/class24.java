import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IMUIZRAF")
public class class24 extends class61 {

    @OriginalMember(owner = "IMUIZRAF", name = "j", descriptor = "I")
    private int field813 = 591;

    @OriginalMember(owner = "IMUIZRAF", name = "k", descriptor = "B")
    private byte field814 = 0;

    @OriginalMember(owner = "IMUIZRAF", name = "l", descriptor = "B")
    private byte field815 = 53;

    @OriginalMember(owner = "IMUIZRAF", name = "m", descriptor = "Z")
    private boolean field816 = false;

    @OriginalMember(owner = "IMUIZRAF", name = "n", descriptor = "I")
    private int field817 = -24385;

    @OriginalMember(owner = "IMUIZRAF", name = "o", descriptor = "Z")
    private boolean field818 = true;

    @OriginalMember(owner = "IMUIZRAF", name = "p", descriptor = "Z")
    private boolean field819 = false;

    @OriginalMember(owner = "IMUIZRAF", name = "q", descriptor = "Z")
    private boolean field820 = false;

    @OriginalMember(owner = "IMUIZRAF", name = "r", descriptor = "I")
    private int field821 = 322;

    @OriginalMember(owner = "IMUIZRAF", name = "s", descriptor = "I")
    private int field822 = 4;

    @OriginalMember(owner = "IMUIZRAF", name = "t", descriptor = "B")
    private byte field823 = -105;

    @OriginalMember(owner = "IMUIZRAF", name = "u", descriptor = "Z")
    private boolean field824 = true;

    @OriginalMember(owner = "IMUIZRAF", name = "v", descriptor = "Z")
    private boolean field825 = false;

    @OriginalMember(owner = "IMUIZRAF", name = "w", descriptor = "I")
    private int field826 = 31514;

    @OriginalMember(owner = "IMUIZRAF", name = "x", descriptor = "I")
    private int field827 = 7;

    @OriginalMember(owner = "IMUIZRAF", name = "y", descriptor = "Z")
    private boolean field828 = true;

    @OriginalMember(owner = "IMUIZRAF", name = "z", descriptor = "Z")
    private boolean field829 = true;

    @OriginalMember(owner = "IMUIZRAF", name = "A", descriptor = "I")
    private int field830 = -948;

    @OriginalMember(owner = "IMUIZRAF", name = "B", descriptor = "[B")
    public byte[] field831;

    @OriginalMember(owner = "IMUIZRAF", name = "C", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "IMUIZRAF", name = "E", descriptor = "[I")
    private static int[] field834 = new int[256];

    @OriginalMember(owner = "IMUIZRAF", name = "F", descriptor = "[I")
    private static final int[] field835;

    @OriginalMember(owner = "IMUIZRAF", name = "K", descriptor = "LPILILDKN;")
    private static class38 field840;

    @OriginalMember(owner = "IMUIZRAF", name = "L", descriptor = "LPILILDKN;")
    private static class38 field841;

    @OriginalMember(owner = "IMUIZRAF", name = "M", descriptor = "LPILILDKN;")
    private static class38 field842;

    @OriginalMember(owner = "IMUIZRAF", name = "N", descriptor = "[C")
    private static char[] field843;

    @OriginalMember(owner = "IMUIZRAF", name = "i", descriptor = "I")
    private int field812;

    @OriginalMember(owner = "IMUIZRAF", name = "D", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "IMUIZRAF", name = "H", descriptor = "I")
    private static int field837;

    @OriginalMember(owner = "IMUIZRAF", name = "I", descriptor = "I")
    private static int field838;

    @OriginalMember(owner = "IMUIZRAF", name = "J", descriptor = "I")
    private static int field839;

    @OriginalMember(owner = "IMUIZRAF", name = "G", descriptor = "LXXDUCPOC;")
    public class66 field836;

    @OriginalMember(owner = "IMUIZRAF", name = "O", descriptor = "Z")
    public static boolean field844;

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(II)LIMUIZRAF;")
    public static class24 method226(int arg0, int arg1) {
        class38 var2 = field841;
        synchronized (field841) {
            class24 var3 = null;
            if (arg0 == 0 && field837 > 0) {
                field837--;
                var3 = (class24) field840.method381();
            } else if (arg0 == 1 && field838 > 0) {
                field838--;
                var3 = (class24) field841.method381();
            } else if (arg0 == 2 && field839 > 0) {
                field839--;
                var3 = (class24) field842.method381();
            }
            if (var3 != null) {
                var3.field832 = 0;
                return var3;
            }
        }
        class24 var5 = new class24(8);
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        var5.field832 = 0;
        if (arg0 == 0) {
            var5.field831 = new byte[100];
        } else if (arg0 == 1) {
            var5.field831 = new byte[5000];
        } else {
            var5.field831 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "<init>", descriptor = "(I)V")
    private class24(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field826 = -218;
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "<init>", descriptor = "(I[B)V")
    public class24(int arg0, byte[] arg1) {
        this.field831 = arg1;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field832 = 0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "b", descriptor = "(II)V")
    public void method227(int arg0, int arg1) {
        int var3 = 9 / arg1;
        this.field831[this.field832++] = (byte) (arg0 + this.field836.method541());
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(I)V")
    public void method228(int arg0) {
        this.field831[this.field832++] = (byte) arg0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "b", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field831[this.field832++] = (byte) (arg0 >> 8);
        this.field831[this.field832++] = (byte) arg0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "c", descriptor = "(II)V")
    public void method230(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field829 = !this.field829;
        }
        this.field831[this.field832++] = (byte) arg0;
        this.field831[this.field832++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "c", descriptor = "(I)V")
    public void method231(int arg0) {
        this.field831[this.field832++] = (byte) (arg0 >> 16);
        this.field831[this.field832++] = (byte) (arg0 >> 8);
        this.field831[this.field832++] = (byte) arg0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "d", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field831[this.field832++] = (byte) (arg0 >> 24);
        this.field831[this.field832++] = (byte) (arg0 >> 16);
        this.field831[this.field832++] = (byte) (arg0 >> 8);
        this.field831[this.field832++] = (byte) arg0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "d", descriptor = "(II)V")
    public void method233(int arg0, int arg1) {
        if (arg1 == 0) {
            this.field831[this.field832++] = (byte) arg0;
            this.field831[this.field832++] = (byte) (arg0 >> 8);
            this.field831[this.field832++] = (byte) (arg0 >> 16);
            this.field831[this.field832++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(IJ)V")
    public void method234(int arg0, long arg1) {
        this.field831[this.field832++] = (byte) (arg1 >> 56);
        this.field831[this.field832++] = (byte) (arg1 >> 48);
        int var4 = 35 / arg0;
        this.field831[this.field832++] = (byte) (arg1 >> 40);
        this.field831[this.field832++] = (byte) (arg1 >> 32);
        this.field831[this.field832++] = (byte) (arg1 >> 24);
        this.field831[this.field832++] = (byte) (arg1 >> 16);
        this.field831[this.field832++] = (byte) (arg1 >> 8);
        this.field831[this.field832++] = (byte) arg1;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method235(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field831, this.field832);
        this.field832 += arg0.length();
        this.field831[this.field832++] = 10;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(BI[BI)V")
    public void method236(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 2) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                this.field831[this.field832++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "e", descriptor = "(II)V")
    public void method237(int arg0, int arg1) {
        this.field831[this.field832 - arg1 - 1] = (byte) arg1;
        int var3 = 95 / arg0;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "c", descriptor = "()I")
    public int method238() {
        return this.field831[this.field832++] & 0xFF;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "d", descriptor = "()B")
    public byte method239() {
        return this.field831[this.field832++];
    }

    @OriginalMember(owner = "IMUIZRAF", name = "e", descriptor = "()I")
    public int method240() {
        this.field832 += 2;
        return ((this.field831[this.field832 - 2] & 0xFF) << 8) + (this.field831[this.field832 - 1] & 0xFF);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "f", descriptor = "()I")
    public int method241() {
        this.field832 += 2;
        int var1 = ((this.field831[this.field832 - 2] & 0xFF) << 8) + (this.field831[this.field832 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "g", descriptor = "()I")
    public int method242() {
        this.field832 += 3;
        return (this.field831[this.field832 - 1] & 0xFF) + ((this.field831[this.field832 - 3] & 0xFF) << 16) + ((this.field831[this.field832 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "h", descriptor = "()I")
    public int method243() {
        this.field832 += 4;
        return (this.field831[this.field832 - 1] & 0xFF) + ((this.field831[this.field832 - 2] & 0xFF) << 8) + ((this.field831[this.field832 - 4] & 0xFF) << 24) + ((this.field831[this.field832 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(B)J")
    public long method244(byte arg0) {
        if (this.field814 != arg0) {
            this.field829 = !this.field829;
        }
        long var2 = (long) this.method243() & 0xFFFFFFFFL;
        long var4 = (long) this.method243() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "i", descriptor = "()Ljava/lang/String;")
    public String method245() {
        int var1 = this.field832;
        while (this.field831[this.field832++] != 10) {
        }
        return new String(this.field831, var1, this.field832 - var1 - 1);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "e", descriptor = "(I)[B")
    public byte[] method246(int arg0) {
        int var2 = this.field832;
        while (this.field831[this.field832++] != 10) {
        }
        byte[] var3 = new byte[this.field832 - var2 - 1];
        if (arg0 != 7) {
            this.field827 = 145;
        }
        for (int var4 = var2; var4 < this.field832 - 1; var4++) {
            var3[var4 - var2] = this.field831[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(I[BII)V")
    public void method247(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 15 / arg3;
        for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
            arg1[var6] = this.field831[this.field832++];
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "b", descriptor = "(B)V")
    public void method248(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field833 = this.field832 * 8;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(IB)I")
    public int method249(int arg0, byte arg1) {
        int var3 = this.field833 >> 3;
        int var4 = 8 - (this.field833 & 0x7);
        int var5 = 0;
        this.field833 += arg0;
        if (arg1 != -80) {
            this.field829 = !this.field829;
        }
        while (arg0 > var4) {
            var5 += (this.field831[var3++] & field835[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field831[var3] & field835[var4]) + var5;
        } else {
            var6 = (this.field831[var3] >> var4 - arg0 & field835[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "f", descriptor = "(I)V")
    public void method250(int arg0) {
        this.field832 = (this.field833 + 7) / 8;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "j", descriptor = "()I")
    public int method251() {
        int var1 = this.field831[this.field832] & 0xFF;
        return var1 < 128 ? this.method238() - 64 : this.method240() - 49152;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "k", descriptor = "()I")
    public int method252() {
        int var1 = this.field831[this.field832] & 0xFF;
        return var1 < 128 ? this.method238() : this.method240() - 32768;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method253(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field832;
        this.field832 = 0;
        byte[] var5 = new byte[var4];
        this.method247(var4, var5, 0, 67);
        BigInteger var6 = new BigInteger(var5);
        if (arg1 != 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        BigInteger var8 = var6.modPow(arg2, arg0);
        byte[] var9 = var8.toByteArray();
        this.field832 = 0;
        this.method228(var9.length);
        this.method236((byte) 2, 0, var9, var9.length);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "f", descriptor = "(II)V")
    public void method254(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field831[this.field832++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "g", descriptor = "(II)V")
    public void method255(int arg0, int arg1) {
        if (arg0 == 0) {
            this.field831[this.field832++] = (byte) -arg1;
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "h", descriptor = "(II)V")
    public void method256(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field827 = -452;
        }
        this.field831[this.field832++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(Z)I")
    public int method257(boolean arg0) {
        return arg0 ? this.field831[this.field832++] - 128 & 0xFF : 1;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "g", descriptor = "(I)I")
    public int method258(int arg0) {
        return arg0 <= 0 ? this.field813 : -this.field831[this.field832++] & 0xFF;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "b", descriptor = "(Z)I")
    public int method259(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field831[this.field832++] & 0xFF;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "h", descriptor = "(I)B")
    public byte method260(int arg0) {
        int var2 = 67 / arg0;
        return (byte) -this.field831[this.field832++];
    }

    @OriginalMember(owner = "IMUIZRAF", name = "i", descriptor = "(I)B")
    public byte method261(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (128 - this.field831[this.field832++]);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "i", descriptor = "(II)V")
    public void method262(int arg0, int arg1) {
        this.field831[this.field832++] = (byte) arg0;
        if (arg1 == 0) {
            this.field831[this.field832++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "j", descriptor = "(II)V")
    public void method263(int arg0, int arg1) {
        this.field831[this.field832++] = (byte) (arg1 >> 8);
        if (arg0 != 1) {
            this.field828 = !this.field828;
        }
        this.field831[this.field832++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "k", descriptor = "(II)V")
    public void method264(int arg0, int arg1) {
        this.field831[this.field832++] = (byte) (arg0 + 128);
        this.field831[this.field832++] = (byte) (arg0 >> 8);
        if (arg1 < 4 || arg1 > 4) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "j", descriptor = "(I)I")
    public int method265(int arg0) {
        this.field832 += 2;
        return arg0 >= 0 && arg0 <= 0 ? ((this.field831[this.field832 - 1] & 0xFF) << 8) + (this.field831[this.field832 - 2] & 0xFF) : 1;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "k", descriptor = "(I)I")
    public int method266(int arg0) {
        this.field832 += 2;
        return arg0 >= 2 && arg0 <= 2 ? ((this.field831[this.field832 - 2] & 0xFF) << 8) + (this.field831[this.field832 - 1] - 128 & 0xFF) : 4;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "l", descriptor = "(I)I")
    public int method267(int arg0) {
        this.field832 += 2;
        return arg0 <= 0 ? this.field812 : ((this.field831[this.field832 - 1] & 0xFF) << 8) + (this.field831[this.field832 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "c", descriptor = "(B)I")
    public int method268(byte arg0) {
        this.field832 += 2;
        int var2 = ((this.field831[this.field832 - 1] & 0xFF) << 8) + (this.field831[this.field832 - 2] & 0xFF);
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field818 = !this.field818;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "IMUIZRAF", name = "m", descriptor = "(I)I")
    public int method269(int arg0) {
        this.field832 += 2;
        int var2 = ((this.field831[this.field832 - 2] & 0xFF) << 8) + (this.field831[this.field832 - 1] - 128 & 0xFF);
        if (arg0 == 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return this.field817;
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "c", descriptor = "(Z)I")
    public int method270(boolean arg0) {
        this.field832 += 4;
        return arg0 ? 4 : (this.field831[this.field832 - 4] & 0xFF) + ((this.field831[this.field832 - 3] & 0xFF) << 8) + ((this.field831[this.field832 - 1] & 0xFF) << 24) + ((this.field831[this.field832 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "n", descriptor = "(I)I")
    public int method271(int arg0) {
        if (arg0 <= 0) {
            this.field827 = -378;
        }
        this.field832 += 4;
        return (this.field831[this.field832 - 3] & 0xFF) + ((this.field831[this.field832 - 4] & 0xFF) << 8) + ((this.field831[this.field832 - 2] & 0xFF) << 24) + ((this.field831[this.field832 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "d", descriptor = "(B)I")
    public int method272(byte arg0) {
        if (arg0 != -105) {
            this.field816 = !this.field816;
        }
        this.field832 += 4;
        return (this.field831[this.field832 - 2] & 0xFF) + ((this.field831[this.field832 - 1] & 0xFF) << 8) + ((this.field831[this.field832 - 3] & 0xFF) << 24) + ((this.field831[this.field832 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(Z[BII)V")
    public void method273(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                this.field831[this.field832++] = (byte) (arg1[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "(II[BI)V")
    public void method274(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 >= 0) {
            this.field828 = !this.field828;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg2[var5] = (byte) (this.field831[this.field832++] - 128);
        }
    }

    @OriginalMember(owner = "IMUIZRAF", name = "a", descriptor = "([BIII)V")
    public void method275(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 5 || arg1 > 5) {
            this.field825 = !this.field825;
        }
        for (int var5 = arg2 + arg3 - 1; var5 >= arg2; var5--) {
            arg0[var5] = (byte) (this.field831[this.field832++] - 128);
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
            field834[var0] = var1;
        }
        field835 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field840 = new class38(false);
        field841 = new class38(false);
        field842 = new class38(false);
        field843 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
