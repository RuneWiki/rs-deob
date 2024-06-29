import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SVWJKJVI")
public class class52 extends class2 {

    @OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "I")
    private int field1415 = -836;

    @OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "B")
    private byte field1416 = -10;

    @OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "Z")
    private boolean field1417 = true;

    @OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "Z")
    private boolean field1418 = false;

    @OriginalMember(owner = "client!SVWJKJVI", name = "l", descriptor = "B")
    private byte field1419 = 3;

    @OriginalMember(owner = "client!SVWJKJVI", name = "m", descriptor = "B")
    private byte field1420 = 1;

    @OriginalMember(owner = "client!SVWJKJVI", name = "n", descriptor = "I")
    private int field1421 = 9;

    @OriginalMember(owner = "client!SVWJKJVI", name = "o", descriptor = "I")
    private int field1422 = 6;

    @OriginalMember(owner = "client!SVWJKJVI", name = "p", descriptor = "Z")
    private boolean field1423 = true;

    @OriginalMember(owner = "client!SVWJKJVI", name = "q", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!SVWJKJVI", name = "r", descriptor = "Z")
    private boolean field1425 = false;

    @OriginalMember(owner = "client!SVWJKJVI", name = "s", descriptor = "Z")
    private boolean field1426 = true;

    @OriginalMember(owner = "client!SVWJKJVI", name = "t", descriptor = "Z")
    private boolean field1427 = false;

    @OriginalMember(owner = "client!SVWJKJVI", name = "u", descriptor = "Z")
    private boolean field1428 = true;

    @OriginalMember(owner = "client!SVWJKJVI", name = "v", descriptor = "I")
    private int field1429 = 2;

    @OriginalMember(owner = "client!SVWJKJVI", name = "w", descriptor = "I")
    private int field1430 = -12340;

    @OriginalMember(owner = "client!SVWJKJVI", name = "x", descriptor = "Z")
    private boolean field1431 = true;

    @OriginalMember(owner = "client!SVWJKJVI", name = "y", descriptor = "I")
    private int field1432 = -43582;

    @OriginalMember(owner = "client!SVWJKJVI", name = "z", descriptor = "[B")
    public byte[] field1433;

    @OriginalMember(owner = "client!SVWJKJVI", name = "A", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!SVWJKJVI", name = "C", descriptor = "[I")
    private static int[] field1436 = new int[256];

    @OriginalMember(owner = "client!SVWJKJVI", name = "D", descriptor = "[I")
    private static final int[] field1437;

    @OriginalMember(owner = "client!SVWJKJVI", name = "I", descriptor = "LETMNPRAF;")
    private static class11 field1442;

    @OriginalMember(owner = "client!SVWJKJVI", name = "J", descriptor = "LETMNPRAF;")
    private static class11 field1443;

    @OriginalMember(owner = "client!SVWJKJVI", name = "K", descriptor = "LETMNPRAF;")
    private static class11 field1444;

    @OriginalMember(owner = "client!SVWJKJVI", name = "L", descriptor = "[C")
    private static char[] field1445;

    @OriginalMember(owner = "client!SVWJKJVI", name = "B", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!SVWJKJVI", name = "F", descriptor = "I")
    private static int field1439;

    @OriginalMember(owner = "client!SVWJKJVI", name = "G", descriptor = "I")
    private static int field1440;

    @OriginalMember(owner = "client!SVWJKJVI", name = "H", descriptor = "I")
    private static int field1441;

    @OriginalMember(owner = "client!SVWJKJVI", name = "E", descriptor = "LOPLZBITI;")
    public class39 field1438;

    @OriginalMember(owner = "client!SVWJKJVI", name = "M", descriptor = "Z")
    public static boolean field1446;

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(ZI)LSVWJKJVI;")
    public static class52 method449(boolean arg0, int arg1) {
        class11 var2 = field1443;
        synchronized (field1443) {
            class52 var3 = null;
            if (arg1 == 0 && field1439 > 0) {
                field1439--;
                var3 = (class52) field1442.method180();
            } else if (arg1 == 1 && field1440 > 0) {
                field1440--;
                var3 = (class52) field1443.method180();
            } else if (arg1 == 2 && field1441 > 0) {
                field1441--;
                var3 = (class52) field1444.method180();
            }
            if (var3 != null) {
                var3.field1434 = 0;
                return var3;
            }
        }
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        class52 var6 = new class52(true);
        var6.field1434 = 0;
        if (arg1 == 0) {
            var6.field1433 = new byte[100];
        } else if (arg1 == 1) {
            var6.field1433 = new byte[5000];
        } else {
            var6.field1433 = new byte[30000];
        }
        return var6;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "<init>", descriptor = "(Z)V")
    private class52(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "<init>", descriptor = "([BZ)V")
    public class52(byte[] arg0, boolean arg1) {
        if (!arg1) {
            this.field1415 = 353;
        }
        this.field1433 = arg0;
        this.field1434 = 0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(II)V")
    public void method450(int arg0, int arg1) {
        if (arg0 == 7) {
            this.field1433[this.field1434++] = (byte) (arg1 + this.field1438.method375());
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(I)V")
    public void method451(int arg0) {
        this.field1433[this.field1434++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(I)V")
    public void method452(int arg0) {
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        this.field1433[this.field1434++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(IB)V")
    public void method453(int arg0, byte arg1) {
        this.field1433[this.field1434++] = (byte) arg0;
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        if (arg1 != -42) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(I)V")
    public void method454(int arg0) {
        this.field1433[this.field1434++] = (byte) (arg0 >> 16);
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        this.field1433[this.field1434++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(I)V")
    public void method455(int arg0) {
        this.field1433[this.field1434++] = (byte) (arg0 >> 24);
        this.field1433[this.field1434++] = (byte) (arg0 >> 16);
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        this.field1433[this.field1434++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(II)V")
    public void method456(int arg0, int arg1) {
        if (arg0 >= 3 && arg0 <= 3) {
            this.field1433[this.field1434++] = (byte) arg1;
            this.field1433[this.field1434++] = (byte) (arg1 >> 8);
            this.field1433[this.field1434++] = (byte) (arg1 >> 16);
            this.field1433[this.field1434++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(JI)V")
    public void method457(long arg0, int arg1) {
        int var4 = 20 / arg1;
        this.field1433[this.field1434++] = (byte) (arg0 >> 56);
        this.field1433[this.field1434++] = (byte) (arg0 >> 48);
        this.field1433[this.field1434++] = (byte) (arg0 >> 40);
        this.field1433[this.field1434++] = (byte) (arg0 >> 32);
        this.field1433[this.field1434++] = (byte) (arg0 >> 24);
        this.field1433[this.field1434++] = (byte) (arg0 >> 16);
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        this.field1433[this.field1434++] = (byte) arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method458(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1433, this.field1434);
        this.field1434 += arg0.length();
        this.field1433[this.field1434++] = 10;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(I[BBI)V")
    public void method459(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 != -10) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = arg0; var6 < arg0 + arg3; var6++) {
            this.field1433[this.field1434++] = arg1[var6];
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(ZI)V")
    public void method460(boolean arg0, int arg1) {
        this.field1433[this.field1434 - arg1 - 1] = (byte) arg1;
        if (!arg0) {
            this.field1427 = !this.field1427;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "()I")
    public int method461() {
        return this.field1433[this.field1434++] & 0xFF;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "()B")
    public byte method462() {
        return this.field1433[this.field1434++];
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "()I")
    public int method463() {
        this.field1434 += 2;
        return ((this.field1433[this.field1434 - 2] & 0xFF) << 8) + (this.field1433[this.field1434 - 1] & 0xFF);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "f", descriptor = "()I")
    public int method464() {
        this.field1434 += 2;
        int var1 = ((this.field1433[this.field1434 - 2] & 0xFF) << 8) + (this.field1433[this.field1434 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "g", descriptor = "()I")
    public int method465() {
        this.field1434 += 3;
        return (this.field1433[this.field1434 - 1] & 0xFF) + ((this.field1433[this.field1434 - 3] & 0xFF) << 16) + ((this.field1433[this.field1434 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "()I")
    public int method466() {
        this.field1434 += 4;
        return (this.field1433[this.field1434 - 1] & 0xFF) + ((this.field1433[this.field1434 - 2] & 0xFF) << 8) + ((this.field1433[this.field1434 - 4] & 0xFF) << 24) + ((this.field1433[this.field1434 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(B)J")
    public long method467(byte arg0) {
        long var2 = (long) this.method466() & 0xFFFFFFFFL;
        if (arg0 != 50) {
            this.field1428 = !this.field1428;
        }
        long var4 = (long) this.method466() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "()Ljava/lang/String;")
    public String method468() {
        int var1 = this.field1434;
        while (this.field1433[this.field1434++] != 10) {
        }
        return new String(this.field1433, var1, this.field1434 - var1 - 1);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "(I)[B")
    public byte[] method469(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = this.field1434;
        while (this.field1433[this.field1434++] != 10) {
        }
        byte[] var4 = new byte[this.field1434 - var3 - 1];
        for (int var5 = var3; var5 < this.field1434 - 1; var5++) {
            var4[var5 - var3] = this.field1433[var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(II[BI)V")
    public void method470(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 72 / arg1;
        for (int var6 = arg0; var6 < arg0 + arg3; var6++) {
            arg2[var6] = this.field1433[this.field1434++];
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "f", descriptor = "(I)V")
    public void method471(int arg0) {
        this.field1435 = this.field1434 * 8;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(II)I")
    public int method472(int arg0, int arg1) {
        int var3 = this.field1435 >> 3;
        int var4 = 8 - (this.field1435 & 0x7);
        int var5 = 0;
        if (arg0 != -34994) {
            this.field1428 = !this.field1428;
        }
        this.field1435 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1433[var3++] & field1437[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1433[var3] & field1437[var4]) + var5;
        } else {
            var6 = (this.field1433[var3] >> var4 - arg1 & field1437[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Z)V")
    public void method473(boolean arg0) {
        this.field1434 = (this.field1435 + 7) / 8;
        if (!arg0) {
            this.field1429 = -322;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "()I")
    public int method474() {
        int var1 = this.field1433[this.field1434] & 0xFF;
        return var1 < 128 ? this.method461() - 64 : this.method463() - 49152;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "()I")
    public int method475() {
        int var1 = this.field1433[this.field1434] & 0xFF;
        return var1 < 128 ? this.method461() : this.method463() - 32768;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
    public void method476(BigInteger arg0, BigInteger arg1, int arg2) {
        int var4 = this.field1434;
        if (arg2 >= 0) {
            return;
        }
        this.field1434 = 0;
        byte[] var5 = new byte[var4];
        this.method470(0, 36, var5, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg1, arg0);
        byte[] var8 = var7.toByteArray();
        this.field1434 = 0;
        this.method451(var8.length);
        this.method459(0, var8, this.field1416, var8.length);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(II)V")
    public void method477(int arg0, int arg1) {
        if (arg0 > 0) {
            this.field1433[this.field1434++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "(II)V")
    public void method478(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1415 = 444;
        }
        this.field1433[this.field1434++] = (byte) -arg0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "g", descriptor = "(I)I")
    public int method479(int arg0) {
        return arg0 == -45375 ? this.field1433[this.field1434++] - 128 & 0xFF : 0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "(I)I")
    public int method480(int arg0) {
        if (arg0 != 8494) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1433[this.field1434++] & 0xFF;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "(I)I")
    public int method481(int arg0) {
        return arg0 == 42604 ? 128 - this.field1433[this.field1434++] & 0xFF : this.field1415;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(Z)B")
    public byte method482(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (byte) (this.field1433[this.field1434++] - 128);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "(I)B")
    public byte method483(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (byte) -this.field1433[this.field1434++];
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "(I)B")
    public byte method484(int arg0) {
        if (arg0 != 0) {
            this.field1417 = !this.field1417;
        }
        return (byte) (128 - this.field1433[this.field1434++]);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(ZI)V")
    public void method485(boolean arg0, int arg1) {
        this.field1433[this.field1434++] = (byte) arg1;
        this.field1433[this.field1434++] = (byte) (arg1 >> 8);
        if (arg0) {
            this.field1417 = !this.field1417;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(IZ)V")
    public void method486(int arg0, boolean arg1) {
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        this.field1433[this.field1434++] = (byte) (arg0 + 128);
        if (arg1) {
            this.field1415 = 457;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(IZ)V")
    public void method487(int arg0, boolean arg1) {
        this.field1433[this.field1434++] = (byte) (arg0 + 128);
        this.field1433[this.field1434++] = (byte) (arg0 >> 8);
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(Z)I")
    public int method488(boolean arg0) {
        if (arg0) {
            this.field1434 += 2;
            return ((this.field1433[this.field1434 - 1] & 0xFF) << 8) + (this.field1433[this.field1434 - 2] & 0xFF);
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(B)I")
    public int method489(byte arg0) {
        this.field1434 += 2;
        return arg0 == -107 ? ((this.field1433[this.field1434 - 2] & 0xFF) << 8) + (this.field1433[this.field1434 - 1] - 128 & 0xFF) : 1;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(B)I")
    public int method490(byte arg0) {
        if (this.field1419 != arg0) {
            this.field1428 = !this.field1428;
        }
        this.field1434 += 2;
        return ((this.field1433[this.field1434 - 1] & 0xFF) << 8) + (this.field1433[this.field1434 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "l", descriptor = "(I)I")
    public int method491(int arg0) {
        this.field1434 += 2;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = ((this.field1433[this.field1434 - 1] & 0xFF) << 8) + (this.field1433[this.field1434 - 2] & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "m", descriptor = "(I)I")
    public int method492(int arg0) {
        this.field1434 += 2;
        int var2 = ((this.field1433[this.field1434 - 2] & 0xFF) << 8) + (this.field1433[this.field1434 - 1] - 128 & 0xFF);
        if (arg0 == 8) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return this.field1432;
        }
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "n", descriptor = "(I)I")
    public int method493(int arg0) {
        this.field1434 += 4;
        return arg0 == 24013 ? (this.field1433[this.field1434 - 3] & 0xFF) + ((this.field1433[this.field1434 - 4] & 0xFF) << 8) + ((this.field1433[this.field1434 - 2] & 0xFF) << 24) + ((this.field1433[this.field1434 - 1] & 0xFF) << 16) : 0;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(Z)I")
    public int method494(boolean arg0) {
        this.field1434 += 4;
        return arg0 ? (this.field1433[this.field1434 - 2] & 0xFF) + ((this.field1433[this.field1434 - 1] & 0xFF) << 8) + ((this.field1433[this.field1434 - 3] & 0xFF) << 24) + ((this.field1433[this.field1434 - 4] & 0xFF) << 16) : this.field1432;
    }

    @OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(ZII[B)V")
    public void method495(boolean arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0) {
            this.field1429 = 106;
        }
        for (int var5 = arg1 + arg2 - 1; var5 >= arg2; var5--) {
            arg3[var5] = this.field1433[this.field1434++];
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
            field1436[var0] = var1;
        }
        field1437 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1442 = new class11(0);
        field1443 = new class11(0);
        field1444 = new class11(0);
        field1445 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
