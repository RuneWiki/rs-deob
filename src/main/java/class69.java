import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZOMNSJJM")
public class class69 extends class6 {

    @OriginalMember(owner = "ZOMNSJJM", name = "i", descriptor = "I")
    private int field1683 = -302;

    @OriginalMember(owner = "ZOMNSJJM", name = "j", descriptor = "I")
    private int field1684 = 4;

    @OriginalMember(owner = "ZOMNSJJM", name = "k", descriptor = "I")
    private int field1685 = 6;

    @OriginalMember(owner = "ZOMNSJJM", name = "l", descriptor = "B")
    private byte field1686 = -77;

    @OriginalMember(owner = "ZOMNSJJM", name = "n", descriptor = "B")
    private byte field1688 = 2;

    @OriginalMember(owner = "ZOMNSJJM", name = "o", descriptor = "I")
    private int field1689 = 1474;

    @OriginalMember(owner = "ZOMNSJJM", name = "q", descriptor = "Z")
    private boolean field1691 = false;

    @OriginalMember(owner = "ZOMNSJJM", name = "r", descriptor = "I")
    private int field1692 = 613;

    @OriginalMember(owner = "ZOMNSJJM", name = "s", descriptor = "Z")
    private boolean field1693 = true;

    @OriginalMember(owner = "ZOMNSJJM", name = "t", descriptor = "Z")
    private boolean field1694 = true;

    @OriginalMember(owner = "ZOMNSJJM", name = "v", descriptor = "Z")
    private boolean field1696 = true;

    @OriginalMember(owner = "ZOMNSJJM", name = "w", descriptor = "I")
    private int field1697 = 8377;

    @OriginalMember(owner = "ZOMNSJJM", name = "x", descriptor = "Z")
    private boolean field1698 = false;

    @OriginalMember(owner = "ZOMNSJJM", name = "y", descriptor = "[B")
    public byte[] field1699;

    @OriginalMember(owner = "ZOMNSJJM", name = "z", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "ZOMNSJJM", name = "B", descriptor = "[I")
    private static int[] field1702 = new int[256];

    @OriginalMember(owner = "ZOMNSJJM", name = "C", descriptor = "[I")
    private static final int[] field1703;

    @OriginalMember(owner = "ZOMNSJJM", name = "H", descriptor = "LYSGENUJE;")
    private static class66 field1708;

    @OriginalMember(owner = "ZOMNSJJM", name = "I", descriptor = "LYSGENUJE;")
    private static class66 field1709;

    @OriginalMember(owner = "ZOMNSJJM", name = "J", descriptor = "LYSGENUJE;")
    private static class66 field1710;

    @OriginalMember(owner = "ZOMNSJJM", name = "K", descriptor = "[C")
    private static char[] field1711;

    @OriginalMember(owner = "ZOMNSJJM", name = "m", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "ZOMNSJJM", name = "p", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "ZOMNSJJM", name = "u", descriptor = "I")
    private int field1695;

    @OriginalMember(owner = "ZOMNSJJM", name = "A", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "ZOMNSJJM", name = "E", descriptor = "I")
    private static int field1705;

    @OriginalMember(owner = "ZOMNSJJM", name = "F", descriptor = "I")
    private static int field1706;

    @OriginalMember(owner = "ZOMNSJJM", name = "G", descriptor = "I")
    private static int field1707;

    @OriginalMember(owner = "ZOMNSJJM", name = "D", descriptor = "LZQADNJCF;")
    public class70 field1704;

    @OriginalMember(owner = "ZOMNSJJM", name = "L", descriptor = "Z")
    public static boolean field1712;

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(II)LZOMNSJJM;")
    public static class69 method535(int arg0, int arg1) {
        class66 var2 = field1709;
        synchronized (field1709) {
            class69 var3 = null;
            if (arg0 == 0 && field1705 > 0) {
                field1705--;
                var3 = (class69) field1708.method522();
            } else if (arg0 == 1 && field1706 > 0) {
                field1706--;
                var3 = (class69) field1709.method522();
            } else if (arg0 == 2 && field1707 > 0) {
                field1707--;
                var3 = (class69) field1710.method522();
            }
            if (var3 != null) {
                var3.field1700 = 0;
                return var3;
            }
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        class69 var5 = new class69((byte) 4);
        var5.field1700 = 0;
        if (arg0 == 0) {
            var5.field1699 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1699 = new byte[5000];
        } else {
            var5.field1699 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "<init>", descriptor = "(B)V")
    private class69(byte arg0) {
        if (arg0 != 4) {
            this.field1694 = !this.field1694;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "<init>", descriptor = "([BI)V")
    public class69(byte[] arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1697 = -274;
        }
        this.field1699 = arg0;
        this.field1700 = 0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(IZ)V")
    public void method536(int arg0, boolean arg1) {
        this.field1699[this.field1700++] = (byte) (arg0 + this.field1704.method585());
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(I)V")
    public void method537(int arg0) {
        this.field1699[this.field1700++] = (byte) arg0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(I)V")
    public void method538(int arg0) {
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) arg0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(BI)V")
    public void method539(byte arg0, int arg1) {
        if (arg0 != 118) {
            this.field1694 = !this.field1694;
        }
        this.field1699[this.field1700++] = (byte) arg1;
        this.field1699[this.field1700++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "(I)V")
    public void method540(int arg0) {
        this.field1699[this.field1700++] = (byte) (arg0 >> 16);
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) arg0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "d", descriptor = "(I)V")
    public void method541(int arg0) {
        this.field1699[this.field1700++] = (byte) (arg0 >> 24);
        this.field1699[this.field1700++] = (byte) (arg0 >> 16);
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) arg0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(II)V")
    public void method542(int arg0, int arg1) {
        this.field1699[this.field1700++] = (byte) arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) (arg0 >> 16);
        this.field1699[this.field1700++] = (byte) (arg0 >> 24);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(JB)V")
    public void method543(long arg0, byte arg1) {
        if (arg1 != 5) {
            this.field1697 = -143;
        }
        this.field1699[this.field1700++] = (byte) (arg0 >> 56);
        this.field1699[this.field1700++] = (byte) (arg0 >> 48);
        this.field1699[this.field1700++] = (byte) (arg0 >> 40);
        this.field1699[this.field1700++] = (byte) (arg0 >> 32);
        this.field1699[this.field1700++] = (byte) (arg0 >> 24);
        this.field1699[this.field1700++] = (byte) (arg0 >> 16);
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) arg0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method544(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1699, this.field1700);
        this.field1700 += arg0.length();
        this.field1699[this.field1700++] = 10;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(III[B)V")
    public void method545(int arg0, int arg1, int arg2, byte[] arg3) {
        if (this.field1684 == arg2) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                this.field1699[this.field1700++] = arg3[var5];
            }
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(ZI)V")
    public void method546(boolean arg0, int arg1) {
        this.field1699[this.field1700 - arg1 - 1] = (byte) arg1;
        if (!arg0) {
            this.field1698 = !this.field1698;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "()I")
    public int method547() {
        return this.field1699[this.field1700++] & 0xFF;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "d", descriptor = "()B")
    public byte method548() {
        return this.field1699[this.field1700++];
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "e", descriptor = "()I")
    public int method549() {
        this.field1700 += 2;
        return ((this.field1699[this.field1700 - 2] & 0xFF) << 8) + (this.field1699[this.field1700 - 1] & 0xFF);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "f", descriptor = "()I")
    public int method550() {
        this.field1700 += 2;
        int var1 = ((this.field1699[this.field1700 - 2] & 0xFF) << 8) + (this.field1699[this.field1700 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "g", descriptor = "()I")
    public int method551() {
        this.field1700 += 3;
        return (this.field1699[this.field1700 - 1] & 0xFF) + ((this.field1699[this.field1700 - 3] & 0xFF) << 16) + ((this.field1699[this.field1700 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "h", descriptor = "()I")
    public int method552() {
        this.field1700 += 4;
        return (this.field1699[this.field1700 - 1] & 0xFF) + ((this.field1699[this.field1700 - 2] & 0xFF) << 8) + ((this.field1699[this.field1700 - 4] & 0xFF) << 24) + ((this.field1699[this.field1700 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(Z)J")
    public long method553(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method552() & 0xFFFFFFFFL;
        long var4 = (long) this.method552() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "i", descriptor = "()Ljava/lang/String;")
    public String method554() {
        int var1 = this.field1700;
        while (this.field1699[this.field1700++] != 10) {
        }
        return new String(this.field1699, var1, this.field1700 - var1 - 1);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(B)[B")
    public byte[] method555(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1700;
        while (this.field1699[this.field1700++] != 10) {
        }
        byte[] var5 = new byte[this.field1700 - var4 - 1];
        for (int var6 = var4; var6 < this.field1700 - 1; var6++) {
            var5[var6 - var4] = this.field1699[var6];
        }
        return var5;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(I[BII)V")
    public void method556(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 9 || arg3 > 9) {
            this.field1698 = !this.field1698;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg1[var5] = this.field1699[this.field1700++];
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(B)V")
    public void method557(byte arg0) {
        this.field1701 = this.field1700 * 8;
        if (arg0 != -108) {
            this.field1694 = !this.field1694;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(IZ)I")
    public int method558(int arg0, boolean arg1) {
        if (!arg1) {
            return 4;
        }
        int var3 = this.field1701 >> 3;
        int var4 = 8 - (this.field1701 & 0x7);
        int var5 = 0;
        this.field1701 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1699[var3++] & field1703[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1699[var3] & field1703[var4]) + var5;
        } else {
            var6 = (this.field1699[var3] >> var4 - arg0 & field1703[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "e", descriptor = "(I)V")
    public void method559(int arg0) {
        this.field1700 = (this.field1701 + 7) / 8;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "j", descriptor = "()I")
    public int method560() {
        int var1 = this.field1699[this.field1700] & 0xFF;
        return var1 < 128 ? this.method547() - 64 : this.method549() - 49152;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "k", descriptor = "()I")
    public int method561() {
        int var1 = this.field1699[this.field1700] & 0xFF;
        return var1 < 128 ? this.method547() : this.method549() - 32768;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
    public void method562(BigInteger arg0, byte arg1, BigInteger arg2) {
        int var4 = this.field1700;
        this.field1700 = 0;
        byte[] var5 = new byte[var4];
        this.method556(0, var5, var4, 9);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1700 = 0;
        this.method537(var8.length);
        if (arg1 == 6) {
            boolean var9 = false;
            this.method545(0, var8.length, 4, var8);
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(ZI)V")
    public void method563(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1699[this.field1700++] = (byte) -arg1;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(BI)V")
    public void method564(byte arg0, int arg1) {
        if (this.field1688 == arg0) {
            this.field1699[this.field1700++] = (byte) (128 - arg1);
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "f", descriptor = "(I)I")
    public int method565(int arg0) {
        int var2 = 6 / arg0;
        return this.field1699[this.field1700++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "g", descriptor = "(I)I")
    public int method566(int arg0) {
        if (this.field1689 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1699[this.field1700++] & 0xFF;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "h", descriptor = "(I)I")
    public int method567(int arg0) {
        return arg0 == 3 ? 128 - this.field1699[this.field1700++] & 0xFF : 4;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(Z)B")
    public byte method568(boolean arg0) {
        if (arg0) {
            this.field1697 = 415;
        }
        return (byte) (this.field1699[this.field1700++] - 128);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "(Z)B")
    public byte method569(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1699[this.field1700++];
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "(II)V")
    public void method570(int arg0, int arg1) {
        this.field1699[this.field1700++] = (byte) arg0;
        if (arg1 != 0) {
            this.field1689 = -420;
        }
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "(IZ)V")
    public void method571(int arg0, boolean arg1) {
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field1699[this.field1700++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "d", descriptor = "(II)V")
    public void method572(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1698 = !this.field1698;
        }
        this.field1699[this.field1700++] = (byte) (arg1 + 128);
        this.field1699[this.field1700++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "i", descriptor = "(I)I")
    public int method573(int arg0) {
        this.field1700 += 2;
        if (arg0 < 7 || arg0 > 7) {
            this.field1684 = -407;
        }
        return ((this.field1699[this.field1700 - 1] & 0xFF) << 8) + (this.field1699[this.field1700 - 2] & 0xFF);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "c", descriptor = "(B)I")
    public int method574(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1693 = !this.field1693;
        }
        this.field1700 += 2;
        return ((this.field1699[this.field1700 - 2] & 0xFF) << 8) + (this.field1699[this.field1700 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "j", descriptor = "(I)I")
    public int method575(int arg0) {
        this.field1700 += 2;
        if (arg0 <= 0) {
            this.field1695 = 346;
        }
        return ((this.field1699[this.field1700 - 1] & 0xFF) << 8) + (this.field1699[this.field1700 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "d", descriptor = "(Z)I")
    public int method576(boolean arg0) {
        if (!arg0) {
            return this.field1697;
        }
        this.field1700 += 2;
        int var2 = ((this.field1699[this.field1700 - 2] & 0xFF) << 8) + (this.field1699[this.field1700 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "k", descriptor = "(I)I")
    public int method577(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1700 += 2;
        int var3 = ((this.field1699[this.field1700 - 1] & 0xFF) << 8) + (this.field1699[this.field1700 - 2] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "e", descriptor = "(Z)I")
    public int method578(boolean arg0) {
        if (arg0) {
            this.field1700 += 3;
            return (this.field1699[this.field1700 - 2] & 0xFF) + ((this.field1699[this.field1700 - 3] & 0xFF) << 16) + ((this.field1699[this.field1700 - 1] & 0xFF) << 8);
        } else {
            return this.field1687;
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "e", descriptor = "(II)V")
    public void method579(int arg0, int arg1) {
        this.field1699[this.field1700++] = (byte) (arg0 >> 8);
        this.field1699[this.field1700++] = (byte) arg0;
        this.field1699[this.field1700++] = (byte) (arg0 >> 24);
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1699[this.field1700++] = (byte) (arg0 >> 16);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "l", descriptor = "(I)I")
    public int method580(int arg0) {
        this.field1700 += 4;
        if (arg0 != -21852) {
            this.field1683 = 180;
        }
        return (this.field1699[this.field1700 - 4] & 0xFF) + ((this.field1699[this.field1700 - 3] & 0xFF) << 8) + ((this.field1699[this.field1700 - 1] & 0xFF) << 24) + ((this.field1699[this.field1700 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "m", descriptor = "(I)I")
    public int method581(int arg0) {
        this.field1700 += 4;
        return arg0 == 613 ? (this.field1699[this.field1700 - 3] & 0xFF) + ((this.field1699[this.field1700 - 4] & 0xFF) << 8) + ((this.field1699[this.field1700 - 2] & 0xFF) << 24) + ((this.field1699[this.field1700 - 1] & 0xFF) << 16) : 0;
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "f", descriptor = "(Z)I")
    public int method582(boolean arg0) {
        this.field1700 += 4;
        if (!arg0) {
            this.field1690 = 214;
        }
        return (this.field1699[this.field1700 - 2] & 0xFF) + ((this.field1699[this.field1700 - 1] & 0xFF) << 8) + ((this.field1699[this.field1700 - 3] & 0xFF) << 24) + ((this.field1699[this.field1700 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "a", descriptor = "([BIII)V")
    public void method583(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field1698 = !this.field1698;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            this.field1699[this.field1700++] = (byte) (arg0[var5] + 128);
        }
    }

    @OriginalMember(owner = "ZOMNSJJM", name = "b", descriptor = "(I[BII)V")
    public void method584(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 93 / arg2;
        for (int var6 = arg0; var6 < arg0 + arg3; var6++) {
            arg1[var6] = (byte) (this.field1699[this.field1700++] - 128);
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
            field1702[var0] = var1;
        }
        field1703 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1708 = new class66(-41036);
        field1709 = new class66(-41036);
        field1710 = new class66(-41036);
        field1711 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
