import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CKBTFRZM")
public class class5 extends class17 {

    @OriginalMember(owner = "CKBTFRZM", name = "j", descriptor = "I")
    private int field105 = -39808;

    @OriginalMember(owner = "CKBTFRZM", name = "k", descriptor = "B")
    private byte field106 = 0;

    @OriginalMember(owner = "CKBTFRZM", name = "l", descriptor = "Z")
    private boolean field107 = false;

    @OriginalMember(owner = "CKBTFRZM", name = "m", descriptor = "B")
    private byte field108 = -72;

    @OriginalMember(owner = "CKBTFRZM", name = "n", descriptor = "B")
    private byte field109 = 3;

    @OriginalMember(owner = "CKBTFRZM", name = "o", descriptor = "Z")
    private boolean field110 = false;

    @OriginalMember(owner = "CKBTFRZM", name = "p", descriptor = "I")
    private int field111 = 6;

    @OriginalMember(owner = "CKBTFRZM", name = "r", descriptor = "Z")
    private boolean field113 = true;

    @OriginalMember(owner = "CKBTFRZM", name = "s", descriptor = "Z")
    private boolean field114 = true;

    @OriginalMember(owner = "CKBTFRZM", name = "t", descriptor = "I")
    private int field115 = 4;

    @OriginalMember(owner = "CKBTFRZM", name = "u", descriptor = "Z")
    private boolean field116 = false;

    @OriginalMember(owner = "CKBTFRZM", name = "v", descriptor = "I")
    private int field117 = 17283;

    @OriginalMember(owner = "CKBTFRZM", name = "w", descriptor = "Z")
    private boolean field118 = true;

    @OriginalMember(owner = "CKBTFRZM", name = "x", descriptor = "Z")
    private boolean field119 = false;

    @OriginalMember(owner = "CKBTFRZM", name = "z", descriptor = "I")
    private int field121 = 25910;

    @OriginalMember(owner = "CKBTFRZM", name = "A", descriptor = "[B")
    public byte[] field122;

    @OriginalMember(owner = "CKBTFRZM", name = "B", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "CKBTFRZM", name = "y", descriptor = "Z")
    private static boolean field120 = true;

    @OriginalMember(owner = "CKBTFRZM", name = "D", descriptor = "[I")
    private static int[] field125 = new int[256];

    @OriginalMember(owner = "CKBTFRZM", name = "E", descriptor = "[I")
    private static final int[] field126;

    @OriginalMember(owner = "CKBTFRZM", name = "J", descriptor = "LWUVIEXOA;")
    private static class69 field131;

    @OriginalMember(owner = "CKBTFRZM", name = "K", descriptor = "LWUVIEXOA;")
    private static class69 field132;

    @OriginalMember(owner = "CKBTFRZM", name = "L", descriptor = "LWUVIEXOA;")
    private static class69 field133;

    @OriginalMember(owner = "CKBTFRZM", name = "M", descriptor = "[C")
    private static char[] field134;

    @OriginalMember(owner = "CKBTFRZM", name = "q", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "CKBTFRZM", name = "C", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "CKBTFRZM", name = "G", descriptor = "I")
    private static int field128;

    @OriginalMember(owner = "CKBTFRZM", name = "H", descriptor = "I")
    private static int field129;

    @OriginalMember(owner = "CKBTFRZM", name = "I", descriptor = "I")
    private static int field130;

    @OriginalMember(owner = "CKBTFRZM", name = "F", descriptor = "LPJNVYQWL;")
    public class50 field127;

    @OriginalMember(owner = "CKBTFRZM", name = "N", descriptor = "Z")
    public static boolean field135;

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(II)LCKBTFRZM;")
    public static class5 method32(int arg0, int arg1) {
        class69 var2 = field132;
        synchronized (field132) {
            class5 var3 = null;
            if (arg0 == 0 && field128 > 0) {
                field128--;
                var3 = (class5) field131.method584();
            } else if (arg0 == 1 && field129 > 0) {
                field129--;
                var3 = (class5) field132.method584();
            } else if (arg0 == 2 && field130 > 0) {
                field130--;
                var3 = (class5) field133.method584();
            }
            if (var3 != null) {
                var3.field123 = 0;
                return var3;
            }
        }
        class5 var5 = new class5(-619);
        if (arg1 <= 0) {
            field120 = true;
        }
        var5.field123 = 0;
        if (arg0 == 0) {
            var5.field122 = new byte[100];
        } else if (arg0 == 1) {
            var5.field122 = new byte[5000];
        } else {
            var5.field122 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "<init>", descriptor = "(I)V")
    private class5(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "<init>", descriptor = "(I[B)V")
    public class5(int arg0, byte[] arg1) {
        this.field122 = arg1;
        if (arg0 < 2 || arg0 > 2) {
            this.field114 = !this.field114;
        }
        this.field123 = 0;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(BI)V")
    public void method33(byte arg0, int arg1) {
        this.field122[this.field123++] = (byte) (arg1 + this.field127.method479());
        if (arg0 != 57) {
            this.field118 = !this.field118;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(I)V")
    public void method34(int arg0) {
        this.field122[this.field123++] = (byte) arg0;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(I)V")
    public void method35(int arg0) {
        this.field122[this.field123++] = (byte) (arg0 >> 8);
        this.field122[this.field123++] = (byte) arg0;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(II)V")
    public void method36(int arg0, int arg1) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field122[this.field123++] = (byte) arg1;
        this.field122[this.field123++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "c", descriptor = "(I)V")
    public void method37(int arg0) {
        this.field122[this.field123++] = (byte) (arg0 >> 16);
        this.field122[this.field123++] = (byte) (arg0 >> 8);
        this.field122[this.field123++] = (byte) arg0;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "d", descriptor = "(I)V")
    public void method38(int arg0) {
        this.field122[this.field123++] = (byte) (arg0 >> 24);
        this.field122[this.field123++] = (byte) (arg0 >> 16);
        this.field122[this.field123++] = (byte) (arg0 >> 8);
        this.field122[this.field123++] = (byte) arg0;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "c", descriptor = "(II)V")
    public void method39(int arg0, int arg1) {
        this.field122[this.field123++] = (byte) arg1;
        this.field122[this.field123++] = (byte) (arg1 >> 8);
        if (arg0 != 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field122[this.field123++] = (byte) (arg1 >> 16);
        this.field122[this.field123++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(IJ)V")
    public void method40(int arg0, long arg1) {
        this.field122[this.field123++] = (byte) (arg1 >> 56);
        this.field122[this.field123++] = (byte) (arg1 >> 48);
        this.field122[this.field123++] = (byte) (arg1 >> 40);
        this.field122[this.field123++] = (byte) (arg1 >> 32);
        this.field122[this.field123++] = (byte) (arg1 >> 24);
        this.field122[this.field123++] = (byte) (arg1 >> 16);
        if (arg0 == 0) {
            this.field122[this.field123++] = (byte) (arg1 >> 8);
            this.field122[this.field123++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method41(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field122, this.field123);
        this.field123 += arg0.length();
        this.field122[this.field123++] = 10;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(I[BII)V")
    public void method42(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 == 9447) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                this.field122[this.field123++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "d", descriptor = "(II)V")
    public void method43(int arg0, int arg1) {
        this.field122[this.field123 - arg1 - 1] = (byte) arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "c", descriptor = "()I")
    public int method44() {
        return this.field122[this.field123++] & 0xFF;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "d", descriptor = "()B")
    public byte method45() {
        return this.field122[this.field123++];
    }

    @OriginalMember(owner = "CKBTFRZM", name = "e", descriptor = "()I")
    public int method46() {
        this.field123 += 2;
        return ((this.field122[this.field123 - 2] & 0xFF) << 8) + (this.field122[this.field123 - 1] & 0xFF);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "f", descriptor = "()I")
    public int method47() {
        this.field123 += 2;
        int var1 = ((this.field122[this.field123 - 2] & 0xFF) << 8) + (this.field122[this.field123 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "g", descriptor = "()I")
    public int method48() {
        this.field123 += 3;
        return (this.field122[this.field123 - 1] & 0xFF) + ((this.field122[this.field123 - 3] & 0xFF) << 16) + ((this.field122[this.field123 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "h", descriptor = "()I")
    public int method49() {
        this.field123 += 4;
        return (this.field122[this.field123 - 1] & 0xFF) + ((this.field122[this.field123 - 2] & 0xFF) << 8) + ((this.field122[this.field123 - 4] & 0xFF) << 24) + ((this.field122[this.field123 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "e", descriptor = "(I)J")
    public long method50(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method49() & 0xFFFFFFFFL;
        long var4 = (long) this.method49() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "i", descriptor = "()Ljava/lang/String;")
    public String method51() {
        int var1 = this.field123;
        while (this.field122[this.field123++] != 10) {
        }
        return new String(this.field122, var1, this.field123 - var1 - 1);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "f", descriptor = "(I)[B")
    public byte[] method52(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field123;
        while (this.field122[this.field123++] != 10) {
        }
        byte[] var4 = new byte[this.field123 - var3 - 1];
        for (int var5 = var3; var5 < this.field123 - 1; var5++) {
            var4[var5 - var3] = this.field122[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(B[BII)V")
    public void method53(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 == 68) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                arg1[var5] = this.field122[this.field123++];
            }
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "g", descriptor = "(I)V")
    public void method54(int arg0) {
        if (arg0 != 12265) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field124 = this.field123 * 8;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "e", descriptor = "(II)I")
    public int method55(int arg0, int arg1) {
        int var3 = this.field124 >> 3;
        int var4 = 8 - (this.field124 & 0x7);
        int var5 = 0;
        this.field124 += arg1;
        if (arg0 != 0) {
            return this.field112;
        }
        while (arg1 > var4) {
            var5 += (this.field122[var3++] & field126[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field122[var3] & field126[var4]) + var5;
        } else {
            var6 = (this.field122[var3] >> var4 - arg1 & field126[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "h", descriptor = "(I)V")
    public void method56(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field118 = !this.field118;
        }
        this.field123 = (this.field124 + 7) / 8;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "j", descriptor = "()I")
    public int method57() {
        int var1 = this.field122[this.field123] & 0xFF;
        return var1 < 128 ? this.method44() - 64 : this.method46() - 49152;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "k", descriptor = "()I")
    public int method58() {
        int var1 = this.field122[this.field123] & 0xFF;
        return var1 < 128 ? this.method44() : this.method46() - 32768;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method59(BigInteger arg0, BigInteger arg1, int arg2) {
        if (arg2 <= 0) {
            return;
        }
        int var4 = this.field123;
        this.field123 = 0;
        byte[] var5 = new byte[var4];
        this.method53((byte) 68, var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field123 = 0;
        this.method34(var8.length);
        this.method42(9447, var8, 0, var8.length);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "f", descriptor = "(II)V")
    public void method60(int arg0, int arg1) {
        if (arg1 != 47636) {
            this.field112 = 307;
        }
        this.field122[this.field123++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(BI)V")
    public void method61(byte arg0, int arg1) {
        if (arg0 != -67) {
            this.field105 = 442;
        }
        this.field122[this.field123++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(Z)I")
    public int method62(boolean arg0) {
        return arg0 ? this.field105 : this.field122[this.field123++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(B)I")
    public int method63(byte arg0) {
        return arg0 == -120 ? -this.field122[this.field123++] & 0xFF : this.field112;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "i", descriptor = "(I)I")
    public int method64(int arg0) {
        while (arg0 >= 0) {
        }
        return 128 - this.field122[this.field123++] & 0xFF;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(Z)B")
    public byte method65(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field122[this.field123++] - 128);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "c", descriptor = "(Z)B")
    public byte method66(boolean arg0) {
        if (arg0) {
            this.field115 = -387;
        }
        return (byte) -this.field122[this.field123++];
    }

    @OriginalMember(owner = "CKBTFRZM", name = "d", descriptor = "(Z)B")
    public byte method67(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field122[this.field123++]);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(IB)V")
    public void method68(int arg0, byte arg1) {
        this.field122[this.field123++] = (byte) arg0;
        this.field122[this.field123++] = (byte) (arg0 >> 8);
        if (arg1 != -125) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(IB)V")
    public void method69(int arg0, byte arg1) {
        if (arg1 != 0) {
            this.field115 = -402;
        }
        this.field122[this.field123++] = (byte) (arg0 >> 8);
        this.field122[this.field123++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "g", descriptor = "(II)V")
    public void method70(int arg0, int arg1) {
        this.field122[this.field123++] = (byte) (arg1 + 128);
        if (arg0 != 43385) {
            this.field118 = !this.field118;
        }
        this.field122[this.field123++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "j", descriptor = "(I)I")
    public int method71(int arg0) {
        if (arg0 == 0) {
            this.field123 += 2;
            return ((this.field122[this.field123 - 1] & 0xFF) << 8) + (this.field122[this.field123 - 2] & 0xFF);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "k", descriptor = "(I)I")
    public int method72(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            this.field123 += 2;
            return ((this.field122[this.field123 - 2] & 0xFF) << 8) + (this.field122[this.field123 - 1] - 128 & 0xFF);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "b", descriptor = "(B)I")
    public int method73(byte arg0) {
        if (this.field106 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field123 += 2;
        return ((this.field122[this.field123 - 1] & 0xFF) << 8) + (this.field122[this.field123 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "l", descriptor = "(I)I")
    public int method74(int arg0) {
        this.field123 += 2;
        int var2 = ((this.field122[this.field123 - 1] & 0xFF) << 8) + (this.field122[this.field123 - 2] & 0xFF);
        if (arg0 == 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "m", descriptor = "(I)I")
    public int method75(int arg0) {
        this.field123 += 2;
        if (arg0 <= 0) {
            return 3;
        }
        int var2 = ((this.field122[this.field123 - 2] & 0xFF) << 8) + (this.field122[this.field123 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "e", descriptor = "(Z)I")
    public int method76(boolean arg0) {
        this.field123 += 2;
        if (arg0) {
            return 3;
        }
        int var2 = ((this.field122[this.field123 - 1] & 0xFF) << 8) + (this.field122[this.field123 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "CKBTFRZM", name = "h", descriptor = "(II)V")
    public void method77(int arg0, int arg1) {
        this.field122[this.field123++] = (byte) (arg1 >> 8);
        this.field122[this.field123++] = (byte) arg1;
        this.field122[this.field123++] = (byte) (arg1 >> 24);
        this.field122[this.field123++] = (byte) (arg1 >> 16);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "c", descriptor = "(B)I")
    public int method78(byte arg0) {
        this.field123 += 4;
        if (this.field109 == arg0) {
            boolean var2 = false;
        } else {
            this.field119 = !this.field119;
        }
        return (this.field122[this.field123 - 4] & 0xFF) + ((this.field122[this.field123 - 3] & 0xFF) << 8) + ((this.field122[this.field123 - 1] & 0xFF) << 24) + ((this.field122[this.field123 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "n", descriptor = "(I)I")
    public int method79(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field123 += 4;
        return (this.field122[this.field123 - 3] & 0xFF) + ((this.field122[this.field123 - 4] & 0xFF) << 8) + ((this.field122[this.field123 - 2] & 0xFF) << 24) + ((this.field122[this.field123 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "o", descriptor = "(I)I")
    public int method80(int arg0) {
        this.field123 += 4;
        if (arg0 != 35745) {
            this.field116 = !this.field116;
        }
        return (this.field122[this.field123 - 2] & 0xFF) + ((this.field122[this.field123 - 1] & 0xFF) << 8) + ((this.field122[this.field123 - 3] & 0xFF) << 24) + ((this.field122[this.field123 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(IZ[BI)V")
    public void method81(int arg0, boolean arg1, byte[] arg2, int arg3) {
        if (!arg1) {
            for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
                this.field122[this.field123++] = arg2[var5];
            }
        }
    }

    @OriginalMember(owner = "CKBTFRZM", name = "a", descriptor = "(III[B)V")
    public void method82(int arg0, int arg1, int arg2, byte[] arg3) {
        if (this.field111 == arg0) {
            for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
                arg3[var5] = this.field122[this.field123++];
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
            field125[var0] = var1;
        }
        field126 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field131 = new class69((byte) 7);
        field132 = new class69((byte) 7);
        field133 = new class69((byte) 7);
        field134 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
