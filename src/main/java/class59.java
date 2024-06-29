import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TKPFKOXP")
public class class59 extends class33 {

    @OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "I")
    private int field1574 = 8;

    @OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "I")
    private int field1575 = -286;

    @OriginalMember(owner = "client!TKPFKOXP", name = "k", descriptor = "I")
    private int field1576 = 924;

    @OriginalMember(owner = "client!TKPFKOXP", name = "l", descriptor = "I")
    private int field1577 = 716;

    @OriginalMember(owner = "client!TKPFKOXP", name = "m", descriptor = "B")
    private byte field1578 = 1;

    @OriginalMember(owner = "client!TKPFKOXP", name = "n", descriptor = "Z")
    private boolean field1579 = false;

    @OriginalMember(owner = "client!TKPFKOXP", name = "p", descriptor = "I")
    private int field1581 = -41034;

    @OriginalMember(owner = "client!TKPFKOXP", name = "q", descriptor = "B")
    private byte field1582 = 0;

    @OriginalMember(owner = "client!TKPFKOXP", name = "r", descriptor = "B")
    private byte field1583 = 2;

    @OriginalMember(owner = "client!TKPFKOXP", name = "s", descriptor = "Z")
    private boolean field1584 = true;

    @OriginalMember(owner = "client!TKPFKOXP", name = "t", descriptor = "Z")
    private boolean field1585 = true;

    @OriginalMember(owner = "client!TKPFKOXP", name = "u", descriptor = "Z")
    private boolean field1586 = false;

    @OriginalMember(owner = "client!TKPFKOXP", name = "v", descriptor = "Z")
    private boolean field1587 = false;

    @OriginalMember(owner = "client!TKPFKOXP", name = "w", descriptor = "[B")
    public byte[] field1588;

    @OriginalMember(owner = "client!TKPFKOXP", name = "x", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!TKPFKOXP", name = "o", descriptor = "I")
    private static int field1580 = -137;

    @OriginalMember(owner = "client!TKPFKOXP", name = "z", descriptor = "[I")
    private static int[] field1591 = new int[256];

    @OriginalMember(owner = "client!TKPFKOXP", name = "A", descriptor = "[I")
    private static final int[] field1592;

    @OriginalMember(owner = "client!TKPFKOXP", name = "F", descriptor = "LSXQMCHPP;")
    private static class56 field1597;

    @OriginalMember(owner = "client!TKPFKOXP", name = "G", descriptor = "LSXQMCHPP;")
    private static class56 field1598;

    @OriginalMember(owner = "client!TKPFKOXP", name = "H", descriptor = "LSXQMCHPP;")
    private static class56 field1599;

    @OriginalMember(owner = "client!TKPFKOXP", name = "I", descriptor = "[C")
    private static char[] field1600;

    @OriginalMember(owner = "client!TKPFKOXP", name = "y", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!TKPFKOXP", name = "C", descriptor = "I")
    private static int field1594;

    @OriginalMember(owner = "client!TKPFKOXP", name = "D", descriptor = "I")
    private static int field1595;

    @OriginalMember(owner = "client!TKPFKOXP", name = "E", descriptor = "I")
    private static int field1596;

    @OriginalMember(owner = "client!TKPFKOXP", name = "B", descriptor = "LFKXPJREN;")
    public class19 field1593;

    @OriginalMember(owner = "client!TKPFKOXP", name = "J", descriptor = "Z")
    public static boolean field1601;

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(II)LTKPFKOXP;")
    public static class59 method517(int arg0, int arg1) {
        class56 var2 = field1598;
        synchronized (field1598) {
            class59 var3 = null;
            if (arg0 == 0 && field1594 > 0) {
                field1594--;
                var3 = (class59) field1597.method508();
            } else if (arg0 == 1 && field1595 > 0) {
                field1595--;
                var3 = (class59) field1598.method508();
            } else if (arg0 == 2 && field1596 > 0) {
                field1596--;
                var3 = (class59) field1599.method508();
            }
            if (var3 != null) {
                var3.field1589 = 0;
                return var3;
            }
        }
        class59 var5 = new class59(8);
        if (arg1 != 28934) {
            field1580 = -140;
        }
        var5.field1589 = 0;
        if (arg0 == 0) {
            var5.field1588 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1588 = new byte[5000];
        } else {
            var5.field1588 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "<init>", descriptor = "(I)V")
    private class59(int arg0) {
        if (arg0 < this.field1574 || arg0 > this.field1574) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "<init>", descriptor = "(I[B)V")
    public class59(int arg0, byte[] arg1) {
        int var3 = 14 / arg0;
        this.field1588 = arg1;
        this.field1589 = 0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(IZ)V")
    public void method518(int arg0, boolean arg1) {
        if (arg1) {
            this.field1588[this.field1589++] = (byte) (arg0 + this.field1593.method201());
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(I)V")
    public void method519(int arg0) {
        this.field1588[this.field1589++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(I)V")
    public void method520(int arg0) {
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        this.field1588[this.field1589++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(II)V")
    public void method521(int arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) arg0;
        if (arg1 > 0) {
            this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(I)V")
    public void method522(int arg0) {
        this.field1588[this.field1589++] = (byte) (arg0 >> 16);
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        this.field1588[this.field1589++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(I)V")
    public void method523(int arg0) {
        this.field1588[this.field1589++] = (byte) (arg0 >> 24);
        this.field1588[this.field1589++] = (byte) (arg0 >> 16);
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        this.field1588[this.field1589++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(IB)V")
    public void method524(int arg0, byte arg1) {
        this.field1588[this.field1589++] = (byte) arg0;
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        if (arg1 == 1) {
            this.field1588[this.field1589++] = (byte) (arg0 >> 16);
            this.field1588[this.field1589++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(JI)V")
    public void method525(long arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1586 = !this.field1586;
        }
        this.field1588[this.field1589++] = (byte) (arg0 >> 56);
        this.field1588[this.field1589++] = (byte) (arg0 >> 48);
        this.field1588[this.field1589++] = (byte) (arg0 >> 40);
        this.field1588[this.field1589++] = (byte) (arg0 >> 32);
        this.field1588[this.field1589++] = (byte) (arg0 >> 24);
        this.field1588[this.field1589++] = (byte) (arg0 >> 16);
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        this.field1588[this.field1589++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method526(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1588, this.field1589);
        this.field1589 += arg0.length();
        this.field1588[this.field1589++] = 10;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(I[BII)V")
    public void method527(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 31 / arg3;
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            this.field1588[this.field1589++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(II)V")
    public void method528(int arg0, int arg1) {
        this.field1588[this.field1589 - arg0 - 1] = (byte) arg0;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "()I")
    public int method529() {
        return this.field1588[this.field1589++] & 0xFF;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "()B")
    public byte method530() {
        return this.field1588[this.field1589++];
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "()I")
    public int method531() {
        this.field1589 += 2;
        return ((this.field1588[this.field1589 - 2] & 0xFF) << 8) + (this.field1588[this.field1589 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "()I")
    public int method532() {
        this.field1589 += 2;
        int var1 = ((this.field1588[this.field1589 - 2] & 0xFF) << 8) + (this.field1588[this.field1589 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "()I")
    public int method533() {
        this.field1589 += 3;
        return (this.field1588[this.field1589 - 1] & 0xFF) + ((this.field1588[this.field1589 - 3] & 0xFF) << 16) + ((this.field1588[this.field1589 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "()I")
    public int method534() {
        this.field1589 += 4;
        return (this.field1588[this.field1589 - 1] & 0xFF) + ((this.field1588[this.field1589 - 2] & 0xFF) << 8) + ((this.field1588[this.field1589 - 4] & 0xFF) << 24) + ((this.field1588[this.field1589 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(B)J")
    public long method535(byte arg0) {
        long var2 = (long) this.method534() & 0xFFFFFFFFL;
        if (arg0 != 37) {
            throw new NullPointerException();
        }
        long var4 = (long) this.method534() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "()Ljava/lang/String;")
    public String method536() {
        int var1 = this.field1589;
        while (this.field1588[this.field1589++] != 10) {
        }
        return new String(this.field1588, var1, this.field1589 - var1 - 1);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(I)[B")
    public byte[] method537(int arg0) {
        int var2 = this.field1589;
        while (this.field1588[this.field1589++] != 10) {
        }
        byte[] var3 = new byte[this.field1589 - var2 - 1];
        if (arg0 != -18933) {
            this.field1585 = !this.field1585;
        }
        for (int var4 = var2; var4 < this.field1589 - 1; var4++) {
            var3[var4 - var2] = this.field1588[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "([BIII)V")
    public void method538(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -16823) {
            this.field1586 = !this.field1586;
        }
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            arg0[var5] = this.field1588[this.field1589++];
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(B)V")
    public void method539(byte arg0) {
        this.field1590 = this.field1589 * 8;
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1586 = !this.field1586;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(IZ)I")
    public int method540(int arg0, boolean arg1) {
        int var3 = this.field1590 >> 3;
        int var4 = 8 - (this.field1590 & 0x7);
        int var5 = 0;
        this.field1590 += arg0;
        if (!arg1) {
            this.field1574 = -123;
        }
        while (arg0 > var4) {
            var5 += (this.field1588[var3++] & field1592[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1588[var3] & field1592[var4]) + var5;
        } else {
            var6 = (this.field1588[var3] >> var4 - arg0 & field1592[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(I)V")
    public void method541(int arg0) {
        this.field1589 = (this.field1590 + 7) / 8;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "()I")
    public int method542() {
        int var1 = this.field1588[this.field1589] & 0xFF;
        return var1 < 128 ? this.method529() - 64 : this.method531() - 49152;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "k", descriptor = "()I")
    public int method543() {
        int var1 = this.field1588[this.field1589] & 0xFF;
        return var1 < 128 ? this.method529() : this.method531() - 32768;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method544(byte arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1589;
        this.field1589 = 0;
        byte[] var5 = new byte[var4];
        this.method538(var5, 0, var4, -16823);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1589 = 0;
        this.method519(var8.length);
        this.method527(0, var8, var8.length, this.field1576);
        if (arg0 == 2) {
            boolean var9 = false;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(BI)V")
    public void method545(byte arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) -arg1;
        if (arg0 == -53) {
            ;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(II)V")
    public void method546(int arg0, int arg1) {
        if (arg1 >= 4 && arg1 <= 4) {
            this.field1588[this.field1589++] = (byte) (128 - arg0);
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(B)I")
    public int method547(byte arg0) {
        if (arg0 != -24) {
            this.field1585 = !this.field1585;
        }
        return this.field1588[this.field1589++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(I)I")
    public int method548(int arg0) {
        int var2 = 19 / arg0;
        return -this.field1588[this.field1589++] & 0xFF;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "(I)I")
    public int method549(int arg0) {
        if (arg0 != 0) {
            this.field1585 = !this.field1585;
        }
        return 128 - this.field1588[this.field1589++] & 0xFF;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(B)B")
    public byte method550(byte arg0) {
        if (arg0 != 84) {
            this.field1577 = -326;
        }
        return (byte) (this.field1588[this.field1589++] - 128);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(B)B")
    public byte method551(byte arg0) {
        if (arg0 != 23) {
            this.field1584 = !this.field1584;
        }
        return (byte) -this.field1588[this.field1589++];
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(B)B")
    public byte method552(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1588[this.field1589++]);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(II)V")
    public void method553(int arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) arg0;
        this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        int var3 = 17 / arg1;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(BI)V")
    public void method554(byte arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) (arg1 >> 8);
        this.field1588[this.field1589++] = (byte) (arg1 + 128);
        if (arg0 != 18) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(II)V")
    public void method555(int arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) (arg0 + 128);
        if (arg1 == 5) {
            this.field1588[this.field1589++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(Z)I")
    public int method556(boolean arg0) {
        if (arg0) {
            return 4;
        } else {
            this.field1589 += 2;
            return ((this.field1588[this.field1589 - 1] & 0xFF) << 8) + (this.field1588[this.field1589 - 2] & 0xFF);
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(Z)I")
    public int method557(boolean arg0) {
        this.field1589 += 2;
        if (arg0) {
            this.field1586 = !this.field1586;
        }
        return ((this.field1588[this.field1589 - 2] & 0xFF) << 8) + (this.field1588[this.field1589 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(B)I")
    public int method558(byte arg0) {
        if (arg0 != 74) {
            this.field1584 = !this.field1584;
        }
        this.field1589 += 2;
        return ((this.field1588[this.field1589 - 1] & 0xFF) << 8) + (this.field1588[this.field1589 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(Z)I")
    public int method559(boolean arg0) {
        if (!arg0) {
            this.field1581 = -395;
        }
        this.field1589 += 2;
        int var2 = ((this.field1588[this.field1589 - 1] & 0xFF) << 8) + (this.field1588[this.field1589 - 2] & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(Z)I")
    public int method560(boolean arg0) {
        this.field1589 += 2;
        int var2 = ((this.field1588[this.field1589 - 2] & 0xFF) << 8) + (this.field1588[this.field1589 - 1] - 128 & 0xFF);
        if (!arg0) {
            this.field1577 = -486;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "(I)I")
    public int method561(int arg0) {
        if (arg0 != 0) {
            return 2;
        }
        this.field1589 += 2;
        int var2 = ((this.field1588[this.field1589 - 1] & 0xFF) << 8) + (this.field1588[this.field1589 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(Z)I")
    public int method562(boolean arg0) {
        this.field1589 += 3;
        if (arg0) {
            field1580 = -115;
        }
        return (this.field1588[this.field1589 - 1] & 0xFF) + ((this.field1588[this.field1589 - 2] & 0xFF) << 16) + ((this.field1588[this.field1589 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(II)V")
    public void method563(int arg0, int arg1) {
        this.field1588[this.field1589++] = (byte) (arg1 >> 16);
        this.field1588[this.field1589++] = (byte) (arg1 >> 24);
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1588[this.field1589++] = (byte) arg1;
        this.field1588[this.field1589++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "(I)I")
    public int method564(int arg0) {
        if (arg0 == 0) {
            this.field1589 += 4;
            return (this.field1588[this.field1589 - 4] & 0xFF) + ((this.field1588[this.field1589 - 3] & 0xFF) << 8) + ((this.field1588[this.field1589 - 1] & 0xFF) << 24) + ((this.field1588[this.field1589 - 2] & 0xFF) << 16);
        } else {
            return this.field1581;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(Z)I")
    public int method565(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1589 += 4;
        return (this.field1588[this.field1589 - 3] & 0xFF) + ((this.field1588[this.field1589 - 4] & 0xFF) << 8) + ((this.field1588[this.field1589 - 2] & 0xFF) << 24) + ((this.field1588[this.field1589 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "(B)I")
    public int method566(byte arg0) {
        if (arg0 == 112) {
            this.field1589 += 4;
            return (this.field1588[this.field1589 - 2] & 0xFF) + ((this.field1588[this.field1589 - 1] & 0xFF) << 8) + ((this.field1588[this.field1589 - 3] & 0xFF) << 24) + ((this.field1588[this.field1589 - 4] & 0xFF) << 16);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(II[BI)V")
    public void method567(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg1 + arg3 - 1; var6 >= arg1; var6--) {
            arg2[var6] = this.field1588[this.field1589++];
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
            field1591[var0] = var1;
        }
        field1592 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1597 = new class56(5);
        field1598 = new class56(5);
        field1599 = new class56(5);
        field1600 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
