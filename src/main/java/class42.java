import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PGNBHFUF")
public class class42 extends class49 {

    @OriginalMember(owner = "PGNBHFUF", name = "j", descriptor = "I")
    private int field1230 = -961;

    @OriginalMember(owner = "PGNBHFUF", name = "l", descriptor = "B")
    private byte field1232 = 5;

    @OriginalMember(owner = "PGNBHFUF", name = "n", descriptor = "I")
    private int field1234 = -47744;

    @OriginalMember(owner = "PGNBHFUF", name = "o", descriptor = "I")
    private int field1235 = 35;

    @OriginalMember(owner = "PGNBHFUF", name = "p", descriptor = "I")
    private int field1236 = 41;

    @OriginalMember(owner = "PGNBHFUF", name = "q", descriptor = "B")
    private byte field1237 = 109;

    @OriginalMember(owner = "PGNBHFUF", name = "r", descriptor = "I")
    private int field1238 = 951;

    @OriginalMember(owner = "PGNBHFUF", name = "s", descriptor = "Z")
    private boolean field1239 = false;

    @OriginalMember(owner = "PGNBHFUF", name = "t", descriptor = "B")
    private byte field1240 = -6;

    @OriginalMember(owner = "PGNBHFUF", name = "u", descriptor = "B")
    private byte field1241 = 9;

    @OriginalMember(owner = "PGNBHFUF", name = "v", descriptor = "B")
    private byte field1242 = 6;

    @OriginalMember(owner = "PGNBHFUF", name = "w", descriptor = "I")
    private int field1243 = 407;

    @OriginalMember(owner = "PGNBHFUF", name = "x", descriptor = "Z")
    private boolean field1244 = true;

    @OriginalMember(owner = "PGNBHFUF", name = "z", descriptor = "Z")
    private boolean field1246 = true;

    @OriginalMember(owner = "PGNBHFUF", name = "A", descriptor = "Z")
    private boolean field1247 = false;

    @OriginalMember(owner = "PGNBHFUF", name = "B", descriptor = "Z")
    private boolean field1248 = true;

    @OriginalMember(owner = "PGNBHFUF", name = "C", descriptor = "[B")
    public byte[] field1249;

    @OriginalMember(owner = "PGNBHFUF", name = "D", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "PGNBHFUF", name = "i", descriptor = "I")
    private static int field1229 = 581;

    @OriginalMember(owner = "PGNBHFUF", name = "F", descriptor = "[I")
    private static int[] field1252 = new int[256];

    @OriginalMember(owner = "PGNBHFUF", name = "G", descriptor = "[I")
    private static final int[] field1253;

    @OriginalMember(owner = "PGNBHFUF", name = "L", descriptor = "LFEPBPONH;")
    private static class15 field1258;

    @OriginalMember(owner = "PGNBHFUF", name = "M", descriptor = "LFEPBPONH;")
    private static class15 field1259;

    @OriginalMember(owner = "PGNBHFUF", name = "N", descriptor = "LFEPBPONH;")
    private static class15 field1260;

    @OriginalMember(owner = "PGNBHFUF", name = "O", descriptor = "[C")
    private static char[] field1261;

    @OriginalMember(owner = "PGNBHFUF", name = "k", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "PGNBHFUF", name = "m", descriptor = "I")
    private static int field1233;

    @OriginalMember(owner = "PGNBHFUF", name = "y", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "PGNBHFUF", name = "E", descriptor = "I")
    public int field1251;

    @OriginalMember(owner = "PGNBHFUF", name = "I", descriptor = "I")
    private static int field1255;

    @OriginalMember(owner = "PGNBHFUF", name = "J", descriptor = "I")
    private static int field1256;

    @OriginalMember(owner = "PGNBHFUF", name = "K", descriptor = "I")
    private static int field1257;

    @OriginalMember(owner = "PGNBHFUF", name = "H", descriptor = "LBDQVRRZB;")
    public class3 field1254;

    @OriginalMember(owner = "PGNBHFUF", name = "P", descriptor = "Z")
    public static boolean field1262;

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(BI)LPGNBHFUF;")
    public static class42 method408(byte arg0, int arg1) {
        class15 var2 = field1259;
        synchronized (field1259) {
            class42 var3 = null;
            if (arg1 == 0 && field1255 > 0) {
                field1255--;
                var3 = (class42) field1258.method268();
            } else if (arg1 == 1 && field1256 > 0) {
                field1256--;
                var3 = (class42) field1259.method268();
            } else if (arg1 == 2 && field1257 > 0) {
                field1257--;
                var3 = (class42) field1260.method268();
            }
            if (var3 != null) {
                var3.field1250 = 0;
                return var3;
            }
        }
        class42 var5 = new class42(field1229);
        if (arg0 != 47) {
            field1233 = 471;
        }
        var5.field1250 = 0;
        if (arg1 == 0) {
            var5.field1249 = new byte[100];
        } else if (arg1 == 1) {
            var5.field1249 = new byte[5000];
        } else {
            var5.field1249 = new byte[30000];
        }
        return var5;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "<init>", descriptor = "(I)V")
    private class42(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "<init>", descriptor = "(I[B)V")
    public class42(int arg0, byte[] arg1) {
        this.field1249 = arg1;
        this.field1250 = 0;
        if (arg0 != 5) {
            field1233 = 326;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(BI)V")
    public void method409(byte arg0, int arg1) {
        if (arg0 != -81) {
            this.field1246 = !this.field1246;
        }
        this.field1249[this.field1250++] = (byte) (arg1 + this.field1254.method51());
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(I)V")
    public void method410(int arg0) {
        this.field1249[this.field1250++] = (byte) arg0;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(I)V")
    public void method411(int arg0) {
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) arg0;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(II)V")
    public void method412(int arg0, int arg1) {
        this.field1249[this.field1250++] = (byte) arg1;
        if (arg0 != -33050) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1249[this.field1250++] = (byte) (arg1 >> 8);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(I)V")
    public void method413(int arg0) {
        this.field1249[this.field1250++] = (byte) (arg0 >> 16);
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) arg0;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "d", descriptor = "(I)V")
    public void method414(int arg0) {
        this.field1249[this.field1250++] = (byte) (arg0 >> 24);
        this.field1249[this.field1250++] = (byte) (arg0 >> 16);
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) arg0;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(II)V")
    public void method415(int arg0, int arg1) {
        this.field1249[this.field1250++] = (byte) arg0;
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) (arg0 >> 16);
        this.field1249[this.field1250++] = (byte) (arg0 >> 24);
        while (arg1 >= 0) {
            field1229 = -315;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(IJ)V")
    public void method416(int arg0, long arg1) {
        if (arg0 != 30294) {
            this.field1247 = !this.field1247;
        }
        this.field1249[this.field1250++] = (byte) (arg1 >> 56);
        this.field1249[this.field1250++] = (byte) (arg1 >> 48);
        this.field1249[this.field1250++] = (byte) (arg1 >> 40);
        this.field1249[this.field1250++] = (byte) (arg1 >> 32);
        this.field1249[this.field1250++] = (byte) (arg1 >> 24);
        this.field1249[this.field1250++] = (byte) (arg1 >> 16);
        this.field1249[this.field1250++] = (byte) (arg1 >> 8);
        this.field1249[this.field1250++] = (byte) arg1;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(Ljava/lang/String;)V")
    public void method417(String arg0) {
        arg0.getBytes(0, arg0.length(), this.field1249, this.field1250);
        this.field1250 += arg0.length();
        this.field1249[this.field1250++] = 10;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "([BIIB)V")
    public void method418(byte[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 74) {
            for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
                this.field1249[this.field1250++] = arg0[var5];
            }
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(BI)V")
    public void method419(byte arg0, int arg1) {
        this.field1249[this.field1250 - arg1 - 1] = (byte) arg1;
        if (this.field1232 == arg0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "()I")
    public int method420() {
        return this.field1249[this.field1250++] & 0xFF;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "d", descriptor = "()B")
    public byte method421() {
        return this.field1249[this.field1250++];
    }

    @OriginalMember(owner = "PGNBHFUF", name = "e", descriptor = "()I")
    public int method422() {
        this.field1250 += 2;
        return ((this.field1249[this.field1250 - 2] & 0xFF) << 8) + (this.field1249[this.field1250 - 1] & 0xFF);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "f", descriptor = "()I")
    public int method423() {
        this.field1250 += 2;
        int var1 = ((this.field1249[this.field1250 - 2] & 0xFF) << 8) + (this.field1249[this.field1250 - 1] & 0xFF);
        if (var1 > 32767) {
            var1 -= 65536;
        }
        return var1;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "g", descriptor = "()I")
    public int method424() {
        this.field1250 += 3;
        return (this.field1249[this.field1250 - 1] & 0xFF) + ((this.field1249[this.field1250 - 3] & 0xFF) << 16) + ((this.field1249[this.field1250 - 2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "h", descriptor = "()I")
    public int method425() {
        this.field1250 += 4;
        return (this.field1249[this.field1250 - 1] & 0xFF) + ((this.field1249[this.field1250 - 2] & 0xFF) << 8) + ((this.field1249[this.field1250 - 4] & 0xFF) << 24) + ((this.field1249[this.field1250 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(Z)J")
    public long method426(boolean arg0) {
        long var2 = (long) this.method425() & 0xFFFFFFFFL;
        if (!arg0) {
            field1233 = 387;
        }
        long var4 = (long) this.method425() & 0xFFFFFFFFL;
        return (var2 << 32) + var4;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "i", descriptor = "()Ljava/lang/String;")
    public String method427() {
        int var1 = this.field1250;
        while (this.field1249[this.field1250++] != 10) {
        }
        return new String(this.field1249, var1, this.field1250 - var1 - 1);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(B)[B")
    public byte[] method428(byte arg0) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        int var2 = this.field1250;
        while (this.field1249[this.field1250++] != 10) {
        }
        byte[] var3 = new byte[this.field1250 - var2 - 1];
        for (int var4 = var2; var4 < this.field1250 - 1; var4++) {
            var3[var4 - var2] = this.field1249[var4];
        }
        return var3;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "([BIII)V")
    public void method429(byte[] arg0, int arg1, int arg2, int arg3) {
        while (arg3 >= 0) {
            this.field1230 = -366;
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            arg0[var5] = this.field1249[this.field1250++];
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(Z)V")
    public void method430(boolean arg0) {
        if (arg0) {
            this.field1251 = this.field1250 * 8;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(IZ)I")
    public int method431(int arg0, boolean arg1) {
        if (arg1) {
            return 1;
        }
        int var3 = this.field1251 >> 3;
        int var4 = 8 - (this.field1251 & 0x7);
        int var5 = 0;
        this.field1251 += arg0;
        while (arg0 > var4) {
            var5 += (this.field1249[var3++] & field1253[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field1249[var3] & field1253[var4]) + var5;
        } else {
            var6 = (this.field1249[var3] >> var4 - arg0 & field1253[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(Z)V")
    public void method432(boolean arg0) {
        if (arg0) {
            this.field1250 = (this.field1251 + 7) / 8;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "j", descriptor = "()I")
    public int method433() {
        int var1 = this.field1249[this.field1250] & 0xFF;
        return var1 < 128 ? this.method420() - 64 : this.method422() - 49152;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "k", descriptor = "()I")
    public int method434() {
        int var1 = this.field1249[this.field1250] & 0xFF;
        return var1 < 128 ? this.method420() : this.method422() - 32768;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
    public void method435(BigInteger arg0, BigInteger arg1, boolean arg2) {
        int var4 = this.field1250;
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1250 = 0;
        byte[] var6 = new byte[var4];
        this.method429(var6, var4, 0, -93);
        BigInteger var7 = new BigInteger(var6);
        BigInteger var8 = var7.modPow(arg0, arg1);
        byte[] var9 = var8.toByteArray();
        this.field1250 = 0;
        this.method410(var9.length);
        this.method418(var9, var9.length, 0, (byte) 74);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(II)V")
    public void method436(int arg0, int arg1) {
        this.field1249[this.field1250++] = (byte) (arg1 + 128);
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(IZ)V")
    public void method437(int arg0, boolean arg1) {
        this.field1249[this.field1250++] = (byte) -arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "d", descriptor = "(Z)I")
    public int method438(boolean arg0) {
        return arg0 ? this.field1236 : this.field1249[this.field1250++] - 128 & 0xFF;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "e", descriptor = "(I)I")
    public int method439(int arg0) {
        if (arg0 != 0) {
            this.field1236 = -470;
        }
        return -this.field1249[this.field1250++] & 0xFF;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "f", descriptor = "(I)I")
    public int method440(int arg0) {
        return arg0 == 8 ? 128 - this.field1249[this.field1250++] & 0xFF : 1;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "e", descriptor = "(Z)B")
    public byte method441(boolean arg0) {
        if (!arg0) {
            this.field1238 = 181;
        }
        return (byte) (this.field1249[this.field1250++] - 128);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "f", descriptor = "(Z)B")
    public byte method442(boolean arg0) {
        if (!arg0) {
            this.field1231 = -21;
        }
        return (byte) -this.field1249[this.field1250++];
    }

    @OriginalMember(owner = "PGNBHFUF", name = "d", descriptor = "(II)V")
    public void method443(int arg0, int arg1) {
        if (arg0 == 26889) {
            this.field1249[this.field1250++] = (byte) arg1;
            this.field1249[this.field1250++] = (byte) (arg1 >> 8);
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(IZ)V")
    public void method444(int arg0, boolean arg1) {
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) (arg0 + 128);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(ZI)V")
    public void method445(boolean arg0, int arg1) {
        this.field1249[this.field1250++] = (byte) (arg1 + 128);
        this.field1249[this.field1250++] = (byte) (arg1 >> 8);
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "g", descriptor = "(I)I")
    public int method446(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1250 += 2;
        return ((this.field1249[this.field1250 - 1] & 0xFF) << 8) + (this.field1249[this.field1250 - 2] & 0xFF);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "b", descriptor = "(B)I")
    public int method447(byte arg0) {
        this.field1250 += 2;
        if (arg0 != -35) {
            this.field1247 = !this.field1247;
        }
        return ((this.field1249[this.field1250 - 2] & 0xFF) << 8) + (this.field1249[this.field1250 - 1] - 128 & 0xFF);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "g", descriptor = "(Z)I")
    public int method448(boolean arg0) {
        this.field1250 += 2;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return ((this.field1249[this.field1250 - 1] & 0xFF) << 8) + (this.field1249[this.field1250 - 2] - 128 & 0xFF);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "c", descriptor = "(B)I")
    public int method449(byte arg0) {
        this.field1250 += 2;
        if (arg0 != 2) {
            this.field1238 = 160;
        }
        int var2 = ((this.field1249[this.field1250 - 2] & 0xFF) << 8) + (this.field1249[this.field1250 - 1] - 128 & 0xFF);
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "d", descriptor = "(B)I")
    public int method450(byte arg0) {
        this.field1250 += 2;
        int var2 = ((this.field1249[this.field1250 - 1] & 0xFF) << 8) + (this.field1249[this.field1250 - 2] - 128 & 0xFF);
        if (this.field1240 != arg0) {
            this.field1235 = -488;
        }
        if (var2 > 32767) {
            var2 -= 65536;
        }
        return var2;
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(IB)V")
    public void method451(int arg0, byte arg1) {
        this.field1249[this.field1250++] = (byte) (arg0 >> 8);
        this.field1249[this.field1250++] = (byte) arg0;
        this.field1249[this.field1250++] = (byte) (arg0 >> 24);
        this.field1249[this.field1250++] = (byte) (arg0 >> 16);
        if (arg1 != 40) {
            this.field1246 = !this.field1246;
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "h", descriptor = "(Z)I")
    public int method452(boolean arg0) {
        this.field1250 += 4;
        if (!arg0) {
            this.field1239 = !this.field1239;
        }
        return (this.field1249[this.field1250 - 2] & 0xFF) + ((this.field1249[this.field1250 - 1] & 0xFF) << 8) + ((this.field1249[this.field1250 - 3] & 0xFF) << 24) + ((this.field1249[this.field1250 - 4] & 0xFF) << 16);
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(I[BII)V")
    public void method453(int arg0, byte[] arg1, int arg2, int arg3) {
        while (arg2 >= 0) {
            this.field1234 = 286;
        }
        for (int var5 = arg0 + arg3 - 1; var5 >= arg0; var5--) {
            this.field1249[this.field1250++] = arg1[var5];
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(I[BIB)V")
    public void method454(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != 3) {
            this.field1244 = !this.field1244;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
            arg1[var5] = this.field1249[this.field1250++];
        }
    }

    @OriginalMember(owner = "PGNBHFUF", name = "a", descriptor = "(IBI[B)V")
    public void method455(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg1 != 42) {
            this.field1245 = -369;
        }
        for (int var5 = arg0 + arg2 - 1; var5 >= arg0; var5--) {
            arg3[var5] = (byte) (this.field1249[this.field1250++] - 128);
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
            field1252[var0] = var1;
        }
        field1253 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
        field1258 = new class15(145);
        field1259 = new class15(145);
        field1260 = new class15(145);
        field1261 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
    }
}
