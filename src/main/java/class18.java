import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EYMNCFMK")
public class class18 extends class68 {

    @OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "I")
    private int field772 = 4;

    @OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "Z")
    private boolean field773 = true;

    @OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "I")
    private int field774 = -17359;

    @OriginalMember(owner = "client!EYMNCFMK", name = "l", descriptor = "I")
    private int field775 = 875;

    @OriginalMember(owner = "client!EYMNCFMK", name = "m", descriptor = "B")
    private byte field776 = 4;

    @OriginalMember(owner = "client!EYMNCFMK", name = "n", descriptor = "I")
    private int field777 = -2948;

    @OriginalMember(owner = "client!EYMNCFMK", name = "o", descriptor = "I")
    private int field778 = -2948;

    @OriginalMember(owner = "client!EYMNCFMK", name = "p", descriptor = "B")
    private byte field779 = 4;

    @OriginalMember(owner = "client!EYMNCFMK", name = "q", descriptor = "B")
    private byte field780 = 5;

    @OriginalMember(owner = "client!EYMNCFMK", name = "r", descriptor = "I")
    private int field781 = -16715;

    @OriginalMember(owner = "client!EYMNCFMK", name = "t", descriptor = "B")
    private byte field783 = 1;

    @OriginalMember(owner = "client!EYMNCFMK", name = "u", descriptor = "B")
    private byte field784 = 3;

    @OriginalMember(owner = "client!EYMNCFMK", name = "v", descriptor = "I")
    private int field785 = 899;

    @OriginalMember(owner = "client!EYMNCFMK", name = "w", descriptor = "B")
    private byte field786 = -115;

    @OriginalMember(owner = "client!EYMNCFMK", name = "x", descriptor = "Z")
    private boolean field787 = false;

    @OriginalMember(owner = "client!EYMNCFMK", name = "y", descriptor = "Z")
    private boolean field788 = true;

    @OriginalMember(owner = "client!EYMNCFMK", name = "z", descriptor = "Z")
    private boolean field789 = false;

    @OriginalMember(owner = "client!EYMNCFMK", name = "B", descriptor = "Z")
    private boolean field791 = false;

    @OriginalMember(owner = "client!EYMNCFMK", name = "C", descriptor = "Z")
    private boolean field792 = true;

    @OriginalMember(owner = "client!EYMNCFMK", name = "D", descriptor = "[B")
    public byte[] field793;

    @OriginalMember(owner = "client!EYMNCFMK", name = "E", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!EYMNCFMK", name = "A", descriptor = "I")
    private static int field790 = -28345;

    @OriginalMember(owner = "client!EYMNCFMK", name = "G", descriptor = "[I")
    private static int[] field796 = new int[256];

    @OriginalMember(owner = "client!EYMNCFMK", name = "H", descriptor = "[I")
    private static final int[] field797;

    @OriginalMember(owner = "client!EYMNCFMK", name = "M", descriptor = "LDMMTBJKZ;")
    private static class12 field802;

    @OriginalMember(owner = "client!EYMNCFMK", name = "N", descriptor = "LDMMTBJKZ;")
    private static class12 field803;

    @OriginalMember(owner = "client!EYMNCFMK", name = "O", descriptor = "LDMMTBJKZ;")
    private static class12 field804;

    @OriginalMember(owner = "client!EYMNCFMK", name = "P", descriptor = "[C")
    private static char[] field805;

    @OriginalMember(owner = "client!EYMNCFMK", name = "s", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!EYMNCFMK", name = "F", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!EYMNCFMK", name = "J", descriptor = "I")
    private static int field799;

    @OriginalMember(owner = "client!EYMNCFMK", name = "K", descriptor = "I")
    private static int field800;

    @OriginalMember(owner = "client!EYMNCFMK", name = "L", descriptor = "I")
    private static int field801;

    @OriginalMember(owner = "client!EYMNCFMK", name = "I", descriptor = "LTXNIKMNQ;")
    public class57 field798;

    @OriginalMember(owner = "client!EYMNCFMK", name = "Q", descriptor = "Z")
    public static boolean field806;

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(II)LEYMNCFMK;")
    public static class18 method227(int arg0, int arg1) {
        if (arg0 < 5 || arg0 > 5) {
            field790 = -464;
        }
        class12 var2 = field803;
        synchronized (field803) {
            class18 var3 = null;
            if (arg1 == 0 && field799 > 0) {
                field799--;
                var3 = (class18) field802.method199();
            } else if (arg1 == 1 && field800 > 0) {
                field800--;
                var3 = (class18) field803.method199();
            } else if (arg1 == 2 && field801 > 0) {
                field801--;
                var3 = (class18) field804.method199();
            }
            if (var3 != null) {
                var3.field794 = 0;
                return var3;
            }
        }
        class18 var5 = new class18(4);
        var5.field794 = 0;
        if (arg1 == 0) {
            var5.field793 = new byte[100];
        } else if (arg1 == 1) {
            var5.field793 = new byte[5000];
        } else {
            var5.field793 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "<init>", descriptor = "(I)V")
    private class18(int arg0) {
        if (arg0 < this.field772 || arg0 > this.field772) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "<init>", descriptor = "([BI)V")
    public class18(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            field790 = 425;
        }
        this.field793 = arg0;
        this.field794 = 0;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(IZ)V")
    public void method228(int arg0, boolean arg1) {
        this.field793[this.field794++] = (byte) (arg0 + this.field798.method524());
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(I)V")
    public void method229(int arg0) {
        this.field793[this.field794++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(I)V")
    public void method230(int arg0) {
        this.field793[this.field794++] = (byte) (arg0 >> 8);
        this.field793[this.field794++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(II)V")
    public void method231(int arg0, int arg1) {
        this.field793[this.field794++] = (byte) arg1;
        this.field793[this.field794++] = (byte) (arg1 >> 8);
        if (this.field774 != arg0) {
            this.field788 = !this.field788;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(I)V")
    public void method232(int arg0) {
        this.field793[this.field794++] = (byte) (arg0 >> 16);
        this.field793[this.field794++] = (byte) (arg0 >> 8);
        this.field793[this.field794++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(I)V")
    public void method233(int arg0) {
        this.field793[this.field794++] = (byte) (arg0 >> 24);
        this.field793[this.field794++] = (byte) (arg0 >> 16);
        this.field793[this.field794++] = (byte) (arg0 >> 8);
        this.field793[this.field794++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(II)V")
    public void method234(int arg0, int arg1) {
        this.field793[this.field794++] = (byte) arg0;
        this.field793[this.field794++] = (byte) (arg0 >> 8);
        if (arg1 < 0) {
            this.field793[this.field794++] = (byte) (arg0 >> 16);
            this.field793[this.field794++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(JI)V")
    public void method235(long arg0, int arg1) {
        this.field793[this.field794++] = (byte) (arg0 >> 56);
        this.field793[this.field794++] = (byte) (arg0 >> 48);
        this.field793[this.field794++] = (byte) (arg0 >> 40);
        this.field793[this.field794++] = (byte) (arg0 >> 32);
        this.field793[this.field794++] = (byte) (arg0 >> 24);
        this.field793[this.field794++] = (byte) (arg0 >> 16);
        this.field793[this.field794++] = (byte) (arg0 >> 8);
        this.field793[this.field794++] = (byte) arg0;
        if (arg1 < 5 || arg1 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method236(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field793, this.field794);
        this.field794 += arg0.length();
        this.field793[this.field794++] = 10;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "([BIBI)V")
    public void method237(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == -116) {
            for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
                this.field793[this.field794++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(II)V")
    public void method238(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field793[this.field794 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "()I")
    public int method239() {
        return this.field793[this.field794++] & 0xFF;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "()B")
    public byte method240() {
        return this.field793[this.field794++];
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "()I")
    public int method241() {
        this.field794 += 2;
        return ((this.field793[this.field794 - 2] & 0xFF) << 8) + (this.field793[this.field794 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "()I")
    public int method242() {
        this.field794 += 2;
        int var1 = ((this.field793[this.field794 - 2] & 0xFF) << 8) + (this.field793[this.field794 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "()I")
    public int method243() {
        this.field794 += 3;
        return (this.field793[this.field794 - 1] & 0xFF) + ((this.field793[this.field794 - 3] & 0xFF) << 16) + ((this.field793[this.field794 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "h", descriptor = "()I")
    public int method244() {
        this.field794 += 4;
        return (this.field793[this.field794 - 1] & 0xFF) + ((this.field793[this.field794 - 2] & 0xFF) << 8) + ((this.field793[this.field794 - 4] & 0xFF) << 24) + ((this.field793[this.field794 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(I)J")
    public long method245(int arg0) {
        long var2 = (long) this.method244() & 0xFFFFFFFFL;
        int var4 = 62 / arg0;
        long var5 = (long) this.method244() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "()Ljava/lang/String;")
    public String method246() {
        int var1 = this.field794;
        while (this.field793[this.field794++] != 10) {
        }
        return new String(this.field793, var1, this.field794 - var1 - 1);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(B)[B")
    public byte[] method247(byte arg0) {
        if (this.field776 == arg0) {
            boolean var2 = false;
        } else {
            this.field773 = !this.field773;
        }
        int var3 = this.field794;
        while (this.field793[this.field794++] != 10) {
        }
        byte[] var4 = new byte[this.field794 - var3 - 1];
        for (int var5 = var3; var5 < this.field794 - 1; var5++) {
            var4[var5 - var3] = this.field793[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(I[BII)V")
    public void method248(int arg0, byte[] arg1, int arg2, int arg3) {
        if (this.field778 == arg0) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                arg1[var5] = this.field793[this.field794++];
            }
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(B)V")
    public void method249(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
            this.field795 = this.field794 * 8;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(BI)I")
    public int method250(byte arg0, int arg1) {
        int var3 = this.field795 >> 3;
        int var4 = 8 - (this.field795 & 0x7);
        int var5 = 0;
        if (arg0 != 79) {
            this.field772 = 297;
        }
        this.field795 += arg1;
        while (arg1 > var4) {
            var5 += (this.field793[var3++] & field797[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field793[var3] & field797[var4]) + var5;
        } else {
            var6 = (this.field793[var3] >> var4 - arg1 & field797[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(B)V")
    public void method251(byte arg0) {
        if (this.field779 != arg0) {
            this.field792 = !this.field792;
        }
        this.field794 = (this.field795 + 7) / 8;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "()I")
    public int method252() {
        int var1 = this.field793[this.field794] & 0xFF;
        return var1 < 128 ? this.method239() - 64 : this.method241() - 49152;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "()I")
    public int method253() {
        int var1 = this.field793[this.field794] & 0xFF;
        return var1 < 128 ? this.method239() : this.method241() - 32768;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method254(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field794;
        this.field794 = 0;
        byte[] var5 = new byte[var4];
        this.method248(this.field777, var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        if (arg2 <= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        byte[] var9 = var7.toByteArray();
        this.field794 = 0;
        this.method229(var9.length);
        this.method237(var9, var9.length, (byte) -116, 0);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(ZI)V")
    public void method255(boolean arg0, int arg1) {
        this.field793[this.field794++] = (byte) (arg1 + 128);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(IZ)V")
    public void method256(int arg0, boolean arg1) {
        this.field793[this.field794++] = (byte) -arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(II)V")
    public void method257(int arg0, int arg1) {
        this.field793[this.field794++] = (byte) (128 - arg0);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(I)I")
    public int method258(int arg0) {
        if (arg0 <= 0) {
            this.field792 = !this.field792;
        }
        return this.field793[this.field794++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "d", descriptor = "(B)I")
    public int method259(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return -this.field793[this.field794++] & 0xFF;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "(I)I")
    public int method260(int arg0) {
        return arg0 >= 0 ? 0 : 128 - this.field793[this.field794++] & 0xFF;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "h", descriptor = "(I)B")
    public byte method261(int arg0) {
        if (arg0 <= 0) {
            this.field782 = -87;
        }
        return (byte) (this.field793[this.field794++] - 128);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "e", descriptor = "(B)B")
    public byte method262(byte arg0) {
        if (this.field783 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field793[this.field794++];
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "i", descriptor = "(I)B")
    public byte method263(int arg0) {
        if (arg0 != 0) {
            this.field773 = !this.field773;
        }
        return (byte) (128 - this.field793[this.field794++]);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(BI)V")
    public void method264(byte arg0, int arg1) {
        if (arg0 != 1) {
            this.field773 = !this.field773;
        }
        this.field793[this.field794++] = (byte) arg1;
        this.field793[this.field794++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(II)V")
    public void method265(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field789 = !this.field789;
        }
        this.field793[this.field794++] = (byte) (arg1 >> 8);
        this.field793[this.field794++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(ZI)V")
    public void method266(boolean arg0, int arg1) {
        this.field793[this.field794++] = (byte) (arg1 + 128);
        this.field793[this.field794++] = (byte) (arg1 >> 8);
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "f", descriptor = "(B)I")
    public int method267(byte arg0) {
        if (arg0 == -97) {
            this.field794 += 2;
            return ((this.field793[this.field794 - 1] & 0xFF) << 8) + (this.field793[this.field794 - 2] & 0xFF);
        } else {
            return this.field772;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "g", descriptor = "(B)I")
    public int method268(byte arg0) {
        this.field794 += 2;
        return arg0 == 6 ? ((this.field793[this.field794 - 2] & 0xFF) << 8) + (this.field793[this.field794 - 1] - 128 & 0xFF) : 3;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(Z)I")
    public int method269(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field794 += 2;
        return ((this.field793[this.field794 - 1] & 0xFF) << 8) + (this.field793[this.field794 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "b", descriptor = "(Z)I")
    public int method270(boolean arg0) {
        if (arg0) {
            this.field789 = !this.field789;
        }
        this.field794 += 2;
        int var2 = ((this.field793[this.field794 - 1] & 0xFF) << 8) + (this.field793[this.field794 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "j", descriptor = "(I)I")
    public int method271(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field781 = 360;
        }
        this.field794 += 2;
        int var2 = ((this.field793[this.field794 - 2] & 0xFF) << 8) + (this.field793[this.field794 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(Z)I")
    public int method272(boolean arg0) {
        this.field794 += 2;
        int var2 = ((this.field793[this.field794 - 1] & 0xFF) << 8) + (this.field793[this.field794 - 2] - 128 & 0xFF);
        if (arg0) {
            this.field791 = !this.field791;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "c", descriptor = "(BI)V")
    public void method273(byte arg0, int arg1) {
        this.field793[this.field794++] = (byte) arg1;
        this.field793[this.field794++] = (byte) (arg1 >> 8);
        this.field793[this.field794++] = (byte) (arg1 >> 16);
        this.field793[this.field794++] = (byte) (arg1 >> 24);
        if (arg0 == -62) {
            ;
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "k", descriptor = "(I)I")
    public int method274(int arg0) {
        this.field794 += 4;
        if (arg0 != 0) {
            this.field772 = -450;
        }
        return (this.field793[this.field794 - 3] & 0xFF) + ((this.field793[this.field794 - 4] & 0xFF) << 8) + ((this.field793[this.field794 - 2] & 0xFF) << 24) + ((this.field793[this.field794 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "l", descriptor = "(I)I")
    public int method275(int arg0) {
        this.field794 += 4;
        int var2 = 22 / arg0;
        return (this.field793[this.field794 - 2] & 0xFF) + ((this.field793[this.field794 - 1] & 0xFF) << 8) + ((this.field793[this.field794 - 3] & 0xFF) << 24) + ((this.field793[this.field794 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "(II[BB)V")
    public void method276(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 == 4) {
            for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
                this.field793[this.field794++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "client!EYMNCFMK", name = "a", descriptor = "([BIII)V")
    public void method277(byte[] arg0, int arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field777 = 398;
        }
        for (int var5 = arg1 + arg3 - 1; var5 >= arg1; var5--) {
            arg0[var5] = (byte) (this.field793[this.field794++] - 128);
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
            field796[var0] = var1;
        }
        field797 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field802 = new class12((byte) 5);
        field803 = new class12((byte) 5);
        field804 = new class12((byte) 5);
        field805 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
