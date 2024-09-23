import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XGRGMPUQ")
public class class69 extends class27 {

    @OriginalMember(owner = "XGRGMPUQ", name = "k", descriptor = "B")
    private byte field1629 = 47;

    @OriginalMember(owner = "XGRGMPUQ", name = "l", descriptor = "I")
    private int field1630 = -211;

    @OriginalMember(owner = "XGRGMPUQ", name = "m", descriptor = "I")
    private int field1631 = -43215;

    @OriginalMember(owner = "XGRGMPUQ", name = "n", descriptor = "I")
    private int field1632 = -998;

    @OriginalMember(owner = "XGRGMPUQ", name = "p", descriptor = "I")
    private int field1634 = 33447;

    @OriginalMember(owner = "XGRGMPUQ", name = "q", descriptor = "I")
    private int field1635 = -263;

    @OriginalMember(owner = "XGRGMPUQ", name = "s", descriptor = "Z")
    private boolean field1637 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "t", descriptor = "Z")
    private boolean field1638 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "u", descriptor = "I")
    private int field1639 = -787;

    @OriginalMember(owner = "XGRGMPUQ", name = "v", descriptor = "I")
    private int field1640 = 5;

    @OriginalMember(owner = "XGRGMPUQ", name = "w", descriptor = "I")
    private int field1641 = 41364;

    @OriginalMember(owner = "XGRGMPUQ", name = "x", descriptor = "I")
    private int field1642 = -302;

    @OriginalMember(owner = "XGRGMPUQ", name = "y", descriptor = "Z")
    private boolean field1643 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "A", descriptor = "I")
    private int field1645 = 47424;

    @OriginalMember(owner = "XGRGMPUQ", name = "B", descriptor = "Z")
    private boolean field1646 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "C", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "XGRGMPUQ", name = "D", descriptor = "Z")
    private boolean field1648 = false;

    @OriginalMember(owner = "XGRGMPUQ", name = "E", descriptor = "Z")
    private boolean field1649 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "F", descriptor = "Z")
    private boolean field1650 = true;

    @OriginalMember(owner = "XGRGMPUQ", name = "G", descriptor = "[B")
    public byte[] field1651;

    @OriginalMember(owner = "XGRGMPUQ", name = "H", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "XGRGMPUQ", name = "i", descriptor = "B")
    private static byte field1627 = 74;

    @OriginalMember(owner = "XGRGMPUQ", name = "j", descriptor = "B")
    private static byte field1628 = 1;

    @OriginalMember(owner = "XGRGMPUQ", name = "J", descriptor = "[I")
    private static int[] field1654 = new int[256];

    @OriginalMember(owner = "XGRGMPUQ", name = "K", descriptor = "[I")
    private static final int[] field1655;

    @OriginalMember(owner = "XGRGMPUQ", name = "P", descriptor = "LVLUKUYNM;")
    private static class60 field1660;

    @OriginalMember(owner = "XGRGMPUQ", name = "Q", descriptor = "LVLUKUYNM;")
    private static class60 field1661;

    @OriginalMember(owner = "XGRGMPUQ", name = "R", descriptor = "LVLUKUYNM;")
    private static class60 field1662;

    @OriginalMember(owner = "XGRGMPUQ", name = "S", descriptor = "[C")
    private static char[] field1663;

    @OriginalMember(owner = "XGRGMPUQ", name = "o", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "XGRGMPUQ", name = "r", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "XGRGMPUQ", name = "z", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "XGRGMPUQ", name = "I", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "XGRGMPUQ", name = "M", descriptor = "I")
    private static int field1657;

    @OriginalMember(owner = "XGRGMPUQ", name = "N", descriptor = "I")
    private static int field1658;

    @OriginalMember(owner = "XGRGMPUQ", name = "O", descriptor = "I")
    private static int field1659;

    @OriginalMember(owner = "XGRGMPUQ", name = "L", descriptor = "LENXSCLLS;")
    public class16 field1656;

    @OriginalMember(owner = "XGRGMPUQ", name = "T", descriptor = "Z")
    public static boolean field1664;

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(IB)LXGRGMPUQ;")
    public static class69 method453(int arg0, byte arg1) {
        class60 var2 = field1661;
        synchronized (field1661) {
            class69 var3 = null;
            if (arg0 == 0 && field1657 > 0) {
                field1657--;
                var3 = (class69) field1660.method360();
            } else if (arg0 == 1 && field1658 > 0) {
                field1658--;
                var3 = (class69) field1661.method360();
            } else if (arg0 == 2 && field1659 > 0) {
                field1659--;
                var3 = (class69) field1662.method360();
            }
            if (var3 != null) {
                var3.field1652 = 0;
                return var3;
            }
        }
        class69 var5 = new class69(field1628);
        if (field1627 != arg1) {
            throw new NullPointerException();
        }
        var5.field1652 = 0;
        if (arg0 == 0) {
            var5.field1651 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1651 = new byte[5000];
        } else {
            var5.field1651 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "<init>", descriptor = "(B)V")
    private class69(byte arg0) {
        if (field1628 != arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "<init>", descriptor = "([BI)V")
    public class69(byte[] arg0, int arg1) {
        this.field1651 = arg0;
        if (arg1 >= 0) {
            this.field1647 = !this.field1647;
        }
        this.field1652 = 0;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(II)V")
    public void method454(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) (arg1 + this.field1656.method200());
        if (arg0 < 4 || arg0 > 4) {
            this.field1650 = !this.field1650;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(I)V")
    public void method455(int arg0) {
        this.field1651[this.field1652++] = (byte) arg0;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "b", descriptor = "(I)V")
    public void method456(int arg0) {
        this.field1651[this.field1652++] = (byte) (arg0 >> 8);
        this.field1651[this.field1652++] = (byte) arg0;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "b", descriptor = "(II)V")
    public void method457(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) arg1;
        this.field1651[this.field1652++] = (byte) (arg1 >> 8);
        if (arg0 == -48022) {
            ;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "c", descriptor = "(I)V")
    public void method458(int arg0) {
        this.field1651[this.field1652++] = (byte) (arg0 >> 16);
        this.field1651[this.field1652++] = (byte) (arg0 >> 8);
        this.field1651[this.field1652++] = (byte) arg0;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "d", descriptor = "(I)V")
    public void method459(int arg0) {
        this.field1651[this.field1652++] = (byte) (arg0 >> 24);
        this.field1651[this.field1652++] = (byte) (arg0 >> 16);
        this.field1651[this.field1652++] = (byte) (arg0 >> 8);
        this.field1651[this.field1652++] = (byte) arg0;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "c", descriptor = "(II)V")
    public void method460(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) arg0;
        if (arg1 > 0) {
            this.field1651[this.field1652++] = (byte) (arg0 >> 8);
            this.field1651[this.field1652++] = (byte) (arg0 >> 16);
            this.field1651[this.field1652++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(BJ)V")
    public void method461(byte arg0, long arg1) {
        this.field1651[this.field1652++] = (byte) (arg1 >> 56);
        this.field1651[this.field1652++] = (byte) (arg1 >> 48);
        this.field1651[this.field1652++] = (byte) (arg1 >> 40);
        this.field1651[this.field1652++] = (byte) (arg1 >> 32);
        this.field1651[this.field1652++] = (byte) (arg1 >> 24);
        this.field1651[this.field1652++] = (byte) (arg1 >> 16);
        this.field1651[this.field1652++] = (byte) (arg1 >> 8);
        if (arg0 != 6) {
            this.field1645 = 35;
        }
        this.field1651[this.field1652++] = (byte) arg1;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method462(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1651, this.field1652);
        this.field1652 += arg0.length();
        this.field1651[this.field1652++] = 10;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "([BIII)V")
    public void method463(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                this.field1651[this.field1652++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(ZI)V")
    public void method464(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1650 = !this.field1650;
        }
        this.field1651[this.field1652 - arg1 - 1] = (byte) arg1;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "c", descriptor = "()I")
    public int method465() {
        return this.field1651[this.field1652++] & 0xFF;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "d", descriptor = "()B")
    public byte method466() {
        return this.field1651[this.field1652++];
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "e", descriptor = "()I")
    public int method467() {
        this.field1652 += 2;
        return ((this.field1651[this.field1652 - 2] & 0xFF) << 8) + (this.field1651[this.field1652 - 1] & 0xFF);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "f", descriptor = "()I")
    public int method468() {
        this.field1652 += 2;
        int var1 = ((this.field1651[this.field1652 - 2] & 0xFF) << 8) + (this.field1651[this.field1652 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "g", descriptor = "()I")
    public int method469() {
        this.field1652 += 3;
        return (this.field1651[this.field1652 - 1] & 0xFF) + ((this.field1651[this.field1652 - 3] & 0xFF) << 16) + ((this.field1651[this.field1652 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "h", descriptor = "()I")
    public int method470() {
        this.field1652 += 4;
        return (this.field1651[this.field1652 - 1] & 0xFF) + ((this.field1651[this.field1652 - 2] & 0xFF) << 8) + ((this.field1651[this.field1652 - 4] & 0xFF) << 24) + ((this.field1651[this.field1652 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "e", descriptor = "(I)J")
    public long method471(int arg0) {
        if (arg0 != 0) {
            this.field1640 = 239;
        }
        long var2 = (long) this.method470() & 0xFFFFFFFFL;
        long var4 = (long) this.method470() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "i", descriptor = "()Ljava/lang/String;")
    public String method472() {
        int var1 = this.field1652;
        while (this.field1651[this.field1652++] != 10) {
        }
        return new String(this.field1651, var1, this.field1652 - var1 - 1);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "f", descriptor = "(I)[B")
    public byte[] method473(int arg0) {
        int var2 = this.field1652;
        while (arg0 >= 0) {
            this.field1640 = -418;
        }
        while (this.field1651[this.field1652++] != 10) {
        }
        byte[] var3 = new byte[this.field1652 - var2 - 1];
        for (int var4 = var2; var4 < this.field1652 - 1; var4++) {
            var3[var4 - var2] = this.field1651[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "b", descriptor = "([BIII)V")
    public void method474(byte[] arg0, int arg1, int arg2, int arg3) {
        if (this.field1631 == arg1) {
            for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
                arg0[var5] = this.field1651[this.field1652++];
            }
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "g", descriptor = "(I)V")
    public void method475(int arg0) {
        this.field1653 = this.field1652 * 8;
        while (arg0 >= 0) {
            this.field1647 = !this.field1647;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "d", descriptor = "(II)I")
    public int method476(int arg0, int arg1) {
        if (arg1 != 0) {
            return 1;
        }
        int var3 = this.field1653 >> 3;
        int var4 = 8 - (this.field1653 & 0x7);
        int var5 = 0;
        this.field1653 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1651[var3++] & field1655[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1651[var3] & field1655[var4]) + var5;
        } else {
            var6 = (this.field1651[var3] >> var4 - arg0 & field1655[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "h", descriptor = "(I)V")
    public void method477(int arg0) {
        this.field1652 = (this.field1653 + 7) / 8;
        if (arg0 != -22110) {
            this.field1650 = !this.field1650;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "j", descriptor = "()I")
    public int method478() {
        int var1 = this.field1651[this.field1652] & 0xFF;
        return var1 < 128 ? this.method465() - 64 : this.method467() - 49152;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "k", descriptor = "()I")
    public int method479() {
        int var1 = this.field1651[this.field1652] & 0xFF;
        return var1 < 128 ? this.method465() : this.method467() - 32768;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method480(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field1652;
        this.field1652 = 0;
        byte[] var5 = new byte[var4];
        this.method474(var5, -43215, var4, 0);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1652 = 0;
        this.method455(var8.length);
        this.method463(var8, 0, -944, var8.length);
        if (arg1 != 4) {
            this.field1647 = !this.field1647;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(BI)V")
    public void method481(byte arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) (arg1 + 128);
        if (arg0 != -88) {
            this.field1649 = !this.field1649;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "e", descriptor = "(II)V")
    public void method482(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) -arg1;
        if (arg0 == 19939) {
            ;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "i", descriptor = "(I)I")
    public int method483(int arg0) {
        while (arg0 >= 0) {
            this.field1636 = -267;
        }
        return this.field1651[this.field1652++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "j", descriptor = "(I)I")
    public int method484(int arg0) {
        while (arg0 >= 0) {
            this.field1630 = -410;
        }
        return -this.field1651[this.field1652++] & 0xFF;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(Z)I")
    public int method485(boolean arg0) {
        if (arg0) {
            this.field1635 = 30;
        }
        return 128 - this.field1651[this.field1652++] & 0xFF;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "b", descriptor = "(Z)B")
    public byte method486(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) (this.field1651[this.field1652++] - 128);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "k", descriptor = "(I)B")
    public byte method487(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field1651[this.field1652++];
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "f", descriptor = "(II)V")
    public void method488(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) arg0;
        if (this.field1641 != arg1) {
            this.field1634 = 313;
        }
        this.field1651[this.field1652++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "g", descriptor = "(II)V")
    public void method489(int arg0, int arg1) {
        if (arg1 == 1) {
            this.field1651[this.field1652++] = (byte) (arg0 >> 8);
            this.field1651[this.field1652++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "h", descriptor = "(II)V")
    public void method490(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field1633 = 188;
        }
        this.field1651[this.field1652++] = (byte) (arg1 + 128);
        this.field1651[this.field1652++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "l", descriptor = "(I)I")
    public int method491(int arg0) {
        this.field1652 += 2;
        if (arg0 <= 0) {
            this.field1650 = !this.field1650;
        }
        return ((this.field1651[this.field1652 - 1] & 0xFF) << 8) + (this.field1651[this.field1652 - 2] & 0xFF);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "m", descriptor = "(I)I")
    public int method492(int arg0) {
        this.field1652 += 2;
        return arg0 == 0 ? ((this.field1651[this.field1652 - 2] & 0xFF) << 8) + (this.field1651[this.field1652 - 1] - 128 & 0xFF) : this.field1639;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "n", descriptor = "(I)I")
    public int method493(int arg0) {
        this.field1652 += 2;
        if (arg0 != 0) {
            this.field1646 = !this.field1646;
        }
        return ((this.field1651[this.field1652 - 1] & 0xFF) << 8) + (this.field1651[this.field1652 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "o", descriptor = "(I)I")
    public int method494(int arg0) {
        this.field1652 += 2;
        if (arg0 <= 0) {
            return this.field1642;
        }
        int var2 = ((this.field1651[this.field1652 - 1] & 0xFF) << 8) + (this.field1651[this.field1652 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "p", descriptor = "(I)I")
    public int method495(int arg0) {
        this.field1652 += 2;
        if (arg0 != 0) {
            return 1;
        }
        int var2 = ((this.field1651[this.field1652 - 1] & 0xFF) << 8) + (this.field1651[this.field1652 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "q", descriptor = "(I)I")
    public int method496(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1652 += 3;
        return (this.field1651[this.field1652 - 3] & 0xFF) + ((this.field1651[this.field1652 - 1] & 0xFF) << 16) + ((this.field1651[this.field1652 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "i", descriptor = "(II)V")
    public void method497(int arg0, int arg1) {
        this.field1651[this.field1652++] = (byte) (arg0 >> 8);
        this.field1651[this.field1652++] = (byte) arg0;
        if (arg1 == 0) {
            this.field1651[this.field1652++] = (byte) (arg0 >> 24);
            this.field1651[this.field1652++] = (byte) (arg0 >> 16);
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "r", descriptor = "(I)I")
    public int method498(int arg0) {
        this.field1652 += 4;
        if (arg0 >= 0) {
            this.field1647 = !this.field1647;
        }
        return (this.field1651[this.field1652 - 4] & 0xFF) + ((this.field1651[this.field1652 - 3] & 0xFF) << 8) + ((this.field1651[this.field1652 - 1] & 0xFF) << 24) + ((this.field1651[this.field1652 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "s", descriptor = "(I)I")
    public int method499(int arg0) {
        if (this.field1644 == arg0) {
            this.field1652 += 4;
            return (this.field1651[this.field1652 - 3] & 0xFF) + ((this.field1651[this.field1652 - 4] & 0xFF) << 8) + ((this.field1651[this.field1652 - 2] & 0xFF) << 24) + ((this.field1651[this.field1652 - 1] & 0xFF) << 16);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "XGRGMPUQ", name = "a", descriptor = "(IZI[B)V")
    public void method500(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0 + arg2 - 1; var6 >= arg2; var6--) {
            this.field1651[this.field1652++] = (byte) (arg3[var6] + 128);
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
            field1654[var0] = var1;
        }
        field1655 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1660 = new class60((byte) 0);
        field1661 = new class60((byte) 0);
        field1662 = new class60((byte) 0);
        field1663 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
