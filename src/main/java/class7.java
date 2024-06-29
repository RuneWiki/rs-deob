import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BSNPYLEV")
public class class7 extends class23 {

    @OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "B")
    private byte field73 = 3;

    @OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "Z")
    private boolean field74 = false;

    @OriginalMember(owner = "client!BSNPYLEV", name = "m", descriptor = "I")
    private int field76 = -457;

    @OriginalMember(owner = "client!BSNPYLEV", name = "o", descriptor = "I")
    private int field78 = 910;

    @OriginalMember(owner = "client!BSNPYLEV", name = "p", descriptor = "Z")
    private boolean field79 = false;

    @OriginalMember(owner = "client!BSNPYLEV", name = "q", descriptor = "B")
    private byte field80 = 4;

    @OriginalMember(owner = "client!BSNPYLEV", name = "r", descriptor = "Z")
    private boolean field81 = true;

    @OriginalMember(owner = "client!BSNPYLEV", name = "s", descriptor = "I")
    private int field82 = 531;

    @OriginalMember(owner = "client!BSNPYLEV", name = "t", descriptor = "B")
    private byte field83 = 8;

    @OriginalMember(owner = "client!BSNPYLEV", name = "u", descriptor = "Z")
    private boolean field84 = true;

    @OriginalMember(owner = "client!BSNPYLEV", name = "v", descriptor = "Z")
    private boolean field85 = false;

    @OriginalMember(owner = "client!BSNPYLEV", name = "w", descriptor = "I")
    private int field86 = -26531;

    @OriginalMember(owner = "client!BSNPYLEV", name = "x", descriptor = "Z")
    private boolean field87 = true;

    @OriginalMember(owner = "client!BSNPYLEV", name = "y", descriptor = "I")
    private int field88 = -48151;

    @OriginalMember(owner = "client!BSNPYLEV", name = "z", descriptor = "I")
    private int field89 = 939;

    @OriginalMember(owner = "client!BSNPYLEV", name = "A", descriptor = "[B")
    public byte[] field90;

    @OriginalMember(owner = "client!BSNPYLEV", name = "B", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "I")
    private static int field72 = 908;

    @OriginalMember(owner = "client!BSNPYLEV", name = "D", descriptor = "[I")
    private static int[] field93 = new int[256];

    @OriginalMember(owner = "client!BSNPYLEV", name = "E", descriptor = "[I")
    private static final int[] field94;

    @OriginalMember(owner = "client!BSNPYLEV", name = "J", descriptor = "LFEIPMYNH;")
    private static class15 field99;

    @OriginalMember(owner = "client!BSNPYLEV", name = "K", descriptor = "LFEIPMYNH;")
    private static class15 field100;

    @OriginalMember(owner = "client!BSNPYLEV", name = "L", descriptor = "LFEIPMYNH;")
    private static class15 field101;

    @OriginalMember(owner = "client!BSNPYLEV", name = "M", descriptor = "[C")
    private static char[] field102;

    @OriginalMember(owner = "client!BSNPYLEV", name = "l", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!BSNPYLEV", name = "n", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!BSNPYLEV", name = "C", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!BSNPYLEV", name = "G", descriptor = "I")
    private static int field96;

    @OriginalMember(owner = "client!BSNPYLEV", name = "H", descriptor = "I")
    private static int field97;

    @OriginalMember(owner = "client!BSNPYLEV", name = "I", descriptor = "I")
    private static int field98;

    @OriginalMember(owner = "client!BSNPYLEV", name = "F", descriptor = "LXXMIBCTG;")
    public class68 field95;

    @OriginalMember(owner = "client!BSNPYLEV", name = "N", descriptor = "Z")
    public static boolean field103;

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(II)LBSNPYLEV;")
    public static class7 method35(int arg0, int arg1) {
        class15 var2 = field100;
        synchronized (field100) {
            class7 var3 = null;
            if (arg0 == 0 && field96 > 0) {
                field96--;
                var3 = (class7) field99.method299();
            } else if (arg0 == 1 && field97 > 0) {
                field97--;
                var3 = (class7) field100.method299();
            } else if (arg0 == 2 && field98 > 0) {
                field98--;
                var3 = (class7) field101.method299();
            }
            if (var3 != null) {
                var3.field91 = 0;
                return var3;
            }
        }
        class7 var5 = new class7((byte) 0);
        var5.field91 = 0;
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 == 0) {
            var5.field90 = new byte[100];
        } else if (arg0 == 1) {
            var5.field90 = new byte[5000];
        } else {
            var5.field90 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "<init>", descriptor = "(B)V")
    private class7(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field86 = 462;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "<init>", descriptor = "([BB)V")
    public class7(byte[] arg0, byte arg1) {
        if (this.field73 == arg1) {
            boolean var3 = false;
        } else {
            this.field84 = !this.field84;
        }
        this.field90 = arg0;
        this.field91 = 0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(ZI)V")
    public void method36(boolean arg0, int arg1) {
        this.field90[this.field91++] = (byte) (arg1 + this.field95.method587());
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(I)V")
    public void method37(int arg0) {
        this.field90[this.field91++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(I)V")
    public void method38(int arg0) {
        this.field90[this.field91++] = (byte) (arg0 >> 8);
        this.field90[this.field91++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(II)V")
    public void method39(int arg0, int arg1) {
        this.field90[this.field91++] = (byte) arg1;
        if (arg0 != 0) {
            this.field88 = -272;
        }
        this.field90[this.field91++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(I)V")
    public void method40(int arg0) {
        this.field90[this.field91++] = (byte) (arg0 >> 16);
        this.field90[this.field91++] = (byte) (arg0 >> 8);
        this.field90[this.field91++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(I)V")
    public void method41(int arg0) {
        this.field90[this.field91++] = (byte) (arg0 >> 24);
        this.field90[this.field91++] = (byte) (arg0 >> 16);
        this.field90[this.field91++] = (byte) (arg0 >> 8);
        this.field90[this.field91++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(II)V")
    public void method42(int arg0, int arg1) {
        this.field90[this.field91++] = (byte) arg1;
        if (arg0 == -5475) {
            this.field90[this.field91++] = (byte) (arg1 >> 8);
            this.field90[this.field91++] = (byte) (arg1 >> 16);
            this.field90[this.field91++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(JI)V")
    public void method43(long arg0, int arg1) {
        this.field90[this.field91++] = (byte) (arg0 >> 56);
        this.field90[this.field91++] = (byte) (arg0 >> 48);
        this.field90[this.field91++] = (byte) (arg0 >> 40);
        this.field90[this.field91++] = (byte) (arg0 >> 32);
        if (arg1 != 3) {
            this.field88 = -363;
        }
        this.field90[this.field91++] = (byte) (arg0 >> 24);
        this.field90[this.field91++] = (byte) (arg0 >> 16);
        this.field90[this.field91++] = (byte) (arg0 >> 8);
        this.field90[this.field91++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method44(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field90, this.field91);
        this.field91 += arg0.length();
        this.field90[this.field91++] = 10;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(III[B)V")
    public void method45(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                this.field90[this.field91++] = arg3[var5];
            }
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(II)V")
    public void method46(int arg0, int arg1) {
        if (arg0 == 5) {
            this.field90[this.field91 - arg1 - 1] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "()I")
    public int method47() {
        return this.field90[this.field91++] & 0xFF;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "()B")
    public byte method48() {
        return this.field90[this.field91++];
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "()I")
    public int method49() {
        this.field91 += 2;
        return ((this.field90[this.field91 - 2] & 0xFF) << 8) + (this.field90[this.field91 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "()I")
    public int method50() {
        this.field91 += 2;
        int var1 = ((this.field90[this.field91 - 2] & 0xFF) << 8) + (this.field90[this.field91 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "()I")
    public int method51() {
        this.field91 += 3;
        return (this.field90[this.field91 - 1] & 0xFF) + ((this.field90[this.field91 - 3] & 0xFF) << 16) + ((this.field90[this.field91 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "()I")
    public int method52() {
        this.field91 += 4;
        return (this.field90[this.field91 - 1] & 0xFF) + ((this.field90[this.field91 - 2] & 0xFF) << 8) + ((this.field90[this.field91 - 4] & 0xFF) << 24) + ((this.field90[this.field91 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(B)J")
    public long method53(byte arg0) {
        long var2 = (long) this.method52() & 0xFFFFFFFFL;
        long var4 = (long) this.method52() & 0xFFFFFFFFL;
        if (arg0 != 51) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "()Ljava/lang/String;")
    public String method54() {
        int var1 = this.field91;
        while (this.field90[this.field91++] != 10) {
        }
        return new String(this.field90, var1, this.field91 - var1 - 1);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(B)[B")
    public byte[] method55(byte arg0) {
        int var2 = this.field91;
        while (this.field90[this.field91++] != 10) {
        }
        byte[] var3 = new byte[this.field91 - var2 - 1];
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            field72 = -145;
        }
        for (int var5 = var2; var5 < this.field91 - 1; var5++) {
            var3[var5 - var2] = this.field90[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(I[BII)V")
    public void method56(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                arg1[var5] = this.field90[this.field91++];
            }
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(I)V")
    public void method57(int arg0) {
        this.field92 = this.field91 * 8;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(II)I")
    public int method58(int arg0, int arg1) {
        int var3 = 75 / arg1;
        int var4 = this.field92 >> 3;
        int var5 = 8 - (this.field92 & 0x7);
        int var6 = 0;
        this.field92 += arg0;
        while (arg0 > var5) {
            var6 += (this.field90[var4++] & field94[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg0 == var5) {
            var7 = (this.field90[var4] & field94[var5]) + var6;
        } else {
            var7 = (this.field90[var4] >> var5 - arg0 & field94[arg0]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(I)V")
    public void method59(int arg0) {
        this.field91 = (this.field92 + 7) / 8;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "()I")
    public int method60() {
        int var1 = this.field90[this.field91] & 0xFF;
        return var1 < 128 ? this.method47() - 64 : this.method49() - 49152;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "()I")
    public int method61() {
        int var1 = this.field90[this.field91] & 0xFF;
        return var1 < 128 ? this.method47() : this.method49() - 32768;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method62(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field91;
        this.field91 = 0;
        byte[] var5 = new byte[var4];
        this.method56(this.field76, var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field91 = 0;
        this.method37(var8.length);
        if (!arg1) {
            this.field84 = !this.field84;
        }
        this.method45(0, 0, var8.length, var8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(II)V")
    public void method63(int arg0, int arg1) {
        int var3 = 37 / arg0;
        this.field90[this.field91++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IZ)V")
    public void method64(int arg0, boolean arg1) {
        this.field90[this.field91++] = (byte) -arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(I)I")
    public int method65(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field90[this.field91++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "(I)I")
    public int method66(int arg0) {
        return arg0 >= 2 && arg0 <= 2 ? -this.field90[this.field91++] & 0xFF : this.field77;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "(I)I")
    public int method67(int arg0) {
        return arg0 == -48149 ? 128 - this.field90[this.field91++] & 0xFF : this.field86;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(B)B")
    public byte method68(byte arg0) {
        if (arg0 != -77) {
            this.field75 = 352;
        }
        return (byte) (this.field90[this.field91++] - 128);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "(I)B")
    public byte method69(int arg0) {
        if (arg0 != 37923) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field90[this.field91++]);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(II)V")
    public void method70(int arg0, int arg1) {
        this.field90[this.field91++] = (byte) arg0;
        int var3 = 39 / arg1;
        this.field90[this.field91++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "(II)V")
    public void method71(int arg0, int arg1) {
        this.field90[this.field91++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            this.field90[this.field91++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IB)V")
    public void method72(int arg0, byte arg1) {
        if (arg1 != 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field90[this.field91++] = (byte) (arg0 + 128);
        this.field90[this.field91++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "(I)I")
    public int method73(int arg0) {
        this.field91 += 2;
        return arg0 >= 6 && arg0 <= 6 ? ((this.field90[this.field91 - 1] & 0xFF) << 8) + (this.field90[this.field91 - 2] & 0xFF) : this.field89;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(B)I")
    public int method74(byte arg0) {
        this.field91 += 2;
        return arg0 == -99 ? ((this.field90[this.field91 - 2] & 0xFF) << 8) + (this.field90[this.field91 - 1] - 128 & 0xFF) : 3;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Z)I")
    public int method75(boolean arg0) {
        this.field91 += 2;
        return arg0 ? ((this.field90[this.field91 - 1] & 0xFF) << 8) + (this.field90[this.field91 - 2] - 128 & 0xFF) : this.field78;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "l", descriptor = "(I)I")
    public int method76(int arg0) {
        this.field91 += 2;
        int var2 = ((this.field90[this.field91 - 1] & 0xFF) << 8) + (this.field90[this.field91 - 2] & 0xFF);
        if (arg0 == 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(B)I")
    public int method77(byte arg0) {
        this.field91 += 2;
        int var2 = ((this.field90[this.field91 - 2] & 0xFF) << 8) + (this.field90[this.field91 - 1] - 128 & 0xFF);
        if (this.field80 == arg0) {
            boolean var3 = false;
        } else {
            this.field79 = !this.field79;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(Z)I")
    public int method78(boolean arg0) {
        if (arg0) {
            this.field78 = 156;
        }
        this.field91 += 3;
        return (this.field90[this.field91 - 3] & 0xFF) + ((this.field90[this.field91 - 1] & 0xFF) << 16) + ((this.field90[this.field91 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "(II)V")
    public void method79(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field90[this.field91++] = (byte) arg1;
        this.field90[this.field91++] = (byte) (arg1 >> 8);
        this.field90[this.field91++] = (byte) (arg1 >> 16);
        this.field90[this.field91++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(B)I")
    public int method80(byte arg0) {
        this.field91 += 4;
        if (arg0 != 1) {
            this.field87 = !this.field87;
        }
        return (this.field90[this.field91 - 4] & 0xFF) + ((this.field90[this.field91 - 3] & 0xFF) << 8) + ((this.field90[this.field91 - 1] & 0xFF) << 24) + ((this.field90[this.field91 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(B)I")
    public int method81(byte arg0) {
        this.field91 += 4;
        if (arg0 != -12) {
            this.field74 = !this.field74;
        }
        return (this.field90[this.field91 - 3] & 0xFF) + ((this.field90[this.field91 - 4] & 0xFF) << 8) + ((this.field90[this.field91 - 2] & 0xFF) << 24) + ((this.field90[this.field91 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "m", descriptor = "(I)I")
    public int method82(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field91 += 4;
        return (this.field90[this.field91 - 2] & 0xFF) + ((this.field90[this.field91 - 1] & 0xFF) << 8) + ((this.field90[this.field91 - 3] & 0xFF) << 24) + ((this.field90[this.field91 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IIZ[B)V")
    public void method83(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg2) {
            for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
                this.field90[this.field91++] = (byte) (arg3[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(II[BI)V")
    public void method84(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 35 / arg1;
        for (int var6 = arg0 + arg3 - 1; var6 >= arg3; var6--) {
            arg2[var6] = this.field90[this.field91++];
        }
    }

    @OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "([BIBI)V")
    public void method85(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (this.field83 == arg2) {
            boolean var5 = false;
        } else {
            this.field86 = 288;
        }
        for (int var6 = arg1 + arg3 - 1; var6 >= arg3; var6--) {
            arg0[var6] = (byte) (this.field90[this.field91++] - 128);
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
            field93[var0] = var1;
        }
        field94 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field99 = new class15(true);
        field100 = new class15(true);
        field101 = new class15(true);
        field102 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
