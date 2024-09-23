import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XOUQUKZW")
public class class62 extends class14 {

    @OriginalMember(owner = "XOUQUKZW", name = "i", descriptor = "I")
    private int field1557 = 34021;

    @OriginalMember(owner = "XOUQUKZW", name = "j", descriptor = "I")
    private int field1558 = -266;

    @OriginalMember(owner = "XOUQUKZW", name = "l", descriptor = "I")
    private int field1560 = -645;

    @OriginalMember(owner = "XOUQUKZW", name = "m", descriptor = "I")
    private int field1561 = 124;

    @OriginalMember(owner = "XOUQUKZW", name = "n", descriptor = "I")
    private int field1562 = 124;

    @OriginalMember(owner = "XOUQUKZW", name = "o", descriptor = "I")
    private int field1563 = 911;

    @OriginalMember(owner = "XOUQUKZW", name = "p", descriptor = "B")
    private byte field1564 = 23;

    @OriginalMember(owner = "XOUQUKZW", name = "q", descriptor = "B")
    private byte field1565 = 13;

    @OriginalMember(owner = "XOUQUKZW", name = "r", descriptor = "I")
    private int field1566 = -483;

    @OriginalMember(owner = "XOUQUKZW", name = "s", descriptor = "B")
    private byte field1567 = 0;

    @OriginalMember(owner = "XOUQUKZW", name = "t", descriptor = "I")
    private int field1568 = 50;

    @OriginalMember(owner = "XOUQUKZW", name = "u", descriptor = "Z")
    private boolean field1569 = true;

    @OriginalMember(owner = "XOUQUKZW", name = "v", descriptor = "Z")
    private boolean field1570 = true;

    @OriginalMember(owner = "XOUQUKZW", name = "w", descriptor = "Z")
    private boolean field1571 = false;

    @OriginalMember(owner = "XOUQUKZW", name = "x", descriptor = "Z")
    private boolean field1572 = false;

    @OriginalMember(owner = "XOUQUKZW", name = "y", descriptor = "I")
    private int field1573 = 6;

    @OriginalMember(owner = "XOUQUKZW", name = "z", descriptor = "Z")
    private boolean field1574 = false;

    @OriginalMember(owner = "XOUQUKZW", name = "A", descriptor = "I")
    private int field1575 = 22876;

    @OriginalMember(owner = "XOUQUKZW", name = "B", descriptor = "Z")
    private boolean field1576 = false;

    @OriginalMember(owner = "XOUQUKZW", name = "C", descriptor = "Z")
    private boolean field1577 = false;

    @OriginalMember(owner = "XOUQUKZW", name = "D", descriptor = "[B")
    public byte[] field1578;

    @OriginalMember(owner = "XOUQUKZW", name = "E", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "XOUQUKZW", name = "G", descriptor = "[I")
    private static int[] field1581 = new int[256];

    @OriginalMember(owner = "XOUQUKZW", name = "H", descriptor = "[I")
    private static final int[] field1582;

    @OriginalMember(owner = "XOUQUKZW", name = "M", descriptor = "LILVDIPQT;")
    private static class31 field1587;

    @OriginalMember(owner = "XOUQUKZW", name = "N", descriptor = "LILVDIPQT;")
    private static class31 field1588;

    @OriginalMember(owner = "XOUQUKZW", name = "O", descriptor = "LILVDIPQT;")
    private static class31 field1589;

    @OriginalMember(owner = "XOUQUKZW", name = "P", descriptor = "[C")
    private static char[] field1590;

    @OriginalMember(owner = "XOUQUKZW", name = "k", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "XOUQUKZW", name = "F", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "XOUQUKZW", name = "J", descriptor = "I")
    private static int field1584;

    @OriginalMember(owner = "XOUQUKZW", name = "K", descriptor = "I")
    private static int field1585;

    @OriginalMember(owner = "XOUQUKZW", name = "L", descriptor = "I")
    private static int field1586;

    @OriginalMember(owner = "XOUQUKZW", name = "I", descriptor = "LLAFREBFM;")
    public class37 field1583;

    @OriginalMember(owner = "XOUQUKZW", name = "Q", descriptor = "Z")
    public static boolean field1591;

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(II)LXOUQUKZW;")
    public static class62 method509(int arg0, int arg1) {
        class31 var2 = field1588;
        synchronized (field1588) {
            class62 var3 = null;
            if (arg1 == 0 && field1584 > 0) {
                field1584--;
                var3 = (class62) field1587.method331();
            } else if (arg1 == 1 && field1585 > 0) {
                field1585--;
                var3 = (class62) field1588.method331();
            } else if (arg1 == 2 && field1586 > 0) {
                field1586--;
                var3 = (class62) field1589.method331();
            }
            if (var3 != null) {
                var3.field1579 = 0;
                return var3;
            }
        }
        int var5 = 37 / arg0;
        class62 var6 = new class62(40898);
        var6.field1579 = 0;
        if (arg1 == 0) {
            var6.field1578 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1578 = new byte[5000];
        } else {
            var6.field1578 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "<init>", descriptor = "(I)V")
    private class62(int arg0) {
        if (arg0 != 40898) {
            this.field1573 = 369;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "<init>", descriptor = "(I[B)V")
    public class62(int arg0, byte[] arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1578 = arg1;
        this.field1579 = 0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "b", descriptor = "(II)V")
    public void method510(int arg0, int arg1) {
        this.field1578[this.field1579++] = (byte) (arg0 + this.field1583.method405());
        if (arg1 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(I)V")
    public void method511(int arg0) {
        this.field1578[this.field1579++] = (byte) arg0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "b", descriptor = "(I)V")
    public void method512(int arg0) {
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        this.field1578[this.field1579++] = (byte) arg0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(IZ)V")
    public void method513(int arg0, boolean arg1) {
        this.field1578[this.field1579++] = (byte) arg0;
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "(I)V")
    public void method514(int arg0) {
        this.field1578[this.field1579++] = (byte) (arg0 >> 16);
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        this.field1578[this.field1579++] = (byte) arg0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "d", descriptor = "(I)V")
    public void method515(int arg0) {
        this.field1578[this.field1579++] = (byte) (arg0 >> 24);
        this.field1578[this.field1579++] = (byte) (arg0 >> 16);
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        this.field1578[this.field1579++] = (byte) arg0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(IB)V")
    public void method516(int arg0, byte arg1) {
        this.field1578[this.field1579++] = (byte) arg0;
        if (arg1 == 7) {
            boolean var3 = false;
            this.field1578[this.field1579++] = (byte) (arg0 >> 8);
            this.field1578[this.field1579++] = (byte) (arg0 >> 16);
            this.field1578[this.field1579++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(JI)V")
    public void method517(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field1569 = !this.field1569;
        }
        this.field1578[this.field1579++] = (byte) (arg0 >> 56);
        this.field1578[this.field1579++] = (byte) (arg0 >> 48);
        this.field1578[this.field1579++] = (byte) (arg0 >> 40);
        this.field1578[this.field1579++] = (byte) (arg0 >> 32);
        this.field1578[this.field1579++] = (byte) (arg0 >> 24);
        this.field1578[this.field1579++] = (byte) (arg0 >> 16);
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        this.field1578[this.field1579++] = (byte) arg0;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method518(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1578, this.field1579);
        this.field1579 += arg0.length();
        this.field1578[this.field1579++] = 10;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(I[BZI)V")
    public void method519(int arg0, byte[] arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
                this.field1578[this.field1579++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "(II)V")
    public void method520(int arg0, int arg1) {
        this.field1578[this.field1579 - arg0 - 1] = (byte) arg0;
        if (arg1 == -31558) {
            ;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "()I")
    public int method521() {
        return this.field1578[this.field1579++] & 0xFF;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "d", descriptor = "()B")
    public byte method522() {
        return this.field1578[this.field1579++];
    }

    @OriginalMember(owner = "XOUQUKZW", name = "e", descriptor = "()I")
    public int method523() {
        this.field1579 += 2;
        return ((this.field1578[this.field1579 - 2] & 0xFF) << 8) + (this.field1578[this.field1579 - 1] & 0xFF);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "f", descriptor = "()I")
    public int method524() {
        this.field1579 += 2;
        int var1 = ((this.field1578[this.field1579 - 2] & 0xFF) << 8) + (this.field1578[this.field1579 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "g", descriptor = "()I")
    public int method525() {
        this.field1579 += 3;
        return (this.field1578[this.field1579 - 1] & 0xFF) + ((this.field1578[this.field1579 - 3] & 0xFF) << 16) + ((this.field1578[this.field1579 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "h", descriptor = "()I")
    public int method526() {
        this.field1579 += 4;
        return (this.field1578[this.field1579 - 1] & 0xFF) + ((this.field1578[this.field1579 - 2] & 0xFF) << 8) + ((this.field1578[this.field1579 - 4] & 0xFF) << 24) + ((this.field1578[this.field1579 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "e", descriptor = "(I)J")
    public long method527(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        long var2 = (long) this.method526() & 0xFFFFFFFFL;
        long var4 = (long) this.method526() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "i", descriptor = "()Ljava/lang/String;")
    public String method528() {
        int var1 = this.field1579;
        while (this.field1578[this.field1579++] != 10) {
        }
        return new String(this.field1578, var1, this.field1579 - var1 - 1);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(B)[B")
    public byte[] method529(byte arg0) {
        if (arg0 != 7) {
            this.field1559 = 327;
        }
        int var2 = this.field1579;
        while (this.field1578[this.field1579++] != 10) {
        }
        byte[] var3 = new byte[this.field1579 - var2 - 1];
        for (int var4 = var2; var4 < this.field1579 - 1; var4++) {
            var3[var4 - var2] = this.field1578[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(II[BB)V")
    public void method530(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 != 2) {
            this.field1558 = -12;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field1578[this.field1579++];
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "f", descriptor = "(I)V")
    public void method531(int arg0) {
        if (arg0 != 0) {
            this.field1559 = -258;
        }
        this.field1580 = this.field1579 * 8;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "d", descriptor = "(II)I")
    public int method532(int arg0, int arg1) {
        int var3 = this.field1580 >> 3;
        int var4 = 8 - (this.field1580 & 0x7);
        int var5 = 0;
        this.field1580 += arg1;
        if (arg0 < 7 || arg0 > 7) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        while (arg1 > var4) {
            var5 += (this.field1578[var3++] & field1582[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (this.field1578[var3] & field1582[var4]) + var5;
        } else {
            var7 = (this.field1578[var3] >> var4 - arg1 & field1582[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "b", descriptor = "(B)V")
    public void method533(byte arg0) {
        this.field1579 = (this.field1580 + 7) / 8;
        if (arg0 != 85) {
            this.field1558 = -201;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "j", descriptor = "()I")
    public int method534() {
        int var1 = this.field1578[this.field1579] & 0xFF;
        return var1 < 128 ? this.method521() - 64 : this.method523() - 49152;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "k", descriptor = "()I")
    public int method535() {
        int var1 = this.field1578[this.field1579] & 0xFF;
        return var1 < 128 ? this.method521() : this.method523() - 32768;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method536(byte arg0, BigInteger arg1, BigInteger arg2) {
        if (arg0 != -29) {
            return;
        }
        int var4 = this.field1579;
        this.field1579 = 0;
        byte[] var5 = new byte[var4];
        this.method530(0, var4, var5, (byte) 2);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg2, arg1);
        byte[] var8 = var7.toByteArray();
        this.field1579 = 0;
        this.method511(var8.length);
        this.method519(var8.length, var8, true, 0);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(ZI)V")
    public void method537(boolean arg0, int arg1) {
        this.field1578[this.field1579++] = (byte) (arg1 + 128);
        if (arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "e", descriptor = "(II)V")
    public void method538(int arg0, int arg1) {
        this.field1578[this.field1579++] = (byte) (128 - arg1);
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "g", descriptor = "(I)I")
    public int method539(int arg0) {
        int var2 = 48 / arg0;
        return this.field1578[this.field1579++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "h", descriptor = "(I)I")
    public int method540(int arg0) {
        if (arg0 <= 0) {
            this.field1561 = 446;
        }
        return -this.field1578[this.field1579++] & 0xFF;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "(B)I")
    public int method541(byte arg0) {
        return this.field1565 == arg0 ? 128 - this.field1578[this.field1579++] & 0xFF : this.field1560;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "i", descriptor = "(I)B")
    public byte method542(int arg0) {
        if (arg0 != 0) {
            this.field1563 = -165;
        }
        return (byte) (this.field1578[this.field1579++] - 128);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "d", descriptor = "(B)B")
    public byte method543(byte arg0) {
        if (arg0 != 87) {
            throw new NullPointerException();
        }
        return (byte) -this.field1578[this.field1579++];
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(Z)B")
    public byte method544(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1578[this.field1579++]);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "b", descriptor = "(IZ)V")
    public void method545(int arg0, boolean arg1) {
        this.field1578[this.field1579++] = (byte) arg0;
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field1573 = -291;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "f", descriptor = "(II)V")
    public void method546(int arg0, int arg1) {
        this.field1578[this.field1579++] = (byte) (arg1 >> 8);
        this.field1578[this.field1579++] = (byte) (arg1 + 128);
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "(IZ)V")
    public void method547(int arg0, boolean arg1) {
        this.field1578[this.field1579++] = (byte) (arg0 + 128);
        this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "b", descriptor = "(Z)I")
    public int method548(boolean arg0) {
        if (arg0) {
            this.field1563 = 366;
        }
        this.field1579 += 2;
        return ((this.field1578[this.field1579 - 1] & 0xFF) << 8) + (this.field1578[this.field1579 - 2] & 0xFF);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "j", descriptor = "(I)I")
    public int method549(int arg0) {
        if (arg0 == 0) {
            this.field1579 += 2;
            return ((this.field1578[this.field1579 - 2] & 0xFF) << 8) + (this.field1578[this.field1579 - 1] - 128 & 0xFF);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "k", descriptor = "(I)I")
    public int method550(int arg0) {
        this.field1579 += 2;
        return arg0 >= 0 ? this.field1558 : ((this.field1578[this.field1579 - 1] & 0xFF) << 8) + (this.field1578[this.field1579 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "e", descriptor = "(B)I")
    public int method551(byte arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1579 += 2;
        int var3 = ((this.field1578[this.field1579 - 2] & 0xFF) << 8) + (this.field1578[this.field1579 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "f", descriptor = "(B)I")
    public int method552(byte arg0) {
        this.field1579 += 2;
        int var2 = ((this.field1578[this.field1579 - 1] & 0xFF) << 8) + (this.field1578[this.field1579 - 2] - 128 & 0xFF);
        if (arg0 != 54) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "XOUQUKZW", name = "d", descriptor = "(IZ)V")
    public void method553(int arg0, boolean arg1) {
        this.field1578[this.field1579++] = (byte) (arg0 >> 16);
        this.field1578[this.field1579++] = (byte) (arg0 >> 24);
        this.field1578[this.field1579++] = (byte) arg0;
        if (arg1) {
            this.field1578[this.field1579++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "l", descriptor = "(I)I")
    public int method554(int arg0) {
        this.field1579 += 4;
        int var2 = 15 / arg0;
        return (this.field1578[this.field1579 - 4] & 0xFF) + ((this.field1578[this.field1579 - 3] & 0xFF) << 8) + ((this.field1578[this.field1579 - 1] & 0xFF) << 24) + ((this.field1578[this.field1579 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "c", descriptor = "(Z)I")
    public int method555(boolean arg0) {
        if (arg0) {
            this.field1579 += 4;
            return (this.field1578[this.field1579 - 3] & 0xFF) + ((this.field1578[this.field1579 - 4] & 0xFF) << 8) + ((this.field1578[this.field1579 - 2] & 0xFF) << 24) + ((this.field1578[this.field1579 - 1] & 0xFF) << 16);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "m", descriptor = "(I)I")
    public int method556(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1579 += 4;
        return (this.field1578[this.field1579 - 2] & 0xFF) + ((this.field1578[this.field1579 - 1] & 0xFF) << 8) + ((this.field1578[this.field1579 - 3] & 0xFF) << 24) + ((this.field1578[this.field1579 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(IIZ[B)V")
    public void method557(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg2) {
            this.field1569 = !this.field1569;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            this.field1578[this.field1579++] = (byte) (arg3[var5] + 128);
        }
    }

    @OriginalMember(owner = "XOUQUKZW", name = "a", descriptor = "(II[BZ)V")
    public void method558(int arg0, int arg1, byte[] arg2, boolean arg3) {
        if (arg3) {
            this.field1570 = !this.field1570;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg1; var5--) {
            arg2[var5] = (byte) (this.field1578[this.field1579++] - 128);
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
            field1581[var0] = var1;
        }
        field1582 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1587 = new class31(-33684);
        field1588 = new class31(-33684);
        field1589 = new class31(-33684);
        field1590 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
