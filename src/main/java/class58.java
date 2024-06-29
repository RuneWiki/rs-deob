import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WBEWPIXO")
public class class58 extends class42 {

    @OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "I")
    private int field1601 = 1;

    @OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "I")
    private int field1602 = -845;

    @OriginalMember(owner = "client!WBEWPIXO", name = "l", descriptor = "I")
    private int field1604 = -944;

    @OriginalMember(owner = "client!WBEWPIXO", name = "m", descriptor = "I")
    private int field1605 = 42;

    @OriginalMember(owner = "client!WBEWPIXO", name = "n", descriptor = "Z")
    private boolean field1606 = false;

    @OriginalMember(owner = "client!WBEWPIXO", name = "o", descriptor = "B")
    private byte field1607 = 0;

    @OriginalMember(owner = "client!WBEWPIXO", name = "p", descriptor = "B")
    private byte field1608 = -33;

    @OriginalMember(owner = "client!WBEWPIXO", name = "q", descriptor = "B")
    private byte field1609 = -35;

    @OriginalMember(owner = "client!WBEWPIXO", name = "r", descriptor = "Z")
    private boolean field1610 = false;

    @OriginalMember(owner = "client!WBEWPIXO", name = "s", descriptor = "Z")
    private boolean field1611 = false;

    @OriginalMember(owner = "client!WBEWPIXO", name = "t", descriptor = "Z")
    private boolean field1612 = true;

    @OriginalMember(owner = "client!WBEWPIXO", name = "v", descriptor = "[B")
    public byte[] field1614;

    @OriginalMember(owner = "client!WBEWPIXO", name = "w", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!WBEWPIXO", name = "u", descriptor = "I")
    private static int field1613 = 8;

    @OriginalMember(owner = "client!WBEWPIXO", name = "y", descriptor = "[I")
    private static int[] field1617 = new int[256];

    @OriginalMember(owner = "client!WBEWPIXO", name = "z", descriptor = "[I")
    private static final int[] field1618;

    @OriginalMember(owner = "client!WBEWPIXO", name = "E", descriptor = "LNYZQPNXB;")
    private static class37 field1623;

    @OriginalMember(owner = "client!WBEWPIXO", name = "F", descriptor = "LNYZQPNXB;")
    private static class37 field1624;

    @OriginalMember(owner = "client!WBEWPIXO", name = "G", descriptor = "LNYZQPNXB;")
    private static class37 field1625;

    @OriginalMember(owner = "client!WBEWPIXO", name = "H", descriptor = "[C")
    private static char[] field1626;

    @OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!WBEWPIXO", name = "x", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!WBEWPIXO", name = "B", descriptor = "I")
    private static int field1620;

    @OriginalMember(owner = "client!WBEWPIXO", name = "C", descriptor = "I")
    private static int field1621;

    @OriginalMember(owner = "client!WBEWPIXO", name = "D", descriptor = "I")
    private static int field1622;

    @OriginalMember(owner = "client!WBEWPIXO", name = "A", descriptor = "LXAGUDWSZ;")
    public class61 field1619;

    @OriginalMember(owner = "client!WBEWPIXO", name = "I", descriptor = "Z")
    public static boolean field1627;

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(II)LWBEWPIXO;")
    public static class58 method503(int arg0, int arg1) {
        class37 var2 = field1624;
        synchronized (field1624) {
            class58 var3 = null;
            if (arg0 == 0 && field1620 > 0) {
                field1620--;
                var3 = (class58) field1623.method339();
            } else if (arg0 == 1 && field1621 > 0) {
                field1621--;
                var3 = (class58) field1624.method339();
            } else if (arg0 == 2 && field1622 > 0) {
                field1622--;
                var3 = (class58) field1625.method339();
            }
            if (var3 != null) {
                var3.field1615 = 0;
                return var3;
            }
        }
        class58 var5 = new class58(46986);
        var5.field1615 = 0;
        if (arg1 != 8) {
            field1613 = 355;
        }
        if (arg0 == 0) {
            var5.field1614 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1614 = new byte[5000];
        } else {
            var5.field1614 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "<init>", descriptor = "(I)V")
    private class58(int arg0) {
        if (arg0 != 46986) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "<init>", descriptor = "(B[B)V")
    public class58(byte arg0, byte[] arg1) {
        this.field1614 = arg1;
        if (arg0 != -115) {
            this.field1611 = !this.field1611;
        }
        this.field1615 = 0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(II)V")
    public void method504(int arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) (arg0 + this.field1619.method558());
        if (arg1 < this.field1601 || arg1 > this.field1601) {
            ;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(I)V")
    public void method505(int arg0) {
        this.field1614[this.field1615++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(I)V")
    public void method506(int arg0) {
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        this.field1614[this.field1615++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(II)V")
    public void method507(int arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) arg0;
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        if (arg1 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(I)V")
    public void method508(int arg0) {
        this.field1614[this.field1615++] = (byte) (arg0 >> 16);
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        this.field1614[this.field1615++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(I)V")
    public void method509(int arg0) {
        this.field1614[this.field1615++] = (byte) (arg0 >> 24);
        this.field1614[this.field1615++] = (byte) (arg0 >> 16);
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        this.field1614[this.field1615++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(II)V")
    public void method510(int arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) arg0;
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        this.field1614[this.field1615++] = (byte) (arg0 >> 16);
        if (arg1 < 0) {
            this.field1614[this.field1615++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(JI)V")
    public void method511(long arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) (arg0 >> 56);
        this.field1614[this.field1615++] = (byte) (arg0 >> 48);
        this.field1614[this.field1615++] = (byte) (arg0 >> 40);
        if (arg1 >= 0) {
            return;
        }
        this.field1614[this.field1615++] = (byte) (arg0 >> 32);
        this.field1614[this.field1615++] = (byte) (arg0 >> 24);
        this.field1614[this.field1615++] = (byte) (arg0 >> 16);
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        this.field1614[this.field1615++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method512(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1614, this.field1615);
        this.field1615 += arg0.length();
        this.field1614[this.field1615++] = 10;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(III[B)V")
    public void method513(int arg0, int arg1, int arg2, byte[] arg3) {
        while (arg0 >= 0) {
            this.field1610 = !this.field1610;
        }
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            this.field1614[this.field1615++] = arg3[var5];
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(II)V")
    public void method514(int arg0, int arg1) {
        int var3 = 32 / arg1;
        this.field1614[this.field1615 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "()I")
    public int method515() {
        return this.field1614[this.field1615++] & 0xFF;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "()B")
    public byte method516() {
        return this.field1614[this.field1615++];
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "()I")
    public int method517() {
        this.field1615 += 2;
        return ((this.field1614[this.field1615 - 2] & 0xFF) << 8) + (this.field1614[this.field1615 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "()I")
    public int method518() {
        this.field1615 += 2;
        int var1 = ((this.field1614[this.field1615 - 2] & 0xFF) << 8) + (this.field1614[this.field1615 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "()I")
    public int method519() {
        this.field1615 += 3;
        return (this.field1614[this.field1615 - 1] & 0xFF) + ((this.field1614[this.field1615 - 3] & 0xFF) << 16) + ((this.field1614[this.field1615 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "h", descriptor = "()I")
    public int method520() {
        this.field1615 += 4;
        return (this.field1614[this.field1615 - 1] & 0xFF) + ((this.field1614[this.field1615 - 2] & 0xFF) << 8) + ((this.field1614[this.field1615 - 4] & 0xFF) << 24) + ((this.field1614[this.field1615 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(I)J")
    public long method521(int arg0) {
        long var2 = (long) this.method520() & 0xFFFFFFFFL;
        long var4 = (long) this.method520() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method522() {
        int var1 = this.field1615;
        while (this.field1614[this.field1615++] != 10) {
        }
        return new String(this.field1614, var1, this.field1615 - var1 - 1);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(I)[B")
    public byte[] method523(int arg0) {
        int var2 = this.field1615;
        if (arg0 != 37643) {
            this.field1602 = -331;
        }
        while (this.field1614[this.field1615++] != 10) {
        }
        byte[] var3 = new byte[this.field1615 - var2 - 1];
        for (int var4 = var2; var4 < this.field1615 - 1; var4++) {
            var3[var4 - var2] = this.field1614[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(III[B)V")
    public void method524(int arg0, int arg1, int arg2, byte[] arg3) {
        while (arg1 >= 0) {
            this.field1611 = !this.field1611;
        }
        for (int var5 = arg0; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field1614[this.field1615++];
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "(I)V")
    public void method525(int arg0) {
        int var2 = 55 / arg0;
        this.field1616 = this.field1615 * 8;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(ZI)I")
    public int method526(boolean arg0, int arg1) {
        int var3 = this.field1616 >> 3;
        int var4 = 8 - (this.field1616 & 0x7);
        int var5 = 0;
        this.field1616 += arg1;
        if (!arg0) {
            return this.field1601;
        }
        while (arg1 > var4) {
            var5 += (this.field1614[var3++] & field1618[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1614[var3] & field1618[var4]) + var5;
        } else {
            var6 = (this.field1614[var3] >> var4 - arg1 & field1618[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(B)V")
    public void method527(byte arg0) {
        this.field1615 = (this.field1616 + 7) / 8;
        if (arg0 != 5) {
            field1613 = -335;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "()I")
    public int method528() {
        int var1 = this.field1614[this.field1615] & 0xFF;
        return var1 < 128 ? this.method515() - 64 : this.method517() - 49152;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "()I")
    public int method529() {
        int var1 = this.field1614[this.field1615] & 0xFF;
        return var1 < 128 ? this.method515() : this.method517() - 32768;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
    public void method530(BigInteger arg0, boolean arg1, BigInteger arg2) {
        int var4 = this.field1615;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1615 = 0;
        byte[] var6 = new byte[var4];
        this.method524(0, -605, var4, var6);
        BigInteger var7 = new BigInteger(var6);
        BigInteger var8 = var7.modPow(arg0, arg2);
        byte[] var9 = var8.toByteArray();
        this.field1615 = 0;
        this.method505(var9.length);
        this.method513(-238, 0, var9.length, var9);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(II)V")
    public void method531(int arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) -arg0;
        if (arg1 != 7) {
            this.field1606 = !this.field1606;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Z)I")
    public int method532(boolean arg0) {
        if (!arg0) {
            this.field1611 = !this.field1611;
        }
        return this.field1614[this.field1615++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "h", descriptor = "(I)I")
    public int method533(int arg0) {
        return arg0 == 18094 ? -this.field1614[this.field1615++] & 0xFF : 2;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(Z)I")
    public int method534(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return 128 - this.field1614[this.field1615++] & 0xFF;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "(I)B")
    public byte method535(int arg0) {
        if (arg0 != 0) {
            this.field1612 = !this.field1612;
        }
        return (byte) (this.field1614[this.field1615++] - 128);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(B)B")
    public byte method536(byte arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        return (byte) -this.field1614[this.field1615++];
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(Z)B")
    public byte method537(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1614[this.field1615++]);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(IB)V")
    public void method538(int arg0, byte arg1) {
        this.field1614[this.field1615++] = (byte) arg0;
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        if (this.field1607 == arg1) {
            boolean var3 = false;
        } else {
            this.field1602 = -3;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "(II)V")
    public void method539(int arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) (arg0 >> 8);
        if (arg1 != 6573) {
            this.field1605 = 387;
        }
        this.field1614[this.field1615++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(BI)V")
    public void method540(byte arg0, int arg1) {
        this.field1614[this.field1615++] = (byte) (arg1 + 128);
        this.field1614[this.field1615++] = (byte) (arg1 >> 8);
        if (arg0 == -82) {
            ;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "(I)I")
    public int method541(int arg0) {
        if (arg0 == 35378) {
            this.field1615 += 2;
            return ((this.field1614[this.field1615 - 1] & 0xFF) << 8) + (this.field1614[this.field1615 - 2] & 0xFF);
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "(I)I")
    public int method542(int arg0) {
        if (arg0 != 0) {
            this.field1603 = 351;
        }
        this.field1615 += 2;
        return ((this.field1614[this.field1615 - 2] & 0xFF) << 8) + (this.field1614[this.field1615 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(Z)I")
    public int method543(boolean arg0) {
        if (arg0) {
            this.field1604 = -228;
        }
        this.field1615 += 2;
        return ((this.field1614[this.field1615 - 1] & 0xFF) << 8) + (this.field1614[this.field1615 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "l", descriptor = "(I)I")
    public int method544(int arg0) {
        int var2 = 78 / arg0;
        this.field1615 += 2;
        int var3 = ((this.field1614[this.field1615 - 1] & 0xFF) << 8) + (this.field1614[this.field1615 - 2] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(Z)I")
    public int method545(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1615 += 2;
        int var3 = ((this.field1614[this.field1615 - 2] & 0xFF) << 8) + (this.field1614[this.field1615 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(Z)I")
    public int method546(boolean arg0) {
        this.field1615 += 2;
        if (arg0) {
            return this.field1604;
        }
        int var2 = ((this.field1614[this.field1615 - 1] & 0xFF) << 8) + (this.field1614[this.field1615 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(BI)V")
    public void method547(byte arg0, int arg1) {
        if (arg0 != 7) {
            this.field1610 = !this.field1610;
        }
        this.field1614[this.field1615++] = (byte) (arg1 >> 8);
        this.field1614[this.field1615++] = (byte) arg1;
        this.field1614[this.field1615++] = (byte) (arg1 >> 24);
        this.field1614[this.field1615++] = (byte) (arg1 >> 16);
        if (class7.field142) {
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(B)I")
    public int method548(byte arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1615 += 4;
        return (this.field1614[this.field1615 - 4] & 0xFF) + ((this.field1614[this.field1615 - 3] & 0xFF) << 8) + ((this.field1614[this.field1615 - 1] & 0xFF) << 24) + ((this.field1614[this.field1615 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "m", descriptor = "(I)I")
    public int method549(int arg0) {
        if (arg0 == 0) {
            this.field1615 += 4;
            return (this.field1614[this.field1615 - 3] & 0xFF) + ((this.field1614[this.field1615 - 4] & 0xFF) << 8) + ((this.field1614[this.field1615 - 2] & 0xFF) << 24) + ((this.field1614[this.field1615 - 1] & 0xFF) << 16);
        } else {
            return this.field1603;
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "n", descriptor = "(I)I")
    public int method550(int arg0) {
        if (arg0 != 16014) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1615 += 4;
        return (this.field1614[this.field1615 - 2] & 0xFF) + ((this.field1614[this.field1615 - 1] & 0xFF) << 8) + ((this.field1614[this.field1615 - 3] & 0xFF) << 24) + ((this.field1614[this.field1615 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "([BIII)V")
    public void method551(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field1606 = !this.field1606;
        }
        for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
            this.field1614[this.field1615++] = (byte) (arg0[var5] + 128);
        }
    }

    @OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(II[BI)V")
    public void method552(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 <= 0) {
            this.field1603 = -93;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
            arg2[var5] = this.field1614[this.field1615++];
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
            field1617[var0] = var1;
        }
        field1618 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1623 = new class37(2);
        field1624 = new class37(2);
        field1625 = new class37(2);
        field1626 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
