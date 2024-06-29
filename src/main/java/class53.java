import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RGCGKKUR")
public class class53 extends class48 {

    @OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "I")
    private int field1531 = 182;

    @OriginalMember(owner = "client!RGCGKKUR", name = "l", descriptor = "Z")
    private boolean field1532 = true;

    @OriginalMember(owner = "client!RGCGKKUR", name = "m", descriptor = "I")
    private int field1533 = 899;

    @OriginalMember(owner = "client!RGCGKKUR", name = "n", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "client!RGCGKKUR", name = "o", descriptor = "I")
    private int field1535 = 45492;

    @OriginalMember(owner = "client!RGCGKKUR", name = "p", descriptor = "Z")
    private boolean field1536 = false;

    @OriginalMember(owner = "client!RGCGKKUR", name = "q", descriptor = "I")
    private int field1537 = 1;

    @OriginalMember(owner = "client!RGCGKKUR", name = "r", descriptor = "[B")
    public byte[] field1538;

    @OriginalMember(owner = "client!RGCGKKUR", name = "s", descriptor = "I")
    public int field1539;

    @OriginalMember(owner = "client!RGCGKKUR", name = "u", descriptor = "[I")
    private static int[] field1541 = new int[256];

    @OriginalMember(owner = "client!RGCGKKUR", name = "v", descriptor = "[I")
    private static final int[] field1542;

    @OriginalMember(owner = "client!RGCGKKUR", name = "A", descriptor = "LCEEJCAVA;")
    private static class5 field1547;

    @OriginalMember(owner = "client!RGCGKKUR", name = "B", descriptor = "LCEEJCAVA;")
    private static class5 field1548;

    @OriginalMember(owner = "client!RGCGKKUR", name = "C", descriptor = "LCEEJCAVA;")
    private static class5 field1549;

    @OriginalMember(owner = "client!RGCGKKUR", name = "D", descriptor = "[C")
    private static char[] field1550;

    @OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client!RGCGKKUR", name = "t", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!RGCGKKUR", name = "x", descriptor = "I")
    private static int field1544;

    @OriginalMember(owner = "client!RGCGKKUR", name = "y", descriptor = "I")
    private static int field1545;

    @OriginalMember(owner = "client!RGCGKKUR", name = "z", descriptor = "I")
    private static int field1546;

    @OriginalMember(owner = "client!RGCGKKUR", name = "w", descriptor = "LJLGPBSNA;")
    public class24 field1543;

    @OriginalMember(owner = "client!RGCGKKUR", name = "E", descriptor = "Z")
    public static boolean field1551;

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(II)LRGCGKKUR;")
    public static class53 method443(int arg0, int arg1) {
        class5 var2 = field1548;
        synchronized (field1548) {
            class53 var3 = null;
            if (arg1 == 0 && field1544 > 0) {
                field1544--;
                var3 = (class53) field1547.method32();
            } else if (arg1 == 1 && field1545 > 0) {
                field1545--;
                var3 = (class53) field1548.method32();
            } else if (arg1 == 2 && field1546 > 0) {
                field1546--;
                var3 = (class53) field1549.method32();
            }
            if (var3 != null) {
                var3.field1539 = 0;
                return var3;
            }
        }
        class53 var5 = new class53(0);
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        var5.field1539 = 0;
        if (arg1 == 0) {
            var5.field1538 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1538 = new byte[5000];
        } else {
            var5.field1538 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "<init>", descriptor = "(I)V")
    private class53(int arg0) {
        if (arg0 != 0) {
            this.field1537 = -134;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "<init>", descriptor = "([BB)V")
    public class53(byte[] arg0, byte arg1) {
        this.field1538 = arg0;
        if (arg1 != -17) {
            throw new NullPointerException();
        }
        this.field1539 = 0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(ZI)V")
    public void method444(boolean arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg1 + this.field1543.method236());
        if (arg0) {
            this.field1531 = 13;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(I)V")
    public void method445(int arg0) {
        this.field1538[this.field1539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(I)V")
    public void method446(int arg0) {
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        this.field1538[this.field1539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(IB)V")
    public void method447(int arg0, byte arg1) {
        if (arg1 != -40) {
            this.field1536 = !this.field1536;
        }
        this.field1538[this.field1539++] = (byte) arg0;
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(I)V")
    public void method448(int arg0) {
        this.field1538[this.field1539++] = (byte) (arg0 >> 16);
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        this.field1538[this.field1539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(I)V")
    public void method449(int arg0) {
        this.field1538[this.field1539++] = (byte) (arg0 >> 24);
        this.field1538[this.field1539++] = (byte) (arg0 >> 16);
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        this.field1538[this.field1539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(IZ)V")
    public void method450(int arg0, boolean arg1) {
        if (arg1) {
            this.field1531 = 21;
        }
        this.field1538[this.field1539++] = (byte) arg0;
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        this.field1538[this.field1539++] = (byte) (arg0 >> 16);
        this.field1538[this.field1539++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(JI)V")
    public void method451(long arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg0 >> 56);
        this.field1538[this.field1539++] = (byte) (arg0 >> 48);
        this.field1538[this.field1539++] = (byte) (arg0 >> 40);
        this.field1538[this.field1539++] = (byte) (arg0 >> 32);
        this.field1538[this.field1539++] = (byte) (arg0 >> 24);
        this.field1538[this.field1539++] = (byte) (arg0 >> 16);
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        this.field1538[this.field1539++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method452(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1538, this.field1539);
        this.field1539 += arg0.length();
        this.field1538[this.field1539++] = 10;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "([BIII)V")
    public void method453(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 0) {
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                this.field1538[this.field1539++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(II)V")
    public void method454(int arg0, int arg1) {
        this.field1538[this.field1539 - arg1 - 1] = (byte) arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "()I")
    public int method455() {
        return this.field1538[this.field1539++] & 0xFF;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "()B")
    public byte method456() {
        return this.field1538[this.field1539++];
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "()I")
    public int method457() {
        this.field1539 += 2;
        return ((this.field1538[this.field1539 - 2] & 0xFF) << 8) + (this.field1538[this.field1539 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "()I")
    public int method458() {
        this.field1539 += 2;
        int var1 = ((this.field1538[this.field1539 - 2] & 0xFF) << 8) + (this.field1538[this.field1539 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "g", descriptor = "()I")
    public int method459() {
        this.field1539 += 3;
        return (this.field1538[this.field1539 - 1] & 0xFF) + ((this.field1538[this.field1539 - 3] & 0xFF) << 16) + ((this.field1538[this.field1539 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "h", descriptor = "()I")
    public int method460() {
        this.field1539 += 4;
        return (this.field1538[this.field1539 - 1] & 0xFF) + ((this.field1538[this.field1539 - 2] & 0xFF) << 8) + ((this.field1538[this.field1539 - 4] & 0xFF) << 24) + ((this.field1538[this.field1539 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Z)J")
    public long method461(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method460() & 0xFFFFFFFFL;
        long var4 = (long) this.method460() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "i", descriptor = "()Ljava/lang/String;")
    public String method462() {
        int var1 = this.field1539;
        while (this.field1538[this.field1539++] != 10) {
        }
        return new String(this.field1538, var1, this.field1539 - var1 - 1);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(B)[B")
    public byte[] method463(byte arg0) {
        if (arg0 != 30) {
            this.field1531 = 222;
        }
        int var2 = this.field1539;
        while (this.field1538[this.field1539++] != 10) {
        }
        byte[] var3 = new byte[this.field1539 - var2 - 1];
        for (int var4 = var2; var4 < this.field1539 - 1; var4++) {
            var3[var4 - var2] = this.field1538[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(III[B)V")
    public void method464(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg2; var6 < arg0 + arg2; var6++) {
            arg3[var6] = this.field1538[this.field1539++];
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(I)V")
    public void method465(int arg0) {
        int var2 = 28 / arg0;
        this.field1540 = this.field1539 * 8;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(IZ)I")
    public int method466(int arg0, boolean arg1) {
        int var3 = this.field1540 >> 3;
        int var4 = 8 - (this.field1540 & 0x7);
        int var5 = 0;
        this.field1540 += arg0;
        if (!arg1) {
            return this.field1530;
        }
        while (arg0 > var4) {
            var5 += (this.field1538[var3++] & field1542[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1538[var3] & field1542[var4]) + var5;
        } else {
            var6 = (this.field1538[var3] >> var4 - arg0 & field1542[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(I)V")
    public void method467(int arg0) {
        this.field1539 = (this.field1540 + 7) / 8;
        if (arg0 < 1 || arg0 > 1) {
            this.field1531 = 247;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "()I")
    public int method468() {
        int var1 = this.field1538[this.field1539] & 0xFF;
        return var1 < 128 ? this.method455() - 64 : this.method457() - 49152;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "()I")
    public int method469() {
        int var1 = this.field1538[this.field1539] & 0xFF;
        return var1 < 128 ? this.method455() : this.method457() - 32768;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method470(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field1539;
        this.field1539 = 0;
        if (arg2) {
            return;
        }
        byte[] var5 = new byte[var4];
        this.method464(var4, 807, 0, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1539 = 0;
        this.method445(var8.length);
        this.method453(var8, 501, var8.length, 0);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(II)V")
    public void method471(int arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg0 + 128);
        while (arg1 >= 0) {
            this.field1535 = -450;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(ZI)V")
    public void method472(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1538[this.field1539++] = (byte) (128 - arg1);
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(Z)I")
    public int method473(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1538[this.field1539++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "g", descriptor = "(I)I")
    public int method474(int arg0) {
        if (arg0 != 0) {
            this.field1532 = !this.field1532;
        }
        return -this.field1538[this.field1539++] & 0xFF;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(Z)I")
    public int method475(boolean arg0) {
        return arg0 ? 128 - this.field1538[this.field1539++] & 0xFF : 3;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "h", descriptor = "(I)B")
    public byte method476(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            this.field1536 = !this.field1536;
        }
        return (byte) -this.field1538[this.field1539++];
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "i", descriptor = "(I)B")
    public byte method477(int arg0) {
        while (arg0 >= 0) {
            this.field1536 = !this.field1536;
        }
        return (byte) (128 - this.field1538[this.field1539++]);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(II)V")
    public void method478(int arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) arg0;
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        while (arg1 >= 0) {
            this.field1531 = 139;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(II)V")
    public void method479(int arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg0 >> 8);
        if (arg1 > 0) {
            this.field1538[this.field1539++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(II)V")
    public void method480(int arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg1 + 128);
        if (arg0 != 23894) {
            this.field1535 = 304;
        }
        this.field1538[this.field1539++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(Z)I")
    public int method481(boolean arg0) {
        if (arg0) {
            return this.field1531;
        } else {
            this.field1539 += 2;
            return ((this.field1538[this.field1539 - 1] & 0xFF) << 8) + (this.field1538[this.field1539 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "(I)I")
    public int method482(int arg0) {
        if (arg0 == 26085) {
            this.field1539 += 2;
            return ((this.field1538[this.field1539 - 2] & 0xFF) << 8) + (this.field1538[this.field1539 - 1] - 128 & 0xFF);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "(I)I")
    public int method483(int arg0) {
        this.field1539 += 2;
        int var2 = 47 / arg0;
        return ((this.field1538[this.field1539 - 1] & 0xFF) << 8) + (this.field1538[this.field1539 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(Z)I")
    public int method484(boolean arg0) {
        this.field1539 += 2;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = ((this.field1538[this.field1539 - 1] & 0xFF) << 8) + (this.field1538[this.field1539 - 2] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "l", descriptor = "(I)I")
    public int method485(int arg0) {
        this.field1539 += 2;
        if (arg0 <= 0) {
            this.field1531 = 52;
        }
        int var2 = ((this.field1538[this.field1539 - 1] & 0xFF) << 8) + (this.field1538[this.field1539 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "m", descriptor = "(I)I")
    public int method486(int arg0) {
        if (arg0 != 28209) {
            this.field1534 = !this.field1534;
        }
        this.field1539 += 3;
        return (this.field1538[this.field1539 - 2] & 0xFF) + ((this.field1538[this.field1539 - 3] & 0xFF) << 16) + ((this.field1538[this.field1539 - 1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(ZI)V")
    public void method487(boolean arg0, int arg1) {
        this.field1538[this.field1539++] = (byte) (arg1 >> 8);
        this.field1538[this.field1539++] = (byte) arg1;
        if (arg0) {
            this.field1532 = !this.field1532;
        }
        this.field1538[this.field1539++] = (byte) (arg1 >> 24);
        this.field1538[this.field1539++] = (byte) (arg1 >> 16);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(Z)I")
    public int method488(boolean arg0) {
        this.field1539 += 4;
        if (!arg0) {
            this.field1532 = !this.field1532;
        }
        return (this.field1538[this.field1539 - 4] & 0xFF) + ((this.field1538[this.field1539 - 3] & 0xFF) << 8) + ((this.field1538[this.field1539 - 1] & 0xFF) << 24) + ((this.field1538[this.field1539 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(B)I")
    public int method489(byte arg0) {
        if (arg0 == -78) {
            this.field1539 += 4;
            return (this.field1538[this.field1539 - 3] & 0xFF) + ((this.field1538[this.field1539 - 4] & 0xFF) << 8) + ((this.field1538[this.field1539 - 2] & 0xFF) << 24) + ((this.field1538[this.field1539 - 1] & 0xFF) << 16);
        } else {
            return this.field1531;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(B)I")
    public int method490(byte arg0) {
        if (arg0 == 0) {
            this.field1539 += 4;
            return (this.field1538[this.field1539 - 2] & 0xFF) + ((this.field1538[this.field1539 - 1] & 0xFF) << 8) + ((this.field1538[this.field1539 - 3] & 0xFF) << 24) + ((this.field1538[this.field1539 - 4] & 0xFF) << 16);
        } else {
            return this.field1531;
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Z[BII)V")
    public void method491(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg3; var6 < arg2 + arg3; var6++) {
            this.field1538[this.field1539++] = (byte) (arg1[var6] + 128);
        }
    }

    @OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(Z[BII)V")
    public void method492(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            for (int var5 = arg2 + arg3 - 1; var5 >= arg3; var5--) {
                arg1[var5] = this.field1538[this.field1539++];
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
            field1541[var0] = var1;
        }
        field1542 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1547 = new class5(-7255);
        field1548 = new class5(-7255);
        field1549 = new class5(-7255);
        field1550 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
