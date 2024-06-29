import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WNCFPLWV")
public class class63 extends class36 {

    @OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "I")
    private int field1556 = -8256;

    @OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "B")
    private byte field1557 = 12;

    @OriginalMember(owner = "client!WNCFPLWV", name = "l", descriptor = "B")
    private byte field1558 = 96;

    @OriginalMember(owner = "client!WNCFPLWV", name = "m", descriptor = "I")
    private int field1559 = 8;

    @OriginalMember(owner = "client!WNCFPLWV", name = "n", descriptor = "B")
    private byte field1560 = 24;

    @OriginalMember(owner = "client!WNCFPLWV", name = "o", descriptor = "I")
    private int field1561 = 8;

    @OriginalMember(owner = "client!WNCFPLWV", name = "p", descriptor = "I")
    private int field1562 = 673;

    @OriginalMember(owner = "client!WNCFPLWV", name = "r", descriptor = "I")
    private int field1564 = 5;

    @OriginalMember(owner = "client!WNCFPLWV", name = "s", descriptor = "Z")
    private boolean field1565 = true;

    @OriginalMember(owner = "client!WNCFPLWV", name = "u", descriptor = "Z")
    private boolean field1567 = true;

    @OriginalMember(owner = "client!WNCFPLWV", name = "v", descriptor = "Z")
    private boolean field1568 = false;

    @OriginalMember(owner = "client!WNCFPLWV", name = "w", descriptor = "Z")
    private boolean field1569 = true;

    @OriginalMember(owner = "client!WNCFPLWV", name = "x", descriptor = "[B")
    public byte[] field1570;

    @OriginalMember(owner = "client!WNCFPLWV", name = "y", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!WNCFPLWV", name = "t", descriptor = "B")
    private static byte field1566 = -126;

    @OriginalMember(owner = "client!WNCFPLWV", name = "A", descriptor = "[I")
    private static int[] field1573 = new int[256];

    @OriginalMember(owner = "client!WNCFPLWV", name = "B", descriptor = "[I")
    private static final int[] field1574;

    @OriginalMember(owner = "client!WNCFPLWV", name = "G", descriptor = "LWAPMJSJO;")
    private static class61 field1579;

    @OriginalMember(owner = "client!WNCFPLWV", name = "H", descriptor = "LWAPMJSJO;")
    private static class61 field1580;

    @OriginalMember(owner = "client!WNCFPLWV", name = "I", descriptor = "LWAPMJSJO;")
    private static class61 field1581;

    @OriginalMember(owner = "client!WNCFPLWV", name = "J", descriptor = "[C")
    private static char[] field1582;

    @OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "I")
    private static int field1555;

    @OriginalMember(owner = "client!WNCFPLWV", name = "z", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!WNCFPLWV", name = "D", descriptor = "I")
    private static int field1576;

    @OriginalMember(owner = "client!WNCFPLWV", name = "E", descriptor = "I")
    private static int field1577;

    @OriginalMember(owner = "client!WNCFPLWV", name = "F", descriptor = "I")
    private static int field1578;

    @OriginalMember(owner = "client!WNCFPLWV", name = "C", descriptor = "LKDQJDBED;")
    public class29 field1575;

    @OriginalMember(owner = "client!WNCFPLWV", name = "q", descriptor = "Z")
    private static boolean field1563;

    @OriginalMember(owner = "client!WNCFPLWV", name = "K", descriptor = "Z")
    public static boolean field1583;

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(II)LWNCFPLWV;")
    public static class63 method490(int arg0, int arg1) {
        class61 var2 = field1580;
        synchronized (field1580) {
            class63 var3 = null;
            if (arg0 == 0 && field1576 > 0) {
                field1576--;
                var3 = (class63) field1579.method484();
            } else if (arg0 == 1 && field1577 > 0) {
                field1577--;
                var3 = (class63) field1580.method484();
            } else if (arg0 == 2 && field1578 > 0) {
                field1578--;
                var3 = (class63) field1581.method484();
            }
            if (var3 != null) {
                var3.field1571 = 0;
                return var3;
            }
        }
        if (arg1 != 0) {
            field1563 = !field1563;
        }
        class63 var5 = new class63(false);
        var5.field1571 = 0;
        if (arg0 == 0) {
            var5.field1570 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1570 = new byte[5000];
        } else {
            var5.field1570 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "<init>", descriptor = "(Z)V")
    private class63(boolean arg0) {
        if (arg0) {
            this.field1565 = !this.field1565;
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "<init>", descriptor = "(B[B)V")
    public class63(byte arg0, byte[] arg1) {
        this.field1570 = arg1;
        if (arg0 != -58) {
            this.field1564 = 499;
        }
        this.field1571 = 0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IB)V")
    public void method491(int arg0, byte arg1) {
        if (arg1 != -80) {
            field1563 = !field1563;
        }
        this.field1570[this.field1571++] = (byte) (arg0 + this.field1575.method317());
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(I)V")
    public void method492(int arg0) {
        this.field1570[this.field1571++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(I)V")
    public void method493(int arg0) {
        this.field1570[this.field1571++] = (byte) (arg0 >> 8);
        this.field1570[this.field1571++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(II)V")
    public void method494(int arg0, int arg1) {
        this.field1570[this.field1571++] = (byte) arg1;
        if (arg0 < 2 || arg0 > 2) {
            this.field1569 = !this.field1569;
        }
        this.field1570[this.field1571++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(I)V")
    public void method495(int arg0) {
        this.field1570[this.field1571++] = (byte) (arg0 >> 16);
        this.field1570[this.field1571++] = (byte) (arg0 >> 8);
        this.field1570[this.field1571++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(I)V")
    public void method496(int arg0) {
        this.field1570[this.field1571++] = (byte) (arg0 >> 24);
        this.field1570[this.field1571++] = (byte) (arg0 >> 16);
        this.field1570[this.field1571++] = (byte) (arg0 >> 8);
        this.field1570[this.field1571++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(II)V")
    public void method497(int arg0, int arg1) {
        this.field1570[this.field1571++] = (byte) arg1;
        if (arg0 > 0) {
            this.field1570[this.field1571++] = (byte) (arg1 >> 8);
            this.field1570[this.field1571++] = (byte) (arg1 >> 16);
            this.field1570[this.field1571++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IJ)V")
    public void method498(int arg0, long arg1) {
        this.field1570[this.field1571++] = (byte) (arg1 >> 56);
        this.field1570[this.field1571++] = (byte) (arg1 >> 48);
        this.field1570[this.field1571++] = (byte) (arg1 >> 40);
        if (arg0 != 0) {
            this.field1556 = -20;
        }
        this.field1570[this.field1571++] = (byte) (arg1 >> 32);
        this.field1570[this.field1571++] = (byte) (arg1 >> 24);
        this.field1570[this.field1571++] = (byte) (arg1 >> 16);
        this.field1570[this.field1571++] = (byte) (arg1 >> 8);
        this.field1570[this.field1571++] = (byte) arg1;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method499(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1570, this.field1571);
        this.field1571 += arg0.length();
        this.field1570[this.field1571++] = 10;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(BI[BI)V")
    public void method500(byte arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 != 96) {
            this.field1554 = 165;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            this.field1570[this.field1571++] = arg2[var5];
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(II)V")
    public void method501(int arg0, int arg1) {
        if (arg1 != 0) {
            field1555 = 123;
        }
        this.field1570[this.field1571 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "()I")
    public int method502() {
        return this.field1570[this.field1571++] & 0xFF;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "()B")
    public byte method503() {
        return this.field1570[this.field1571++];
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "()I")
    public int method504() {
        this.field1571 += 2;
        return ((this.field1570[this.field1571 - 2] & 0xFF) << 8) + (this.field1570[this.field1571 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "()I")
    public int method505() {
        this.field1571 += 2;
        int var1 = ((this.field1570[this.field1571 - 2] & 0xFF) << 8) + (this.field1570[this.field1571 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "()I")
    public int method506() {
        this.field1571 += 3;
        return (this.field1570[this.field1571 - 1] & 0xFF) + ((this.field1570[this.field1571 - 3] & 0xFF) << 16) + ((this.field1570[this.field1571 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "()I")
    public int method507() {
        this.field1571 += 4;
        return (this.field1570[this.field1571 - 1] & 0xFF) + ((this.field1570[this.field1571 - 2] & 0xFF) << 8) + ((this.field1570[this.field1571 - 4] & 0xFF) << 24) + ((this.field1570[this.field1571 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(B)J")
    public long method508(byte arg0) {
        long var2 = (long) this.method507() & 0xFFFFFFFFL;
        long var4 = (long) this.method507() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            this.field1564 = 236;
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "()Ljava/lang/String;")
    public String method509() {
        int var1 = this.field1571;
        while (this.field1570[this.field1571++] != 10) {
        }
        return new String(this.field1570, var1, this.field1571 - var1 - 1);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "(I)[B")
    public byte[] method510(int arg0) {
        if (arg0 != -34529) {
            throw new NullPointerException();
        }
        int var2 = this.field1571;
        while (this.field1570[this.field1571++] != 10) {
        }
        byte[] var3 = new byte[this.field1571 - var2 - 1];
        for (int var4 = var2; var4 < this.field1571 - 1; var4++) {
            var3[var4 - var2] = this.field1570[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IIB[B)V")
    public void method511(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 == 7) {
            for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
                arg3[var5] = this.field1570[this.field1571++];
            }
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "(I)V")
    public void method512(int arg0) {
        int var2 = 36 / arg0;
        this.field1572 = this.field1571 * 8;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "(II)I")
    public int method513(int arg0, int arg1) {
        if (arg1 != 0) {
            return this.field1564;
        }
        int var3 = this.field1572 >> 3;
        int var4 = 8 - (this.field1572 & 0x7);
        int var5 = 0;
        this.field1572 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1570[var3++] & field1574[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1570[var3] & field1574[var4]) + var5;
        } else {
            var6 = (this.field1570[var3] >> var4 - arg0 & field1574[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "(I)V")
    public void method514(int arg0) {
        if (arg0 != -18093) {
            this.field1564 = 39;
        }
        this.field1571 = (this.field1572 + 7) / 8;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "()I")
    public int method515() {
        int var1 = this.field1570[this.field1571] & 0xFF;
        return var1 < 128 ? this.method502() - 64 : this.method504() - 49152;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "()I")
    public int method516() {
        int var1 = this.field1570[this.field1571] & 0xFF;
        return var1 < 128 ? this.method502() : this.method504() - 32768;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
    public void method517(boolean arg0, BigInteger arg1, BigInteger arg2) {
        int var4 = this.field1571;
        if (!arg0) {
            return;
        }
        this.field1571 = 0;
        byte[] var5 = new byte[var4];
        this.method511(0, var4, (byte) 7, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1571 = 0;
        this.method492(var8.length);
        this.method500(this.field1558, 0, var8, var8.length);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(ZI)V")
    public void method518(boolean arg0, int arg1) {
        if (arg0) {
            this.field1570[this.field1571++] = (byte) -arg1;
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "(II)V")
    public void method519(int arg0, int arg1) {
        this.field1570[this.field1571++] = (byte) (128 - arg0);
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "(I)I")
    public int method520(int arg0) {
        if (arg0 != -37135) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1570[this.field1571++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(Z)I")
    public int method521(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1570[this.field1571++] & 0xFF;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "(I)I")
    public int method522(int arg0) {
        return arg0 == 0 ? 128 - this.field1570[this.field1571++] & 0xFF : 3;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(B)B")
    public byte method523(byte arg0) {
        if (arg0 != 115) {
            throw new NullPointerException();
        }
        return (byte) (this.field1570[this.field1571++] - 128);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(Z)B")
    public byte method524(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) -this.field1570[this.field1571++];
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "(I)B")
    public byte method525(int arg0) {
        if (arg0 != -17575) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1570[this.field1571++]);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "(II)V")
    public void method526(int arg0, int arg1) {
        if (arg0 == 3) {
            this.field1570[this.field1571++] = (byte) arg1;
            this.field1570[this.field1571++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "(II)V")
    public void method527(int arg0, int arg1) {
        this.field1570[this.field1571++] = (byte) (arg0 >> 8);
        this.field1570[this.field1571++] = (byte) (arg0 + 128);
        if (arg1 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(BI)V")
    public void method528(byte arg0, int arg1) {
        this.field1570[this.field1571++] = (byte) (arg1 + 128);
        this.field1570[this.field1571++] = (byte) (arg1 >> 8);
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(B)I")
    public int method529(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            field1555 = 225;
        }
        this.field1571 += 2;
        return ((this.field1570[this.field1571 - 1] & 0xFF) << 8) + (this.field1570[this.field1571 - 2] & 0xFF);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "(I)I")
    public int method530(int arg0) {
        this.field1571 += 2;
        int var2 = 92 / arg0;
        return ((this.field1570[this.field1571 - 2] & 0xFF) << 8) + (this.field1570[this.field1571 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "l", descriptor = "(I)I")
    public int method531(int arg0) {
        this.field1571 += 2;
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1570[this.field1571 - 1] & 0xFF) << 8) + (this.field1570[this.field1571 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(B)I")
    public int method532(byte arg0) {
        this.field1571 += 2;
        int var2 = ((this.field1570[this.field1571 - 2] & 0xFF) << 8) + (this.field1570[this.field1571 - 1] - 128 & 0xFF);
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            this.field1556 = -215;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(Z)I")
    public int method533(boolean arg0) {
        this.field1571 += 2;
        if (!arg0) {
            return 1;
        }
        int var2 = ((this.field1570[this.field1571 - 1] & 0xFF) << 8) + (this.field1570[this.field1571 - 2] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(Z)I")
    public int method534(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1571 += 3;
        return (this.field1570[this.field1571 - 1] & 0xFF) + ((this.field1570[this.field1571 - 2] & 0xFF) << 16) + ((this.field1570[this.field1571 - 3] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(IB)V")
    public void method535(int arg0, byte arg1) {
        this.field1570[this.field1571++] = (byte) (arg0 >> 16);
        this.field1570[this.field1571++] = (byte) (arg0 >> 24);
        this.field1570[this.field1571++] = (byte) arg0;
        this.field1570[this.field1571++] = (byte) (arg0 >> 8);
        if (arg1 != 76) {
            this.field1565 = !this.field1565;
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "m", descriptor = "(I)I")
    public int method536(int arg0) {
        this.field1571 += 4;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1570[this.field1571 - 4] & 0xFF) + ((this.field1570[this.field1571 - 3] & 0xFF) << 8) + ((this.field1570[this.field1571 - 1] & 0xFF) << 24) + ((this.field1570[this.field1571 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "n", descriptor = "(I)I")
    public int method537(int arg0) {
        if (arg0 <= 0) {
            return 0;
        } else {
            this.field1571 += 4;
            return (this.field1570[this.field1571 - 2] & 0xFF) + ((this.field1570[this.field1571 - 1] & 0xFF) << 8) + ((this.field1570[this.field1571 - 3] & 0xFF) << 24) + ((this.field1570[this.field1571 - 4] & 0xFF) << 16);
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IZI[B)V")
    public void method538(int arg0, boolean arg1, int arg2, byte[] arg3) {
        if (arg1) {
            this.field1562 = 481;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
            arg3[var5] = this.field1570[this.field1571++];
        }
    }

    @OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(III[B)V")
    public void method539(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 7) {
            this.field1564 = -480;
        }
        for (int var5 = arg0 + arg1 - 1; var5 >= arg0; var5--) {
            arg3[var5] = (byte) (this.field1570[this.field1571++] - 128);
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
            field1573[var0] = var1;
        }
        field1574 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1579 = new class61(field1566);
        field1580 = new class61(field1566);
        field1581 = new class61(field1566);
        field1582 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
