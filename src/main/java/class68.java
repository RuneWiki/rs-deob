import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YOXDZEVD")
public class class68 extends class30 {

    @OriginalMember(owner = "YOXDZEVD", name = "i", descriptor = "Z")
    private boolean field1591 = false;

    @OriginalMember(owner = "YOXDZEVD", name = "j", descriptor = "Z")
    private boolean field1592 = false;

    @OriginalMember(owner = "YOXDZEVD", name = "k", descriptor = "Z")
    private boolean field1593 = false;

    @OriginalMember(owner = "YOXDZEVD", name = "l", descriptor = "Z")
    private boolean field1594 = true;

    @OriginalMember(owner = "YOXDZEVD", name = "m", descriptor = "B")
    private byte field1595 = 7;

    @OriginalMember(owner = "YOXDZEVD", name = "n", descriptor = "I")
    private int field1596 = -8237;

    @OriginalMember(owner = "YOXDZEVD", name = "p", descriptor = "I")
    private int field1598 = 6;

    @OriginalMember(owner = "YOXDZEVD", name = "q", descriptor = "I")
    private int field1599 = -16007;

    @OriginalMember(owner = "YOXDZEVD", name = "r", descriptor = "Z")
    private boolean field1600 = true;

    @OriginalMember(owner = "YOXDZEVD", name = "s", descriptor = "I")
    private int field1601 = 305;

    @OriginalMember(owner = "YOXDZEVD", name = "t", descriptor = "I")
    private int field1602 = 6;

    @OriginalMember(owner = "YOXDZEVD", name = "u", descriptor = "I")
    private int field1603 = -113;

    @OriginalMember(owner = "YOXDZEVD", name = "v", descriptor = "Z")
    private boolean field1604 = true;

    @OriginalMember(owner = "YOXDZEVD", name = "w", descriptor = "Z")
    private boolean field1605 = false;

    @OriginalMember(owner = "YOXDZEVD", name = "x", descriptor = "I")
    private int field1606 = 2;

    @OriginalMember(owner = "YOXDZEVD", name = "y", descriptor = "Z")
    private boolean field1607 = true;

    @OriginalMember(owner = "YOXDZEVD", name = "z", descriptor = "Z")
    private boolean field1608 = false;

    @OriginalMember(owner = "YOXDZEVD", name = "A", descriptor = "I")
    private int field1609 = 691;

    @OriginalMember(owner = "YOXDZEVD", name = "B", descriptor = "I")
    private int field1610 = -2273;

    @OriginalMember(owner = "YOXDZEVD", name = "C", descriptor = "[B")
    public byte[] field1611;

    @OriginalMember(owner = "YOXDZEVD", name = "D", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "YOXDZEVD", name = "F", descriptor = "[I")
    private static int[] field1614 = new int[256];

    @OriginalMember(owner = "YOXDZEVD", name = "G", descriptor = "[I")
    private static final int[] field1615;

    @OriginalMember(owner = "YOXDZEVD", name = "L", descriptor = "LYLURZVWU;")
    private static class65 field1620;

    @OriginalMember(owner = "YOXDZEVD", name = "M", descriptor = "LYLURZVWU;")
    private static class65 field1621;

    @OriginalMember(owner = "YOXDZEVD", name = "N", descriptor = "LYLURZVWU;")
    private static class65 field1622;

    @OriginalMember(owner = "YOXDZEVD", name = "O", descriptor = "[C")
    private static char[] field1623;

    @OriginalMember(owner = "YOXDZEVD", name = "o", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "YOXDZEVD", name = "E", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "YOXDZEVD", name = "I", descriptor = "I")
    private static int field1617;

    @OriginalMember(owner = "YOXDZEVD", name = "J", descriptor = "I")
    private static int field1618;

    @OriginalMember(owner = "YOXDZEVD", name = "K", descriptor = "I")
    private static int field1619;

    @OriginalMember(owner = "YOXDZEVD", name = "H", descriptor = "LPOKVNZOV;")
    public class42 field1616;

    @OriginalMember(owner = "YOXDZEVD", name = "P", descriptor = "Z")
    public static boolean field1624;

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(II)LYOXDZEVD;")
    public static class68 method537(int arg0, int arg1) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class65 var3 = field1621;
        synchronized (field1621) {
            class68 var4 = null;
            if (arg1 == 0 && field1617 > 0) {
                field1617--;
                var4 = (class68) field1620.method527();
            } else if (arg1 == 1 && field1618 > 0) {
                field1618--;
                var4 = (class68) field1621.method527();
            } else if (arg1 == 2 && field1619 > 0) {
                field1619--;
                var4 = (class68) field1622.method527();
            }
            if (var4 != null) {
                var4.field1612 = 0;
                return var4;
            }
        }
        class68 var6 = new class68((byte) -84);
        var6.field1612 = 0;
        if (arg1 == 0) {
            var6.field1611 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1611 = new byte[5000];
        } else {
            var6.field1611 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "<init>", descriptor = "(B)V")
    private class68(byte arg0) {
        if (arg0 != -84) {
            this.field1609 = 328;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "<init>", descriptor = "([BI)V")
    public class68(byte[] arg0, int arg1) {
        this.field1611 = arg0;
        this.field1612 = 0;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(IB)V")
    public void method538(int arg0, byte arg1) {
        this.field1611[this.field1612++] = (byte) (arg0 + this.field1616.method377());
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(I)V")
    public void method539(int arg0) {
        this.field1611[this.field1612++] = (byte) arg0;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(I)V")
    public void method540(int arg0) {
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
        this.field1611[this.field1612++] = (byte) arg0;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(IB)V")
    public void method541(int arg0, byte arg1) {
        this.field1611[this.field1612++] = (byte) arg0;
        if (arg1 != -105) {
            this.field1607 = !this.field1607;
        }
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "(I)V")
    public void method542(int arg0) {
        this.field1611[this.field1612++] = (byte) (arg0 >> 16);
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
        this.field1611[this.field1612++] = (byte) arg0;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "d", descriptor = "(I)V")
    public void method543(int arg0) {
        this.field1611[this.field1612++] = (byte) (arg0 >> 24);
        this.field1611[this.field1612++] = (byte) (arg0 >> 16);
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
        this.field1611[this.field1612++] = (byte) arg0;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "(IB)V")
    public void method544(int arg0, byte arg1) {
        this.field1611[this.field1612++] = (byte) arg0;
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
        this.field1611[this.field1612++] = (byte) (arg0 >> 16);
        this.field1611[this.field1612++] = (byte) (arg0 >> 24);
        if (arg1 != 38) {
            this.field1607 = !this.field1607;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(ZJ)V")
    public void method545(boolean arg0, long arg1) {
        if (arg0) {
            this.field1592 = !this.field1592;
        }
        this.field1611[this.field1612++] = (byte) (arg1 >> 56);
        this.field1611[this.field1612++] = (byte) (arg1 >> 48);
        this.field1611[this.field1612++] = (byte) (arg1 >> 40);
        this.field1611[this.field1612++] = (byte) (arg1 >> 32);
        this.field1611[this.field1612++] = (byte) (arg1 >> 24);
        this.field1611[this.field1612++] = (byte) (arg1 >> 16);
        this.field1611[this.field1612++] = (byte) (arg1 >> 8);
        this.field1611[this.field1612++] = (byte) arg1;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method546(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1611, this.field1612);
        this.field1612 += arg0.length();
        this.field1611[this.field1612++] = 10;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(I[BII)V")
    public void method547(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 >= 0) {
            this.field1606 = -351;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            this.field1611[this.field1612++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(IZ)V")
    public void method548(int arg0, boolean arg1) {
        if (arg1) {
            this.field1611[this.field1612 - arg0 - 1] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "()I")
    public int method549() {
        return this.field1611[this.field1612++] & 0xFF;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "d", descriptor = "()B")
    public byte method550() {
        return this.field1611[this.field1612++];
    }

    @OriginalMember(owner = "YOXDZEVD", name = "e", descriptor = "()I")
    public int method551() {
        this.field1612 += 2;
        return ((this.field1611[this.field1612 - 2] & 0xFF) << 8) + (this.field1611[this.field1612 - 1] & 0xFF);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "f", descriptor = "()I")
    public int method552() {
        this.field1612 += 2;
        int var1 = ((this.field1611[this.field1612 - 2] & 0xFF) << 8) + (this.field1611[this.field1612 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "g", descriptor = "()I")
    public int method553() {
        this.field1612 += 3;
        return (this.field1611[this.field1612 - 1] & 0xFF) + ((this.field1611[this.field1612 - 3] & 0xFF) << 16) + ((this.field1611[this.field1612 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "h", descriptor = "()I")
    public int method554() {
        this.field1612 += 4;
        return (this.field1611[this.field1612 - 1] & 0xFF) + ((this.field1611[this.field1612 - 2] & 0xFF) << 8) + ((this.field1611[this.field1612 - 4] & 0xFF) << 24) + ((this.field1611[this.field1612 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(Z)J")
    public long method555(boolean arg0) {
        long var2 = (long) this.method554() & 0xFFFFFFFFL;
        if (!arg0) {
            throw new NullPointerException();
        }
        long var4 = (long) this.method554() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "i", descriptor = "()Ljava/lang/String;")
    public String method556() {
        int var1 = this.field1612;
        while (this.field1611[this.field1612++] != 10) {
        }
        return new String(this.field1611, var1, this.field1612 - var1 - 1);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "e", descriptor = "(I)[B")
    public byte[] method557(int arg0) {
        int var2 = this.field1612;
        while (this.field1611[this.field1612++] != 10) {
        }
        byte[] var3 = new byte[this.field1612 - var2 - 1];
        int var4 = 26 / arg0;
        for (int var5 = var2; var5 < this.field1612 - 1; var5++) {
            var3[var5 - var2] = this.field1611[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(I[BBI)V")
    public void method558(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 == 7) {
            boolean var5 = false;
        } else {
            this.field1610 = -308;
        }
        for (int var6 = arg0; var6 < arg0 + arg3; var6++) {
            arg1[var6] = this.field1611[this.field1612++];
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "f", descriptor = "(I)V")
    public void method559(int arg0) {
        this.field1613 = this.field1612 * 8;
        if (this.field1596 != arg0) {
            this.field1609 = -454;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(ZI)I")
    public int method560(boolean arg0, int arg1) {
        int var3 = this.field1613 >> 3;
        int var4 = 8 - (this.field1613 & 0x7);
        int var5 = 0;
        this.field1613 += arg1;
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        while (arg1 > var4) {
            var5 += (this.field1611[var3++] & field1615[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field1611[var3] & field1615[var4]) + var5;
        } else {
            var7 = (this.field1611[var3] >> var4 - arg1 & field1615[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(B)V")
    public void method561(byte arg0) {
        this.field1612 = (this.field1613 + 7) / 8;
        if (arg0 != 1) {
            this.field1593 = !this.field1593;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "j", descriptor = "()I")
    public int method562() {
        int var1 = this.field1611[this.field1612] & 0xFF;
        return var1 < 128 ? this.method549() - 64 : this.method551() - 49152;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "k", descriptor = "()I")
    public int method563() {
        int var1 = this.field1611[this.field1612] & 0xFF;
        return var1 < 128 ? this.method549() : this.method551() - 32768;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method564(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field1612;
        this.field1612 = 0;
        byte[] var5 = new byte[var4];
        this.method558(0, var5, this.field1595, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1612 = 0;
        if (!arg1) {
            this.field1597 = -389;
        }
        this.method539(var8.length);
        this.method547(0, var8, var8.length, -56);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(IZ)V")
    public void method565(int arg0, boolean arg1) {
        this.field1611[this.field1612++] = (byte) (arg0 + 128);
        if (!arg1) {
            this.field1608 = !this.field1608;
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(ZI)V")
    public void method566(boolean arg0, int arg1) {
        if (arg0) {
            this.field1600 = !this.field1600;
        }
        this.field1611[this.field1612++] = (byte) -arg1;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(II)V")
    public void method567(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1593 = !this.field1593;
        }
        this.field1611[this.field1612++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "g", descriptor = "(I)I")
    public int method568(int arg0) {
        return arg0 >= 0 ? 1 : this.field1611[this.field1612++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "h", descriptor = "(I)I")
    public int method569(int arg0) {
        while (arg0 >= 0) {
            this.field1607 = !this.field1607;
        }
        return -this.field1611[this.field1612++] & 0xFF;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(B)I")
    public int method570(byte arg0) {
        return arg0 == 96 ? 128 - this.field1611[this.field1612++] & 0xFF : this.field1596;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "b", descriptor = "(Z)B")
    public byte method571(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1611[this.field1612++];
    }

    @OriginalMember(owner = "YOXDZEVD", name = "i", descriptor = "(I)B")
    public byte method572(int arg0) {
        if (arg0 >= 0) {
            this.field1605 = !this.field1605;
        }
        return (byte) (128 - this.field1611[this.field1612++]);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "(IZ)V")
    public void method573(int arg0, boolean arg1) {
        if (arg1) {
            this.field1611[this.field1612++] = (byte) arg0;
            this.field1611[this.field1612++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "(II)V")
    public void method574(int arg0, int arg1) {
        if (arg0 < this.field1602 || arg0 > this.field1602) {
            this.field1608 = !this.field1608;
        }
        this.field1611[this.field1612++] = (byte) (arg1 >> 8);
        this.field1611[this.field1612++] = (byte) (arg1 + 128);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "d", descriptor = "(IB)V")
    public void method575(int arg0, byte arg1) {
        this.field1611[this.field1612++] = (byte) (arg0 + 128);
        if (arg1 != 64) {
            this.field1593 = !this.field1593;
        }
        this.field1611[this.field1612++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "j", descriptor = "(I)I")
    public int method576(int arg0) {
        if (arg0 >= 0) {
            return this.field1602;
        } else {
            this.field1612 += 2;
            return ((this.field1611[this.field1612 - 1] & 0xFF) << 8) + (this.field1611[this.field1612 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "c", descriptor = "(Z)I")
    public int method577(boolean arg0) {
        this.field1612 += 2;
        return arg0 ? ((this.field1611[this.field1612 - 2] & 0xFF) << 8) + (this.field1611[this.field1612 - 1] - 128 & 0xFF) : this.field1596;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "d", descriptor = "(Z)I")
    public int method578(boolean arg0) {
        this.field1612 += 2;
        if (arg0) {
            this.field1605 = !this.field1605;
        }
        return ((this.field1611[this.field1612 - 1] & 0xFF) << 8) + (this.field1611[this.field1612 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "e", descriptor = "(Z)I")
    public int method579(boolean arg0) {
        this.field1612 += 2;
        int var2 = ((this.field1611[this.field1612 - 2] & 0xFF) << 8) + (this.field1611[this.field1612 - 1] - 128 & 0xFF);
        if (arg0) {
            this.field1591 = !this.field1591;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "k", descriptor = "(I)I")
    public int method580(int arg0) {
        this.field1612 += 2;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = ((this.field1611[this.field1612 - 1] & 0xFF) << 8) + (this.field1611[this.field1612 - 2] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "YOXDZEVD", name = "f", descriptor = "(Z)I")
    public int method581(boolean arg0) {
        this.field1612 += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1611[this.field1612 - 4] & 0xFF) + ((this.field1611[this.field1612 - 3] & 0xFF) << 8) + ((this.field1611[this.field1612 - 1] & 0xFF) << 24) + ((this.field1611[this.field1612 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "g", descriptor = "(Z)I")
    public int method582(boolean arg0) {
        this.field1612 += 4;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1611[this.field1612 - 2] & 0xFF) + ((this.field1611[this.field1612 - 1] & 0xFF) << 8) + ((this.field1611[this.field1612 - 3] & 0xFF) << 24) + ((this.field1611[this.field1612 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(III[B)V")
    public void method583(int arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 65 / arg1;
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            this.field1611[this.field1612++] = (byte) (arg3[var6] + 128);
        }
    }

    @OriginalMember(owner = "YOXDZEVD", name = "a", descriptor = "(IBI[B)V")
    public void method584(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 == 0) {
            for (int var5 = arg0 + arg2 - 1; var5 >= arg2; var5--) {
                arg3[var5] = (byte) (this.field1611[this.field1612++] - 128);
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
            field1614[var0] = var1;
        }
        field1615 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1620 = new class65((byte) 52);
        field1621 = new class65((byte) 52);
        field1622 = new class65((byte) 52);
        field1623 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
