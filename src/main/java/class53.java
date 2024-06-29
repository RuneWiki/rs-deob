import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TQYMAXSO")
public class class53 extends class57 {

    @OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "I")
    private int field1439 = -768;

    @OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "Z")
    private boolean field1440 = true;

    @OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "B")
    private byte field1441 = 7;

    @OriginalMember(owner = "client!TQYMAXSO", name = "l", descriptor = "B")
    private byte field1442 = -112;

    @OriginalMember(owner = "client!TQYMAXSO", name = "m", descriptor = "Z")
    private boolean field1443 = true;

    @OriginalMember(owner = "client!TQYMAXSO", name = "n", descriptor = "Z")
    private boolean field1444 = false;

    @OriginalMember(owner = "client!TQYMAXSO", name = "o", descriptor = "B")
    private byte field1445 = 7;

    @OriginalMember(owner = "client!TQYMAXSO", name = "q", descriptor = "I")
    private int field1447 = -862;

    @OriginalMember(owner = "client!TQYMAXSO", name = "r", descriptor = "I")
    private int field1448 = -483;

    @OriginalMember(owner = "client!TQYMAXSO", name = "s", descriptor = "Z")
    private boolean field1449 = false;

    @OriginalMember(owner = "client!TQYMAXSO", name = "t", descriptor = "Z")
    private boolean field1450 = true;

    @OriginalMember(owner = "client!TQYMAXSO", name = "u", descriptor = "B")
    private byte field1451 = 23;

    @OriginalMember(owner = "client!TQYMAXSO", name = "v", descriptor = "I")
    private int field1452 = 809;

    @OriginalMember(owner = "client!TQYMAXSO", name = "w", descriptor = "I")
    private int field1453 = -161;

    @OriginalMember(owner = "client!TQYMAXSO", name = "y", descriptor = "I")
    private int field1455 = 42179;

    @OriginalMember(owner = "client!TQYMAXSO", name = "z", descriptor = "[B")
    public byte[] field1456;

    @OriginalMember(owner = "client!TQYMAXSO", name = "A", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!TQYMAXSO", name = "C", descriptor = "[I")
    private static int[] field1459 = new int[256];

    @OriginalMember(owner = "client!TQYMAXSO", name = "D", descriptor = "[I")
    private static final int[] field1460;

    @OriginalMember(owner = "client!TQYMAXSO", name = "I", descriptor = "LCRZPTUPR;")
    private static class7 field1465;

    @OriginalMember(owner = "client!TQYMAXSO", name = "J", descriptor = "LCRZPTUPR;")
    private static class7 field1466;

    @OriginalMember(owner = "client!TQYMAXSO", name = "K", descriptor = "LCRZPTUPR;")
    private static class7 field1467;

    @OriginalMember(owner = "client!TQYMAXSO", name = "L", descriptor = "[C")
    private static char[] field1468;

    @OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client!TQYMAXSO", name = "x", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!TQYMAXSO", name = "B", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!TQYMAXSO", name = "F", descriptor = "I")
    private static int field1462;

    @OriginalMember(owner = "client!TQYMAXSO", name = "G", descriptor = "I")
    private static int field1463;

    @OriginalMember(owner = "client!TQYMAXSO", name = "H", descriptor = "I")
    private static int field1464;

    @OriginalMember(owner = "client!TQYMAXSO", name = "E", descriptor = "LMRWOUQJV;")
    public class33 field1461;

    @OriginalMember(owner = "client!TQYMAXSO", name = "p", descriptor = "Z")
    private static boolean field1446;

    @OriginalMember(owner = "client!TQYMAXSO", name = "M", descriptor = "Z")
    public static boolean field1469;

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IB)LTQYMAXSO;")
    public static class53 method456(int arg0, byte arg1) {
        class7 var2 = field1466;
        synchronized (field1466) {
            class53 var3 = null;
            if (arg0 == 0 && field1462 > 0) {
                field1462--;
                var3 = (class53) field1465.method178();
            } else if (arg0 == 1 && field1463 > 0) {
                field1463--;
                var3 = (class53) field1466.method178();
            } else if (arg0 == 2 && field1464 > 0) {
                field1464--;
                var3 = (class53) field1467.method178();
            }
            if (var3 != null) {
                var3.field1457 = 0;
                return var3;
            }
        }
        class53 var5 = new class53(-768);
        var5.field1457 = 0;
        if (arg1 == 1) {
            boolean var6 = false;
        } else {
            field1446 = !field1446;
        }
        if (arg0 == 0) {
            var5.field1456 = new byte[100];
        } else if (arg0 == 1) {
            var5.field1456 = new byte[5000];
        } else {
            var5.field1456 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "<init>", descriptor = "(I)V")
    private class53(int arg0) {
        if (arg0 >= 0) {
            field1446 = !field1446;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "<init>", descriptor = "([BI)V")
    public class53(byte[] arg0, int arg1) {
        while (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1456 = arg0;
        this.field1457 = 0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(II)V")
    public void method457(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1456[this.field1457++] = (byte) (arg1 + this.field1461.method335());
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(I)V")
    public void method458(int arg0) {
        this.field1456[this.field1457++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(I)V")
    public void method459(int arg0) {
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        this.field1456[this.field1457++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(II)V")
    public void method460(int arg0, int arg1) {
        this.field1456[this.field1457++] = (byte) arg0;
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        if (arg1 != -22089) {
            field1446 = !field1446;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(I)V")
    public void method461(int arg0) {
        this.field1456[this.field1457++] = (byte) (arg0 >> 16);
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        this.field1456[this.field1457++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(I)V")
    public void method462(int arg0) {
        this.field1456[this.field1457++] = (byte) (arg0 >> 24);
        this.field1456[this.field1457++] = (byte) (arg0 >> 16);
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        this.field1456[this.field1457++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IZ)V")
    public void method463(int arg0, boolean arg1) {
        this.field1456[this.field1457++] = (byte) arg0;
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        if (arg1) {
            this.field1456[this.field1457++] = (byte) (arg0 >> 16);
            this.field1456[this.field1457++] = (byte) (arg0 >> 24);
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IJ)V")
    public void method464(int arg0, long arg1) {
        this.field1456[this.field1457++] = (byte) (arg1 >> 56);
        this.field1456[this.field1457++] = (byte) (arg1 >> 48);
        this.field1456[this.field1457++] = (byte) (arg1 >> 40);
        this.field1456[this.field1457++] = (byte) (arg1 >> 32);
        this.field1456[this.field1457++] = (byte) (arg1 >> 24);
        this.field1456[this.field1457++] = (byte) (arg1 >> 16);
        this.field1456[this.field1457++] = (byte) (arg1 >> 8);
        this.field1456[this.field1457++] = (byte) arg1;
        int var4 = 53 / arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method465(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1456, this.field1457);
        this.field1457 += arg0.length();
        this.field1456[this.field1457++] = 10;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(I[BIB)V")
    public void method466(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 == -4) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                this.field1456[this.field1457++] = arg1[var5];
            }
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(IB)V")
    public void method467(int arg0, byte arg1) {
        if (this.field1441 != arg1) {
            this.field1440 = !this.field1440;
        }
        this.field1456[this.field1457 - arg0 - 1] = (byte) arg0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "()I")
    public int method468() {
        return this.field1456[this.field1457++] & 0xFF;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "()B")
    public byte method469() {
        return this.field1456[this.field1457++];
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "()I")
    public int method470() {
        this.field1457 += 2;
        return ((this.field1456[this.field1457 - 2] & 0xFF) << 8) + (this.field1456[this.field1457 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "()I")
    public int method471() {
        this.field1457 += 2;
        int var1 = ((this.field1456[this.field1457 - 2] & 0xFF) << 8) + (this.field1456[this.field1457 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "()I")
    public int method472() {
        this.field1457 += 3;
        return (this.field1456[this.field1457 - 1] & 0xFF) + ((this.field1456[this.field1457 - 3] & 0xFF) << 16) + ((this.field1456[this.field1457 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "()I")
    public int method473() {
        this.field1457 += 4;
        return (this.field1456[this.field1457 - 1] & 0xFF) + ((this.field1456[this.field1457 - 2] & 0xFF) << 8) + ((this.field1456[this.field1457 - 4] & 0xFF) << 24) + ((this.field1456[this.field1457 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(I)J")
    public long method474(int arg0) {
        long var2 = (long) this.method473() & 0xFFFFFFFFL;
        long var4 = (long) this.method473() & 0xFFFFFFFFL;
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "()Ljava/lang/String;")
    public String method475() {
        int var1 = this.field1457;
        while (this.field1456[this.field1457++] != 10) {
        }
        return new String(this.field1456, var1, this.field1457 - var1 - 1);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(I)[B")
    public byte[] method476(int arg0) {
        int var2 = this.field1457;
        if (arg0 != -2167) {
            field1446 = !field1446;
        }
        while (this.field1456[this.field1457++] != 10) {
        }
        byte[] var3 = new byte[this.field1457 - var2 - 1];
        for (int var4 = var2; var4 < this.field1457 - 1; var4++) {
            var3[var4 - var2] = this.field1456[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(III[B)V")
    public void method477(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 > 0) {
            for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
                arg3[var5] = this.field1456[this.field1457++];
            }
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(B)V")
    public void method478(byte arg0) {
        this.field1458 = this.field1457 * 8;
        if (arg0 == -43) {
            ;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(IB)I")
    public int method479(int arg0, byte arg1) {
        int var3 = this.field1458 >> 3;
        int var4 = 8 - (this.field1458 & 0x7);
        int var5 = 0;
        if (arg1 != 63) {
            this.field1455 = 38;
        }
        this.field1458 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1456[var3++] & field1460[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1456[var3] & field1460[var4]) + var5;
        } else {
            var6 = (this.field1456[var3] >> var4 - arg0 & field1460[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "(I)V")
    public void method480(int arg0) {
        this.field1457 = (this.field1458 + 7) / 8;
        if (arg0 != 9) {
            field1446 = !field1446;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "()I")
    public int method481() {
        int var1 = this.field1456[this.field1457] & 0xFF;
        return var1 < 128 ? this.method468() - 64 : this.method470() - 49152;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "()I")
    public int method482() {
        int var1 = this.field1456[this.field1457] & 0xFF;
        return var1 < 128 ? this.method468() : this.method470() - 32768;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method483(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field1457;
        if (arg2) {
            return;
        }
        this.field1457 = 0;
        byte[] var5 = new byte[var4];
        this.method477(691, 0, var4, var5);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1457 = 0;
        this.method458(var8.length);
        this.method466(var8.length, var8, 0, (byte) -4);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(IZ)V")
    public void method484(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1456[this.field1457++] = (byte) (arg0 + 128);
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(II)V")
    public void method485(int arg0, int arg1) {
        if (arg1 < 0) {
            this.field1456[this.field1457++] = (byte) -arg0;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(II)V")
    public void method486(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1439 = 459;
        }
        this.field1456[this.field1457++] = (byte) (128 - arg0);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(B)I")
    public int method487(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
            return this.field1456[this.field1457++] - 128 & 0xFF;
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "(I)I")
    public int method488(int arg0) {
        if (arg0 != -33544) {
            this.field1443 = !this.field1443;
        }
        return -this.field1456[this.field1457++] & 0xFF;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "(I)I")
    public int method489(int arg0) {
        return arg0 == -33025 ? 128 - this.field1456[this.field1457++] & 0xFF : 1;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "(I)B")
    public byte method490(int arg0) {
        if (arg0 != 1) {
            this.field1440 = !this.field1440;
        }
        return (byte) (this.field1456[this.field1457++] - 128);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Z)B")
    public byte method491(boolean arg0) {
        if (arg0) {
            this.field1443 = !this.field1443;
        }
        return (byte) -this.field1456[this.field1457++];
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(B)B")
    public byte method492(byte arg0) {
        if (arg0 != -9) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1456[this.field1457++]);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(II)V")
    public void method493(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1444 = !this.field1444;
        }
        this.field1456[this.field1457++] = (byte) arg1;
        this.field1456[this.field1457++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(II)V")
    public void method494(int arg0, int arg1) {
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        if (arg1 != 0) {
            this.field1438 = -196;
        }
        this.field1456[this.field1457++] = (byte) (arg0 + 128);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "(II)V")
    public void method495(int arg0, int arg1) {
        this.field1456[this.field1457++] = (byte) (arg0 + 128);
        if (arg1 == 0) {
            this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(B)I")
    public int method496(byte arg0) {
        if (this.field1445 == arg0) {
            boolean var2 = false;
            this.field1457 += 2;
            return ((this.field1456[this.field1457 - 1] & 0xFF) << 8) + (this.field1456[this.field1457 - 2] & 0xFF);
        } else {
            return this.field1454;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "(I)I")
    public int method497(int arg0) {
        this.field1457 += 2;
        if (arg0 != 0) {
            this.field1440 = !this.field1440;
        }
        return ((this.field1456[this.field1457 - 2] & 0xFF) << 8) + (this.field1456[this.field1457 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(B)I")
    public int method498(byte arg0) {
        this.field1457 += 2;
        return arg0 == 19 ? ((this.field1456[this.field1457 - 1] & 0xFF) << 8) + (this.field1456[this.field1457 - 2] - 128 & 0xFF) : 0;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(Z)I")
    public int method499(boolean arg0) {
        this.field1457 += 2;
        int var2 = ((this.field1456[this.field1457 - 1] & 0xFF) << 8) + (this.field1456[this.field1457 - 2] & 0xFF);
        if (arg0) {
            this.field1450 = !this.field1450;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(Z)I")
    public int method500(boolean arg0) {
        this.field1457 += 2;
        int var2 = ((this.field1456[this.field1457 - 1] & 0xFF) << 8) + (this.field1456[this.field1457 - 2] - 128 & 0xFF);
        if (arg0) {
            return 4;
        } else {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(IZ)V")
    public void method501(int arg0, boolean arg1) {
        this.field1456[this.field1457++] = (byte) (arg0 >> 8);
        this.field1456[this.field1457++] = (byte) arg0;
        if (!arg1) {
            this.field1456[this.field1457++] = (byte) (arg0 >> 24);
            this.field1456[this.field1457++] = (byte) (arg0 >> 16);
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(B)I")
    public int method502(byte arg0) {
        if (arg0 != 87) {
            this.field1440 = !this.field1440;
        }
        this.field1457 += 4;
        return (this.field1456[this.field1457 - 4] & 0xFF) + ((this.field1456[this.field1457 - 3] & 0xFF) << 8) + ((this.field1456[this.field1457 - 1] & 0xFF) << 24) + ((this.field1456[this.field1457 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "l", descriptor = "(I)I")
    public int method503(int arg0) {
        this.field1457 += 4;
        return arg0 < 0 ? (this.field1456[this.field1457 - 3] & 0xFF) + ((this.field1456[this.field1457 - 4] & 0xFF) << 8) + ((this.field1456[this.field1457 - 2] & 0xFF) << 24) + ((this.field1456[this.field1457 - 1] & 0xFF) << 16) : 1;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "m", descriptor = "(I)I")
    public int method504(int arg0) {
        this.field1457 += 4;
        return arg0 == 0 ? (this.field1456[this.field1457 - 2] & 0xFF) + ((this.field1456[this.field1457 - 1] & 0xFF) << 8) + ((this.field1456[this.field1457 - 3] & 0xFF) << 24) + ((this.field1456[this.field1457 - 4] & 0xFF) << 16) : this.field1455;
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "([BIZI)V")
    public void method505(byte[] arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
                this.field1456[this.field1457++] = (byte) (arg0[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "([BIII)V")
    public void method506(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            this.field1443 = !this.field1443;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg0[var5] = (byte) (this.field1456[this.field1457++] - 128);
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
            field1459[var0] = var1;
        }
        field1460 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1465 = new class7((byte) 1);
        field1466 = new class7((byte) 1);
        field1467 = new class7((byte) 1);
        field1468 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
