import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UAWAYCTK")
public class class55 extends class13 {

    @OriginalMember(owner = "UAWAYCTK", name = "i", descriptor = "Z")
    private boolean field1438 = true;

    @OriginalMember(owner = "UAWAYCTK", name = "k", descriptor = "Z")
    private boolean field1440 = false;

    @OriginalMember(owner = "UAWAYCTK", name = "l", descriptor = "Z")
    private boolean field1441 = true;

    @OriginalMember(owner = "UAWAYCTK", name = "m", descriptor = "I")
    private int field1442 = 41598;

    @OriginalMember(owner = "UAWAYCTK", name = "n", descriptor = "B")
    private byte field1443 = 9;

    @OriginalMember(owner = "UAWAYCTK", name = "o", descriptor = "I")
    private int field1444 = -49448;

    @OriginalMember(owner = "UAWAYCTK", name = "p", descriptor = "I")
    private int field1445 = -27691;

    @OriginalMember(owner = "UAWAYCTK", name = "q", descriptor = "I")
    private int field1446 = -27691;

    @OriginalMember(owner = "UAWAYCTK", name = "r", descriptor = "B")
    private byte field1447 = -50;

    @OriginalMember(owner = "UAWAYCTK", name = "s", descriptor = "I")
    private int field1448 = 8;

    @OriginalMember(owner = "UAWAYCTK", name = "t", descriptor = "I")
    private int field1449 = -49955;

    @OriginalMember(owner = "UAWAYCTK", name = "u", descriptor = "Z")
    private boolean field1450 = false;

    @OriginalMember(owner = "UAWAYCTK", name = "v", descriptor = "B")
    private byte field1451 = 1;

    @OriginalMember(owner = "UAWAYCTK", name = "w", descriptor = "I")
    private int field1452 = -296;

    @OriginalMember(owner = "UAWAYCTK", name = "x", descriptor = "Z")
    private boolean field1453 = true;

    @OriginalMember(owner = "UAWAYCTK", name = "y", descriptor = "I")
    private int field1454 = -799;

    @OriginalMember(owner = "UAWAYCTK", name = "z", descriptor = "[B")
    public byte[] field1455;

    @OriginalMember(owner = "UAWAYCTK", name = "A", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "UAWAYCTK", name = "j", descriptor = "I")
    private static int field1439 = -400;

    @OriginalMember(owner = "UAWAYCTK", name = "C", descriptor = "[I")
    private static int[] field1458 = new int[256];

    @OriginalMember(owner = "UAWAYCTK", name = "D", descriptor = "[I")
    private static final int[] field1459;

    @OriginalMember(owner = "UAWAYCTK", name = "I", descriptor = "LURASIGRB;")
    private static class58 field1464;

    @OriginalMember(owner = "UAWAYCTK", name = "J", descriptor = "LURASIGRB;")
    private static class58 field1465;

    @OriginalMember(owner = "UAWAYCTK", name = "K", descriptor = "LURASIGRB;")
    private static class58 field1466;

    @OriginalMember(owner = "UAWAYCTK", name = "L", descriptor = "[C")
    private static char[] field1467;

    @OriginalMember(owner = "UAWAYCTK", name = "B", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "UAWAYCTK", name = "F", descriptor = "I")
    private static int field1461;

    @OriginalMember(owner = "UAWAYCTK", name = "G", descriptor = "I")
    private static int field1462;

    @OriginalMember(owner = "UAWAYCTK", name = "H", descriptor = "I")
    private static int field1463;

    @OriginalMember(owner = "UAWAYCTK", name = "E", descriptor = "LVZIKSEDY;")
    public class65 field1460;

    @OriginalMember(owner = "UAWAYCTK", name = "M", descriptor = "Z")
    public static boolean field1468;

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(II)LUAWAYCTK;")
    public static class55 method443(int arg0, int arg1) {
        class58 var2 = field1465;
        synchronized (field1465) {
            class55 var3 = null;
            if (arg1 == 0 && field1461 > 0) {
                field1461--;
                var3 = (class55) field1464.method502();
            } else if (arg1 == 1 && field1462 > 0) {
                field1462--;
                var3 = (class55) field1465.method502();
            } else if (arg1 == 2 && field1463 > 0) {
                field1463--;
                var3 = (class55) field1466.method502();
            }
            if (var3 != null) {
                var3.field1456 = 0;
                return var3;
            }
        }
        class55 var5 = new class55(true);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        var5.field1456 = 0;
        if (arg1 == 0) {
            var5.field1455 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1455 = new byte[5000];
        } else {
            var5.field1455 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "<init>", descriptor = "(Z)V")
    private class55(boolean arg0) {
        if (!arg0) {
            this.field1453 = !this.field1453;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "<init>", descriptor = "(I[B)V")
    public class55(int arg0, byte[] arg1) {
        this.field1455 = arg1;
        this.field1456 = 0;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(ZI)V")
    public void method444(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1455[this.field1456++] = (byte) (arg1 + this.field1460.method518());
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(I)V")
    public void method445(int arg0) {
        this.field1455[this.field1456++] = (byte) arg0;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "b", descriptor = "(I)V")
    public void method446(int arg0) {
        this.field1455[this.field1456++] = (byte) (arg0 >> 8);
        this.field1455[this.field1456++] = (byte) arg0;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "b", descriptor = "(II)V")
    public void method447(int arg0, int arg1) {
        if (arg1 != -19346) {
            this.field1453 = !this.field1453;
        }
        this.field1455[this.field1456++] = (byte) arg0;
        this.field1455[this.field1456++] = (byte) (arg0 >> 8);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "c", descriptor = "(I)V")
    public void method448(int arg0) {
        this.field1455[this.field1456++] = (byte) (arg0 >> 16);
        this.field1455[this.field1456++] = (byte) (arg0 >> 8);
        this.field1455[this.field1456++] = (byte) arg0;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "d", descriptor = "(I)V")
    public void method449(int arg0) {
        this.field1455[this.field1456++] = (byte) (arg0 >> 24);
        this.field1455[this.field1456++] = (byte) (arg0 >> 16);
        this.field1455[this.field1456++] = (byte) (arg0 >> 8);
        this.field1455[this.field1456++] = (byte) arg0;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "c", descriptor = "(II)V")
    public void method450(int arg0, int arg1) {
        this.field1455[this.field1456++] = (byte) arg1;
        if (arg0 < 0) {
            this.field1455[this.field1456++] = (byte) (arg1 >> 8);
            this.field1455[this.field1456++] = (byte) (arg1 >> 16);
            this.field1455[this.field1456++] = (byte) (arg1 >> 24);
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(JZ)V")
    public void method451(long arg0, boolean arg1) {
        this.field1455[this.field1456++] = (byte) (arg0 >> 56);
        this.field1455[this.field1456++] = (byte) (arg0 >> 48);
        this.field1455[this.field1456++] = (byte) (arg0 >> 40);
        this.field1455[this.field1456++] = (byte) (arg0 >> 32);
        this.field1455[this.field1456++] = (byte) (arg0 >> 24);
        this.field1455[this.field1456++] = (byte) (arg0 >> 16);
        this.field1455[this.field1456++] = (byte) (arg0 >> 8);
        this.field1455[this.field1456++] = (byte) arg0;
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method452(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1455, this.field1456);
        this.field1456 += arg0.length();
        this.field1455[this.field1456++] = 10;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "([BZII)V")
    public void method453(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field1439 = 88;
        }
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            this.field1455[this.field1456++] = arg0[var5];
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "d", descriptor = "(II)V")
    public void method454(int arg0, int arg1) {
        this.field1455[this.field1456 - arg0 - 1] = (byte) arg0;
        if (arg1 != 36772) {
            field1439 = 275;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "c", descriptor = "()I")
    public int method455() {
        return this.field1455[this.field1456++] & 0xFF;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "d", descriptor = "()B")
    public byte method456() {
        return this.field1455[this.field1456++];
    }

    @OriginalMember(owner = "UAWAYCTK", name = "e", descriptor = "()I")
    public int method457() {
        this.field1456 += 2;
        return ((this.field1455[this.field1456 - 2] & 0xFF) << 8) + (this.field1455[this.field1456 - 1] & 0xFF);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "f", descriptor = "()I")
    public int method458() {
        this.field1456 += 2;
        int var1 = ((this.field1455[this.field1456 - 2] & 0xFF) << 8) + (this.field1455[this.field1456 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "g", descriptor = "()I")
    public int method459() {
        this.field1456 += 3;
        return (this.field1455[this.field1456 - 1] & 0xFF) + ((this.field1455[this.field1456 - 3] & 0xFF) << 16) + ((this.field1455[this.field1456 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "h", descriptor = "()I")
    public int method460() {
        this.field1456 += 4;
        return (this.field1455[this.field1456 - 1] & 0xFF) + ((this.field1455[this.field1456 - 2] & 0xFF) << 8) + ((this.field1455[this.field1456 - 4] & 0xFF) << 24) + ((this.field1455[this.field1456 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(B)J")
    public long method461(byte arg0) {
        long var2 = (long) this.method460() & 0xFFFFFFFFL;
        long var4 = (long) this.method460() & 0xFFFFFFFFL;
        if (arg0 != -26) {
            throw new NullPointerException();
        }
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "i", descriptor = "()Ljava/lang/String;")
    public String method462() {
        int var1 = this.field1456;
        while (this.field1455[this.field1456++] != 10) {
        }
        return new String(this.field1455, var1, this.field1456 - var1 - 1);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "e", descriptor = "(I)[B")
    public byte[] method463(int arg0) {
        int var2 = this.field1456;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        while (this.field1455[this.field1456++] != 10) {
        }
        byte[] var3 = new byte[this.field1456 - var2 - 1];
        for (int var4 = var2; var4 < this.field1456 - 1; var4++) {
            var3[var4 - var2] = this.field1455[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(I[BIZ)V")
    public void method464(int arg0, byte[] arg1, int arg2, boolean arg3) {
        if (!arg3) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg1[var5] = this.field1455[this.field1456++];
            }
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(Z)V")
    public void method465(boolean arg0) {
        if (arg0) {
            this.field1457 = this.field1456 * 8;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "e", descriptor = "(II)I")
    public int method466(int arg0, int arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.field1454 = -445;
        }
        int var3 = this.field1457 >> 3;
        int var4 = 8 - (this.field1457 & 0x7);
        int var5 = 0;
        this.field1457 += arg1;
        while (arg1 > var4) {
            var5 += (this.field1455[var3++] & field1459[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (this.field1455[var3] & field1459[var4]) + var5;
        } else {
            var6 = (this.field1455[var3] >> var4 - arg1 & field1459[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "b", descriptor = "(Z)V")
    public void method467(boolean arg0) {
        this.field1456 = (this.field1457 + 7) / 8;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "j", descriptor = "()I")
    public int method468() {
        int var1 = this.field1455[this.field1456] & 0xFF;
        return var1 < 128 ? this.method455() - 64 : this.method457() - 49152;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "k", descriptor = "()I")
    public int method469() {
        int var1 = this.field1455[this.field1456] & 0xFF;
        return var1 < 128 ? this.method455() : this.method457() - 32768;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
    public void method470(BigInteger arg0, int arg1, BigInteger arg2) {
        int var4 = this.field1456;
        this.field1456 = 0;
        if (arg1 < 8 || arg1 > 8) {
            this.field1442 = -167;
        }
        byte[] var5 = new byte[var4];
        this.method464(var4, var5, 0, false);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(arg0, arg2);
        byte[] var8 = var7.toByteArray();
        this.field1456 = 0;
        this.method445(var8.length);
        this.method453(var8, false, 0, var8.length);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "f", descriptor = "(II)V")
    public void method471(int arg0, int arg1) {
        if (arg0 == 4) {
            this.field1455[this.field1456++] = (byte) (arg1 + 128);
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(IB)V")
    public void method472(int arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field1455[this.field1456++] = (byte) -arg0;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "g", descriptor = "(II)V")
    public void method473(int arg0, int arg1) {
        if (arg1 == 30130) {
            this.field1455[this.field1456++] = (byte) (128 - arg0);
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "b", descriptor = "(B)I")
    public int method474(byte arg0) {
        if (arg0 != 1) {
            this.field1453 = !this.field1453;
        }
        return this.field1455[this.field1456++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "c", descriptor = "(B)I")
    public int method475(byte arg0) {
        if (arg0 != 16) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return -this.field1455[this.field1456++] & 0xFF;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "d", descriptor = "(B)I")
    public int method476(byte arg0) {
        return this.field1447 == arg0 ? 128 - this.field1455[this.field1456++] & 0xFF : 3;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "f", descriptor = "(I)B")
    public byte method477(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
        return (byte) (this.field1455[this.field1456++] - 128);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "e", descriptor = "(B)B")
    public byte method478(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return (byte) (128 - this.field1455[this.field1456++]);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "h", descriptor = "(II)V")
    public void method479(int arg0, int arg1) {
        this.field1455[this.field1456++] = (byte) arg0;
        if (this.field1448 == arg1) {
            this.field1455[this.field1456++] = (byte) (arg0 >> 8);
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "i", descriptor = "(II)V")
    public void method480(int arg0, int arg1) {
        this.field1455[this.field1456++] = (byte) (arg1 >> 8);
        this.field1455[this.field1456++] = (byte) (arg1 + 128);
        if (arg0 != -24437) {
            this.field1448 = 39;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "j", descriptor = "(II)V")
    public void method481(int arg0, int arg1) {
        this.field1455[this.field1456++] = (byte) (arg1 + 128);
        this.field1455[this.field1456++] = (byte) (arg1 >> 8);
        if (arg0 <= 0) {
            this.field1454 = 201;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "g", descriptor = "(I)I")
    public int method482(int arg0) {
        this.field1456 += 2;
        if (arg0 != 0) {
            this.field1440 = !this.field1440;
        }
        return ((this.field1455[this.field1456 - 1] & 0xFF) << 8) + (this.field1455[this.field1456 - 2] & 0xFF);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "h", descriptor = "(I)I")
    public int method483(int arg0) {
        this.field1456 += 2;
        if (arg0 != 17702) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1455[this.field1456 - 2] & 0xFF) << 8) + (this.field1455[this.field1456 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "c", descriptor = "(Z)I")
    public int method484(boolean arg0) {
        this.field1456 += 2;
        return arg0 ? 1 : ((this.field1455[this.field1456 - 1] & 0xFF) << 8) + (this.field1455[this.field1456 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "f", descriptor = "(B)I")
    public int method485(byte arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1456 += 2;
        int var3 = ((this.field1455[this.field1456 - 2] & 0xFF) << 8) + (this.field1455[this.field1456 - 1] - 128 & 0xFF);
        if (var3 > 32767) {
            var3 -= 65536;
        }
        return var3;
    }

    @OriginalMember(owner = "UAWAYCTK", name = "i", descriptor = "(I)I")
    public int method486(int arg0) {
        this.field1456 += 2;
        int var2 = ((this.field1455[this.field1456 - 1] & 0xFF) << 8) + (this.field1455[this.field1456 - 2] - 128 & 0xFF);
        if (arg0 < 0) {
            if (var2 > 32767) {
                var2 -= 65536;
            }
            return var2;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "g", descriptor = "(B)I")
    public int method487(byte arg0) {
        this.field1456 += 3;
        if (arg0 != -33) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1455[this.field1456 - 2] & 0xFF) + ((this.field1455[this.field1456 - 3] & 0xFF) << 16) + ((this.field1455[this.field1456 - 1] & 0xFF) << 8);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "k", descriptor = "(II)V")
    public void method488(int arg0, int arg1) {
        this.field1455[this.field1456++] = (byte) (arg1 >> 16);
        this.field1455[this.field1456++] = (byte) (arg1 >> 24);
        this.field1455[this.field1456++] = (byte) arg1;
        this.field1455[this.field1456++] = (byte) (arg1 >> 8);
        if (arg0 != 3) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "d", descriptor = "(Z)I")
    public int method489(boolean arg0) {
        this.field1456 += 4;
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (this.field1455[this.field1456 - 4] & 0xFF) + ((this.field1455[this.field1456 - 3] & 0xFF) << 8) + ((this.field1455[this.field1456 - 1] & 0xFF) << 24) + ((this.field1455[this.field1456 - 2] & 0xFF) << 16);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "j", descriptor = "(I)I")
    public int method490(int arg0) {
        int var2 = 53 / arg0;
        this.field1456 += 4;
        return (this.field1455[this.field1456 - 3] & 0xFF) + ((this.field1455[this.field1456 - 4] & 0xFF) << 8) + ((this.field1455[this.field1456 - 2] & 0xFF) << 24) + ((this.field1455[this.field1456 - 1] & 0xFF) << 16);
    }

    @OriginalMember(owner = "UAWAYCTK", name = "h", descriptor = "(B)I")
    public int method491(byte arg0) {
        if (this.field1451 == arg0) {
            this.field1456 += 4;
            return (this.field1455[this.field1456 - 2] & 0xFF) + ((this.field1455[this.field1456 - 1] & 0xFF) << 8) + ((this.field1455[this.field1456 - 3] & 0xFF) << 24) + ((this.field1455[this.field1456 - 4] & 0xFF) << 16);
        } else {
            return 4;
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "b", descriptor = "([BZII)V")
    public void method492(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
                this.field1455[this.field1456++] = (byte) (arg0[var5] + 128);
            }
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(II[BI)V")
    public void method493(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != 0) {
            this.field1450 = !this.field1450;
        }
        for (int var5 = arg0 + arg3 - 1; var5 >= arg3; var5--) {
            arg2[var5] = this.field1455[this.field1456++];
        }
    }

    @OriginalMember(owner = "UAWAYCTK", name = "a", descriptor = "(I[BII)V")
    public void method494(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 < 0) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg1[var5] = (byte) (this.field1455[this.field1456++] - 128);
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
            field1458[var0] = var1;
        }
        field1459 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1464 = new class58(41824);
        field1465 = new class58(41824);
        field1466 = new class58(41824);
        field1467 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
