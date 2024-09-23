import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XQPFGONL")
public class class62 extends class70 {

    @OriginalMember(owner = "XQPFGONL", name = "i", descriptor = "Z")
    private boolean field1524 = true;

    @OriginalMember(owner = "XQPFGONL", name = "k", descriptor = "I")
    private int field1526 = 641;

    @OriginalMember(owner = "XQPFGONL", name = "l", descriptor = "I")
    private int field1527 = -37665;

    @OriginalMember(owner = "XQPFGONL", name = "m", descriptor = "B")
    private byte field1528 = 5;

    @OriginalMember(owner = "XQPFGONL", name = "n", descriptor = "I")
    private int field1529 = 41041;

    @OriginalMember(owner = "XQPFGONL", name = "o", descriptor = "I")
    private int field1530 = 17932;

    @OriginalMember(owner = "XQPFGONL", name = "p", descriptor = "B")
    private byte field1531 = -51;

    @OriginalMember(owner = "XQPFGONL", name = "q", descriptor = "I")
    private int field1532 = -8270;

    @OriginalMember(owner = "XQPFGONL", name = "r", descriptor = "I")
    private int field1533 = -683;

    @OriginalMember(owner = "XQPFGONL", name = "s", descriptor = "B")
    private byte field1534 = 2;

    @OriginalMember(owner = "XQPFGONL", name = "t", descriptor = "I")
    private int field1535 = 26149;

    @OriginalMember(owner = "XQPFGONL", name = "u", descriptor = "I")
    private int field1536 = -281;

    @OriginalMember(owner = "XQPFGONL", name = "v", descriptor = "I")
    private int field1537 = -979;

    @OriginalMember(owner = "XQPFGONL", name = "w", descriptor = "Z")
    private boolean field1538 = true;

    @OriginalMember(owner = "XQPFGONL", name = "x", descriptor = "Z")
    private boolean field1539 = false;

    @OriginalMember(owner = "XQPFGONL", name = "y", descriptor = "Z")
    private boolean field1540 = false;

    @OriginalMember(owner = "XQPFGONL", name = "z", descriptor = "[B")
    public byte[] field1541;

    @OriginalMember(owner = "XQPFGONL", name = "A", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "XQPFGONL", name = "C", descriptor = "[I")
    private static int[] field1544 = new int[256];

    @OriginalMember(owner = "XQPFGONL", name = "D", descriptor = "[I")
    private static final int[] field1545;

    @OriginalMember(owner = "XQPFGONL", name = "I", descriptor = "LFOKYUBQV;")
    private static class16 field1550;

    @OriginalMember(owner = "XQPFGONL", name = "J", descriptor = "LFOKYUBQV;")
    private static class16 field1551;

    @OriginalMember(owner = "XQPFGONL", name = "K", descriptor = "LFOKYUBQV;")
    private static class16 field1552;

    @OriginalMember(owner = "XQPFGONL", name = "L", descriptor = "[C")
    private static char[] field1553;

    @OriginalMember(owner = "XQPFGONL", name = "j", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "XQPFGONL", name = "B", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "XQPFGONL", name = "F", descriptor = "I")
    private static int field1547;

    @OriginalMember(owner = "XQPFGONL", name = "G", descriptor = "I")
    private static int field1548;

    @OriginalMember(owner = "XQPFGONL", name = "H", descriptor = "I")
    private static int field1549;

    @OriginalMember(owner = "XQPFGONL", name = "E", descriptor = "LXLANGUSV;")
    public class59 field1546;

    @OriginalMember(owner = "XQPFGONL", name = "M", descriptor = "Z")
    public static boolean field1554;

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(BI)LXQPFGONL;")
    public static class62 method466(byte arg0, int arg1) {
        class16 var2 = field1551;
        synchronized (field1551) {
            class62 var3 = null;
            if (arg1 == 0 && field1547 > 0) {
                field1547--;
                var3 = (class62) field1550.method198();
            } else if (arg1 == 1 && field1548 > 0) {
                field1548--;
                var3 = (class62) field1551.method198();
            } else if (arg1 == 2 && field1549 > 0) {
                field1549--;
                var3 = (class62) field1552.method198();
            }
            if (var3 != null) {
                var3.field1542 = 0;
                return var3;
            }
        }
        class62 var5 = new class62(0);
        var5.field1542 = 0;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        if (arg1 == 0) {
            var5.field1541 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1541 = new byte[5000];
        } else {
            var5.field1541 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "XQPFGONL", name = "<init>", descriptor = "(I)V")
    private class62(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "<init>", descriptor = "([BI)V")
    public class62(byte[] arg0, int arg1) {
        this.field1541 = arg0;
        if (arg1 != 49938) {
            throw new NullPointerException();
        }
        this.field1542 = 0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(II)V")
    public void method467(int arg0, int arg1) {
        int var3 = 65 / arg1;
        this.field1541[this.field1542++] = (byte) (arg0 + this.field1546.method461());
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(I)V")
    public void method468(int arg0) {
        this.field1541[this.field1542++] = (byte) arg0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(I)V")
    public void method469(int arg0) {
        this.field1541[this.field1542++] = (byte) (arg0 >> 8);
        this.field1541[this.field1542++] = (byte) arg0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(BI)V")
    public void method470(byte arg0, int arg1) {
        this.field1541[this.field1542++] = (byte) arg1;
        this.field1541[this.field1542++] = (byte) (arg1 >> 8);
        if (arg0 != 3) {
            this.field1540 = !this.field1540;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "(I)V")
    public void method471(int arg0) {
        this.field1541[this.field1542++] = (byte) (arg0 >> 16);
        this.field1541[this.field1542++] = (byte) (arg0 >> 8);
        this.field1541[this.field1542++] = (byte) arg0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "d", descriptor = "(I)V")
    public void method472(int arg0) {
        this.field1541[this.field1542++] = (byte) (arg0 >> 24);
        this.field1541[this.field1542++] = (byte) (arg0 >> 16);
        this.field1541[this.field1542++] = (byte) (arg0 >> 8);
        this.field1541[this.field1542++] = (byte) arg0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(ZI)V")
    public void method473(boolean arg0, int arg1) {
        this.field1541[this.field1542++] = (byte) arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1541[this.field1542++] = (byte) (arg1 >> 8);
        this.field1541[this.field1542++] = (byte) (arg1 >> 16);
        this.field1541[this.field1542++] = (byte) (arg1 >> 24);
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(JB)V")
    public void method474(long arg0, byte arg1) {
        this.field1541[this.field1542++] = (byte) (arg0 >> 56);
        this.field1541[this.field1542++] = (byte) (arg0 >> 48);
        this.field1541[this.field1542++] = (byte) (arg0 >> 40);
        this.field1541[this.field1542++] = (byte) (arg0 >> 32);
        this.field1541[this.field1542++] = (byte) (arg0 >> 24);
        this.field1541[this.field1542++] = (byte) (arg0 >> 16);
        if (arg1 == 6) {
            boolean var4 = false;
        } else {
            this.field1537 = 447;
        }
        this.field1541[this.field1542++] = (byte) (arg0 >> 8);
        this.field1541[this.field1542++] = (byte) arg0;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method475(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1541, this.field1542);
        this.field1542 += arg0.length();
        this.field1541[this.field1542++] = 10;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(III[B)V")
    public void method476(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 64 / arg0;
        for (int var6 = arg2; var6 < arg1 + arg2; var6++) {
            this.field1541[this.field1542++] = arg3[var6];
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(II)V")
    public void method477(int arg0, int arg1) {
        if (arg0 < 2 || arg0 > 2) {
            this.field1526 = 245;
        }
        this.field1541[this.field1542 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "()I")
    public int method478() {
        return this.field1541[this.field1542++] & 0xFF;
    }

    @OriginalMember(owner = "XQPFGONL", name = "d", descriptor = "()B")
    public byte method479() {
        return this.field1541[this.field1542++];
    }

    @OriginalMember(owner = "XQPFGONL", name = "e", descriptor = "()I")
    public int method480() {
        this.field1542 += 2;
        return ((this.field1541[this.field1542 - 2] & 0xFF) << 8) + (this.field1541[this.field1542 - 1] & 0xFF);
    }

    @OriginalMember(owner = "XQPFGONL", name = "f", descriptor = "()I")
    public int method481() {
        this.field1542 += 2;
        int var1 = ((this.field1541[this.field1542 - 2] & 0xFF) << 8) + (this.field1541[this.field1542 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "XQPFGONL", name = "g", descriptor = "()I")
    public int method482() {
        this.field1542 += 3;
        return (this.field1541[this.field1542 - 1] & 0xFF) + ((this.field1541[this.field1542 - 3] & 0xFF) << 16) + ((this.field1541[this.field1542 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "XQPFGONL", name = "h", descriptor = "()I")
    public int method483() {
        this.field1542 += 4;
        return (this.field1541[this.field1542 - 1] & 0xFF) + ((this.field1541[this.field1542 - 2] & 0xFF) << 8) + ((this.field1541[this.field1542 - 4] & 0xFF) << 24) + ((this.field1541[this.field1542 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(B)J")
    public long method484(byte arg0) {
        long var2 = (long) this.method483() & 0xFFFFFFFFL;
        long var4 = (long) this.method483() & 0xFFFFFFFFL;
        if (arg0 != 17) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "XQPFGONL", name = "i", descriptor = "()Ljava/lang/String;")
    public String method485() {
        int var1 = this.field1542;
        while (this.field1541[this.field1542++] != 10) {
        }
        return new String(this.field1541, var1, this.field1542 - var1 - 1);
    }

    @OriginalMember(owner = "XQPFGONL", name = "e", descriptor = "(I)[B")
    public byte[] method486(int arg0) {
        int var2 = this.field1542;
        while (this.field1541[this.field1542++] != 10) {
        }
        byte[] var3 = new byte[this.field1542 - var2 - 1];
        if (this.field1527 != arg0) {
            throw new NullPointerException();
        }
        for (int var4 = var2; var4 < this.field1542 - 1; var4++) {
            var3[var4 - var2] = this.field1541[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(IIB[B)V")
    public void method487(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (this.field1528 == arg2) {
            boolean var5 = false;
            for (int var6 = arg1; var6 < arg0 + arg1; var6++) {
                arg3[var6] = this.field1541[this.field1542++];
            }
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "f", descriptor = "(I)V")
    public void method488(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1543 = this.field1542 * 8;
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "(II)I")
    public int method489(int arg0, int arg1) {
        int var3 = this.field1543 >> 3;
        int var4 = 8 - (this.field1543 & 0x7);
        int var5 = 0;
        this.field1543 += arg0;
        if (arg1 < 0 || arg1 > 0) {
            return this.field1525;
        }
        while (arg0 > var4) {
            var5 += (this.field1541[var3++] & field1545[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1541[var3] & field1545[var4]) + var5;
        } else {
            var6 = (this.field1541[var3] >> var4 - arg0 & field1545[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(B)V")
    public void method490(byte arg0) {
        if (arg0 == 8) {
            this.field1542 = (this.field1543 + 7) / 8;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "j", descriptor = "()I")
    public int method491() {
        int var1 = this.field1541[this.field1542] & 0xFF;
        return var1 < 128 ? this.method478() - 64 : this.method480() - 49152;
    }

    @OriginalMember(owner = "XQPFGONL", name = "k", descriptor = "()I")
    public int method492() {
        int var1 = this.field1541[this.field1542] & 0xFF;
        return var1 < 128 ? this.method478() : this.method480() - 32768;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
    public void method493(BigInteger arg0, BigInteger arg1, byte arg2) {
        int var4 = this.field1542;
        this.field1542 = 0;
        byte[] var5 = new byte[var4];
        this.method487(var4, 0, (byte) 5, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1542 = 0;
        this.method468(var8.length);
        this.method476(641, var8.length, 0, var8);
        if (arg2 != -18) {
            this.field1526 = -28;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(IB)V")
    public void method494(int arg0, byte arg1) {
        this.field1541[this.field1542++] = (byte) (arg0 + 128);
        if (arg1 != 9) {
            this.field1524 = !this.field1524;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "d", descriptor = "(II)V")
    public void method495(int arg0, int arg1) {
        this.field1541[this.field1542++] = (byte) (128 - arg0);
        if (arg1 <= 0) {
            this.field1525 = 366;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "g", descriptor = "(I)I")
    public int method496(int arg0) {
        int var2 = 52 / arg0;
        return this.field1541[this.field1542++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "XQPFGONL", name = "h", descriptor = "(I)I")
    public int method497(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1541[this.field1542++] & 0xFF;
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(Z)I")
    public int method498(boolean arg0) {
        if (arg0) {
            this.field1539 = !this.field1539;
        }
        return 128 - this.field1541[this.field1542++] & 0xFF;
    }

    @OriginalMember(owner = "XQPFGONL", name = "i", descriptor = "(I)B")
    public byte method499(int arg0) {
        while (arg0 >= 0) {
            this.field1540 = !this.field1540;
        }
        return (byte) -this.field1541[this.field1542++];
    }

    @OriginalMember(owner = "XQPFGONL", name = "j", descriptor = "(I)B")
    public byte method500(int arg0) {
        int var2 = 85 / arg0;
        return (byte) (128 - this.field1541[this.field1542++]);
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "(BI)V")
    public void method501(byte arg0, int arg1) {
        this.field1541[this.field1542++] = (byte) arg1;
        if (arg0 != -11) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1541[this.field1542++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(IZ)V")
    public void method502(int arg0, boolean arg1) {
        this.field1541[this.field1542++] = (byte) (arg0 >> 8);
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1541[this.field1542++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(ZI)V")
    public void method503(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1541[this.field1542++] = (byte) (arg1 + 128);
            this.field1541[this.field1542++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "k", descriptor = "(I)I")
    public int method504(int arg0) {
        if (arg0 >= 0) {
            return 4;
        } else {
            this.field1542 += 2;
            return ((this.field1541[this.field1542 - 1] & 0xFF) << 8) + (this.field1541[this.field1542 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "l", descriptor = "(I)I")
    public int method505(int arg0) {
        this.field1542 += 2;
        while (arg0 >= 0) {
            this.field1529 = 499;
        }
        return ((this.field1541[this.field1542 - 2] & 0xFF) << 8) + (this.field1541[this.field1542 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "(B)I")
    public int method506(byte arg0) {
        this.field1542 += 2;
        if (arg0 != 56) {
            this.field1525 = -256;
        }
        return ((this.field1541[this.field1542 - 1] & 0xFF) << 8) + (this.field1541[this.field1542 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "XQPFGONL", name = "b", descriptor = "(Z)I")
    public int method507(boolean arg0) {
        this.field1542 += 2;
        if (!arg0) {
            this.field1530 = 470;
        }
        int var2 = ((this.field1541[this.field1542 - 1] & 0xFF) << 8) + (this.field1541[this.field1542 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XQPFGONL", name = "m", descriptor = "(I)I")
    public int method508(int arg0) {
        this.field1542 += 2;
        int var2 = ((this.field1541[this.field1542 - 1] & 0xFF) << 8) + (this.field1541[this.field1542 - 2] - 128 & 0xFF);
        if (arg0 != 37075) {
            this.field1527 = -311;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XQPFGONL", name = "e", descriptor = "(II)V")
    public void method509(int arg0, int arg1) {
        this.field1541[this.field1542++] = (byte) (arg1 >> 16);
        this.field1541[this.field1542++] = (byte) (arg1 >> 24);
        if (arg0 <= 0) {
            this.field1538 = !this.field1538;
        }
        this.field1541[this.field1542++] = (byte) arg1;
        this.field1541[this.field1542++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "XQPFGONL", name = "c", descriptor = "(Z)I")
    public int method510(boolean arg0) {
        this.field1542 += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1541[this.field1542 - 4] & 0xFF) + ((this.field1541[this.field1542 - 3] & 0xFF) << 8) + ((this.field1541[this.field1542 - 1] & 0xFF) << 24) + ((this.field1541[this.field1542 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XQPFGONL", name = "d", descriptor = "(B)I")
    public int method511(byte arg0) {
        if (arg0 == 64) {
            this.field1542 += 4;
            return (this.field1541[this.field1542 - 3] & 0xFF) + ((this.field1541[this.field1542 - 4] & 0xFF) << 8) + ((this.field1541[this.field1542 - 2] & 0xFF) << 24) + ((this.field1541[this.field1542 - 1] & 0xFF) << 16);
        } else {
            return this.field1529;
        }
    }

    @OriginalMember(owner = "XQPFGONL", name = "d", descriptor = "(Z)I")
    public int method512(boolean arg0) {
        this.field1542 += 4;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1541[this.field1542 - 2] & 0xFF) + ((this.field1541[this.field1542 - 1] & 0xFF) << 8) + ((this.field1541[this.field1542 - 3] & 0xFF) << 24) + ((this.field1541[this.field1542 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XQPFGONL", name = "a", descriptor = "(I[BII)V")
    public void method513(int arg0, byte[] arg1, int arg2, int arg3) {
        if (this.field1535 != arg3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0 + arg2 - 1; var6 >= arg2; var6--) {
            arg1[var6] = this.field1541[this.field1542++];
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
            field1544[var0] = var1;
        }
        field1545 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1550 = new class16(false);
        field1551 = new class16(false);
        field1552 = new class16(false);
        field1553 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
