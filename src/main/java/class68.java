import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XJCNBMKS")
public class class68 extends class30 {

    @OriginalMember(owner = "XJCNBMKS", name = "j", descriptor = "Z")
    private boolean field1628 = true;

    @OriginalMember(owner = "XJCNBMKS", name = "k", descriptor = "I")
    private int field1629 = -16211;

    @OriginalMember(owner = "XJCNBMKS", name = "l", descriptor = "B")
    private byte field1630 = 6;

    @OriginalMember(owner = "XJCNBMKS", name = "m", descriptor = "I")
    private int field1631 = -879;

    @OriginalMember(owner = "XJCNBMKS", name = "n", descriptor = "Z")
    private boolean field1632 = true;

    @OriginalMember(owner = "XJCNBMKS", name = "o", descriptor = "I")
    private int field1633 = 4;

    @OriginalMember(owner = "XJCNBMKS", name = "p", descriptor = "B")
    private byte field1634 = 8;

    @OriginalMember(owner = "XJCNBMKS", name = "q", descriptor = "I")
    private int field1635 = 2;

    @OriginalMember(owner = "XJCNBMKS", name = "r", descriptor = "I")
    private int field1636 = 22736;

    @OriginalMember(owner = "XJCNBMKS", name = "s", descriptor = "I")
    private int field1637 = -862;

    @OriginalMember(owner = "XJCNBMKS", name = "t", descriptor = "B")
    private byte field1638 = 10;

    @OriginalMember(owner = "XJCNBMKS", name = "u", descriptor = "Z")
    private boolean field1639 = false;

    @OriginalMember(owner = "XJCNBMKS", name = "w", descriptor = "I")
    private int field1641 = 6;

    @OriginalMember(owner = "XJCNBMKS", name = "x", descriptor = "[B")
    public byte[] field1642;

    @OriginalMember(owner = "XJCNBMKS", name = "y", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "XJCNBMKS", name = "i", descriptor = "I")
    private static int field1627 = -127;

    @OriginalMember(owner = "XJCNBMKS", name = "v", descriptor = "Z")
    private static boolean field1640 = true;

    @OriginalMember(owner = "XJCNBMKS", name = "A", descriptor = "[I")
    private static int[] field1645 = new int[256];

    @OriginalMember(owner = "XJCNBMKS", name = "B", descriptor = "[I")
    private static final int[] field1646;

    @OriginalMember(owner = "XJCNBMKS", name = "G", descriptor = "LEWLVMFRK;")
    private static class15 field1651;

    @OriginalMember(owner = "XJCNBMKS", name = "H", descriptor = "LEWLVMFRK;")
    private static class15 field1652;

    @OriginalMember(owner = "XJCNBMKS", name = "I", descriptor = "LEWLVMFRK;")
    private static class15 field1653;

    @OriginalMember(owner = "XJCNBMKS", name = "J", descriptor = "[C")
    private static char[] field1654;

    @OriginalMember(owner = "XJCNBMKS", name = "z", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "XJCNBMKS", name = "D", descriptor = "I")
    private static int field1648;

    @OriginalMember(owner = "XJCNBMKS", name = "E", descriptor = "I")
    private static int field1649;

    @OriginalMember(owner = "XJCNBMKS", name = "F", descriptor = "I")
    private static int field1650;

    @OriginalMember(owner = "XJCNBMKS", name = "C", descriptor = "LADZBQDSQ;")
    public class2 field1647;

    @OriginalMember(owner = "XJCNBMKS", name = "K", descriptor = "Z")
    public static boolean field1655;

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(II)LXJCNBMKS;")
    public static class68 method522(int arg0, int arg1) {
        class15 var2 = field1652;
        synchronized (field1652) {
            class68 var3 = null;
            if (arg0 == 0 && field1648 > 0) {
                field1648--;
                var3 = (class68) field1651.method200();
            } else if (arg0 == 1 && field1649 > 0) {
                field1649--;
                var3 = (class68) field1652.method200();
            } else if (arg0 == 2 && field1650 > 0) {
                field1650--;
                var3 = (class68) field1653.method200();
            }
            if (var3 != null) {
                var3.field1643 = 0;
                return var3;
            }
        }
        class68 var5 = new class68((byte) -48);
        var5.field1643 = 0;
        while (arg1 >= 0) {
            field1640 = !field1640;
        }
        if (arg0 == 0) {
            var5.field1642 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1642 = new byte[5000];
        } else {
            var5.field1642 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "<init>", descriptor = "(B)V")
    private class68(byte arg0) {
        if (arg0 != -48) {
            field1627 = 20;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "<init>", descriptor = "(B[B)V")
    public class68(byte arg0, byte[] arg1) {
        this.field1642 = arg1;
        this.field1643 = 0;
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            field1627 = -405;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "(II)V")
    public void method523(int arg0, int arg1) {
        if (arg1 == 0) {
            this.field1642[this.field1643++] = (byte) (arg0 + this.field1647.method3());
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(I)V")
    public void method524(int arg0) {
        this.field1642[this.field1643++] = (byte) arg0;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "(I)V")
    public void method525(int arg0) {
        this.field1642[this.field1643++] = (byte) (arg0 >> 8);
        this.field1642[this.field1643++] = (byte) arg0;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(IB)V")
    public void method526(int arg0, byte arg1) {
        if (arg1 != 1) {
            this.field1628 = !this.field1628;
        }
        this.field1642[this.field1643++] = (byte) arg0;
        this.field1642[this.field1643++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "(I)V")
    public void method527(int arg0) {
        this.field1642[this.field1643++] = (byte) (arg0 >> 16);
        this.field1642[this.field1643++] = (byte) (arg0 >> 8);
        this.field1642[this.field1643++] = (byte) arg0;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "d", descriptor = "(I)V")
    public void method528(int arg0) {
        this.field1642[this.field1643++] = (byte) (arg0 >> 24);
        this.field1642[this.field1643++] = (byte) (arg0 >> 16);
        this.field1642[this.field1643++] = (byte) (arg0 >> 8);
        this.field1642[this.field1643++] = (byte) arg0;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "(II)V")
    public void method529(int arg0, int arg1) {
        this.field1642[this.field1643++] = (byte) arg1;
        this.field1642[this.field1643++] = (byte) (arg1 >> 8);
        this.field1642[this.field1643++] = (byte) (arg1 >> 16);
        this.field1642[this.field1643++] = (byte) (arg1 >> 24);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(IJ)V")
    public void method530(int arg0, long arg1) {
        this.field1642[this.field1643++] = (byte) (arg1 >> 56);
        this.field1642[this.field1643++] = (byte) (arg1 >> 48);
        this.field1642[this.field1643++] = (byte) (arg1 >> 40);
        this.field1642[this.field1643++] = (byte) (arg1 >> 32);
        int var4 = 99 / arg0;
        this.field1642[this.field1643++] = (byte) (arg1 >> 24);
        this.field1642[this.field1643++] = (byte) (arg1 >> 16);
        this.field1642[this.field1643++] = (byte) (arg1 >> 8);
        this.field1642[this.field1643++] = (byte) arg1;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method531(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1642, this.field1643);
        this.field1643 += arg0.length();
        this.field1642[this.field1643++] = 10;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "([BIII)V")
    public void method532(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 3) {
            for (int var5 = arg3; var5 < arg1 + arg3; var5++) {
                this.field1642[this.field1643++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "d", descriptor = "(II)V")
    public void method533(int arg0, int arg1) {
        this.field1642[this.field1643 - arg1 - 1] = (byte) arg1;
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "()I")
    public int method534() {
        return this.field1642[this.field1643++] & 0xFF;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "d", descriptor = "()B")
    public byte method535() {
        return this.field1642[this.field1643++];
    }

    @OriginalMember(owner = "XJCNBMKS", name = "e", descriptor = "()I")
    public int method536() {
        this.field1643 += 2;
        return ((this.field1642[this.field1643 - 2] & 0xFF) << 8) + (this.field1642[this.field1643 - 1] & 0xFF);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "f", descriptor = "()I")
    public int method537() {
        this.field1643 += 2;
        int var1 = ((this.field1642[this.field1643 - 2] & 0xFF) << 8) + (this.field1642[this.field1643 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "g", descriptor = "()I")
    public int method538() {
        this.field1643 += 3;
        return (this.field1642[this.field1643 - 1] & 0xFF) + ((this.field1642[this.field1643 - 3] & 0xFF) << 16) + ((this.field1642[this.field1643 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "h", descriptor = "()I")
    public int method539() {
        this.field1643 += 4;
        return (this.field1642[this.field1643 - 1] & 0xFF) + ((this.field1642[this.field1643 - 2] & 0xFF) << 8) + ((this.field1642[this.field1643 - 4] & 0xFF) << 24) + ((this.field1642[this.field1643 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(Z)J")
    public long method540(boolean arg0) {
        long var2 = (long) this.method539() & 0xFFFFFFFFL;
        long var4 = (long) this.method539() & 0xFFFFFFFFL;
        if (!arg0) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "i", descriptor = "()Ljava/lang/String;")
    public String method541() {
        int var1 = this.field1643;
        while (this.field1642[this.field1643++] != 10) {
        }
        return new String(this.field1642, var1, this.field1643 - var1 - 1);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(B)[B")
    public byte[] method542(byte arg0) {
        int var2 = this.field1643;
        while (this.field1642[this.field1643++] != 10) {
        }
        byte[] var3 = new byte[this.field1643 - var2 - 1];
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        for (int var5 = var2; var5 < this.field1643 - 1; var5++) {
            var3[var5 - var2] = this.field1642[var5];
        }
        return var3;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(I[BII)V")
    public void method543(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 > 0) {
            for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
                arg1[var5] = this.field1642[this.field1643++];
            }
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "(B)V")
    public void method544(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
            this.field1644 = this.field1643 * 8;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(ZI)I")
    public int method545(boolean arg0, int arg1) {
        if (!arg0) {
            return this.field1629;
        }
        int var3 = this.field1644 >> 3;
        int var4 = 8 - (this.field1644 & 0x7);
        int var5 = 0;
        this.field1644 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1642[var3++] & field1646[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1642[var3] & field1646[var4]) + var5;
        } else {
            var6 = (this.field1642[var3] >> var4 - arg1 & field1646[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "e", descriptor = "(I)V")
    public void method546(int arg0) {
        this.field1643 = (this.field1644 + 7) / 8;
        if (arg0 != 0) {
            this.field1628 = !this.field1628;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "j", descriptor = "()I")
    public int method547() {
        int var1 = this.field1642[this.field1643] & 0xFF;
        return var1 < 128 ? this.method534() - 64 : this.method536() - 49152;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "k", descriptor = "()I")
    public int method548() {
        int var1 = this.field1642[this.field1643] & 0xFF;
        return var1 < 128 ? this.method534() : this.method536() - 32768;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method549(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field1643;
        this.field1643 = 0;
        byte[] var5 = new byte[var4];
        this.method543(var4, var5, 68, 0);
        if (this.field1634 == arg1) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        BigInteger var8 = new BigInteger(var5);
        BigInteger var9 = var8.modPow(arg0, arg2);
        byte[] var10 = var9.toByteArray();
        this.field1643 = 0;
        this.method524(var10.length);
        this.method532(var10, var10.length, 3, 0);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "e", descriptor = "(II)V")
    public void method550(int arg0, int arg1) {
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1642[this.field1643++] = (byte) -arg1;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "f", descriptor = "(II)V")
    public void method551(int arg0, int arg1) {
        this.field1642[this.field1643++] = (byte) (128 - arg0);
        if (arg1 == 47778) {
            ;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "f", descriptor = "(I)I")
    public int method552(int arg0) {
        if (this.field1636 != arg0) {
            this.field1641 = -484;
        }
        return this.field1642[this.field1643++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "g", descriptor = "(I)I")
    public int method553(int arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1642[this.field1643++] & 0xFF;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "(B)I")
    public int method554(byte arg0) {
        if (arg0 != 112) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field1642[this.field1643++] & 0xFF;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "h", descriptor = "(I)B")
    public byte method555(int arg0) {
        if (arg0 != 0) {
            this.field1641 = 419;
        }
        return (byte) (128 - this.field1642[this.field1643++]);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "g", descriptor = "(II)V")
    public void method556(int arg0, int arg1) {
        this.field1642[this.field1643++] = (byte) arg1;
        this.field1642[this.field1643++] = (byte) (arg1 >> 8);
        int var3 = 21 / arg0;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "(IB)V")
    public void method557(int arg0, byte arg1) {
        this.field1642[this.field1643++] = (byte) (arg0 >> 8);
        this.field1642[this.field1643++] = (byte) (arg0 + 128);
        if (arg1 != 60) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "(IB)V")
    public void method558(int arg0, byte arg1) {
        this.field1642[this.field1643++] = (byte) (arg0 + 128);
        if (arg1 == 7) {
            this.field1642[this.field1643++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "i", descriptor = "(I)I")
    public int method559(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1643 += 2;
        return ((this.field1642[this.field1643 - 1] & 0xFF) << 8) + (this.field1642[this.field1643 - 2] & 0xFF);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "j", descriptor = "(I)I")
    public int method560(int arg0) {
        this.field1643 += 2;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1642[this.field1643 - 2] & 0xFF) << 8) + (this.field1642[this.field1643 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "k", descriptor = "(I)I")
    public int method561(int arg0) {
        this.field1643 += 2;
        return arg0 < 0 ? ((this.field1642[this.field1643 - 1] & 0xFF) << 8) + (this.field1642[this.field1643 - 2] - 128 & 0xFF) : 1;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "l", descriptor = "(I)I")
    public int method562(int arg0) {
        this.field1643 += 2;
        int var2 = ((this.field1642[this.field1643 - 1] & 0xFF) << 8) + (this.field1642[this.field1643 - 2] & 0xFF);
        if (arg0 >= 1 && arg0 <= 1) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "m", descriptor = "(I)I")
    public int method563(int arg0) {
        this.field1643 += 2;
        if (arg0 != 0) {
            this.field1628 = !this.field1628;
        }
        int var2 = ((this.field1642[this.field1643 - 2] & 0xFF) << 8) + (this.field1642[this.field1643 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "(Z)I")
    public int method564(boolean arg0) {
        if (arg0) {
            return this.field1635;
        }
        this.field1643 += 2;
        int var2 = ((this.field1642[this.field1643 - 1] & 0xFF) << 8) + (this.field1642[this.field1643 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XJCNBMKS", name = "h", descriptor = "(II)V")
    public void method565(int arg0, int arg1) {
        this.field1642[this.field1643++] = (byte) arg1;
        this.field1642[this.field1643++] = (byte) (arg1 >> 8);
        this.field1642[this.field1643++] = (byte) (arg1 >> 16);
        this.field1642[this.field1643++] = (byte) (arg1 >> 24);
        if (arg0 >= 0) {
            this.field1633 = -148;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "d", descriptor = "(B)I")
    public int method566(byte arg0) {
        this.field1643 += 4;
        if (arg0 == 1) {
            boolean var2 = false;
            return (this.field1642[this.field1643 - 3] & 0xFF) + ((this.field1642[this.field1643 - 4] & 0xFF) << 8) + ((this.field1642[this.field1643 - 2] & 0xFF) << 24) + ((this.field1642[this.field1643 - 1] & 0xFF) << 16);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "c", descriptor = "(Z)I")
    public int method567(boolean arg0) {
        this.field1643 += 4;
        return arg0 ? this.field1637 : (this.field1642[this.field1643 - 2] & 0xFF) + ((this.field1642[this.field1643 - 1] & 0xFF) << 8) + ((this.field1642[this.field1643 - 3] & 0xFF) << 24) + ((this.field1642[this.field1643 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XJCNBMKS", name = "b", descriptor = "([BIII)V")
    public void method568(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 == -27280) {
            for (int var5 = arg1 + arg3 - 1; var5 >= arg1; var5--) {
                this.field1642[this.field1643++] = (byte) (arg0[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(I[BZI)V")
    public void method569(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1636 = 143;
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            arg1[var5] = (byte) (this.field1642[this.field1643++] - 128);
        }
    }

    @OriginalMember(owner = "XJCNBMKS", name = "a", descriptor = "(I[BBI)V")
    public void method570(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 == -54) {
            for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
                arg1[var5] = (byte) (this.field1642[this.field1643++] - 128);
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
            field1645[var0] = var1;
        }
        field1646 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1651 = new class15(field1640);
        field1652 = new class15(field1640);
        field1653 = new class15(field1640);
        field1654 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
