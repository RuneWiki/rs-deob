import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EGCCHUZS")
public class class15 extends class10 {

    @OriginalMember(owner = "EGCCHUZS", name = "i", descriptor = "I")
    private int field690 = 1;

    @OriginalMember(owner = "EGCCHUZS", name = "j", descriptor = "I")
    private int field691 = -380;

    @OriginalMember(owner = "EGCCHUZS", name = "k", descriptor = "I")
    private int field692 = -40923;

    @OriginalMember(owner = "EGCCHUZS", name = "l", descriptor = "B")
    private byte field693 = -2;

    @OriginalMember(owner = "EGCCHUZS", name = "m", descriptor = "I")
    private int field694 = 393;

    @OriginalMember(owner = "EGCCHUZS", name = "n", descriptor = "I")
    private int field695 = -361;

    @OriginalMember(owner = "EGCCHUZS", name = "o", descriptor = "Z")
    private boolean field696 = false;

    @OriginalMember(owner = "EGCCHUZS", name = "p", descriptor = "I")
    private int field697 = -549;

    @OriginalMember(owner = "EGCCHUZS", name = "q", descriptor = "B")
    private byte field698 = -105;

    @OriginalMember(owner = "EGCCHUZS", name = "r", descriptor = "I")
    private int field699 = -48141;

    @OriginalMember(owner = "EGCCHUZS", name = "t", descriptor = "I")
    private int field701 = 37931;

    @OriginalMember(owner = "EGCCHUZS", name = "u", descriptor = "Z")
    private boolean field702 = true;

    @OriginalMember(owner = "EGCCHUZS", name = "v", descriptor = "Z")
    private boolean field703 = false;

    @OriginalMember(owner = "EGCCHUZS", name = "w", descriptor = "Z")
    private boolean field704 = true;

    @OriginalMember(owner = "EGCCHUZS", name = "x", descriptor = "Z")
    private boolean field705 = true;

    @OriginalMember(owner = "EGCCHUZS", name = "y", descriptor = "I")
    private int field706 = 202;

    @OriginalMember(owner = "EGCCHUZS", name = "A", descriptor = "[B")
    public byte[] field708;

    @OriginalMember(owner = "EGCCHUZS", name = "B", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "EGCCHUZS", name = "z", descriptor = "I")
    private static int field707 = 890;

    @OriginalMember(owner = "EGCCHUZS", name = "D", descriptor = "[I")
    private static int[] field711 = new int[256];

    @OriginalMember(owner = "EGCCHUZS", name = "E", descriptor = "[I")
    private static final int[] field712;

    @OriginalMember(owner = "EGCCHUZS", name = "J", descriptor = "LJQSVNFRT;")
    private static class36 field717;

    @OriginalMember(owner = "EGCCHUZS", name = "K", descriptor = "LJQSVNFRT;")
    private static class36 field718;

    @OriginalMember(owner = "EGCCHUZS", name = "L", descriptor = "LJQSVNFRT;")
    private static class36 field719;

    @OriginalMember(owner = "EGCCHUZS", name = "M", descriptor = "[C")
    private static char[] field720;

    @OriginalMember(owner = "EGCCHUZS", name = "s", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "EGCCHUZS", name = "C", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "EGCCHUZS", name = "G", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "EGCCHUZS", name = "H", descriptor = "I")
    private static int field715;

    @OriginalMember(owner = "EGCCHUZS", name = "I", descriptor = "I")
    private static int field716;

    @OriginalMember(owner = "EGCCHUZS", name = "F", descriptor = "LQHNACLRF;")
    public class54 field713;

    @OriginalMember(owner = "EGCCHUZS", name = "N", descriptor = "Z")
    public static boolean field721;

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(II)LEGCCHUZS;")
    public static class15 method249(int arg0, int arg1) {
        class36 var2 = field718;
        synchronized (field718) {
            class15 var3 = null;
            if (arg1 == 0 && field714 > 0) {
                field714--;
                var3 = (class15) field717.method394();
            } else if (arg1 == 1 && field715 > 0) {
                field715--;
                var3 = (class15) field718.method394();
            } else if (arg1 == 2 && field716 > 0) {
                field716--;
                var3 = (class15) field719.method394();
            }
            if (var3 != null) {
                var3.field709 = 0;
                return var3;
            }
        }
        class15 var5 = new class15(433);
        var5.field709 = 0;
        if (arg0 < 2 || arg0 > 2) {
            field707 = -350;
        }
        if (arg1 == 0) {
            var5.field708 = new byte[100];
        } else if (arg1 == 1) {
            var5.field708 = new byte[5000];
        } else {
            var5.field708 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "<init>", descriptor = "(I)V")
    private class15(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "<init>", descriptor = "([BZ)V")
    public class15(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field704 = !this.field704;
        }
        this.field708 = arg0;
        this.field709 = 0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "b", descriptor = "(II)V")
    public void method250(int arg0, int arg1) {
        this.field708[this.field709++] = (byte) (arg1 + this.field713.method522());
        if (arg0 < this.field690 || arg0 > this.field690) {
            this.field705 = !this.field705;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(I)V")
    public void method251(int arg0) {
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "b", descriptor = "(I)V")
    public void method252(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(IB)V")
    public void method253(int arg0, byte arg1) {
        this.field708[this.field709++] = (byte) arg0;
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        if (arg1 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "(I)V")
    public void method254(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "(I)V")
    public void method255(int arg0) {
        this.field708[this.field709++] = (byte) (arg0 >> 24);
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) arg0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "(II)V")
    public void method256(int arg0, int arg1) {
        this.field708[this.field709++] = (byte) arg1;
        if (arg0 != -25153) {
            this.field704 = !this.field704;
        }
        this.field708[this.field709++] = (byte) (arg1 >> 8);
        this.field708[this.field709++] = (byte) (arg1 >> 16);
        this.field708[this.field709++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(IJ)V")
    public void method257(int arg0, long arg1) {
        this.field708[this.field709++] = (byte) (arg1 >> 56);
        this.field708[this.field709++] = (byte) (arg1 >> 48);
        this.field708[this.field709++] = (byte) (arg1 >> 40);
        this.field708[this.field709++] = (byte) (arg1 >> 32);
        this.field708[this.field709++] = (byte) (arg1 >> 24);
        this.field708[this.field709++] = (byte) (arg1 >> 16);
        this.field708[this.field709++] = (byte) (arg1 >> 8);
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field708[this.field709++] = (byte) arg1;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method258(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field708, this.field709);
        this.field709 += arg0.length();
        this.field708[this.field709++] = 10;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "([BIIZ)V")
    public void method259(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1; var6 < arg1 + arg2; var6++) {
            this.field708[this.field709++] = arg0[var6];
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "(II)V")
    public void method260(int arg0, int arg1) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field708[this.field709 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "()I")
    public int method261() {
        return this.field708[this.field709++] & 0xFF;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "()B")
    public byte method262() {
        return this.field708[this.field709++];
    }

    @OriginalMember(owner = "EGCCHUZS", name = "e", descriptor = "()I")
    public int method263() {
        this.field709 += 2;
        return ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "f", descriptor = "()I")
    public int method264() {
        this.field709 += 2;
        int var1 = ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "g", descriptor = "()I")
    public int method265() {
        this.field709 += 3;
        return (this.field708[this.field709 - 1] & 0xFF) + ((this.field708[this.field709 - 3] & 0xFF) << 16) + ((this.field708[this.field709 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "h", descriptor = "()I")
    public int method266() {
        this.field709 += 4;
        return (this.field708[this.field709 - 1] & 0xFF) + ((this.field708[this.field709 - 2] & 0xFF) << 8) + ((this.field708[this.field709 - 4] & 0xFF) << 24) + ((this.field708[this.field709 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(Z)J")
    public long method267(boolean arg0) {
        if (arg0) {
            this.field704 = !this.field704;
        }
        long var2 = (long) this.method266() & 0xFFFFFFFFL;
        long var4 = (long) this.method266() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "i", descriptor = "()Ljava/lang/String;")
    public String method268() {
        int var1 = this.field709;
        while (this.field708[this.field709++] != 10) {
        }
        return new String(this.field708, var1, this.field709 - var1 - 1);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "b", descriptor = "(Z)[B")
    public byte[] method269(boolean arg0) {
        int var2 = this.field709;
        while (this.field708[this.field709++] != 10) {
        }
        byte[] var3 = new byte[this.field709 - var2 - 1];
        if (!arg0) {
            this.field692 = -212;
        }
        for (int var4 = var2; var4 < this.field709 - 1; var4++) {
            var3[var4 - var2] = this.field708[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(II[BI)V")
    public void method270(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 == 18677) {
            for (int var5 = arg1; var5 < arg0 + arg1; var5++) {
                arg2[var5] = this.field708[this.field709++];
            }
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "(Z)V")
    public void method271(boolean arg0) {
        if (!arg0) {
            this.field710 = this.field709 * 8;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "b", descriptor = "(IB)I")
    public int method272(int arg0, byte arg1) {
        int var3 = this.field710 >> 3;
        int var4 = 8 - (this.field710 & 0x7);
        int var5 = 0;
        if (arg1 != 0) {
            this.field690 = -317;
        }
        this.field710 += arg0;
        while (arg0 > var4) {
            var5 += (this.field708[var3++] & field712[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field708[var3] & field712[var4]) + var5;
        } else {
            var6 = (this.field708[var3] >> var4 - arg0 & field712[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(B)V")
    public void method273(byte arg0) {
        this.field709 = (this.field710 + 7) / 8;
        if (this.field693 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "j", descriptor = "()I")
    public int method274() {
        int var1 = this.field708[this.field709] & 0xFF;
        return var1 < 128 ? this.method261() - 64 : this.method263() - 49152;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "k", descriptor = "()I")
    public int method275() {
        int var1 = this.field708[this.field709] & 0xFF;
        return var1 < 128 ? this.method261() : this.method263() - 32768;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method276(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field709;
        if (arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field709 = 0;
        byte[] var6 = new byte[var4];
        this.method270(var4, 0, var6, 18677);
        BigInteger var7 = new BigInteger(var6);
        BigInteger var8 = var7.modPow(arg2, arg0);
        byte[] var9 = var8.toByteArray();
        this.field709 = 0;
        this.method251(var9.length);
        this.method259(var9, 0, var9.length, true);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "(IB)V")
    public void method277(int arg0, byte arg1) {
        this.field708[this.field709++] = (byte) -arg0;
        if (this.field698 == arg1) {
            ;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(BI)V")
    public void method278(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.field704 = !this.field704;
        }
        this.field708[this.field709++] = (byte) (128 - arg1);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "e", descriptor = "(I)I")
    public int method279(int arg0) {
        if (arg0 != 0) {
            this.field705 = !this.field705;
        }
        return this.field708[this.field709++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "(Z)I")
    public int method280(boolean arg0) {
        return arg0 ? -this.field708[this.field709++] & 0xFF : 3;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "e", descriptor = "(Z)I")
    public int method281(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field708[this.field709++] & 0xFF;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "b", descriptor = "(B)B")
    public byte method282(byte arg0) {
        if (arg0 != -95) {
            this.field695 = 53;
        }
        return (byte) -this.field708[this.field709++];
    }

    @OriginalMember(owner = "EGCCHUZS", name = "c", descriptor = "(B)B")
    public byte method283(byte arg0) {
        if (arg0 != 3) {
            this.field694 = 100;
        }
        return (byte) (128 - this.field708[this.field709++]);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "e", descriptor = "(II)V")
    public void method284(int arg0, int arg1) {
        this.field708[this.field709++] = (byte) arg0;
        if (arg1 != 33414) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field708[this.field709++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(ZI)V")
    public void method285(boolean arg0, int arg1) {
        this.field708[this.field709++] = (byte) (arg1 >> 8);
        if (!arg0) {
            this.field704 = !this.field704;
        }
        this.field708[this.field709++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "(IB)V")
    public void method286(int arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var3 = false;
            this.field708[this.field709++] = (byte) (arg0 + 128);
            this.field708[this.field709++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "f", descriptor = "(I)I")
    public int method287(int arg0) {
        if (arg0 == 5) {
            this.field709 += 2;
            return ((this.field708[this.field709 - 1] & 0xFF) << 8) + (this.field708[this.field709 - 2] & 0xFF);
        } else {
            return this.field697;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "g", descriptor = "(I)I")
    public int method288(int arg0) {
        this.field709 += 2;
        if (arg0 != -36835) {
            field707 = -413;
        }
        return ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "h", descriptor = "(I)I")
    public int method289(int arg0) {
        if (arg0 != 0) {
            this.field705 = !this.field705;
        }
        this.field709 += 2;
        return ((this.field708[this.field709 - 1] & 0xFF) << 8) + (this.field708[this.field709 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "f", descriptor = "(Z)I")
    public int method290(boolean arg0) {
        if (arg0) {
            field707 = -40;
        }
        this.field709 += 2;
        int var2 = ((this.field708[this.field709 - 1] & 0xFF) << 8) + (this.field708[this.field709 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "d", descriptor = "(B)I")
    public int method291(byte arg0) {
        this.field709 += 2;
        int var2 = ((this.field708[this.field709 - 2] & 0xFF) << 8) + (this.field708[this.field709 - 1] - 128 & 0xFF);
        if (arg0 != 92) {
            this.field705 = !this.field705;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "i", descriptor = "(I)I")
    public int method292(int arg0) {
        this.field709 += 2;
        int var2 = ((this.field708[this.field709 - 1] & 0xFF) << 8) + (this.field708[this.field709 - 2] - 128 & 0xFF);
        if (arg0 == 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "j", descriptor = "(I)I")
    public int method293(int arg0) {
        this.field709 += 3;
        return arg0 < 0 ? (this.field708[this.field709 - 3] & 0xFF) + ((this.field708[this.field709 - 1] & 0xFF) << 16) + ((this.field708[this.field709 - 2] & 0xFF) << 8) : 0;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(IZ)V")
    public void method294(int arg0, boolean arg1) {
        this.field708[this.field709++] = (byte) arg0;
        this.field708[this.field709++] = (byte) (arg0 >> 8);
        this.field708[this.field709++] = (byte) (arg0 >> 16);
        if (arg1) {
            this.field708[this.field709++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "g", descriptor = "(Z)I")
    public int method295(boolean arg0) {
        if (arg0) {
            return 2;
        } else {
            this.field709 += 4;
            return (this.field708[this.field709 - 4] & 0xFF) + ((this.field708[this.field709 - 3] & 0xFF) << 8) + ((this.field708[this.field709 - 1] & 0xFF) << 24) + ((this.field708[this.field709 - 2] & 0xFF) << 16);
        }
    }

    @OriginalMember(owner = "EGCCHUZS", name = "k", descriptor = "(I)I")
    public int method296(int arg0) {
        this.field709 += 4;
        return arg0 == 0 ? (this.field708[this.field709 - 3] & 0xFF) + ((this.field708[this.field709 - 4] & 0xFF) << 8) + ((this.field708[this.field709 - 2] & 0xFF) << 24) + ((this.field708[this.field709 - 1] & 0xFF) << 16) : 3;
    }

    @OriginalMember(owner = "EGCCHUZS", name = "l", descriptor = "(I)I")
    public int method297(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field709 += 4;
        return (this.field708[this.field709 - 2] & 0xFF) + ((this.field708[this.field709 - 1] & 0xFF) << 8) + ((this.field708[this.field709 - 3] & 0xFF) << 24) + ((this.field708[this.field709 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "EGCCHUZS", name = "a", descriptor = "(Z[BII)V")
    public void method298(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field700 = 88;
        }
        for (int var5 = arg2 + arg3 - 1; var5 >= arg3; var5--) {
            arg1[var5] = (byte) (this.field708[this.field709++] - 128);
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
            field711[var0] = var1;
        }
        field712 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field717 = new class36(0);
        field718 = new class36(0);
        field719 = new class36(0);
        field720 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
