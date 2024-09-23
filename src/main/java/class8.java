import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CFARFRSG")
public class class8 extends class60 {

    @OriginalMember(owner = "CFARFRSG", name = "l", descriptor = "I")
    private int field52 = 344;

    @OriginalMember(owner = "CFARFRSG", name = "m", descriptor = "I")
    private int field53 = 3;

    @OriginalMember(owner = "CFARFRSG", name = "n", descriptor = "I")
    private int field54 = -11820;

    @OriginalMember(owner = "CFARFRSG", name = "o", descriptor = "B")
    private byte field55 = 9;

    @OriginalMember(owner = "CFARFRSG", name = "p", descriptor = "B")
    private byte field56 = -32;

    @OriginalMember(owner = "CFARFRSG", name = "q", descriptor = "I")
    private int field57 = -482;

    @OriginalMember(owner = "CFARFRSG", name = "r", descriptor = "Z")
    private boolean field58 = true;

    @OriginalMember(owner = "CFARFRSG", name = "s", descriptor = "I")
    private int field59 = -164;

    @OriginalMember(owner = "CFARFRSG", name = "t", descriptor = "I")
    private int field60 = 743;

    @OriginalMember(owner = "CFARFRSG", name = "u", descriptor = "B")
    private byte field61 = 89;

    @OriginalMember(owner = "CFARFRSG", name = "v", descriptor = "Z")
    private boolean field62 = false;

    @OriginalMember(owner = "CFARFRSG", name = "w", descriptor = "I")
    private int field63 = 887;

    @OriginalMember(owner = "CFARFRSG", name = "x", descriptor = "B")
    private byte field64 = 4;

    @OriginalMember(owner = "CFARFRSG", name = "y", descriptor = "I")
    private int field65 = -642;

    @OriginalMember(owner = "CFARFRSG", name = "z", descriptor = "I")
    private int field66 = -962;

    @OriginalMember(owner = "CFARFRSG", name = "A", descriptor = "B")
    private byte field67 = 1;

    @OriginalMember(owner = "CFARFRSG", name = "B", descriptor = "I")
    private int field68 = -658;

    @OriginalMember(owner = "CFARFRSG", name = "D", descriptor = "Z")
    private boolean field70 = false;

    @OriginalMember(owner = "CFARFRSG", name = "E", descriptor = "[B")
    public byte[] field71;

    @OriginalMember(owner = "CFARFRSG", name = "F", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "CFARFRSG", name = "k", descriptor = "I")
    private static int field51 = 5;

    @OriginalMember(owner = "CFARFRSG", name = "C", descriptor = "I")
    private static int field69 = -524;

    @OriginalMember(owner = "CFARFRSG", name = "H", descriptor = "[I")
    private static int[] field74 = new int[256];

    @OriginalMember(owner = "CFARFRSG", name = "I", descriptor = "[I")
    private static final int[] field75;

    @OriginalMember(owner = "CFARFRSG", name = "N", descriptor = "LCLCMCMIN;")
    private static class9 field80;

    @OriginalMember(owner = "CFARFRSG", name = "O", descriptor = "LCLCMCMIN;")
    private static class9 field81;

    @OriginalMember(owner = "CFARFRSG", name = "P", descriptor = "LCLCMCMIN;")
    private static class9 field82;

    @OriginalMember(owner = "CFARFRSG", name = "Q", descriptor = "[C")
    private static char[] field83;

    @OriginalMember(owner = "CFARFRSG", name = "G", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "CFARFRSG", name = "K", descriptor = "I")
    private static int field77;

    @OriginalMember(owner = "CFARFRSG", name = "L", descriptor = "I")
    private static int field78;

    @OriginalMember(owner = "CFARFRSG", name = "M", descriptor = "I")
    private static int field79;

    @OriginalMember(owner = "CFARFRSG", name = "J", descriptor = "LQKKVGPGN;")
    public class53 field76;

    @OriginalMember(owner = "CFARFRSG", name = "R", descriptor = "Z")
    public static boolean field84;

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(II)LCFARFRSG;")
    public static class8 method18(int arg0, int arg1) {
        if (field51 != arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class9 var3 = field81;
        synchronized (field81) {
            class8 var4 = null;
            if (arg0 == 0 && field77 > 0) {
                field77--;
                var4 = (class8) field80.method70();
            } else if (arg0 == 1 && field78 > 0) {
                field78--;
                var4 = (class8) field81.method70();
            } else if (arg0 == 2 && field79 > 0) {
                field79--;
                var4 = (class8) field82.method70();
            }
            if (var4 != null) {
                var4.field72 = 0;
                return var4;
            }
        }
        class8 var6 = new class8(753);
        var6.field72 = 0;
        if (arg0 == 0) {
            var6.field71 = new byte[100];
        } else if (arg0 == 1) {
            var6.field71 = new byte[5000];
        } else {
            var6.field71 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "CFARFRSG", name = "<init>", descriptor = "(I)V")
    private class8(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "<init>", descriptor = "([BI)V")
    public class8(byte[] arg0, int arg1) {
        this.field71 = arg0;
        int var3 = 30 / arg1;
        this.field72 = 0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(II)V")
    public void method19(int arg0, int arg1) {
        this.field71[this.field72++] = (byte) (arg0 + this.field76.method475());
        if (arg1 <= 0) {
            field51 = 327;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(I)V")
    public void method20(int arg0) {
        this.field71[this.field72++] = (byte) arg0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(I)V")
    public void method21(int arg0) {
        this.field71[this.field72++] = (byte) (arg0 >> 8);
        this.field71[this.field72++] = (byte) arg0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(IZ)V")
    public void method22(int arg0, boolean arg1) {
        if (arg1) {
            this.field68 = -393;
        }
        this.field71[this.field72++] = (byte) arg0;
        this.field71[this.field72++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "(I)V")
    public void method23(int arg0) {
        this.field71[this.field72++] = (byte) (arg0 >> 16);
        this.field71[this.field72++] = (byte) (arg0 >> 8);
        this.field71[this.field72++] = (byte) arg0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "d", descriptor = "(I)V")
    public void method24(int arg0) {
        this.field71[this.field72++] = (byte) (arg0 >> 24);
        this.field71[this.field72++] = (byte) (arg0 >> 16);
        this.field71[this.field72++] = (byte) (arg0 >> 8);
        this.field71[this.field72++] = (byte) arg0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "(II)V")
    public void method25(int arg0, int arg1) {
        if (arg0 < this.field53 || arg0 > this.field53) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field71[this.field72++] = (byte) arg1;
        this.field71[this.field72++] = (byte) (arg1 >> 8);
        this.field71[this.field72++] = (byte) (arg1 >> 16);
        this.field71[this.field72++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(BJ)V")
    public void method26(byte arg0, long arg1) {
        this.field71[this.field72++] = (byte) (arg1 >> 56);
        this.field71[this.field72++] = (byte) (arg1 >> 48);
        this.field71[this.field72++] = (byte) (arg1 >> 40);
        this.field71[this.field72++] = (byte) (arg1 >> 32);
        this.field71[this.field72++] = (byte) (arg1 >> 24);
        this.field71[this.field72++] = (byte) (arg1 >> 16);
        this.field71[this.field72++] = (byte) (arg1 >> 8);
        if (arg0 == 9) {
            boolean var4 = false;
            this.field71[this.field72++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method27(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field71, this.field72);
        this.field72 += arg0.length();
        this.field71[this.field72++] = 10;
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(III[B)V")
    public void method28(int arg0, int arg1, int arg2, byte[] arg3) {
        if (this.field54 != arg2) {
            this.field53 = 279;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            this.field71[this.field72++] = arg3[var5];
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(IZ)V")
    public void method29(int arg0, boolean arg1) {
        this.field71[this.field72 - arg0 - 1] = (byte) arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "()I")
    public int method30() {
        return this.field71[this.field72++] & 0xFF;
    }

    @OriginalMember(owner = "CFARFRSG", name = "d", descriptor = "()B")
    public byte method31() {
        return this.field71[this.field72++];
    }

    @OriginalMember(owner = "CFARFRSG", name = "e", descriptor = "()I")
    public int method32() {
        this.field72 += 2;
        return ((this.field71[this.field72 - 2] & 0xFF) << 8) + (this.field71[this.field72 - 1] & 0xFF);
    }

    @OriginalMember(owner = "CFARFRSG", name = "f", descriptor = "()I")
    public int method33() {
        this.field72 += 2;
        int var1 = ((this.field71[this.field72 - 2] & 0xFF) << 8) + (this.field71[this.field72 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "CFARFRSG", name = "g", descriptor = "()I")
    public int method34() {
        this.field72 += 3;
        return (this.field71[this.field72 - 1] & 0xFF) + ((this.field71[this.field72 - 3] & 0xFF) << 16) + ((this.field71[this.field72 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "h", descriptor = "()I")
    public int method35() {
        this.field72 += 4;
        return (this.field71[this.field72 - 1] & 0xFF) + ((this.field71[this.field72 - 2] & 0xFF) << 8) + ((this.field71[this.field72 - 4] & 0xFF) << 24) + ((this.field71[this.field72 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(B)J")
    public long method36(byte arg0) {
        long var2 = (long) this.method35() & 0xFFFFFFFFL;
        if (arg0 != -111) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        long var5 = (long) this.method35() & 0xFFFFFFFFL;
        return (var2 << 32) + var5;
    }

    @OriginalMember(owner = "CFARFRSG", name = "i", descriptor = "()Ljava/lang/String;")
    public String method37() {
        int var1 = this.field72;
        while (this.field71[this.field72++] != 10) {
        }
        return new String(this.field71, var1, this.field72 - var1 - 1);
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(B)[B")
    public byte[] method38(byte arg0) {
        int var2 = this.field72;
        while (this.field71[this.field72++] != 10) {
        }
        byte[] var3 = new byte[this.field72 - var2 - 1];
        if (arg0 != 5) {
            this.field52 = -323;
        }
        for (int var4 = var2; var4 < this.field72 - 1; var4++) {
            var3[var4 - var2] = this.field71[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(III[B)V")
    public void method39(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 == 0) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg3[var5] = this.field71[this.field72++];
            }
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "e", descriptor = "(I)V")
    public void method40(int arg0) {
        if (arg0 >= 2 && arg0 <= 2) {
            this.field73 = this.field72 * 8;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "d", descriptor = "(II)I")
    public int method41(int arg0, int arg1) {
        int var3 = this.field73 >> 3;
        int var4 = 8 - (this.field73 & 0x7);
        int var5 = 0;
        this.field73 += arg1;
        int var6 = 9 / arg0;
        while (arg1 > var4) {
            var5 += (this.field71[var3++] & field75[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field71[var3] & field75[var4]) + var5;
        } else {
            var7 = (this.field71[var3] >> var4 - arg1 & field75[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "CFARFRSG", name = "f", descriptor = "(I)V")
    public void method42(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field72 = (this.field73 + 7) / 8;
    }

    @OriginalMember(owner = "CFARFRSG", name = "j", descriptor = "()I")
    public int method43() {
        int var1 = this.field71[this.field72] & 0xFF;
        return var1 < 128 ? this.method30() - 64 : this.method32() - 49152;
    }

    @OriginalMember(owner = "CFARFRSG", name = "k", descriptor = "()I")
    public int method44() {
        int var1 = this.field71[this.field72] & 0xFF;
        return var1 < 128 ? this.method30() : this.method32() - 32768;
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method45(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field72;
        this.field72 = 0;
        byte[] var5 = new byte[var4];
        this.method39(var4, 0, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field72 = 0;
        if (arg1 == 3) {
            boolean var9 = false;
        } else {
            this.field58 = !this.field58;
        }
        this.method20(var8.length);
        this.method28(0, var8.length, -11820, var8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "e", descriptor = "(II)V")
    public void method46(int arg0, int arg1) {
        this.field71[this.field72++] = (byte) (arg0 + 128);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(IB)V")
    public void method47(int arg0, byte arg1) {
        if (arg1 != 3) {
            this.field62 = !this.field62;
        }
        this.field71[this.field72++] = (byte) -arg0;
    }

    @OriginalMember(owner = "CFARFRSG", name = "f", descriptor = "(II)V")
    public void method48(int arg0, int arg1) {
        int var3 = 16 / arg0;
        this.field71[this.field72++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "CFARFRSG", name = "g", descriptor = "(I)I")
    public int method49(int arg0) {
        int var2 = 77 / arg0;
        return this.field71[this.field72++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "(B)I")
    public int method50(byte arg0) {
        if (arg0 != 70) {
            this.field62 = !this.field62;
        }
        return -this.field71[this.field72++] & 0xFF;
    }

    @OriginalMember(owner = "CFARFRSG", name = "h", descriptor = "(I)I")
    public int method51(int arg0) {
        if (arg0 != 11818) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field71[this.field72++] & 0xFF;
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(Z)B")
    public byte method52(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field71[this.field72++] - 128);
    }

    @OriginalMember(owner = "CFARFRSG", name = "d", descriptor = "(B)B")
    public byte method53(byte arg0) {
        if (this.field64 != arg0) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return (byte) (128 - this.field71[this.field72++]);
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "(IZ)V")
    public void method54(int arg0, boolean arg1) {
        this.field71[this.field72++] = (byte) arg0;
        if (!arg1) {
            this.field58 = !this.field58;
        }
        this.field71[this.field72++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "g", descriptor = "(II)V")
    public void method55(int arg0, int arg1) {
        this.field71[this.field72++] = (byte) (arg1 >> 8);
        this.field71[this.field72++] = (byte) (arg1 + 128);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "h", descriptor = "(II)V")
    public void method56(int arg0, int arg1) {
        int var3 = 0 / arg1;
        this.field71[this.field72++] = (byte) (arg0 + 128);
        this.field71[this.field72++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "e", descriptor = "(B)I")
    public int method57(byte arg0) {
        this.field72 += 2;
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field52 = -141;
        }
        return ((this.field71[this.field72 - 1] & 0xFF) << 8) + (this.field71[this.field72 - 2] & 0xFF);
    }

    @OriginalMember(owner = "CFARFRSG", name = "i", descriptor = "(I)I")
    public int method58(int arg0) {
        this.field72 += 2;
        int var2 = 46 / arg0;
        return ((this.field71[this.field72 - 2] & 0xFF) << 8) + (this.field71[this.field72 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "CFARFRSG", name = "j", descriptor = "(I)I")
    public int method59(int arg0) {
        if (arg0 >= 0) {
            return 4;
        } else {
            this.field72 += 2;
            return ((this.field71[this.field72 - 1] & 0xFF) << 8) + (this.field71[this.field72 - 2] - 128 & 0xFF);
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "b", descriptor = "(Z)I")
    public int method60(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field72 += 2;
        int var3 = ((this.field71[this.field72 - 1] & 0xFF) << 8) + (this.field71[this.field72 - 2] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "CFARFRSG", name = "k", descriptor = "(I)I")
    public int method61(int arg0) {
        this.field72 += 2;
        if (arg0 < 9 || arg0 > 9) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = ((this.field71[this.field72 - 2] & 0xFF) << 8) + (this.field71[this.field72 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "CFARFRSG", name = "l", descriptor = "(I)I")
    public int method62(int arg0) {
        this.field72 += 3;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field71[this.field72 - 2] & 0xFF) + ((this.field71[this.field72 - 3] & 0xFF) << 16) + ((this.field71[this.field72 - 1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "CFARFRSG", name = "i", descriptor = "(II)V")
    public void method63(int arg0, int arg1) {
        this.field71[this.field72++] = (byte) (arg1 >> 16);
        this.field71[this.field72++] = (byte) (arg1 >> 24);
        this.field71[this.field72++] = (byte) arg1;
        if (arg0 < 0) {
            this.field71[this.field72++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "c", descriptor = "(Z)I")
    public int method64(boolean arg0) {
        this.field72 += 4;
        return arg0 ? 4 : (this.field71[this.field72 - 4] & 0xFF) + ((this.field71[this.field72 - 3] & 0xFF) << 8) + ((this.field71[this.field72 - 1] & 0xFF) << 24) + ((this.field71[this.field72 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CFARFRSG", name = "m", descriptor = "(I)I")
    public int method65(int arg0) {
        while (arg0 >= 0) {
            this.field58 = !this.field58;
        }
        this.field72 += 4;
        return (this.field71[this.field72 - 2] & 0xFF) + ((this.field71[this.field72 - 1] & 0xFF) << 8) + ((this.field71[this.field72 - 3] & 0xFF) << 24) + ((this.field71[this.field72 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "(I[BIZ)V")
    public void method66(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
            this.field71[this.field72++] = (byte) (arg1[var6] + 128);
        }
    }

    @OriginalMember(owner = "CFARFRSG", name = "a", descriptor = "([BIII)V")
    public void method67(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                arg0[var5] = (byte) (this.field71[this.field72++] - 128);
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
            field74[var0] = var1;
        }
        field75 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field80 = new class9(field69);
        field81 = new class9(field69);
        field82 = new class9(field69);
        field83 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
